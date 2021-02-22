package com.lhw.pojo;

import java.sql.Timestamp;
import java.util.Date;

public class SysUser {
    private long id;
    private String account;
    private String realName;
    private String password;
    private long sex;
    private Date birthdy;
    private Integer age;
    private String phone;
    private String address;
    private SysRole role;
    private long createdUsedId;
    private Timestamp createdTime;
    private long updatedUserId;
    private Timestamp updatedTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getSex() {
        return sex;
    }

    public void setSex(long sex) {
        this.sex = sex;
    }

    public Date getBirthdy() {
        return birthdy;
    }

    public void setBirthdy(Date birthdy) {
        this.birthdy = birthdy;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public SysRole getRole() {
        return role;
    }

    public void setRole(SysRole role) {
        this.role = role;
    }

    public long getCreatedUsedId() {
        return createdUsedId;
    }

    public void setCreatedUsedId(long createdUsedId) {
        this.createdUsedId = createdUsedId;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public long getUpdatedUserId() {
        return updatedUserId;
    }

    public void setUpdatedUserId(long updatedUserId) {
        this.updatedUserId = updatedUserId;
    }

    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }
}
