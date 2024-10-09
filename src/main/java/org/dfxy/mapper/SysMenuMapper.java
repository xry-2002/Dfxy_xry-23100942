package org.dfxy.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.dfxy.model.SysMenu;

import java.util.List;

@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    /**
     * 根据用户名获取对应的菜单
     */
    List<SysMenu> findByUserName(@Param("username") String username);
}