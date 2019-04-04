package com.daokoujinke.entity;

import java.util.ArrayList;
import java.util.List;

public class TAntifraudIndexExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TAntifraudIndexExample() {
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

        public Criteria andCustNameIsNull() {
            addCriterion("cust_name is null");
            return (Criteria) this;
        }

        public Criteria andCustNameIsNotNull() {
            addCriterion("cust_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustNameEqualTo(String value) {
            addCriterion("cust_name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotEqualTo(String value) {
            addCriterion("cust_name <>", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThan(String value) {
            addCriterion("cust_name >", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameGreaterThanOrEqualTo(String value) {
            addCriterion("cust_name >=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThan(String value) {
            addCriterion("cust_name <", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLessThanOrEqualTo(String value) {
            addCriterion("cust_name <=", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("cust_name like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotLike(String value) {
            addCriterion("cust_name not like", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameIn(List<String> values) {
            addCriterion("cust_name in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotIn(List<String> values) {
            addCriterion("cust_name not in", values, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameBetween(String value1, String value2) {
            addCriterion("cust_name between", value1, value2, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameNotBetween(String value1, String value2) {
            addCriterion("cust_name not between", value1, value2, "custName");
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

        public Criteria andPlatcnt7dLeaderIsNull() {
            addCriterion("PlatCnt_7D_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderIsNotNull() {
            addCriterion("PlatCnt_7D_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_7D_leader =", value, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_7D_leader <>", value, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_7D_leader >", value, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_7D_leader >=", value, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_7D_leader <", value, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_7D_leader <=", value, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_7D_leader in", values, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_7D_leader not in", values, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_7D_leader between", value1, value2, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt7dLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_7D_leader not between", value1, value2, "platcnt7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderIsNull() {
            addCriterion("PlatCnt_1M_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderIsNotNull() {
            addCriterion("PlatCnt_1M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_1M_leader =", value, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_1M_leader <>", value, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_1M_leader >", value, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_1M_leader >=", value, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_1M_leader <", value, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_1M_leader <=", value, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_1M_leader in", values, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_1M_leader not in", values, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_1M_leader between", value1, value2, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt1mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_1M_leader not between", value1, value2, "platcnt1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderIsNull() {
            addCriterion("PlatCnt_3M_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderIsNotNull() {
            addCriterion("PlatCnt_3M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_3M_leader =", value, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_3M_leader <>", value, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_3M_leader >", value, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_3M_leader >=", value, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_3M_leader <", value, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_3M_leader <=", value, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_3M_leader in", values, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_3M_leader not in", values, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_3M_leader between", value1, value2, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcnt3mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_3M_leader not between", value1, value2, "platcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderIsNull() {
            addCriterion("PlatCnt_Bank_7D_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderIsNotNull() {
            addCriterion("PlatCnt_Bank_7D_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_7D_leader =", value, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_7D_leader <>", value, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_Bank_7D_leader >", value, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_7D_leader >=", value, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_Bank_7D_leader <", value, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_7D_leader <=", value, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_Bank_7D_leader in", values, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_Bank_7D_leader not in", values, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_Bank_7D_leader between", value1, value2, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank7dLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_Bank_7D_leader not between", value1, value2, "platcntBank7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderIsNull() {
            addCriterion("PlatCnt_Bank_1M_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderIsNotNull() {
            addCriterion("PlatCnt_Bank_1M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_1M_leader =", value, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_1M_leader <>", value, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_Bank_1M_leader >", value, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_1M_leader >=", value, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_Bank_1M_leader <", value, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_1M_leader <=", value, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_Bank_1M_leader in", values, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_Bank_1M_leader not in", values, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_Bank_1M_leader between", value1, value2, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank1mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_Bank_1M_leader not between", value1, value2, "platcntBank1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderIsNull() {
            addCriterion("PlatCnt_Bank_3M_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderIsNotNull() {
            addCriterion("PlatCnt_Bank_3M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_3M_leader =", value, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_3M_leader <>", value, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_Bank_3M_leader >", value, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_3M_leader >=", value, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_Bank_3M_leader <", value, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_Bank_3M_leader <=", value, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_Bank_3M_leader in", values, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_Bank_3M_leader not in", values, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_Bank_3M_leader between", value1, value2, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntBank3mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_Bank_3M_leader not between", value1, value2, "platcntBank3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderIsNull() {
            addCriterion("PlatCnt_CSFin_7D_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderIsNotNull() {
            addCriterion("PlatCnt_CSFin_7D_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_7D_leader =", value, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_7D_leader <>", value, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_CSFin_7D_leader >", value, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_7D_leader >=", value, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_CSFin_7D_leader <", value, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_7D_leader <=", value, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_CSFin_7D_leader in", values, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_CSFin_7D_leader not in", values, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_CSFin_7D_leader between", value1, value2, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin7dLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_CSFin_7D_leader not between", value1, value2, "platcntCsfin7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderIsNull() {
            addCriterion("PlatCnt_CSFin_1M_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderIsNotNull() {
            addCriterion("PlatCnt_CSFin_1M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_1M_leader =", value, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_1M_leader <>", value, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_CSFin_1M_leader >", value, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_1M_leader >=", value, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_CSFin_1M_leader <", value, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_1M_leader <=", value, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_CSFin_1M_leader in", values, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_CSFin_1M_leader not in", values, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_CSFin_1M_leader between", value1, value2, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin1mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_CSFin_1M_leader not between", value1, value2, "platcntCsfin1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderIsNull() {
            addCriterion("PlatCnt_CSFin_3M_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderIsNotNull() {
            addCriterion("PlatCnt_CSFin_3M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_3M_leader =", value, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_3M_leader <>", value, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_CSFin_3M_leader >", value, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_3M_leader >=", value, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_CSFin_3M_leader <", value, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_CSFin_3M_leader <=", value, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_CSFin_3M_leader in", values, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_CSFin_3M_leader not in", values, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_CSFin_3M_leader between", value1, value2, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntCsfin3mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_CSFin_3M_leader not between", value1, value2, "platcntCsfin3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderIsNull() {
            addCriterion("PlatCnt_P2P_7D_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderIsNotNull() {
            addCriterion("PlatCnt_P2P_7D_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_7D_leader =", value, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_7D_leader <>", value, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_P2P_7D_leader >", value, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_7D_leader >=", value, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_P2P_7D_leader <", value, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_7D_leader <=", value, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_P2P_7D_leader in", values, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_P2P_7D_leader not in", values, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_P2P_7D_leader between", value1, value2, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p7dLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_P2P_7D_leader not between", value1, value2, "platcntP2p7dLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderIsNull() {
            addCriterion("PlatCnt_P2P_1M_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderIsNotNull() {
            addCriterion("PlatCnt_P2P_1M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_1M_leader =", value, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_1M_leader <>", value, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_P2P_1M_leader >", value, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_1M_leader >=", value, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_P2P_1M_leader <", value, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_1M_leader <=", value, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_P2P_1M_leader in", values, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_P2P_1M_leader not in", values, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_P2P_1M_leader between", value1, value2, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p1mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_P2P_1M_leader not between", value1, value2, "platcntP2p1mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderIsNull() {
            addCriterion("PlatCnt_P2P_3M_leader is null");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderIsNotNull() {
            addCriterion("PlatCnt_P2P_3M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_3M_leader =", value, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderNotEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_3M_leader <>", value, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderGreaterThan(Integer value) {
            addCriterion("PlatCnt_P2P_3M_leader >", value, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_3M_leader >=", value, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderLessThan(Integer value) {
            addCriterion("PlatCnt_P2P_3M_leader <", value, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("PlatCnt_P2P_3M_leader <=", value, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderIn(List<Integer> values) {
            addCriterion("PlatCnt_P2P_3M_leader in", values, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderNotIn(List<Integer> values) {
            addCriterion("PlatCnt_P2P_3M_leader not in", values, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_P2P_3M_leader between", value1, value2, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andPlatcntP2p3mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("PlatCnt_P2P_3M_leader not between", value1, value2, "platcntP2p3mLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderIsNull() {
            addCriterion("DueCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderIsNotNull() {
            addCriterion("DueCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderEqualTo(Integer value) {
            addCriterion("DueCnt_ID_leader =", value, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderNotEqualTo(Integer value) {
            addCriterion("DueCnt_ID_leader <>", value, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderGreaterThan(Integer value) {
            addCriterion("DueCnt_ID_leader >", value, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueCnt_ID_leader >=", value, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderLessThan(Integer value) {
            addCriterion("DueCnt_ID_leader <", value, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueCnt_ID_leader <=", value, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderIn(List<Integer> values) {
            addCriterion("DueCnt_ID_leader in", values, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderNotIn(List<Integer> values) {
            addCriterion("DueCnt_ID_leader not in", values, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueCnt_ID_leader between", value1, value2, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueCnt_ID_leader not between", value1, value2, "duecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderIsNull() {
            addCriterion("DueCnt_Te_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderIsNotNull() {
            addCriterion("DueCnt_Te_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderEqualTo(Integer value) {
            addCriterion("DueCnt_Te_leader =", value, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderNotEqualTo(Integer value) {
            addCriterion("DueCnt_Te_leader <>", value, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderGreaterThan(Integer value) {
            addCriterion("DueCnt_Te_leader >", value, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueCnt_Te_leader >=", value, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderLessThan(Integer value) {
            addCriterion("DueCnt_Te_leader <", value, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueCnt_Te_leader <=", value, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderIn(List<Integer> values) {
            addCriterion("DueCnt_Te_leader in", values, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderNotIn(List<Integer> values) {
            addCriterion("DueCnt_Te_leader not in", values, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueCnt_Te_leader between", value1, value2, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntTeLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueCnt_Te_leader not between", value1, value2, "duecntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderIsNull() {
            addCriterion("DueCnt_IDTe_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderIsNotNull() {
            addCriterion("DueCnt_IDTe_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderEqualTo(Integer value) {
            addCriterion("DueCnt_IDTe_leader =", value, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderNotEqualTo(Integer value) {
            addCriterion("DueCnt_IDTe_leader <>", value, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderGreaterThan(Integer value) {
            addCriterion("DueCnt_IDTe_leader >", value, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueCnt_IDTe_leader >=", value, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderLessThan(Integer value) {
            addCriterion("DueCnt_IDTe_leader <", value, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueCnt_IDTe_leader <=", value, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderIn(List<Integer> values) {
            addCriterion("DueCnt_IDTe_leader in", values, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderNotIn(List<Integer> values) {
            addCriterion("DueCnt_IDTe_leader not in", values, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueCnt_IDTe_leader between", value1, value2, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdteLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueCnt_IDTe_leader not between", value1, value2, "duecntIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderIsNull() {
            addCriterion("DueAmt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderIsNotNull() {
            addCriterion("DueAmt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderEqualTo(Integer value) {
            addCriterion("DueAmt_ID_leader =", value, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderNotEqualTo(Integer value) {
            addCriterion("DueAmt_ID_leader <>", value, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderGreaterThan(Integer value) {
            addCriterion("DueAmt_ID_leader >", value, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueAmt_ID_leader >=", value, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderLessThan(Integer value) {
            addCriterion("DueAmt_ID_leader <", value, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueAmt_ID_leader <=", value, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderIn(List<Integer> values) {
            addCriterion("DueAmt_ID_leader in", values, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderNotIn(List<Integer> values) {
            addCriterion("DueAmt_ID_leader not in", values, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueAmt_ID_leader between", value1, value2, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueAmt_ID_leader not between", value1, value2, "dueamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderIsNull() {
            addCriterion("DueAmt_Te_leader is null");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderIsNotNull() {
            addCriterion("DueAmt_Te_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderEqualTo(Integer value) {
            addCriterion("DueAmt_Te_leader =", value, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderNotEqualTo(Integer value) {
            addCriterion("DueAmt_Te_leader <>", value, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderGreaterThan(Integer value) {
            addCriterion("DueAmt_Te_leader >", value, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueAmt_Te_leader >=", value, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderLessThan(Integer value) {
            addCriterion("DueAmt_Te_leader <", value, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueAmt_Te_leader <=", value, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderIn(List<Integer> values) {
            addCriterion("DueAmt_Te_leader in", values, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderNotIn(List<Integer> values) {
            addCriterion("DueAmt_Te_leader not in", values, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueAmt_Te_leader between", value1, value2, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtTeLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueAmt_Te_leader not between", value1, value2, "dueamtTeLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderIsNull() {
            addCriterion("DueAmt_IDTe_leader is null");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderIsNotNull() {
            addCriterion("DueAmt_IDTe_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderEqualTo(Integer value) {
            addCriterion("DueAmt_IDTe_leader =", value, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderNotEqualTo(Integer value) {
            addCriterion("DueAmt_IDTe_leader <>", value, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderGreaterThan(Integer value) {
            addCriterion("DueAmt_IDTe_leader >", value, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueAmt_IDTe_leader >=", value, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderLessThan(Integer value) {
            addCriterion("DueAmt_IDTe_leader <", value, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueAmt_IDTe_leader <=", value, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderIn(List<Integer> values) {
            addCriterion("DueAmt_IDTe_leader in", values, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderNotIn(List<Integer> values) {
            addCriterion("DueAmt_IDTe_leader not in", values, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueAmt_IDTe_leader between", value1, value2, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDueamtIdteLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueAmt_IDTe_leader not between", value1, value2, "dueamtIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderIsNull() {
            addCriterion("DueDay_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderIsNotNull() {
            addCriterion("DueDay_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderEqualTo(Integer value) {
            addCriterion("DueDay_ID_leader =", value, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderNotEqualTo(Integer value) {
            addCriterion("DueDay_ID_leader <>", value, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderGreaterThan(Integer value) {
            addCriterion("DueDay_ID_leader >", value, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueDay_ID_leader >=", value, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderLessThan(Integer value) {
            addCriterion("DueDay_ID_leader <", value, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueDay_ID_leader <=", value, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderIn(List<Integer> values) {
            addCriterion("DueDay_ID_leader in", values, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderNotIn(List<Integer> values) {
            addCriterion("DueDay_ID_leader not in", values, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueDay_ID_leader between", value1, value2, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueDay_ID_leader not between", value1, value2, "duedayIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderIsNull() {
            addCriterion("DueDay_Te_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderIsNotNull() {
            addCriterion("DueDay_Te_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderEqualTo(Integer value) {
            addCriterion("DueDay_Te_leader =", value, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderNotEqualTo(Integer value) {
            addCriterion("DueDay_Te_leader <>", value, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderGreaterThan(Integer value) {
            addCriterion("DueDay_Te_leader >", value, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueDay_Te_leader >=", value, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderLessThan(Integer value) {
            addCriterion("DueDay_Te_leader <", value, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueDay_Te_leader <=", value, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderIn(List<Integer> values) {
            addCriterion("DueDay_Te_leader in", values, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderNotIn(List<Integer> values) {
            addCriterion("DueDay_Te_leader not in", values, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueDay_Te_leader between", value1, value2, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayTeLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueDay_Te_leader not between", value1, value2, "duedayTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderIsNull() {
            addCriterion("DueDay_IDTe_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderIsNotNull() {
            addCriterion("DueDay_IDTe_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderEqualTo(Integer value) {
            addCriterion("DueDay_IDTe_leader =", value, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderNotEqualTo(Integer value) {
            addCriterion("DueDay_IDTe_leader <>", value, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderGreaterThan(Integer value) {
            addCriterion("DueDay_IDTe_leader >", value, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueDay_IDTe_leader >=", value, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderLessThan(Integer value) {
            addCriterion("DueDay_IDTe_leader <", value, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueDay_IDTe_leader <=", value, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderIn(List<Integer> values) {
            addCriterion("DueDay_IDTe_leader in", values, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderNotIn(List<Integer> values) {
            addCriterion("DueDay_IDTe_leader not in", values, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueDay_IDTe_leader between", value1, value2, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andDuedayIdteLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueDay_IDTe_leader not between", value1, value2, "duedayIdteLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderIsNull() {
            addCriterion("TeToIDCnt_3M_leader is null");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderIsNotNull() {
            addCriterion("TeToIDCnt_3M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderEqualTo(Integer value) {
            addCriterion("TeToIDCnt_3M_leader =", value, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderNotEqualTo(Integer value) {
            addCriterion("TeToIDCnt_3M_leader <>", value, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderGreaterThan(Integer value) {
            addCriterion("TeToIDCnt_3M_leader >", value, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("TeToIDCnt_3M_leader >=", value, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderLessThan(Integer value) {
            addCriterion("TeToIDCnt_3M_leader <", value, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("TeToIDCnt_3M_leader <=", value, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderIn(List<Integer> values) {
            addCriterion("TeToIDCnt_3M_leader in", values, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderNotIn(List<Integer> values) {
            addCriterion("TeToIDCnt_3M_leader not in", values, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("TeToIDCnt_3M_leader between", value1, value2, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andTetoidcnt3mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("TeToIDCnt_3M_leader not between", value1, value2, "tetoidcnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderIsNull() {
            addCriterion("IDToTeCnt_3M_leader is null");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderIsNotNull() {
            addCriterion("IDToTeCnt_3M_leader is not null");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderEqualTo(Integer value) {
            addCriterion("IDToTeCnt_3M_leader =", value, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderNotEqualTo(Integer value) {
            addCriterion("IDToTeCnt_3M_leader <>", value, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderGreaterThan(Integer value) {
            addCriterion("IDToTeCnt_3M_leader >", value, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("IDToTeCnt_3M_leader >=", value, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderLessThan(Integer value) {
            addCriterion("IDToTeCnt_3M_leader <", value, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("IDToTeCnt_3M_leader <=", value, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderIn(List<Integer> values) {
            addCriterion("IDToTeCnt_3M_leader in", values, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderNotIn(List<Integer> values) {
            addCriterion("IDToTeCnt_3M_leader not in", values, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderBetween(Integer value1, Integer value2) {
            addCriterion("IDToTeCnt_3M_leader between", value1, value2, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andIdtotecnt3mLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("IDToTeCnt_3M_leader not between", value1, value2, "idtotecnt3mLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderIsNull() {
            addCriterion("DisCrdtCnt_IDName_leader is null");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderIsNotNull() {
            addCriterion("DisCrdtCnt_IDName_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderEqualTo(Integer value) {
            addCriterion("DisCrdtCnt_IDName_leader =", value, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderNotEqualTo(Integer value) {
            addCriterion("DisCrdtCnt_IDName_leader <>", value, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderGreaterThan(Integer value) {
            addCriterion("DisCrdtCnt_IDName_leader >", value, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisCrdtCnt_IDName_leader >=", value, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderLessThan(Integer value) {
            addCriterion("DisCrdtCnt_IDName_leader <", value, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DisCrdtCnt_IDName_leader <=", value, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderIn(List<Integer> values) {
            addCriterion("DisCrdtCnt_IDName_leader in", values, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderNotIn(List<Integer> values) {
            addCriterion("DisCrdtCnt_IDName_leader not in", values, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DisCrdtCnt_IDName_leader between", value1, value2, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdnameLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DisCrdtCnt_IDName_leader not between", value1, value2, "discrdtcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderIsNull() {
            addCriterion("ExeCnt_IDName_leader is null");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderIsNotNull() {
            addCriterion("ExeCnt_IDName_leader is not null");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderEqualTo(Integer value) {
            addCriterion("ExeCnt_IDName_leader =", value, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderNotEqualTo(Integer value) {
            addCriterion("ExeCnt_IDName_leader <>", value, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderGreaterThan(Integer value) {
            addCriterion("ExeCnt_IDName_leader >", value, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExeCnt_IDName_leader >=", value, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderLessThan(Integer value) {
            addCriterion("ExeCnt_IDName_leader <", value, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("ExeCnt_IDName_leader <=", value, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderIn(List<Integer> values) {
            addCriterion("ExeCnt_IDName_leader in", values, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderNotIn(List<Integer> values) {
            addCriterion("ExeCnt_IDName_leader not in", values, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderBetween(Integer value1, Integer value2) {
            addCriterion("ExeCnt_IDName_leader between", value1, value2, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdnameLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("ExeCnt_IDName_leader not between", value1, value2, "execntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderIsNull() {
            addCriterion("SetCnt_IDName_leader is null");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderIsNotNull() {
            addCriterion("SetCnt_IDName_leader is not null");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderEqualTo(Integer value) {
            addCriterion("SetCnt_IDName_leader =", value, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderNotEqualTo(Integer value) {
            addCriterion("SetCnt_IDName_leader <>", value, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderGreaterThan(Integer value) {
            addCriterion("SetCnt_IDName_leader >", value, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("SetCnt_IDName_leader >=", value, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderLessThan(Integer value) {
            addCriterion("SetCnt_IDName_leader <", value, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("SetCnt_IDName_leader <=", value, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderIn(List<Integer> values) {
            addCriterion("SetCnt_IDName_leader in", values, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderNotIn(List<Integer> values) {
            addCriterion("SetCnt_IDName_leader not in", values, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderBetween(Integer value1, Integer value2) {
            addCriterion("SetCnt_IDName_leader between", value1, value2, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdnameLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("SetCnt_IDName_leader not between", value1, value2, "setcntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderIsNull() {
            addCriterion("DueCnt_IDName_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderIsNotNull() {
            addCriterion("DueCnt_IDName_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderEqualTo(Integer value) {
            addCriterion("DueCnt_IDName_leader =", value, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderNotEqualTo(Integer value) {
            addCriterion("DueCnt_IDName_leader <>", value, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderGreaterThan(Integer value) {
            addCriterion("DueCnt_IDName_leader >", value, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DueCnt_IDName_leader >=", value, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderLessThan(Integer value) {
            addCriterion("DueCnt_IDName_leader <", value, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DueCnt_IDName_leader <=", value, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderIn(List<Integer> values) {
            addCriterion("DueCnt_IDName_leader in", values, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderNotIn(List<Integer> values) {
            addCriterion("DueCnt_IDName_leader not in", values, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DueCnt_IDName_leader between", value1, value2, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andDuecntIdnameLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DueCnt_IDName_leader not between", value1, value2, "duecntIdnameLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderIsNull() {
            addCriterion("HighRisk_leader is null");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderIsNotNull() {
            addCriterion("HighRisk_leader is not null");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderEqualTo(Integer value) {
            addCriterion("HighRisk_leader =", value, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderNotEqualTo(Integer value) {
            addCriterion("HighRisk_leader <>", value, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderGreaterThan(Integer value) {
            addCriterion("HighRisk_leader >", value, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("HighRisk_leader >=", value, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderLessThan(Integer value) {
            addCriterion("HighRisk_leader <", value, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("HighRisk_leader <=", value, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderIn(List<Integer> values) {
            addCriterion("HighRisk_leader in", values, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderNotIn(List<Integer> values) {
            addCriterion("HighRisk_leader not in", values, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderBetween(Integer value1, Integer value2) {
            addCriterion("HighRisk_leader between", value1, value2, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andHighriskLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("HighRisk_leader not between", value1, value2, "highriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderIsNull() {
            addCriterion("MidRisk_leader is null");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderIsNotNull() {
            addCriterion("MidRisk_leader is not null");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderEqualTo(Integer value) {
            addCriterion("MidRisk_leader =", value, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderNotEqualTo(Integer value) {
            addCriterion("MidRisk_leader <>", value, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderGreaterThan(Integer value) {
            addCriterion("MidRisk_leader >", value, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("MidRisk_leader >=", value, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderLessThan(Integer value) {
            addCriterion("MidRisk_leader <", value, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("MidRisk_leader <=", value, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderIn(List<Integer> values) {
            addCriterion("MidRisk_leader in", values, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderNotIn(List<Integer> values) {
            addCriterion("MidRisk_leader not in", values, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderBetween(Integer value1, Integer value2) {
            addCriterion("MidRisk_leader between", value1, value2, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andMidriskLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("MidRisk_leader not between", value1, value2, "midriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderIsNull() {
            addCriterion("LowRisk_leader is null");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderIsNotNull() {
            addCriterion("LowRisk_leader is not null");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderEqualTo(Integer value) {
            addCriterion("LowRisk_leader =", value, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderNotEqualTo(Integer value) {
            addCriterion("LowRisk_leader <>", value, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderGreaterThan(Integer value) {
            addCriterion("LowRisk_leader >", value, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("LowRisk_leader >=", value, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderLessThan(Integer value) {
            addCriterion("LowRisk_leader <", value, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("LowRisk_leader <=", value, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderIn(List<Integer> values) {
            addCriterion("LowRisk_leader in", values, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderNotIn(List<Integer> values) {
            addCriterion("LowRisk_leader not in", values, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderBetween(Integer value1, Integer value2) {
            addCriterion("LowRisk_leader between", value1, value2, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andLowriskLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("LowRisk_leader not between", value1, value2, "lowriskLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderIsNull() {
            addCriterion("final_score_leader is null");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderIsNotNull() {
            addCriterion("final_score_leader is not null");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderEqualTo(Integer value) {
            addCriterion("final_score_leader =", value, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderNotEqualTo(Integer value) {
            addCriterion("final_score_leader <>", value, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderGreaterThan(Integer value) {
            addCriterion("final_score_leader >", value, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("final_score_leader >=", value, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderLessThan(Integer value) {
            addCriterion("final_score_leader <", value, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("final_score_leader <=", value, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderIn(List<Integer> values) {
            addCriterion("final_score_leader in", values, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderNotIn(List<Integer> values) {
            addCriterion("final_score_leader not in", values, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderBetween(Integer value1, Integer value2) {
            addCriterion("final_score_leader between", value1, value2, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalScoreLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("final_score_leader not between", value1, value2, "finalScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderIsNull() {
            addCriterion("antifraud_score_leader is null");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderIsNotNull() {
            addCriterion("antifraud_score_leader is not null");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderEqualTo(Integer value) {
            addCriterion("antifraud_score_leader =", value, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderNotEqualTo(Integer value) {
            addCriterion("antifraud_score_leader <>", value, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderGreaterThan(Integer value) {
            addCriterion("antifraud_score_leader >", value, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("antifraud_score_leader >=", value, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderLessThan(Integer value) {
            addCriterion("antifraud_score_leader <", value, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("antifraud_score_leader <=", value, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderIn(List<Integer> values) {
            addCriterion("antifraud_score_leader in", values, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderNotIn(List<Integer> values) {
            addCriterion("antifraud_score_leader not in", values, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderBetween(Integer value1, Integer value2) {
            addCriterion("antifraud_score_leader between", value1, value2, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andAntifraudScoreLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("antifraud_score_leader not between", value1, value2, "antifraudScoreLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderIsNull() {
            addCriterion("final_decision_leader is null");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderIsNotNull() {
            addCriterion("final_decision_leader is not null");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderEqualTo(String value) {
            addCriterion("final_decision_leader =", value, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderNotEqualTo(String value) {
            addCriterion("final_decision_leader <>", value, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderGreaterThan(String value) {
            addCriterion("final_decision_leader >", value, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderGreaterThanOrEqualTo(String value) {
            addCriterion("final_decision_leader >=", value, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderLessThan(String value) {
            addCriterion("final_decision_leader <", value, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderLessThanOrEqualTo(String value) {
            addCriterion("final_decision_leader <=", value, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderLike(String value) {
            addCriterion("final_decision_leader like", value, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderNotLike(String value) {
            addCriterion("final_decision_leader not like", value, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderIn(List<String> values) {
            addCriterion("final_decision_leader in", values, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderNotIn(List<String> values) {
            addCriterion("final_decision_leader not in", values, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderBetween(String value1, String value2) {
            addCriterion("final_decision_leader between", value1, value2, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andFinalDecisionLeaderNotBetween(String value1, String value2) {
            addCriterion("final_decision_leader not between", value1, value2, "finalDecisionLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderIsNull() {
            addCriterion("DisCrdtCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderIsNotNull() {
            addCriterion("DisCrdtCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderEqualTo(Integer value) {
            addCriterion("DisCrdtCnt_ID_leader =", value, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderNotEqualTo(Integer value) {
            addCriterion("DisCrdtCnt_ID_leader <>", value, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderGreaterThan(Integer value) {
            addCriterion("DisCrdtCnt_ID_leader >", value, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DisCrdtCnt_ID_leader >=", value, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderLessThan(Integer value) {
            addCriterion("DisCrdtCnt_ID_leader <", value, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DisCrdtCnt_ID_leader <=", value, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderIn(List<Integer> values) {
            addCriterion("DisCrdtCnt_ID_leader in", values, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderNotIn(List<Integer> values) {
            addCriterion("DisCrdtCnt_ID_leader not in", values, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DisCrdtCnt_ID_leader between", value1, value2, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDiscrdtcntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DisCrdtCnt_ID_leader not between", value1, value2, "discrdtcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderIsNull() {
            addCriterion("CriWantedCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderIsNotNull() {
            addCriterion("CriWantedCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderEqualTo(Integer value) {
            addCriterion("CriWantedCnt_ID_leader =", value, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderNotEqualTo(Integer value) {
            addCriterion("CriWantedCnt_ID_leader <>", value, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderGreaterThan(Integer value) {
            addCriterion("CriWantedCnt_ID_leader >", value, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("CriWantedCnt_ID_leader >=", value, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderLessThan(Integer value) {
            addCriterion("CriWantedCnt_ID_leader <", value, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("CriWantedCnt_ID_leader <=", value, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderIn(List<Integer> values) {
            addCriterion("CriWantedCnt_ID_leader in", values, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderNotIn(List<Integer> values) {
            addCriterion("CriWantedCnt_ID_leader not in", values, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("CriWantedCnt_ID_leader between", value1, value2, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andCriwantedcntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("CriWantedCnt_ID_leader not between", value1, value2, "criwantedcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderIsNull() {
            addCriterion("ExeCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderIsNotNull() {
            addCriterion("ExeCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderEqualTo(Integer value) {
            addCriterion("ExeCnt_ID_leader =", value, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderNotEqualTo(Integer value) {
            addCriterion("ExeCnt_ID_leader <>", value, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderGreaterThan(Integer value) {
            addCriterion("ExeCnt_ID_leader >", value, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExeCnt_ID_leader >=", value, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderLessThan(Integer value) {
            addCriterion("ExeCnt_ID_leader <", value, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("ExeCnt_ID_leader <=", value, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderIn(List<Integer> values) {
            addCriterion("ExeCnt_ID_leader in", values, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderNotIn(List<Integer> values) {
            addCriterion("ExeCnt_ID_leader not in", values, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("ExeCnt_ID_leader between", value1, value2, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andExecntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("ExeCnt_ID_leader not between", value1, value2, "execntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderIsNull() {
            addCriterion("SetCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderIsNotNull() {
            addCriterion("SetCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderEqualTo(Integer value) {
            addCriterion("SetCnt_ID_leader =", value, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderNotEqualTo(Integer value) {
            addCriterion("SetCnt_ID_leader <>", value, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderGreaterThan(Integer value) {
            addCriterion("SetCnt_ID_leader >", value, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("SetCnt_ID_leader >=", value, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderLessThan(Integer value) {
            addCriterion("SetCnt_ID_leader <", value, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("SetCnt_ID_leader <=", value, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderIn(List<Integer> values) {
            addCriterion("SetCnt_ID_leader in", values, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderNotIn(List<Integer> values) {
            addCriterion("SetCnt_ID_leader not in", values, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("SetCnt_ID_leader between", value1, value2, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetcntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("SetCnt_ID_leader not between", value1, value2, "setcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderIsNull() {
            addCriterion("OweTaxCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderIsNotNull() {
            addCriterion("OweTaxCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderEqualTo(Integer value) {
            addCriterion("OweTaxCnt_ID_leader =", value, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderNotEqualTo(Integer value) {
            addCriterion("OweTaxCnt_ID_leader <>", value, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderGreaterThan(Integer value) {
            addCriterion("OweTaxCnt_ID_leader >", value, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("OweTaxCnt_ID_leader >=", value, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderLessThan(Integer value) {
            addCriterion("OweTaxCnt_ID_leader <", value, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("OweTaxCnt_ID_leader <=", value, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderIn(List<Integer> values) {
            addCriterion("OweTaxCnt_ID_leader in", values, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderNotIn(List<Integer> values) {
            addCriterion("OweTaxCnt_ID_leader not in", values, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("OweTaxCnt_ID_leader between", value1, value2, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andOwetaxcntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("OweTaxCnt_ID_leader not between", value1, value2, "owetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderIsNull() {
            addCriterion("DuePayCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderIsNotNull() {
            addCriterion("DuePayCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderEqualTo(Integer value) {
            addCriterion("DuePayCnt_ID_leader =", value, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderNotEqualTo(Integer value) {
            addCriterion("DuePayCnt_ID_leader <>", value, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderGreaterThan(Integer value) {
            addCriterion("DuePayCnt_ID_leader >", value, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DuePayCnt_ID_leader >=", value, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderLessThan(Integer value) {
            addCriterion("DuePayCnt_ID_leader <", value, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DuePayCnt_ID_leader <=", value, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderIn(List<Integer> values) {
            addCriterion("DuePayCnt_ID_leader in", values, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderNotIn(List<Integer> values) {
            addCriterion("DuePayCnt_ID_leader not in", values, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DuePayCnt_ID_leader between", value1, value2, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DuePayCnt_ID_leader not between", value1, value2, "duepaycntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderIsNull() {
            addCriterion("LPOweTaxCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderIsNotNull() {
            addCriterion("LPOweTaxCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderEqualTo(Integer value) {
            addCriterion("LPOweTaxCnt_ID_leader =", value, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderNotEqualTo(Integer value) {
            addCriterion("LPOweTaxCnt_ID_leader <>", value, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderGreaterThan(Integer value) {
            addCriterion("LPOweTaxCnt_ID_leader >", value, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("LPOweTaxCnt_ID_leader >=", value, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderLessThan(Integer value) {
            addCriterion("LPOweTaxCnt_ID_leader <", value, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("LPOweTaxCnt_ID_leader <=", value, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderIn(List<Integer> values) {
            addCriterion("LPOweTaxCnt_ID_leader in", values, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderNotIn(List<Integer> values) {
            addCriterion("LPOweTaxCnt_ID_leader not in", values, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("LPOweTaxCnt_ID_leader between", value1, value2, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpowetaxcntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("LPOweTaxCnt_ID_leader not between", value1, value2, "lpowetaxcntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderIsNull() {
            addCriterion("LPDueCnt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderIsNotNull() {
            addCriterion("LPDueCnt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderEqualTo(Integer value) {
            addCriterion("LPDueCnt_ID_leader =", value, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderNotEqualTo(Integer value) {
            addCriterion("LPDueCnt_ID_leader <>", value, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderGreaterThan(Integer value) {
            addCriterion("LPDueCnt_ID_leader >", value, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("LPDueCnt_ID_leader >=", value, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderLessThan(Integer value) {
            addCriterion("LPDueCnt_ID_leader <", value, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("LPDueCnt_ID_leader <=", value, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderIn(List<Integer> values) {
            addCriterion("LPDueCnt_ID_leader in", values, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderNotIn(List<Integer> values) {
            addCriterion("LPDueCnt_ID_leader not in", values, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("LPDueCnt_ID_leader between", value1, value2, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andLpduecntIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("LPDueCnt_ID_leader not between", value1, value2, "lpduecntIdLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderIsNull() {
            addCriterion("DuePayCnt_TE_leader is null");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderIsNotNull() {
            addCriterion("DuePayCnt_TE_leader is not null");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderEqualTo(Integer value) {
            addCriterion("DuePayCnt_TE_leader =", value, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderNotEqualTo(Integer value) {
            addCriterion("DuePayCnt_TE_leader <>", value, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderGreaterThan(Integer value) {
            addCriterion("DuePayCnt_TE_leader >", value, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("DuePayCnt_TE_leader >=", value, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderLessThan(Integer value) {
            addCriterion("DuePayCnt_TE_leader <", value, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("DuePayCnt_TE_leader <=", value, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderIn(List<Integer> values) {
            addCriterion("DuePayCnt_TE_leader in", values, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderNotIn(List<Integer> values) {
            addCriterion("DuePayCnt_TE_leader not in", values, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderBetween(Integer value1, Integer value2) {
            addCriterion("DuePayCnt_TE_leader between", value1, value2, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andDuepaycntTeLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("DuePayCnt_TE_leader not between", value1, value2, "duepaycntTeLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderIsNull() {
            addCriterion("ExeAmt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderIsNotNull() {
            addCriterion("ExeAmt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderEqualTo(Integer value) {
            addCriterion("ExeAmt_ID_leader =", value, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderNotEqualTo(Integer value) {
            addCriterion("ExeAmt_ID_leader <>", value, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderGreaterThan(Integer value) {
            addCriterion("ExeAmt_ID_leader >", value, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExeAmt_ID_leader >=", value, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderLessThan(Integer value) {
            addCriterion("ExeAmt_ID_leader <", value, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("ExeAmt_ID_leader <=", value, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderIn(List<Integer> values) {
            addCriterion("ExeAmt_ID_leader in", values, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderNotIn(List<Integer> values) {
            addCriterion("ExeAmt_ID_leader not in", values, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("ExeAmt_ID_leader between", value1, value2, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andExeamtIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("ExeAmt_ID_leader not between", value1, value2, "exeamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderIsNull() {
            addCriterion("SetAmt_ID_leader is null");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderIsNotNull() {
            addCriterion("SetAmt_ID_leader is not null");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderEqualTo(Integer value) {
            addCriterion("SetAmt_ID_leader =", value, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderNotEqualTo(Integer value) {
            addCriterion("SetAmt_ID_leader <>", value, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderGreaterThan(Integer value) {
            addCriterion("SetAmt_ID_leader >", value, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderGreaterThanOrEqualTo(Integer value) {
            addCriterion("SetAmt_ID_leader >=", value, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderLessThan(Integer value) {
            addCriterion("SetAmt_ID_leader <", value, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderLessThanOrEqualTo(Integer value) {
            addCriterion("SetAmt_ID_leader <=", value, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderIn(List<Integer> values) {
            addCriterion("SetAmt_ID_leader in", values, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderNotIn(List<Integer> values) {
            addCriterion("SetAmt_ID_leader not in", values, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderBetween(Integer value1, Integer value2) {
            addCriterion("SetAmt_ID_leader between", value1, value2, "setamtIdLeader");
            return (Criteria) this;
        }

        public Criteria andSetamtIdLeaderNotBetween(Integer value1, Integer value2) {
            addCriterion("SetAmt_ID_leader not between", value1, value2, "setamtIdLeader");
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