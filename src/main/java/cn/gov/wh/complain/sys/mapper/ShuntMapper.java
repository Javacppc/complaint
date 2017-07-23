package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Shunt;
import cn.gov.wh.complain.sys.pojo.ShuntExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShuntMapper {
    int countByExample(ShuntExample example);

    int deleteByExample(ShuntExample example);

    int deleteByPrimaryKey(String shuntid);

    int insert(Shunt record);

    int insertSelective(Shunt record);

    List<Shunt> selectByExampleWithBLOBs(ShuntExample example);

    List<Shunt> selectByExample(ShuntExample example);

    Shunt selectByPrimaryKey(String shuntid);

    int updateByExampleSelective(@Param("record") Shunt record, @Param("example") ShuntExample example);

    int updateByExampleWithBLOBs(@Param("record") Shunt record, @Param("example") ShuntExample example);

    int updateByExample(@Param("record") Shunt record, @Param("example") ShuntExample example);

    int updateByPrimaryKeySelective(Shunt record);

    int updateByPrimaryKeyWithBLOBs(Shunt record);

    int updateByPrimaryKey(Shunt record);
}