package com.daokoujinke.entity;

import java.io.Serializable;
import java.util.Date;

public class CRelationInfo implements Serializable {
    private Integer id;

    private String maritalStatus;

    private String spouseName;

    private String spousePhone;

    private String spouseIdcode;

    private String spouseEdu;

    private String contactRel;

    private String contactName;

    private String contactPhone;

    private String dkId;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus == null ? null : maritalStatus.trim();
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName == null ? null : spouseName.trim();
    }

    public String getSpousePhone() {
        return spousePhone;
    }

    public void setSpousePhone(String spousePhone) {
        this.spousePhone = spousePhone == null ? null : spousePhone.trim();
    }

    public String getSpouseIdcode() {
        return spouseIdcode;
    }

    public void setSpouseIdcode(String spouseIdcode) {
        this.spouseIdcode = spouseIdcode == null ? null : spouseIdcode.trim();
    }

    public String getSpouseEdu() {
        return spouseEdu;
    }

    public void setSpouseEdu(String spouseEdu) {
        this.spouseEdu = spouseEdu == null ? null : spouseEdu.trim();
    }

    public String getContactRel() {
        return contactRel;
    }

    public void setContactRel(String contactRel) {
        this.contactRel = contactRel == null ? null : contactRel.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone == null ? null : contactPhone.trim();
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