package com.lhw.biz;

import com.lhw.pojo.SysUser;
import com.lhw.utils.Page;

public interface UserBiz {
    SysUser login(String account, String password) throws Exception;

    Page<SysUser> selectUserList(String realName, Integer roleId, Integer currentPage, Integer pageSize) throws Exception;
}
