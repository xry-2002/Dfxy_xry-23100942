package org.dfxy.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.dfxy.model.SysMenu;
import org.dfxy.vo.ResponseResult;

import java.util.List;
import java.util.Map;

/**
 * 菜单管理 服务类
 */
public interface ISysMenuService extends IService<SysMenu> {
    /**
     * 根据用户名获取对应菜单
     */
    List<SysMenu> findListByName(String username);

    /**
     * 以树状形式获取菜单
     * @return
     */
    List<Map<String, Object>> queryMenuTree();
    /**
     *
     * @param menuId
     * @return
     */
    SysMenu queryMenuById(Integer menuId);
    /**
     *
     * @param menuId
     * @return
     */
    SysMenu queryParentMenuById(Integer menuId);
    /**
     * 保存菜单
     * @param sysMenu
     */
    void saveMenu(SysMenu sysMenu);
    /**
     * 删除菜单
     * @param menuId
     * @return
     */
    ResponseResult deleteMenu(Integer menuId);

}
