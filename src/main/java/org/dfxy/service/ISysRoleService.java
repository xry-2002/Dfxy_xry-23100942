package org.dfxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.dfxy.model.SysRole;

import java.util.List;
import java.util.Map;

/**
 * 服务类
 */
public interface ISysRoleService extends IService<SysRole> {
    /**
     * 保存角色
     */
    void saveRole(SysRole sysRole, int[] roleMenus);
    /**
     * 获取角色所管理的菜单
     * @param role
     * @return
     */
    List<Map<String, Object>> getRoleMenuTree(SysRole role);
}
