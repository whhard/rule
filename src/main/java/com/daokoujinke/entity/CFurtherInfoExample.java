package com.daokoujinke.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CFurtherInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CFurtherInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDkIdIsNull() {
            addCriterion("dk_id is null");
            return (Criteria) this;
        }

        public Criteria andDkIdIsNotNull() {
            addCriterion("dk_id is not null");
            return (Criteria) this;
        }

        public Criteria andDkIdEqualTo(String value) {
            addCriterion("dk_id =", value, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdNotEqualTo(String value) {
            addCriterion("dk_id <>", value, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdGreaterThan(String value) {
            addCriterion("dk_id >", value, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdGreaterThanOrEqualTo(String value) {
            addCriterion("dk_id >=", value, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdLessThan(String value) {
            addCriterion("dk_id <", value, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdLessThanOrEqualTo(String value) {
            addCriterion("dk_id <=", value, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdLike(String value) {
            addCriterion("dk_id like", value, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdNotLike(String value) {
            addCriterion("dk_id not like", value, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdIn(List<String> values) {
            addCriterion("dk_id in", values, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdNotIn(List<String> values) {
            addCriterion("dk_id not in", values, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdBetween(String value1, String value2) {
            addCriterion("dk_id between", value1, value2, "dkId");
            return (Criteria) this;
        }

        public Criteria andDkIdNotBetween(String value1, String value2) {
            addCriterion("dk_id not between", value1, value2, "dkId");
            return (Criteria) this;
        }

        public Criteria andScPhotoIsNull() {
            addCriterion("sc_photo is null");
            return (Criteria) this;
        }

        public Criteria andScPhotoIsNotNull() {
            addCriterion("sc_photo is not null");
            return (Criteria) this;
        }

        public Criteria andScPhotoEqualTo(String value) {
            addCriterion("sc_photo =", value, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoNotEqualTo(String value) {
            addCriterion("sc_photo <>", value, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoGreaterThan(String value) {
            addCriterion("sc_photo >", value, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("sc_photo >=", value, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoLessThan(String value) {
            addCriterion("sc_photo <", value, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoLessThanOrEqualTo(String value) {
            addCriterion("sc_photo <=", value, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoLike(String value) {
            addCriterion("sc_photo like", value, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoNotLike(String value) {
            addCriterion("sc_photo not like", value, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoIn(List<String> values) {
            addCriterion("sc_photo in", values, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoNotIn(List<String> values) {
            addCriterion("sc_photo not in", values, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoBetween(String value1, String value2) {
            addCriterion("sc_photo between", value1, value2, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoNotBetween(String value1, String value2) {
            addCriterion("sc_photo not between", value1, value2, "scPhoto");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlIsNull() {
            addCriterion("sc_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlIsNotNull() {
            addCriterion("sc_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlEqualTo(String value) {
            addCriterion("sc_photo_url =", value, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlNotEqualTo(String value) {
            addCriterion("sc_photo_url <>", value, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlGreaterThan(String value) {
            addCriterion("sc_photo_url >", value, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("sc_photo_url >=", value, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlLessThan(String value) {
            addCriterion("sc_photo_url <", value, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("sc_photo_url <=", value, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlLike(String value) {
            addCriterion("sc_photo_url like", value, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlNotLike(String value) {
            addCriterion("sc_photo_url not like", value, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlIn(List<String> values) {
            addCriterion("sc_photo_url in", values, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlNotIn(List<String> values) {
            addCriterion("sc_photo_url not in", values, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlBetween(String value1, String value2) {
            addCriterion("sc_photo_url between", value1, value2, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andScPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("sc_photo_url not between", value1, value2, "scPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardIsNull() {
            addCriterion("spouse_idcard is null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardIsNotNull() {
            addCriterion("spouse_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardEqualTo(String value) {
            addCriterion("spouse_idcard =", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardNotEqualTo(String value) {
            addCriterion("spouse_idcard <>", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardGreaterThan(String value) {
            addCriterion("spouse_idcard >", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_idcard >=", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardLessThan(String value) {
            addCriterion("spouse_idcard <", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardLessThanOrEqualTo(String value) {
            addCriterion("spouse_idcard <=", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardLike(String value) {
            addCriterion("spouse_idcard like", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardNotLike(String value) {
            addCriterion("spouse_idcard not like", value, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardIn(List<String> values) {
            addCriterion("spouse_idcard in", values, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardNotIn(List<String> values) {
            addCriterion("spouse_idcard not in", values, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBetween(String value1, String value2) {
            addCriterion("spouse_idcard between", value1, value2, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardNotBetween(String value1, String value2) {
            addCriterion("spouse_idcard not between", value1, value2, "spouseIdcard");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlIsNull() {
            addCriterion("spouse_sc_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlIsNotNull() {
            addCriterion("spouse_sc_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlEqualTo(String value) {
            addCriterion("spouse_sc_photo_url =", value, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlNotEqualTo(String value) {
            addCriterion("spouse_sc_photo_url <>", value, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlGreaterThan(String value) {
            addCriterion("spouse_sc_photo_url >", value, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_sc_photo_url >=", value, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlLessThan(String value) {
            addCriterion("spouse_sc_photo_url <", value, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("spouse_sc_photo_url <=", value, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlLike(String value) {
            addCriterion("spouse_sc_photo_url like", value, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlNotLike(String value) {
            addCriterion("spouse_sc_photo_url not like", value, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlIn(List<String> values) {
            addCriterion("spouse_sc_photo_url in", values, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlNotIn(List<String> values) {
            addCriterion("spouse_sc_photo_url not in", values, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlBetween(String value1, String value2) {
            addCriterion("spouse_sc_photo_url between", value1, value2, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseScPhotoUrlNotBetween(String value1, String value2) {
            addCriterion("spouse_sc_photo_url not between", value1, value2, "spouseScPhotoUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlIsNull() {
            addCriterion("spouse_idcard_front_url is null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlIsNotNull() {
            addCriterion("spouse_idcard_front_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlEqualTo(String value) {
            addCriterion("spouse_idcard_front_url =", value, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlNotEqualTo(String value) {
            addCriterion("spouse_idcard_front_url <>", value, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlGreaterThan(String value) {
            addCriterion("spouse_idcard_front_url >", value, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_idcard_front_url >=", value, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlLessThan(String value) {
            addCriterion("spouse_idcard_front_url <", value, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlLessThanOrEqualTo(String value) {
            addCriterion("spouse_idcard_front_url <=", value, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlLike(String value) {
            addCriterion("spouse_idcard_front_url like", value, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlNotLike(String value) {
            addCriterion("spouse_idcard_front_url not like", value, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlIn(List<String> values) {
            addCriterion("spouse_idcard_front_url in", values, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlNotIn(List<String> values) {
            addCriterion("spouse_idcard_front_url not in", values, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlBetween(String value1, String value2) {
            addCriterion("spouse_idcard_front_url between", value1, value2, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardFrontUrlNotBetween(String value1, String value2) {
            addCriterion("spouse_idcard_front_url not between", value1, value2, "spouseIdcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlIsNull() {
            addCriterion("spouse_idcard_back_url is null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlIsNotNull() {
            addCriterion("spouse_idcard_back_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlEqualTo(String value) {
            addCriterion("spouse_idcard_back_url =", value, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlNotEqualTo(String value) {
            addCriterion("spouse_idcard_back_url <>", value, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlGreaterThan(String value) {
            addCriterion("spouse_idcard_back_url >", value, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_idcard_back_url >=", value, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlLessThan(String value) {
            addCriterion("spouse_idcard_back_url <", value, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlLessThanOrEqualTo(String value) {
            addCriterion("spouse_idcard_back_url <=", value, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlLike(String value) {
            addCriterion("spouse_idcard_back_url like", value, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlNotLike(String value) {
            addCriterion("spouse_idcard_back_url not like", value, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlIn(List<String> values) {
            addCriterion("spouse_idcard_back_url in", values, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlNotIn(List<String> values) {
            addCriterion("spouse_idcard_back_url not in", values, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlBetween(String value1, String value2) {
            addCriterion("spouse_idcard_back_url between", value1, value2, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcardBackUrlNotBetween(String value1, String value2) {
            addCriterion("spouse_idcard_back_url not between", value1, value2, "spouseIdcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIsNull() {
            addCriterion("house_photo is null");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIsNotNull() {
            addCriterion("house_photo is not null");
            return (Criteria) this;
        }

        public Criteria andHousePhotoEqualTo(String value) {
            addCriterion("house_photo =", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotEqualTo(String value) {
            addCriterion("house_photo <>", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoGreaterThan(String value) {
            addCriterion("house_photo >", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoGreaterThanOrEqualTo(String value) {
            addCriterion("house_photo >=", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLessThan(String value) {
            addCriterion("house_photo <", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLessThanOrEqualTo(String value) {
            addCriterion("house_photo <=", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoLike(String value) {
            addCriterion("house_photo like", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotLike(String value) {
            addCriterion("house_photo not like", value, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoIn(List<String> values) {
            addCriterion("house_photo in", values, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotIn(List<String> values) {
            addCriterion("house_photo not in", values, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoBetween(String value1, String value2) {
            addCriterion("house_photo between", value1, value2, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoNotBetween(String value1, String value2) {
            addCriterion("house_photo not between", value1, value2, "housePhoto");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlIsNull() {
            addCriterion("house_photo_url is null");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlIsNotNull() {
            addCriterion("house_photo_url is not null");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlEqualTo(String value) {
            addCriterion("house_photo_url =", value, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlNotEqualTo(String value) {
            addCriterion("house_photo_url <>", value, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlGreaterThan(String value) {
            addCriterion("house_photo_url >", value, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlGreaterThanOrEqualTo(String value) {
            addCriterion("house_photo_url >=", value, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlLessThan(String value) {
            addCriterion("house_photo_url <", value, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlLessThanOrEqualTo(String value) {
            addCriterion("house_photo_url <=", value, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlLike(String value) {
            addCriterion("house_photo_url like", value, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlNotLike(String value) {
            addCriterion("house_photo_url not like", value, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlIn(List<String> values) {
            addCriterion("house_photo_url in", values, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlNotIn(List<String> values) {
            addCriterion("house_photo_url not in", values, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlBetween(String value1, String value2) {
            addCriterion("house_photo_url between", value1, value2, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andHousePhotoUrlNotBetween(String value1, String value2) {
            addCriterion("house_photo_url not between", value1, value2, "housePhotoUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoIsNull() {
            addCriterion("car_photo is null");
            return (Criteria) this;
        }

        public Criteria andCarPhotoIsNotNull() {
            addCriterion("car_photo is not null");
            return (Criteria) this;
        }

        public Criteria andCarPhotoEqualTo(String value) {
            addCriterion("car_photo =", value, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoNotEqualTo(String value) {
            addCriterion("car_photo <>", value, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoGreaterThan(String value) {
            addCriterion("car_photo >", value, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("car_photo >=", value, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoLessThan(String value) {
            addCriterion("car_photo <", value, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoLessThanOrEqualTo(String value) {
            addCriterion("car_photo <=", value, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoLike(String value) {
            addCriterion("car_photo like", value, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoNotLike(String value) {
            addCriterion("car_photo not like", value, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoIn(List<String> values) {
            addCriterion("car_photo in", values, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoNotIn(List<String> values) {
            addCriterion("car_photo not in", values, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBetween(String value1, String value2) {
            addCriterion("car_photo between", value1, value2, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoNotBetween(String value1, String value2) {
            addCriterion("car_photo not between", value1, value2, "carPhoto");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlIsNull() {
            addCriterion("car_photo_front_url is null");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlIsNotNull() {
            addCriterion("car_photo_front_url is not null");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlEqualTo(String value) {
            addCriterion("car_photo_front_url =", value, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlNotEqualTo(String value) {
            addCriterion("car_photo_front_url <>", value, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlGreaterThan(String value) {
            addCriterion("car_photo_front_url >", value, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlGreaterThanOrEqualTo(String value) {
            addCriterion("car_photo_front_url >=", value, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlLessThan(String value) {
            addCriterion("car_photo_front_url <", value, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlLessThanOrEqualTo(String value) {
            addCriterion("car_photo_front_url <=", value, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlLike(String value) {
            addCriterion("car_photo_front_url like", value, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlNotLike(String value) {
            addCriterion("car_photo_front_url not like", value, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlIn(List<String> values) {
            addCriterion("car_photo_front_url in", values, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlNotIn(List<String> values) {
            addCriterion("car_photo_front_url not in", values, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlBetween(String value1, String value2) {
            addCriterion("car_photo_front_url between", value1, value2, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoFrontUrlNotBetween(String value1, String value2) {
            addCriterion("car_photo_front_url not between", value1, value2, "carPhotoFrontUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlIsNull() {
            addCriterion("car_photo_back_url is null");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlIsNotNull() {
            addCriterion("car_photo_back_url is not null");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlEqualTo(String value) {
            addCriterion("car_photo_back_url =", value, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlNotEqualTo(String value) {
            addCriterion("car_photo_back_url <>", value, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlGreaterThan(String value) {
            addCriterion("car_photo_back_url >", value, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("car_photo_back_url >=", value, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlLessThan(String value) {
            addCriterion("car_photo_back_url <", value, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlLessThanOrEqualTo(String value) {
            addCriterion("car_photo_back_url <=", value, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlLike(String value) {
            addCriterion("car_photo_back_url like", value, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlNotLike(String value) {
            addCriterion("car_photo_back_url not like", value, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlIn(List<String> values) {
            addCriterion("car_photo_back_url in", values, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlNotIn(List<String> values) {
            addCriterion("car_photo_back_url not in", values, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlBetween(String value1, String value2) {
            addCriterion("car_photo_back_url between", value1, value2, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCarPhotoBackUrlNotBetween(String value1, String value2) {
            addCriterion("car_photo_back_url not between", value1, value2, "carPhotoBackUrl");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}