package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.RoleModuleExample;
import cn.gov.wh.complain.sys.pojo.RoleModuleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleModuleMapper {
    int countByExample(RoleModuleExample example);

    int deleteByExample(RoleModuleExample example);

    int deleteByPrimaryKey(RoleModuleKey key);

    int insert(RoleModuleKey record);

    int insertSelective(RoleModuleKey record);

    List<RoleModuleKey> selectByExample(RoleModuleExample example);

    int updateByExampleSelective(@Param("record") RoleModuleKey record, @Param("example") RoleModuleExample example);

    int updateByExample(@Param("record") RoleModuleKey record, @Param("example") RoleModuleExample example);
}