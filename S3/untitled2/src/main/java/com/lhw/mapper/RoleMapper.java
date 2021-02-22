package com.lhw.mapper;

import com.lhw.pojo.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    /**
     * 获取角色列表
     *
     * @return
     * @throws Exception
     */
    public List<SysRole> selectList() throws Exception;

    /**
     * 增加角色信息
     *
     * @param sysRole
     * @return
     * @throws Exception
     */
    public int add(SysRole sysRole) throws Exception;

    /**
     * 通过Id删除role
     *
     * @param delId
     * @return
     * @throws Exception
     */
    public int deleteById(@Param("id") Integer delId) throws Exception;

    /**
     * 修改角色信息
     *
     * @param sysRole
     * @return
     * @throws Exception
     */
    public int update(SysRole sysRole) throws Exception;


    /**
     * 通过id获取role
     *
     * @param id
     * @return
     * @throws Exception
     */
    public SysRole selectById(@Param("id") Integer id) throws Exception;

    /**
     * 根据code ，进行角色编码的唯一性验证
     *
     * @param code
     * @return
     * @throws Exception
     */
    public int selectByCode(@Param("code") String code) throws Exception;
}