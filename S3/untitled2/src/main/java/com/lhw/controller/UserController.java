package com.lhw.controller;

import com.lhw.biz.RoleBiz;
import com.lhw.biz.UserBiz;
import com.lhw.pojo.SysRole;
import com.lhw.pojo.SysUser;
import com.lhw.utils.Page;
import com.lhw.utils.ResUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public class UserController {
    @Autowired
    UserBiz userBiz;
    @Autowired
    RoleBiz roleBiz;

    @RequestMapping("tologin")
    public String tOLogin() {
        return "login";
    }

    @RequestMapping("dologin")
    public String login(HttpServletRequest request, @RequestParam("account") String account, @RequestParam("password") String password, Model model) {
        try {
            SysUser user = userBiz.login(account, password);
            if (user != null) {
                // 登录成功
//                1. 登录的用户要保存session
                request.getSession().setAttribute(ResUtil.LOGINUSER, user);
                //2.去frame页面
                return "frame";
            } else {
                model.addAttribute("account", account);
                model.addAttribute("error", "用户名或密码错误");
                return "login";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @RequestMapping("sys/user/list")
    public String getUserList(@RequestParam(required = false, value = "queryRealName") String realName,
                              @RequestParam(required = false, value = "queryRoleId") Integer rolwId,
                              @RequestParam(required = false, value = "pageIndex") Integer currentPage,
                              @RequestParam(required = false, value = "pageSize") Integer pageSize,
                              Model model) {
        if (currentPage == null)
            currentPage = 1;
        if (pageSize == null) {
            pageSize = ResUtil.PAGESIZE;
        }
        try {
            try {
                Page<SysUser> page = userBiz.selectUserList(realName, rolwId, currentPage, pageSize);
                List<SysRole> roleList = roleBiz.getAll();
                model.addAttribute("page", page);
                model.addAttribute("roleList", roleList);
                model.addAttribute("queryRealName", realName);
                model.addAttribute("queryRoleId", rolwId);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return "sysUser/list";
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute(ResUtil.LOGINUSER);
        return "login";
    }
}
