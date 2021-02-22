package com.lhw.mapper;

import com.lhw.pojo.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 通过userCode获取User
     *
     * @param account
     * @return
     * @throws Exception
     */
    public SysUser selectByAccount(@Param("account") String account) throws Exception;

    /**
     * 增加用户信息
     *
     * @param sysUser
     * @return
     * @throws Exception
     */
    public int add(SysUser sysUser) throws Exception;

    /**
     * 通过条件查询-userList
     *
     * @param realName
     * @param roleId
     * @param pageBegin
     * @param pageSize
     * @return
     * @throws Exception
     */
    public List<SysUser> selectList(@Param("realName") String realName, @Param("roleId") Integer roleId,
                                    @Param("pageBegin") Integer pageBegin, @Param("pageSize") Integer pageSize) throws Exception;

    /**
     * 通过条件查询-用户表记录数
     *
     * @param realName
     * @param roleId
     * @return
     * @throws Exception
     */
    public int selectCount(@Param("realName") String realName, @Param("roleId") Integer roleId) throws Exception;

    /**
     * 通过userId删除user
     *
     * @param delId
     * @return
     * @throws Exception
     */
    public int deleteById(@Param("id") Integer delId) throws Exception;


    /**
     * 通过userId获取user
     *
     * @param id
     * @return
     * @throws Exception
     */
    public SysUser selectById(@Param("id") Integer id) throws Exception;

    /**
     * 修改用户信息
     *
     * @param sysUser
     * @return
     * @throws Exception
     */
    public int update(SysUser sysUser) throws Exception;


    /**
     * 修改当前用户密码
     *
     * @param id
     * @param password
     * @return
     * @throws Exception
     */
    public int updatePwd(@Param("id") Integer id, @Param("password") String password) throws Exception;
}
