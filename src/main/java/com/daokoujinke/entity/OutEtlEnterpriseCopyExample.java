package com.daokoujinke.entity;

import java.util.ArrayList;
import java.util.List;

public class OutEtlEnterpriseCopyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutEtlEnterpriseCopyExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andEstatimeIsNull() {
            addCriterion("EstaTime is null");
            return (Criteria) this;
        }

        public Criteria andEstatimeIsNotNull() {
            addCriterion("EstaTime is not null");
            return (Criteria) this;
        }

        public Criteria andEstatimeEqualTo(Integer value) {
            addCriterion("EstaTime =", value, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeNotEqualTo(Integer value) {
            addCriterion("EstaTime <>", value, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeGreaterThan(Integer value) {
            addCriterion("EstaTime >", value, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("EstaTime >=", value, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeLessThan(Integer value) {
            addCriterion("EstaTime <", value, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeLessThanOrEqualTo(Integer value) {
            addCriterion("EstaTime <=", value, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeIn(List<Integer> values) {
            addCriterion("EstaTime in", values, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeNotIn(List<Integer> values) {
            addCriterion("EstaTime not in", values, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeBetween(Integer value1, Integer value2) {
            addCriterion("EstaTime between", value1, value2, "estatime");
            return (Criteria) this;
        }

        public Criteria andEstatimeNotBetween(Integer value1, Integer value2) {
            addCriterion("EstaTime not between", value1, value2, "estatime");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIsNull() {
            addCriterion("RegCapital is null");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIsNotNull() {
            addCriterion("RegCapital is not null");
            return (Criteria) this;
        }

        public Criteria andRegcapitalEqualTo(String value) {
            addCriterion("RegCapital =", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotEqualTo(String value) {
            addCriterion("RegCapital <>", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalGreaterThan(String value) {
            addCriterion("RegCapital >", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalGreaterThanOrEqualTo(String value) {
            addCriterion("RegCapital >=", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLessThan(String value) {
            addCriterion("RegCapital <", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLessThanOrEqualTo(String value) {
            addCriterion("RegCapital <=", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalLike(String value) {
            addCriterion("RegCapital like", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotLike(String value) {
            addCriterion("RegCapital not like", value, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalIn(List<String> values) {
            addCriterion("RegCapital in", values, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotIn(List<String> values) {
            addCriterion("RegCapital not in", values, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalBetween(String value1, String value2) {
            addCriterion("RegCapital between", value1, value2, "regcapital");
            return (Criteria) this;
        }

        public Criteria andRegcapitalNotBetween(String value1, String value2) {
            addCriterion("RegCapital not between", value1, value2, "regcapital");
            return (Criteria) this;
        }

        public Criteria andManagestateIsNull() {
            addCriterion("ManageState is null");
            return (Criteria) this;
        }

        public Criteria andManagestateIsNotNull() {
            addCriterion("ManageState is not null");
            return (Criteria) this;
        }

        public Criteria andManagestateEqualTo(String value) {
            addCriterion("ManageState =", value, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateNotEqualTo(String value) {
            addCriterion("ManageState <>", value, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateGreaterThan(String value) {
            addCriterion("ManageState >", value, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateGreaterThanOrEqualTo(String value) {
            addCriterion("ManageState >=", value, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateLessThan(String value) {
            addCriterion("ManageState <", value, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateLessThanOrEqualTo(String value) {
            addCriterion("ManageState <=", value, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateLike(String value) {
            addCriterion("ManageState like", value, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateNotLike(String value) {
            addCriterion("ManageState not like", value, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateIn(List<String> values) {
            addCriterion("ManageState in", values, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateNotIn(List<String> values) {
            addCriterion("ManageState not in", values, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateBetween(String value1, String value2) {
            addCriterion("ManageState between", value1, value2, "managestate");
            return (Criteria) this;
        }

        public Criteria andManagestateNotBetween(String value1, String value2) {
            addCriterion("ManageState not between", value1, value2, "managestate");
            return (Criteria) this;
        }

        public Criteria andLostexecntIsNull() {
            addCriterion("LostExeCnt is null");
            return (Criteria) this;
        }

        public Criteria andLostexecntIsNotNull() {
            addCriterion("LostExeCnt is not null");
            return (Criteria) this;
        }

        public Criteria andLostexecntEqualTo(Integer value) {
            addCriterion("LostExeCnt =", value, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntNotEqualTo(Integer value) {
            addCriterion("LostExeCnt <>", value, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntGreaterThan(Integer value) {
            addCriterion("LostExeCnt >", value, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("LostExeCnt >=", value, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntLessThan(Integer value) {
            addCriterion("LostExeCnt <", value, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntLessThanOrEqualTo(Integer value) {
            addCriterion("LostExeCnt <=", value, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntIn(List<Integer> values) {
            addCriterion("LostExeCnt in", values, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntNotIn(List<Integer> values) {
            addCriterion("LostExeCnt not in", values, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntBetween(Integer value1, Integer value2) {
            addCriterion("LostExeCnt between", value1, value2, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andLostexecntNotBetween(Integer value1, Integer value2) {
            addCriterion("LostExeCnt not between", value1, value2, "lostexecnt");
            return (Criteria) this;
        }

        public Criteria andExecntIsNull() {
            addCriterion("ExeCnt is null");
            return (Criteria) this;
        }

        public Criteria andExecntIsNotNull() {
            addCriterion("ExeCnt is not null");
            return (Criteria) this;
        }

        public Criteria andExecntEqualTo(Integer value) {
            addCriterion("ExeCnt =", value, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntNotEqualTo(Integer value) {
            addCriterion("ExeCnt <>", value, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntGreaterThan(Integer value) {
            addCriterion("ExeCnt >", value, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExeCnt >=", value, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntLessThan(Integer value) {
            addCriterion("ExeCnt <", value, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntLessThanOrEqualTo(Integer value) {
            addCriterion("ExeCnt <=", value, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntIn(List<Integer> values) {
            addCriterion("ExeCnt in", values, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntNotIn(List<Integer> values) {
            addCriterion("ExeCnt not in", values, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntBetween(Integer value1, Integer value2) {
            addCriterion("ExeCnt between", value1, value2, "execnt");
            return (Criteria) this;
        }

        public Criteria andExecntNotBetween(Integer value1, Integer value2) {
            addCriterion("ExeCnt not between", value1, value2, "execnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntIsNull() {
            addCriterion("OwnTaxCnt is null");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntIsNotNull() {
            addCriterion("OwnTaxCnt is not null");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntEqualTo(Integer value) {
            addCriterion("OwnTaxCnt =", value, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntNotEqualTo(Integer value) {
            addCriterion("OwnTaxCnt <>", value, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntGreaterThan(Integer value) {
            addCriterion("OwnTaxCnt >", value, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("OwnTaxCnt >=", value, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntLessThan(Integer value) {
            addCriterion("OwnTaxCnt <", value, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntLessThanOrEqualTo(Integer value) {
            addCriterion("OwnTaxCnt <=", value, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntIn(List<Integer> values) {
            addCriterion("OwnTaxCnt in", values, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntNotIn(List<Integer> values) {
            addCriterion("OwnTaxCnt not in", values, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntBetween(Integer value1, Integer value2) {
            addCriterion("OwnTaxCnt between", value1, value2, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxcntNotBetween(Integer value1, Integer value2) {
            addCriterion("OwnTaxCnt not between", value1, value2, "owntaxcnt");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxIsNull() {
            addCriterion("OwnTaxAmtMax is null");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxIsNotNull() {
            addCriterion("OwnTaxAmtMax is not null");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxEqualTo(String value) {
            addCriterion("OwnTaxAmtMax =", value, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxNotEqualTo(String value) {
            addCriterion("OwnTaxAmtMax <>", value, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxGreaterThan(String value) {
            addCriterion("OwnTaxAmtMax >", value, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxGreaterThanOrEqualTo(String value) {
            addCriterion("OwnTaxAmtMax >=", value, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxLessThan(String value) {
            addCriterion("OwnTaxAmtMax <", value, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxLessThanOrEqualTo(String value) {
            addCriterion("OwnTaxAmtMax <=", value, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxLike(String value) {
            addCriterion("OwnTaxAmtMax like", value, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxNotLike(String value) {
            addCriterion("OwnTaxAmtMax not like", value, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxIn(List<String> values) {
            addCriterion("OwnTaxAmtMax in", values, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxNotIn(List<String> values) {
            addCriterion("OwnTaxAmtMax not in", values, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxBetween(String value1, String value2) {
            addCriterion("OwnTaxAmtMax between", value1, value2, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtmaxNotBetween(String value1, String value2) {
            addCriterion("OwnTaxAmtMax not between", value1, value2, "owntaxamtmax");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewIsNull() {
            addCriterion("OwnTaxAmtNew is null");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewIsNotNull() {
            addCriterion("OwnTaxAmtNew is not null");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewEqualTo(Double value) {
            addCriterion("OwnTaxAmtNew =", value, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewNotEqualTo(Double value) {
            addCriterion("OwnTaxAmtNew <>", value, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewGreaterThan(Double value) {
            addCriterion("OwnTaxAmtNew >", value, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewGreaterThanOrEqualTo(Double value) {
            addCriterion("OwnTaxAmtNew >=", value, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewLessThan(Double value) {
            addCriterion("OwnTaxAmtNew <", value, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewLessThanOrEqualTo(Double value) {
            addCriterion("OwnTaxAmtNew <=", value, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewIn(List<Double> values) {
            addCriterion("OwnTaxAmtNew in", values, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewNotIn(List<Double> values) {
            addCriterion("OwnTaxAmtNew not in", values, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewBetween(Double value1, Double value2) {
            addCriterion("OwnTaxAmtNew between", value1, value2, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtnewNotBetween(Double value1, Double value2) {
            addCriterion("OwnTaxAmtNew not between", value1, value2, "owntaxamtnew");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalIsNull() {
            addCriterion("OwnTaxAmtBal is null");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalIsNotNull() {
            addCriterion("OwnTaxAmtBal is not null");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalEqualTo(Double value) {
            addCriterion("OwnTaxAmtBal =", value, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalNotEqualTo(Double value) {
            addCriterion("OwnTaxAmtBal <>", value, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalGreaterThan(Double value) {
            addCriterion("OwnTaxAmtBal >", value, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalGreaterThanOrEqualTo(Double value) {
            addCriterion("OwnTaxAmtBal >=", value, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalLessThan(Double value) {
            addCriterion("OwnTaxAmtBal <", value, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalLessThanOrEqualTo(Double value) {
            addCriterion("OwnTaxAmtBal <=", value, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalIn(List<Double> values) {
            addCriterion("OwnTaxAmtBal in", values, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalNotIn(List<Double> values) {
            addCriterion("OwnTaxAmtBal not in", values, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalBetween(Double value1, Double value2) {
            addCriterion("OwnTaxAmtBal between", value1, value2, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andOwntaxamtbalNotBetween(Double value1, Double value2) {
            addCriterion("OwnTaxAmtBal not between", value1, value2, "owntaxamtbal");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntIsNull() {
            addCriterion("LegPersonChanCnt is null");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntIsNotNull() {
            addCriterion("LegPersonChanCnt is not null");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntEqualTo(Integer value) {
            addCriterion("LegPersonChanCnt =", value, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntNotEqualTo(Integer value) {
            addCriterion("LegPersonChanCnt <>", value, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntGreaterThan(Integer value) {
            addCriterion("LegPersonChanCnt >", value, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntGreaterThanOrEqualTo(Integer value) {
            addCriterion("LegPersonChanCnt >=", value, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntLessThan(Integer value) {
            addCriterion("LegPersonChanCnt <", value, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntLessThanOrEqualTo(Integer value) {
            addCriterion("LegPersonChanCnt <=", value, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntIn(List<Integer> values) {
            addCriterion("LegPersonChanCnt in", values, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntNotIn(List<Integer> values) {
            addCriterion("LegPersonChanCnt not in", values, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntBetween(Integer value1, Integer value2) {
            addCriterion("LegPersonChanCnt between", value1, value2, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andLegpersonchancntNotBetween(Integer value1, Integer value2) {
            addCriterion("LegPersonChanCnt not between", value1, value2, "legpersonchancnt");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctIsNull() {
            addCriterion("RegCapChanPct is null");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctIsNotNull() {
            addCriterion("RegCapChanPct is not null");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctEqualTo(Double value) {
            addCriterion("RegCapChanPct =", value, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctNotEqualTo(Double value) {
            addCriterion("RegCapChanPct <>", value, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctGreaterThan(Double value) {
            addCriterion("RegCapChanPct >", value, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctGreaterThanOrEqualTo(Double value) {
            addCriterion("RegCapChanPct >=", value, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctLessThan(Double value) {
            addCriterion("RegCapChanPct <", value, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctLessThanOrEqualTo(Double value) {
            addCriterion("RegCapChanPct <=", value, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctIn(List<Double> values) {
            addCriterion("RegCapChanPct in", values, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctNotIn(List<Double> values) {
            addCriterion("RegCapChanPct not in", values, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctBetween(Double value1, Double value2) {
            addCriterion("RegCapChanPct between", value1, value2, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andRegcapchanpctNotBetween(Double value1, Double value2) {
            addCriterion("RegCapChanPct not between", value1, value2, "regcapchanpct");
            return (Criteria) this;
        }

        public Criteria andExelastIsNull() {
            addCriterion("ExeLast is null");
            return (Criteria) this;
        }

        public Criteria andExelastIsNotNull() {
            addCriterion("ExeLast is not null");
            return (Criteria) this;
        }

        public Criteria andExelastEqualTo(Integer value) {
            addCriterion("ExeLast =", value, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastNotEqualTo(Integer value) {
            addCriterion("ExeLast <>", value, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastGreaterThan(Integer value) {
            addCriterion("ExeLast >", value, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastGreaterThanOrEqualTo(Integer value) {
            addCriterion("ExeLast >=", value, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastLessThan(Integer value) {
            addCriterion("ExeLast <", value, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastLessThanOrEqualTo(Integer value) {
            addCriterion("ExeLast <=", value, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastIn(List<Integer> values) {
            addCriterion("ExeLast in", values, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastNotIn(List<Integer> values) {
            addCriterion("ExeLast not in", values, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastBetween(Integer value1, Integer value2) {
            addCriterion("ExeLast between", value1, value2, "exelast");
            return (Criteria) this;
        }

        public Criteria andExelastNotBetween(Integer value1, Integer value2) {
            addCriterion("ExeLast not between", value1, value2, "exelast");
            return (Criteria) this;
        }

        public Criteria andNoticecntYIsNull() {
            addCriterion("NoticeCnt_Y is null");
            return (Criteria) this;
        }

        public Criteria andNoticecntYIsNotNull() {
            addCriterion("NoticeCnt_Y is not null");
            return (Criteria) this;
        }

        public Criteria andNoticecntYEqualTo(Integer value) {
            addCriterion("NoticeCnt_Y =", value, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYNotEqualTo(Integer value) {
            addCriterion("NoticeCnt_Y <>", value, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYGreaterThan(Integer value) {
            addCriterion("NoticeCnt_Y >", value, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYGreaterThanOrEqualTo(Integer value) {
            addCriterion("NoticeCnt_Y >=", value, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYLessThan(Integer value) {
            addCriterion("NoticeCnt_Y <", value, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYLessThanOrEqualTo(Integer value) {
            addCriterion("NoticeCnt_Y <=", value, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYIn(List<Integer> values) {
            addCriterion("NoticeCnt_Y in", values, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYNotIn(List<Integer> values) {
            addCriterion("NoticeCnt_Y not in", values, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYBetween(Integer value1, Integer value2) {
            addCriterion("NoticeCnt_Y between", value1, value2, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNoticecntYNotBetween(Integer value1, Integer value2) {
            addCriterion("NoticeCnt_Y not between", value1, value2, "noticecntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYIsNull() {
            addCriterion("Not_LaborCnt_Y is null");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYIsNotNull() {
            addCriterion("Not_LaborCnt_Y is not null");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYEqualTo(Integer value) {
            addCriterion("Not_LaborCnt_Y =", value, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYNotEqualTo(Integer value) {
            addCriterion("Not_LaborCnt_Y <>", value, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYGreaterThan(Integer value) {
            addCriterion("Not_LaborCnt_Y >", value, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYGreaterThanOrEqualTo(Integer value) {
            addCriterion("Not_LaborCnt_Y >=", value, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYLessThan(Integer value) {
            addCriterion("Not_LaborCnt_Y <", value, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYLessThanOrEqualTo(Integer value) {
            addCriterion("Not_LaborCnt_Y <=", value, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYIn(List<Integer> values) {
            addCriterion("Not_LaborCnt_Y in", values, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYNotIn(List<Integer> values) {
            addCriterion("Not_LaborCnt_Y not in", values, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYBetween(Integer value1, Integer value2) {
            addCriterion("Not_LaborCnt_Y between", value1, value2, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andNotLaborcntYNotBetween(Integer value1, Integer value2) {
            addCriterion("Not_LaborCnt_Y not between", value1, value2, "notLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYIsNull() {
            addCriterion("Doc_LaborCnt_Y is null");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYIsNotNull() {
            addCriterion("Doc_LaborCnt_Y is not null");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYEqualTo(Integer value) {
            addCriterion("Doc_LaborCnt_Y =", value, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYNotEqualTo(Integer value) {
            addCriterion("Doc_LaborCnt_Y <>", value, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYGreaterThan(Integer value) {
            addCriterion("Doc_LaborCnt_Y >", value, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYGreaterThanOrEqualTo(Integer value) {
            addCriterion("Doc_LaborCnt_Y >=", value, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYLessThan(Integer value) {
            addCriterion("Doc_LaborCnt_Y <", value, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYLessThanOrEqualTo(Integer value) {
            addCriterion("Doc_LaborCnt_Y <=", value, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYIn(List<Integer> values) {
            addCriterion("Doc_LaborCnt_Y in", values, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYNotIn(List<Integer> values) {
            addCriterion("Doc_LaborCnt_Y not in", values, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYBetween(Integer value1, Integer value2) {
            addCriterion("Doc_LaborCnt_Y between", value1, value2, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocLaborcntYNotBetween(Integer value1, Integer value2) {
            addCriterion("Doc_LaborCnt_Y not between", value1, value2, "docLaborcntY");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBIsNull() {
            addCriterion("Doc_FinancingCnt_B is null");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBIsNotNull() {
            addCriterion("Doc_FinancingCnt_B is not null");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBEqualTo(Integer value) {
            addCriterion("Doc_FinancingCnt_B =", value, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBNotEqualTo(Integer value) {
            addCriterion("Doc_FinancingCnt_B <>", value, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBGreaterThan(Integer value) {
            addCriterion("Doc_FinancingCnt_B >", value, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBGreaterThanOrEqualTo(Integer value) {
            addCriterion("Doc_FinancingCnt_B >=", value, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBLessThan(Integer value) {
            addCriterion("Doc_FinancingCnt_B <", value, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBLessThanOrEqualTo(Integer value) {
            addCriterion("Doc_FinancingCnt_B <=", value, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBIn(List<Integer> values) {
            addCriterion("Doc_FinancingCnt_B in", values, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBNotIn(List<Integer> values) {
            addCriterion("Doc_FinancingCnt_B not in", values, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBBetween(Integer value1, Integer value2) {
            addCriterion("Doc_FinancingCnt_B between", value1, value2, "docFinancingcntB");
            return (Criteria) this;
        }

        public Criteria andDocFinancingcntBNotBetween(Integer value1, Integer value2) {
            addCriterion("Doc_FinancingCnt_B not between", value1, value2, "docFinancingcntB");
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