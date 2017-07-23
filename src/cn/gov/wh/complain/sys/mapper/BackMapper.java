package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Back;
import cn.gov.wh.complain.sys.pojo.BackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BackMapper {
    int countByExample(BackExample example);

    int deleteByExample(BackExample example);

    int deleteByPrimaryKey(String returnid);

    int insert(Back record);

    int insertSelective(Back record);

    List<Back> selectByExampleWithBLOBs(BackExample example);

    List<Back> selectByExample(BackExample example);

    Back selectByPrimaryKey(String returnid);

    int updateByExampleSelective(@Param("record") Back record, @Param("example") BackExample example);

    int updateByExampleWithBLOBs(@Param("record") Back record, @Param("example") BackExample example);

    int updateByExample(@Param("record") Back record, @Param("example") BackExample example);

    int updateByPrimaryKeySelective(Back record);

    int updateByPrimaryKeyWithBLOBs(Back record);

    int updateByPrimaryKey(Back record);
}