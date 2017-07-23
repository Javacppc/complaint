package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Complainreg;
import cn.gov.wh.complain.sys.pojo.ComplainregExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComplainregMapper {
    int countByExample(ComplainregExample example);

    int deleteByExample(ComplainregExample example);

    int deleteByPrimaryKey(String complainregid);

    int insert(Complainreg record);

    int insertSelective(Complainreg record);

    List<Complainreg> selectByExample(ComplainregExample example);

    Complainreg selectByPrimaryKey(String complainregid);

    int updateByExampleSelective(@Param("record") Complainreg record, @Param("example") ComplainregExample example);

    int updateByExample(@Param("record") Complainreg record, @Param("example") ComplainregExample example);

    int updateByPrimaryKeySelective(Complainreg record);

    int updateByPrimaryKey(Complainreg record);
}