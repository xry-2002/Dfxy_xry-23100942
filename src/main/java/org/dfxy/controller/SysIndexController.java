package org.dfxy.controller;

import org.dfxy.model.SysMenu;
import org.dfxy.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
@RequestMapping("/a")
public class SysIndexController {

    @Autowired
    private ISysMenuService sysMenuService;

    @RequestMapping("/index")
    public String index(Model model) {

        //读取当前登录成功用户的角色，并根据角色加载菜单
        //获得spring security用户
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext()
                .getAuthentication()
                .getPrincipal();
        //读取当前用户管理的菜单
        List<SysMenu> menuList = sysMenuService.findListByName(userDetails.getUsername());
        //获取当前登录的系统用户
        model.addAttribute("menus", menuList);


        return "sys/index";
    }

    @RequestMapping("/views/console")
    public String views_console(Model model) {
        return "sys/views/console";
    }

    @RequestMapping("/logout")
    public String loginPage(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            //设置用户厉害
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        return "redirect:/a/user/login";
    }
}
