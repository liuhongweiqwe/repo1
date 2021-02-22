package com.lhw.biz;

import com.lhw.mapper.RoleMapper;
import com.lhw.pojo.SysRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RoleBizlmpl implements RoleBiz {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<SysRole> getAll() throws Exception {
        return null;
    }
}
