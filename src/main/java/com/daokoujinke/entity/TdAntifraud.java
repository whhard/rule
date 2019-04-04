package com.daokoujinke.entity;

import java.io.Serializable;
import java.util.Date;

public class TdAntifraud implements Serializable {
    private Integer id;

    private String custName;

    private String actName;

    private String idcode;

    private Date createTime;

    private String antifraudContent;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getActName() {
        return actName;
    }

    public void setActName(String actName) {
        this.actName = actName == null ? null : actName.trim();
    }

    public String getIdcode() {
        return idcode;
    }

    public void setIdcode(String idcode) {
        this.idcode = idcode == null ? null : idcode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAntifraudContent() {
        return antifraudContent;
    }

    public void setAntifraudContent(String antifraudContent) {
        this.antifraudContent = antifraudContent == null ? null : antifraudContent.trim();
    }
}