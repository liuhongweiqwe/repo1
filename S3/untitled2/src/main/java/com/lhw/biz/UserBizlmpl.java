package com.lhw.biz;

import com.lhw.pojo.SysUser;
import com.lhw.utils.Page;

public class UserBizlmpl implements UserBiz {
    @Override
    public SysUser login(String account, String password) throws Exception {
        return null;
    }

    @Override
    public Page<SysUser> selectUserList(String realName, Integer roleId, Integer currentPage, Integer pageSize) throws Exception {
        return null;
    }
}
