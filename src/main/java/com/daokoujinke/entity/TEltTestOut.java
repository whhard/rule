package com.daokoujinke.entity;

import java.io.Serializable;

public class TEltTestOut implements Serializable {
    private Integer id;

    private String companyName;

    private Integer estatime;

    private String regcapital;

    private String managestate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public Integer getEstatime() {
        return estatime;
    }

    public void setEstatime(Integer estatime) {
        this.estatime = estatime;
    }

    public String getRegcapital() {
        return regcapital;
    }

    public void setRegcapital(String regcapital) {
        this.regcapital = regcapital == null ? null : regcapital.trim();
    }

    public String getManagestate() {
        return managestate;
    }

    public void setManagestate(String managestate) {
        this.managestate = managestate == null ? null : managestate.trim();
    }
}