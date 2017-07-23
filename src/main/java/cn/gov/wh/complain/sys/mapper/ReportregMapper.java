package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Reportreg;
import cn.gov.wh.complain.sys.pojo.ReportregExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportregMapper {
    int countByExample(ReportregExample example);

    int deleteByExample(ReportregExample example);

    int deleteByPrimaryKey(String repid);

    int insert(Reportreg record);

    int insertSelective(Reportreg record);

    List<Reportreg> selectByExample(ReportregExample example);

    Reportreg selectByPrimaryKey(String repid);

    int updateByExampleSelective(@Param("record") Reportreg record, @Param("example") ReportregExample example);

    int updateByExample(@Param("record") Reportreg record, @Param("example") ReportregExample example);

    int updateByPrimaryKeySelective(Reportreg record);

    int updateByPrimaryKey(Reportreg record);
}