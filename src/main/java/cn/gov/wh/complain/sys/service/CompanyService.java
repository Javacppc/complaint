package cn.gov.wh.complain.sys.service;

import java.util.List;

import cn.gov.wh.complain.sys.exception.SysException;
import cn.gov.wh.complain.sys.pojo.Company;
import cn.gov.wh.complain.sys.vo.CompanyVo;
import cn.gov.wh.complain.sys.vo.EasyUIDataGridResult;

/**
 * 单位管理业务逻辑层接口
 * @author 朱可凡
 *
 */
public interface CompanyService {
	/**
	 * 分页查询
	 * @param page 从第几页开始查
	 * @param rows 每页查询多少条记录
	 * @return
	 */
	EasyUIDataGridResult getCompanyList(Integer page, Integer rows) throws SysException;
	/**
	 * 删除指定的部门  对于父子部门情况  若删除父部门则仅仅删除父部门，子部门的parentid字段置为"0"
	 * @param id 待删除部门的Id
	 * @throws SysException
	 */
	void deleteCompanyById(String id) throws SysException;
	/**
	 * 单位信息插入数据库中
	 * @param company 单位信息
	 * @throws SysException
	 */
	void insertCompany(Company company) throws SysException;
	/**
	 * 更新单位信息
	 * @param company
	 */
	void updateCompany(Company company) throws SysException;
	/**
	 * 列出系统中所有的单位信息  不包括用户自己所属的
	 * @param companyid 
	 * @return
	 */
	List<CompanyVo> queryAllCompany(String companyid) throws SysException;
	
}
