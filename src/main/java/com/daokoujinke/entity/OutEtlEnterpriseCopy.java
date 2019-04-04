package com.daokoujinke.entity;

import java.io.Serializable;

public class OutEtlEnterpriseCopy implements Serializable {
    private Integer id;

    private String companyName;

    private Integer estatime;

    private String regcapital;

    private String managestate;

    private Integer lostexecnt;

    private Integer execnt;

    private Integer owntaxcnt;

    private String owntaxamtmax;

    private Double owntaxamtnew;

    private Double owntaxamtbal;

    private Integer legpersonchancnt;

    private Double regcapchanpct;

    private Integer exelast;

    private Integer noticecntY;

    private Integer notLaborcntY;

    private Integer docLaborcntY;

    private Integer docFinancingcntB;

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

    public Integer getLostexecnt() {
        return lostexecnt;
    }

    public void setLostexecnt(Integer lostexecnt) {
        this.lostexecnt = lostexecnt;
    }

    public Integer getExecnt() {
        return execnt;
    }

    public void setExecnt(Integer execnt) {
        this.execnt = execnt;
    }

    public Integer getOwntaxcnt() {
        return owntaxcnt;
    }

    public void setOwntaxcnt(Integer owntaxcnt) {
        this.owntaxcnt = owntaxcnt;
    }

    public String getOwntaxamtmax() {
        return owntaxamtmax;
    }

    public void setOwntaxamtmax(String owntaxamtmax) {
        this.owntaxamtmax = owntaxamtmax == null ? null : owntaxamtmax.trim();
    }

    public Double getOwntaxamtnew() {
        return owntaxamtnew;
    }

    public void setOwntaxamtnew(Double owntaxamtnew) {
        this.owntaxamtnew = owntaxamtnew;
    }

    public Double getOwntaxamtbal() {
        return owntaxamtbal;
    }

    public void setOwntaxamtbal(Double owntaxamtbal) {
        this.owntaxamtbal = owntaxamtbal;
    }

    public Integer getLegpersonchancnt() {
        return legpersonchancnt;
    }

    public void setLegpersonchancnt(Integer legpersonchancnt) {
        this.legpersonchancnt = legpersonchancnt;
    }

    public Double getRegcapchanpct() {
        return regcapchanpct;
    }

    public void setRegcapchanpct(Double regcapchanpct) {
        this.regcapchanpct = regcapchanpct;
    }

    public Integer getExelast() {
        return exelast;
    }

    public void setExelast(Integer exelast) {
        this.exelast = exelast;
    }

    public Integer getNoticecntY() {
        return noticecntY;
    }

    public void setNoticecntY(Integer noticecntY) {
        this.noticecntY = noticecntY;
    }

    public Integer getNotLaborcntY() {
        return notLaborcntY;
    }

    public void setNotLaborcntY(Integer notLaborcntY) {
        this.notLaborcntY = notLaborcntY;
    }

    public Integer getDocLaborcntY() {
        return docLaborcntY;
    }

    public void setDocLaborcntY(Integer docLaborcntY) {
        this.docLaborcntY = docLaborcntY;
    }

    public Integer getDocFinancingcntB() {
        return docFinancingcntB;
    }

    public void setDocFinancingcntB(Integer docFinancingcntB) {
        this.docFinancingcntB = docFinancingcntB;
    }
}