package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Reportfeedback;
import cn.gov.wh.complain.sys.pojo.ReportfeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReportfeedbackMapper {
    int countByExample(ReportfeedbackExample example);

    int deleteByExample(ReportfeedbackExample example);

    int deleteByPrimaryKey(String refeid);

    int insert(Reportfeedback record);

    int insertSelective(Reportfeedback record);

    List<Reportfeedback> selectByExample(ReportfeedbackExample example);

    Reportfeedback selectByPrimaryKey(String refeid);

    int updateByExampleSelective(@Param("record") Reportfeedback record, @Param("example") ReportfeedbackExample example);

    int updateByExample(@Param("record") Reportfeedback record, @Param("example") ReportfeedbackExample example);

    int updateByPrimaryKeySelective(Reportfeedback record);

    int updateByPrimaryKey(Reportfeedback record);
}