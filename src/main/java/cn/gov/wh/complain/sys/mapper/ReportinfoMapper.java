package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Reportinfo;
import cn.gov.wh.complain.sys.pojo.ReportinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportinfoMapper {
    int countByExample(ReportinfoExample example);

    int deleteByExample(ReportinfoExample example);

    int deleteByPrimaryKey(String reportid);

    int insert(Reportinfo record);

    int insertSelective(Reportinfo record);

    List<Reportinfo> selectByExample(ReportinfoExample example);

    Reportinfo selectByPrimaryKey(String reportid);

    int updateByExampleSelective(@Param("record") Reportinfo record, @Param("example") ReportinfoExample example);

    int updateByExample(@Param("record") Reportinfo record, @Param("example") ReportinfoExample example);

    int updateByPrimaryKeySelective(Reportinfo record);

    int updateByPrimaryKey(Reportinfo record);
}