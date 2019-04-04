package com.daokoujinke.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CRelationInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CRelationInfoExample() {
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

        public Criteria andMaritalStatusIsNull() {
            addCriterion("marital_status is null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIsNotNull() {
            addCriterion("marital_status is not null");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusEqualTo(String value) {
            addCriterion("marital_status =", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotEqualTo(String value) {
            addCriterion("marital_status <>", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThan(String value) {
            addCriterion("marital_status >", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("marital_status >=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThan(String value) {
            addCriterion("marital_status <", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLessThanOrEqualTo(String value) {
            addCriterion("marital_status <=", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusLike(String value) {
            addCriterion("marital_status like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotLike(String value) {
            addCriterion("marital_status not like", value, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusIn(List<String> values) {
            addCriterion("marital_status in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotIn(List<String> values) {
            addCriterion("marital_status not in", values, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusBetween(String value1, String value2) {
            addCriterion("marital_status between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andMaritalStatusNotBetween(String value1, String value2) {
            addCriterion("marital_status not between", value1, value2, "maritalStatus");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNull() {
            addCriterion("spouse_name is null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIsNotNull() {
            addCriterion("spouse_name is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseNameEqualTo(String value) {
            addCriterion("spouse_name =", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotEqualTo(String value) {
            addCriterion("spouse_name <>", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThan(String value) {
            addCriterion("spouse_name >", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_name >=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThan(String value) {
            addCriterion("spouse_name <", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLessThanOrEqualTo(String value) {
            addCriterion("spouse_name <=", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameLike(String value) {
            addCriterion("spouse_name like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotLike(String value) {
            addCriterion("spouse_name not like", value, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameIn(List<String> values) {
            addCriterion("spouse_name in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotIn(List<String> values) {
            addCriterion("spouse_name not in", values, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameBetween(String value1, String value2) {
            addCriterion("spouse_name between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpouseNameNotBetween(String value1, String value2) {
            addCriterion("spouse_name not between", value1, value2, "spouseName");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneIsNull() {
            addCriterion("spouse_phone is null");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneIsNotNull() {
            addCriterion("spouse_phone is not null");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneEqualTo(String value) {
            addCriterion("spouse_phone =", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneNotEqualTo(String value) {
            addCriterion("spouse_phone <>", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneGreaterThan(String value) {
            addCriterion("spouse_phone >", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_phone >=", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneLessThan(String value) {
            addCriterion("spouse_phone <", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneLessThanOrEqualTo(String value) {
            addCriterion("spouse_phone <=", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneLike(String value) {
            addCriterion("spouse_phone like", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneNotLike(String value) {
            addCriterion("spouse_phone not like", value, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneIn(List<String> values) {
            addCriterion("spouse_phone in", values, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneNotIn(List<String> values) {
            addCriterion("spouse_phone not in", values, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneBetween(String value1, String value2) {
            addCriterion("spouse_phone between", value1, value2, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpousePhoneNotBetween(String value1, String value2) {
            addCriterion("spouse_phone not between", value1, value2, "spousePhone");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeIsNull() {
            addCriterion("spouse_idcode is null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeIsNotNull() {
            addCriterion("spouse_idcode is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeEqualTo(String value) {
            addCriterion("spouse_idcode =", value, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeNotEqualTo(String value) {
            addCriterion("spouse_idcode <>", value, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeGreaterThan(String value) {
            addCriterion("spouse_idcode >", value, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_idcode >=", value, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeLessThan(String value) {
            addCriterion("spouse_idcode <", value, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeLessThanOrEqualTo(String value) {
            addCriterion("spouse_idcode <=", value, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeLike(String value) {
            addCriterion("spouse_idcode like", value, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeNotLike(String value) {
            addCriterion("spouse_idcode not like", value, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeIn(List<String> values) {
            addCriterion("spouse_idcode in", values, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeNotIn(List<String> values) {
            addCriterion("spouse_idcode not in", values, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeBetween(String value1, String value2) {
            addCriterion("spouse_idcode between", value1, value2, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseIdcodeNotBetween(String value1, String value2) {
            addCriterion("spouse_idcode not between", value1, value2, "spouseIdcode");
            return (Criteria) this;
        }

        public Criteria andSpouseEduIsNull() {
            addCriterion("spouse_edu is null");
            return (Criteria) this;
        }

        public Criteria andSpouseEduIsNotNull() {
            addCriterion("spouse_edu is not null");
            return (Criteria) this;
        }

        public Criteria andSpouseEduEqualTo(String value) {
            addCriterion("spouse_edu =", value, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduNotEqualTo(String value) {
            addCriterion("spouse_edu <>", value, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduGreaterThan(String value) {
            addCriterion("spouse_edu >", value, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduGreaterThanOrEqualTo(String value) {
            addCriterion("spouse_edu >=", value, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduLessThan(String value) {
            addCriterion("spouse_edu <", value, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduLessThanOrEqualTo(String value) {
            addCriterion("spouse_edu <=", value, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduLike(String value) {
            addCriterion("spouse_edu like", value, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduNotLike(String value) {
            addCriterion("spouse_edu not like", value, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduIn(List<String> values) {
            addCriterion("spouse_edu in", values, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduNotIn(List<String> values) {
            addCriterion("spouse_edu not in", values, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduBetween(String value1, String value2) {
            addCriterion("spouse_edu between", value1, value2, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andSpouseEduNotBetween(String value1, String value2) {
            addCriterion("spouse_edu not between", value1, value2, "spouseEdu");
            return (Criteria) this;
        }

        public Criteria andContactRelIsNull() {
            addCriterion("contact_rel is null");
            return (Criteria) this;
        }

        public Criteria andContactRelIsNotNull() {
            addCriterion("contact_rel is not null");
            return (Criteria) this;
        }

        public Criteria andContactRelEqualTo(String value) {
            addCriterion("contact_rel =", value, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelNotEqualTo(String value) {
            addCriterion("contact_rel <>", value, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelGreaterThan(String value) {
            addCriterion("contact_rel >", value, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelGreaterThanOrEqualTo(String value) {
            addCriterion("contact_rel >=", value, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelLessThan(String value) {
            addCriterion("contact_rel <", value, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelLessThanOrEqualTo(String value) {
            addCriterion("contact_rel <=", value, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelLike(String value) {
            addCriterion("contact_rel like", value, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelNotLike(String value) {
            addCriterion("contact_rel not like", value, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelIn(List<String> values) {
            addCriterion("contact_rel in", values, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelNotIn(List<String> values) {
            addCriterion("contact_rel not in", values, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelBetween(String value1, String value2) {
            addCriterion("contact_rel between", value1, value2, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactRelNotBetween(String value1, String value2) {
            addCriterion("contact_rel not between", value1, value2, "contactRel");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
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