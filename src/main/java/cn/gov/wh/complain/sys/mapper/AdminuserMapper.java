package cn.gov.wh.complain.sys.mapper;

import cn.gov.wh.complain.sys.pojo.Adminuser;
import cn.gov.wh.complain.sys.pojo.AdminuserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminuserMapper {
    int countByExample(AdminuserExample example);

    int deleteByExample(AdminuserExample example);

    int deleteByPrimaryKey(String userid);

    int insert(Adminuser record);

    int insertSelective(Adminuser record);

    List<Adminuser> selectByExample(AdminuserExample example);

    Adminuser selectByPrimaryKey(String userid);

    int updateByExampleSelective(@Param("record") Adminuser record, @Param("example") AdminuserExample example);

    int updateByExample(@Param("record") Adminuser record, @Param("example") AdminuserExample example);

    int updateByPrimaryKeySelective(Adminuser record);

    int updateByPrimaryKey(Adminuser record);
}