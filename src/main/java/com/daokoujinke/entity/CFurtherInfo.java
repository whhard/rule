package com.daokoujinke.entity;

import java.io.Serializable;
import java.util.Date;

public class CFurtherInfo implements Serializable {
    private Integer id;

    private String dkId;

    private String scPhoto;

    private String scPhotoUrl;

    private String spouseIdcard;

    private String spouseScPhotoUrl;

    private String spouseIdcardFrontUrl;

    private String spouseIdcardBackUrl;

    private String housePhoto;

    private String housePhotoUrl;

    private String carPhoto;

    private String carPhotoFrontUrl;

    private String carPhotoBackUrl;

    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDkId() {
        return dkId;
    }

    public void setDkId(String dkId) {
        this.dkId = dkId == null ? null : dkId.trim();
    }

    public String getScPhoto() {
        return scPhoto;
    }

    public void setScPhoto(String scPhoto) {
        this.scPhoto = scPhoto == null ? null : scPhoto.trim();
    }

    public String getScPhotoUrl() {
        return scPhotoUrl;
    }

    public void setScPhotoUrl(String scPhotoUrl) {
        this.scPhotoUrl = scPhotoUrl == null ? null : scPhotoUrl.trim();
    }

    public String getSpouseIdcard() {
        return spouseIdcard;
    }

    public void setSpouseIdcard(String spouseIdcard) {
        this.spouseIdcard = spouseIdcard == null ? null : spouseIdcard.trim();
    }

    public String getSpouseScPhotoUrl() {
        return spouseScPhotoUrl;
    }

    public void setSpouseScPhotoUrl(String spouseScPhotoUrl) {
        this.spouseScPhotoUrl = spouseScPhotoUrl == null ? null : spouseScPhotoUrl.trim();
    }

    public String getSpouseIdcardFrontUrl() {
        return spouseIdcardFrontUrl;
    }

    public void setSpouseIdcardFrontUrl(String spouseIdcardFrontUrl) {
        this.spouseIdcardFrontUrl = spouseIdcardFrontUrl == null ? null : spouseIdcardFrontUrl.trim();
    }

    public String getSpouseIdcardBackUrl() {
        return spouseIdcardBackUrl;
    }

    public void setSpouseIdcardBackUrl(String spouseIdcardBackUrl) {
        this.spouseIdcardBackUrl = spouseIdcardBackUrl == null ? null : spouseIdcardBackUrl.trim();
    }

    public String getHousePhoto() {
        return housePhoto;
    }

    public void setHousePhoto(String housePhoto) {
        this.housePhoto = housePhoto == null ? null : housePhoto.trim();
    }

    public String getHousePhotoUrl() {
        return housePhotoUrl;
    }

    public void setHousePhotoUrl(String housePhotoUrl) {
        this.housePhotoUrl = housePhotoUrl == null ? null : housePhotoUrl.trim();
    }

    public String getCarPhoto() {
        return carPhoto;
    }

    public void setCarPhoto(String carPhoto) {
        this.carPhoto = carPhoto == null ? null : carPhoto.trim();
    }

    public String getCarPhotoFrontUrl() {
        return carPhotoFrontUrl;
    }

    public void setCarPhotoFrontUrl(String carPhotoFrontUrl) {
        this.carPhotoFrontUrl = carPhotoFrontUrl == null ? null : carPhotoFrontUrl.trim();
    }

    public String getCarPhotoBackUrl() {
        return carPhotoBackUrl;
    }

    public void setCarPhotoBackUrl(String carPhotoBackUrl) {
        this.carPhotoBackUrl = carPhotoBackUrl == null ? null : carPhotoBackUrl.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}