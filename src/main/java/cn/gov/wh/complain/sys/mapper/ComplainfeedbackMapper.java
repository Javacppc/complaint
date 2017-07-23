package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Complainfeedback;
import cn.gov.wh.complain.sys.pojo.ComplainfeedbackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplainfeedbackMapper {
    int countByExample(ComplainfeedbackExample example);

    int deleteByExample(ComplainfeedbackExample example);

    int deleteByPrimaryKey(String feedbackid);

    int insert(Complainfeedback record);

    int insertSelective(Complainfeedback record);

    List<Complainfeedback> selectByExample(ComplainfeedbackExample example);

    Complainfeedback selectByPrimaryKey(String feedbackid);

    int updateByExampleSelective(@Param("record") Complainfeedback record, @Param("example") ComplainfeedbackExample example);

    int updateByExample(@Param("record") Complainfeedback record, @Param("example") ComplainfeedbackExample example);

    int updateByPrimaryKeySelective(Complainfeedback record);

    int updateByPrimaryKey(Complainfeedback record);
}