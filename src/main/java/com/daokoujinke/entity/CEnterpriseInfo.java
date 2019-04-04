package com.daokoujinke.entity;

import java.io.Serializable;
import java.util.Date;

public class CEnterpriseInfo implements Serializable {
    private Integer id;

    private String cusName;

    private String creditNo;

    private String address;

    private String licenseUrl;

    private String halfReportUrl;

    private String dkId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName == null ? null : cusName.trim();
    }

    public String getCreditNo() {
        return creditNo;
    }

    public void setCreditNo(String creditNo) {
        this.creditNo = creditNo == null ? null : creditNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl == null ? null : licenseUrl.trim();
    }

    public String getHalfReportUrl() {
        return halfReportUrl;
    }

    public void setHalfReportUrl(String halfReportUrl) {
        this.halfReportUrl = halfReportUrl == null ? null : halfReportUrl.trim();
    }

    public String getDkId() {
        return dkId;
    }

    public void setDkId(String dkId) {
        this.dkId = dkId == null ? null : dkId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}