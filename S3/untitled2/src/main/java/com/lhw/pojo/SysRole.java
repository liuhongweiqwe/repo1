package com.lhw.pojo;

import java.sql.Timestamp;

public class SysRole {
    private long id;
    private String code;
    private String roleName;
    private long createdUserId;
    private Timestamp createdTime;
    private long updatedUserId;
    private Timestamp updatedTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public long getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(long createdUserId) {
        this.createdUserId = createdUserId;
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
