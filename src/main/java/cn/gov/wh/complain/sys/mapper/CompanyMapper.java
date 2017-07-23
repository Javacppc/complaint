package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Company;
import cn.gov.wh.complain.sys.pojo.CompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    int countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(String companyid);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(String companyid);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}