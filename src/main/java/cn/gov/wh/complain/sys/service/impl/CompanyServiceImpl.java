package cn.gov.wh.complain.sys.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cn.gov.wh.complain.sys.exception.SysException;
import cn.gov.wh.complain.sys.mapper.CompanyMapper;
import cn.gov.wh.complain.sys.pojo.Company;
import cn.gov.wh.complain.sys.pojo.CompanyExample;
import cn.gov.wh.complain.sys.pojo.CompanyExample.Criteria;
import cn.gov.wh.complain.sys.service.CompanyService;
import cn.gov.wh.complain.sys.vo.CompanyVo;
import cn.gov.wh.complain.sys.vo.EasyUIDataGridResult;
@Service
public class CompanyServiceImpl implements CompanyService{
	@Autowired
	private CompanyMapper companyMapper;

	@Override
	public EasyUIDataGridResult getCompanyList(Integer page, Integer rows) throws SysException {
		PageHelper.startPage(page, rows);
		CompanyExample example = new CompanyExample();
		List<Company> list = companyMapper.selectByExample(example);
		PageInfo<Company> pageInfo = new PageInfo<>(list);
		EasyUIDataGridResult result = new EasyUIDataGridResult();
		result.setRows(list);
		result.setTotal(pageInfo.getTotal());
		return result;
	}
	/**
	 * 通过Id号删除
	 */
	@Override
	public void deleteCompanyById(String id) throws SysException{
		companyMapper.deleteByPrimaryKey(id);
		//查出其直接子部门
		CompanyExample example = new CompanyExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentidEqualTo(id);
		List<Company> list = companyMapper.selectByExample(example);
		//所有相关的子部门parentId字段变为0
		for (Company company : list) {
			company.setParentid("0");
			companyMapper.updateByPrimaryKeySelective(company);
		}
	}
	
	@Override
	public void insertCompany(Company company) throws SysException {
		companyMapper.insertSelective(company);
	}
	
	@Override
	public void updateCompany(Company company) throws SysException{
		//companyMapper.updateByExampleSelective(company, new CompanyExample());//update company set companyid=?--外键约束
		companyMapper.updateByPrimaryKey(company);
	}
	@Override
	public List<CompanyVo> queryAllCompany(String companyid) throws SysException{
		CompanyExample example = new CompanyExample();
		Criteria criteria = example.createCriteria();
		criteria.andCompanyidNotEqualTo(companyid);
		List<Company> list = companyMapper.selectByExample(example);
		List<CompanyVo> companys = new ArrayList<>();
		for (Company vo : list) {
			companys.add(new CompanyVo(vo.getCompanyid(), vo.getCompanyname()));
		}
		return companys;
	}
}
