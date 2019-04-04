package com.daokoujinke.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CPersonalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CPersonalInfoExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdcodeIsNull() {
            addCriterion("idcode is null");
            return (Criteria) this;
        }

        public Criteria andIdcodeIsNotNull() {
            addCriterion("idcode is not null");
            return (Criteria) this;
        }

        public Criteria andIdcodeEqualTo(String value) {
            addCriterion("idcode =", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeNotEqualTo(String value) {
            addCriterion("idcode <>", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeGreaterThan(String value) {
            addCriterion("idcode >", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeGreaterThanOrEqualTo(String value) {
            addCriterion("idcode >=", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeLessThan(String value) {
            addCriterion("idcode <", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeLessThanOrEqualTo(String value) {
            addCriterion("idcode <=", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeLike(String value) {
            addCriterion("idcode like", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeNotLike(String value) {
            addCriterion("idcode not like", value, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeIn(List<String> values) {
            addCriterion("idcode in", values, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeNotIn(List<String> values) {
            addCriterion("idcode not in", values, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeBetween(String value1, String value2) {
            addCriterion("idcode between", value1, value2, "idcode");
            return (Criteria) this;
        }

        public Criteria andIdcodeNotBetween(String value1, String value2) {
            addCriterion("idcode not between", value1, value2, "idcode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("indate is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("indate is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(String value) {
            addCriterion("indate =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(String value) {
            addCriterion("indate <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(String value) {
            addCriterion("indate >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(String value) {
            addCriterion("indate >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(String value) {
            addCriterion("indate <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(String value) {
            addCriterion("indate <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLike(String value) {
            addCriterion("indate like", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotLike(String value) {
            addCriterion("indate not like", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<String> values) {
            addCriterion("indate in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<String> values) {
            addCriterion("indate not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(String value1, String value2) {
            addCriterion("indate between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(String value1, String value2) {
            addCriterion("indate not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNull() {
            addCriterion("bank_card is null");
            return (Criteria) this;
        }

        public Criteria andBankCardIsNotNull() {
            addCriterion("bank_card is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardEqualTo(String value) {
            addCriterion("bank_card =", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotEqualTo(String value) {
            addCriterion("bank_card <>", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThan(String value) {
            addCriterion("bank_card >", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card >=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThan(String value) {
            addCriterion("bank_card <", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLessThanOrEqualTo(String value) {
            addCriterion("bank_card <=", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardLike(String value) {
            addCriterion("bank_card like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotLike(String value) {
            addCriterion("bank_card not like", value, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardIn(List<String> values) {
            addCriterion("bank_card in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotIn(List<String> values) {
            addCriterion("bank_card not in", values, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardBetween(String value1, String value2) {
            addCriterion("bank_card between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andBankCardNotBetween(String value1, String value2) {
            addCriterion("bank_card not between", value1, value2, "bankCard");
            return (Criteria) this;
        }

        public Criteria andEduIsNull() {
            addCriterion("edu is null");
            return (Criteria) this;
        }

        public Criteria andEduIsNotNull() {
            addCriterion("edu is not null");
            return (Criteria) this;
        }

        public Criteria andEduEqualTo(String value) {
            addCriterion("edu =", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotEqualTo(String value) {
            addCriterion("edu <>", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThan(String value) {
            addCriterion("edu >", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduGreaterThanOrEqualTo(String value) {
            addCriterion("edu >=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThan(String value) {
            addCriterion("edu <", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLessThanOrEqualTo(String value) {
            addCriterion("edu <=", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduLike(String value) {
            addCriterion("edu like", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotLike(String value) {
            addCriterion("edu not like", value, "edu");
            return (Criteria) this;
        }

        public Criteria andEduIn(List<String> values) {
            addCriterion("edu in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotIn(List<String> values) {
            addCriterion("edu not in", values, "edu");
            return (Criteria) this;
        }

        public Criteria andEduBetween(String value1, String value2) {
            addCriterion("edu between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andEduNotBetween(String value1, String value2) {
            addCriterion("edu not between", value1, value2, "edu");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNull() {
            addCriterion("detail_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNotNull() {
            addCriterion("detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressEqualTo(String value) {
            addCriterion("detail_address =", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotEqualTo(String value) {
            addCriterion("detail_address <>", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThan(String value) {
            addCriterion("detail_address >", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detail_address >=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThan(String value) {
            addCriterion("detail_address <", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("detail_address <=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLike(String value) {
            addCriterion("detail_address like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotLike(String value) {
            addCriterion("detail_address not like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIn(List<String> values) {
            addCriterion("detail_address in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotIn(List<String> values) {
            addCriterion("detail_address not in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressBetween(String value1, String value2) {
            addCriterion("detail_address between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotBetween(String value1, String value2) {
            addCriterion("detail_address not between", value1, value2, "detailAddress");
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

        public Criteria andIdcardFrontUrlIsNull() {
            addCriterion("idcard_front_url is null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlIsNotNull() {
            addCriterion("idcard_front_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlEqualTo(String value) {
            addCriterion("idcard_front_url =", value, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlNotEqualTo(String value) {
            addCriterion("idcard_front_url <>", value, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlGreaterThan(String value) {
            addCriterion("idcard_front_url >", value, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_front_url >=", value, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlLessThan(String value) {
            addCriterion("idcard_front_url <", value, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlLessThanOrEqualTo(String value) {
            addCriterion("idcard_front_url <=", value, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlLike(String value) {
            addCriterion("idcard_front_url like", value, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlNotLike(String value) {
            addCriterion("idcard_front_url not like", value, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlIn(List<String> values) {
            addCriterion("idcard_front_url in", values, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlNotIn(List<String> values) {
            addCriterion("idcard_front_url not in", values, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlBetween(String value1, String value2) {
            addCriterion("idcard_front_url between", value1, value2, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardFrontUrlNotBetween(String value1, String value2) {
            addCriterion("idcard_front_url not between", value1, value2, "idcardFrontUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlIsNull() {
            addCriterion("idcard_back_url is null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlIsNotNull() {
            addCriterion("idcard_back_url is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlEqualTo(String value) {
            addCriterion("idcard_back_url =", value, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlNotEqualTo(String value) {
            addCriterion("idcard_back_url <>", value, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlGreaterThan(String value) {
            addCriterion("idcard_back_url >", value, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlGreaterThanOrEqualTo(String value) {
            addCriterion("idcard_back_url >=", value, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlLessThan(String value) {
            addCriterion("idcard_back_url <", value, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlLessThanOrEqualTo(String value) {
            addCriterion("idcard_back_url <=", value, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlLike(String value) {
            addCriterion("idcard_back_url like", value, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlNotLike(String value) {
            addCriterion("idcard_back_url not like", value, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlIn(List<String> values) {
            addCriterion("idcard_back_url in", values, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlNotIn(List<String> values) {
            addCriterion("idcard_back_url not in", values, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlBetween(String value1, String value2) {
            addCriterion("idcard_back_url between", value1, value2, "idcardBackUrl");
            return (Criteria) this;
        }

        public Criteria andIdcardBackUrlNotBetween(String value1, String value2) {
            addCriterion("idcard_back_url not between", value1, value2, "idcardBackUrl");
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