package com.lhw.pojo;

import java.sql.Timestamp;

public class TStorageRecord {
    private long id;
    private String srCode;
    private String goodsName;
    private String goodsDesc;
    private String goodsUnit;
    private double goodsCount;
    private double totalAmount;
    private long payStatus;
    private long createdUserId;
    private Timestamp createdTime;
    private long updatedUserId;
    private Timestamp updatedTime;
    private long supplierId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSrCode() {
        return srCode;
    }

    public void setSrCode(String srCode) {
        this.srCode = srCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc;
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit;
    }

    public double getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(double goodsCount) {
        this.goodsCount = goodsCount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public long getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(long payStatus) {
        this.payStatus = payStatus;
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

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }
}
