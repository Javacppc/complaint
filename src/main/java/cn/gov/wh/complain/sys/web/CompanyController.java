package cn.gov.wh.complain.sys.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.gov.wh.complain.sys.exception.SysException;
import cn.gov.wh.complain.sys.mapper.DeptMapper;
import cn.gov.wh.complain.sys.pojo.Adminuser;
import cn.gov.wh.complain.sys.pojo.Company;
import cn.gov.wh.complain.sys.pojo.Dept;
import cn.gov.wh.complain.sys.service.CompanyService;
import cn.gov.wh.complain.sys.util.IDUtils;
import cn.gov.wh.complain.sys.util.SysConstant;
import cn.gov.wh.complain.sys.vo.CompanyVo;
import cn.gov.wh.complain.sys.vo.ComplainResult;
import cn.gov.wh.complain.sys.vo.EasyUIDataGridResult;
/**
 * 单位管理控制器类
 * @author 朱可凡
 *
 */
@Controller
@RequestMapping("/company")
public class CompanyController {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private CompanyService companyService;
	@Autowired
	private DeptMapper deptMapper;
	@RequestMapping("/")
	public String toList() {
		//跳转到单位管理页面
		return "sys/company/list";
	}
	
	/**
	 * 将所有数据显示到列表中
	 * @param page 从第几页开始查询
	 * @param rows 每页显示多少条数据
	 * @param model
	 * @return
	 * @throws SysException 
	 */
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult list(Integer page, Integer rows, Model model) throws SysException {
		EasyUIDataGridResult result = companyService.getCompanyList(page, rows);
		return result;
	}
	/**
	 * 根据传递过来的id参数删除
	 * @param ids 以逗号形式隔开的id列表  即待删除的id列表
	 * @return
	 * @throws SysException 
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ComplainResult delete(String ids) throws SysException {
		String[] idsArr = ids.split(",");
		for (String id : idsArr) {
			companyService.deleteCompanyById(id);
		}
		return ComplainResult.ok();
	}
	/**
	 * 增加或修改单位信息
	 * @param company
	 * @return
	 * @throws SysException
	 */
	@RequestMapping("/change")
	@ResponseBody
	public ComplainResult change(Company company) throws SysException{
		logger.info("传过来了?" + company.toString());
		if (company.getCompanyid() == null) {
			//新增操作
			long id = IDUtils.generateId();//生成Id号
			company.setCompanyid(String.valueOf(id));
			companyService.insertCompany(company);
		} else {
			//修改操作
			companyService.updateCompany(company);
		}
		return ComplainResult.ok();
	}
	/**
	 * 查询出系统中所有的单位信息并将其放到下拉框中  当然不包括自己
	 * @return
	 * @throws SysException
	 */
	@RequestMapping("/lc")
	@ResponseBody
	public List<CompanyVo> listCompany(HttpSession session) throws SysException{
		Adminuser user =  (Adminuser) session.getAttribute(SysConstant.CURRENT_USER_INFO);
		String deptid = user.getDeptid();
		Dept dept = deptMapper.selectByPrimaryKey(deptid);
		String companyid = dept.getCompanyid();
		List<CompanyVo> companys = companyService.queryAllCompany(companyid);
		companys.add(0, new CompanyVo("-1", "--请选择--"));
		companys.add(1, new CompanyVo("0", "无父部门"));
		return companys;
	}
}
