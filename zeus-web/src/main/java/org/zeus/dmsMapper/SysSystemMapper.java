package org.zeus.dmsMapper;

import java.util.List;
import org.zeus.entity.SysSystem;
import org.zeus.entity.SysSystemExample;
import org.apache.ibatis.annotations.Param;

public interface SysSystemMapper {
    int countByExample(SysSystemExample example);

    int deleteByExample(SysSystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysSystem record);

    int insertSelective(SysSystem record);

    List<SysSystem> selectByExample(SysSystemExample example);

    SysSystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysSystem record, @Param("example") SysSystemExample example);

    int updateByExample(@Param("record") SysSystem record, @Param("example") SysSystemExample example);

    int updateByPrimaryKeySelective(SysSystem record);

    int updateByPrimaryKey(SysSystem record);
}