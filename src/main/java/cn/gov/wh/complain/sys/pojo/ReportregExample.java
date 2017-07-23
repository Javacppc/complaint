package cn.gov.wh.complain.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportregExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportregExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRepidIsNull() {
            addCriterion("repid is null");
            return (Criteria) this;
        }

        public Criteria andRepidIsNotNull() {
            addCriterion("repid is not null");
            return (Criteria) this;
        }

        public Criteria andRepidEqualTo(String value) {
            addCriterion("repid =", value, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidNotEqualTo(String value) {
            addCriterion("repid <>", value, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidGreaterThan(String value) {
            addCriterion("repid >", value, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidGreaterThanOrEqualTo(String value) {
            addCriterion("repid >=", value, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidLessThan(String value) {
            addCriterion("repid <", value, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidLessThanOrEqualTo(String value) {
            addCriterion("repid <=", value, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidLike(String value) {
            addCriterion("repid like", value, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidNotLike(String value) {
            addCriterion("repid not like", value, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidIn(List<String> values) {
            addCriterion("repid in", values, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidNotIn(List<String> values) {
            addCriterion("repid not in", values, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidBetween(String value1, String value2) {
            addCriterion("repid between", value1, value2, "repid");
            return (Criteria) this;
        }

        public Criteria andRepidNotBetween(String value1, String value2) {
            addCriterion("repid not between", value1, value2, "repid");
            return (Criteria) this;
        }

        public Criteria andShuntidIsNull() {
            addCriterion("shuntid is null");
            return (Criteria) this;
        }

        public Criteria andShuntidIsNotNull() {
            addCriterion("shuntid is not null");
            return (Criteria) this;
        }

        public Criteria andShuntidEqualTo(String value) {
            addCriterion("shuntid =", value, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidNotEqualTo(String value) {
            addCriterion("shuntid <>", value, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidGreaterThan(String value) {
            addCriterion("shuntid >", value, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidGreaterThanOrEqualTo(String value) {
            addCriterion("shuntid >=", value, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidLessThan(String value) {
            addCriterion("shuntid <", value, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidLessThanOrEqualTo(String value) {
            addCriterion("shuntid <=", value, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidLike(String value) {
            addCriterion("shuntid like", value, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidNotLike(String value) {
            addCriterion("shuntid not like", value, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidIn(List<String> values) {
            addCriterion("shuntid in", values, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidNotIn(List<String> values) {
            addCriterion("shuntid not in", values, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidBetween(String value1, String value2) {
            addCriterion("shuntid between", value1, value2, "shuntid");
            return (Criteria) this;
        }

        public Criteria andShuntidNotBetween(String value1, String value2) {
            addCriterion("shuntid not between", value1, value2, "shuntid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRefeidIsNull() {
            addCriterion("refeid is null");
            return (Criteria) this;
        }

        public Criteria andRefeidIsNotNull() {
            addCriterion("refeid is not null");
            return (Criteria) this;
        }

        public Criteria andRefeidEqualTo(String value) {
            addCriterion("refeid =", value, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidNotEqualTo(String value) {
            addCriterion("refeid <>", value, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidGreaterThan(String value) {
            addCriterion("refeid >", value, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidGreaterThanOrEqualTo(String value) {
            addCriterion("refeid >=", value, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidLessThan(String value) {
            addCriterion("refeid <", value, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidLessThanOrEqualTo(String value) {
            addCriterion("refeid <=", value, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidLike(String value) {
            addCriterion("refeid like", value, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidNotLike(String value) {
            addCriterion("refeid not like", value, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidIn(List<String> values) {
            addCriterion("refeid in", values, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidNotIn(List<String> values) {
            addCriterion("refeid not in", values, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidBetween(String value1, String value2) {
            addCriterion("refeid between", value1, value2, "refeid");
            return (Criteria) this;
        }

        public Criteria andRefeidNotBetween(String value1, String value2) {
            addCriterion("refeid not between", value1, value2, "refeid");
            return (Criteria) this;
        }

        public Criteria andReturnidIsNull() {
            addCriterion("returnid is null");
            return (Criteria) this;
        }

        public Criteria andReturnidIsNotNull() {
            addCriterion("returnid is not null");
            return (Criteria) this;
        }

        public Criteria andReturnidEqualTo(String value) {
            addCriterion("returnid =", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotEqualTo(String value) {
            addCriterion("returnid <>", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidGreaterThan(String value) {
            addCriterion("returnid >", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidGreaterThanOrEqualTo(String value) {
            addCriterion("returnid >=", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidLessThan(String value) {
            addCriterion("returnid <", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidLessThanOrEqualTo(String value) {
            addCriterion("returnid <=", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidLike(String value) {
            addCriterion("returnid like", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotLike(String value) {
            addCriterion("returnid not like", value, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidIn(List<String> values) {
            addCriterion("returnid in", values, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotIn(List<String> values) {
            addCriterion("returnid not in", values, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidBetween(String value1, String value2) {
            addCriterion("returnid between", value1, value2, "returnid");
            return (Criteria) this;
        }

        public Criteria andReturnidNotBetween(String value1, String value2) {
            addCriterion("returnid not between", value1, value2, "returnid");
            return (Criteria) this;
        }

        public Criteria andRepnameIsNull() {
            addCriterion("repname is null");
            return (Criteria) this;
        }

        public Criteria andRepnameIsNotNull() {
            addCriterion("repname is not null");
            return (Criteria) this;
        }

        public Criteria andRepnameEqualTo(String value) {
            addCriterion("repname =", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameNotEqualTo(String value) {
            addCriterion("repname <>", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameGreaterThan(String value) {
            addCriterion("repname >", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameGreaterThanOrEqualTo(String value) {
            addCriterion("repname >=", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameLessThan(String value) {
            addCriterion("repname <", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameLessThanOrEqualTo(String value) {
            addCriterion("repname <=", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameLike(String value) {
            addCriterion("repname like", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameNotLike(String value) {
            addCriterion("repname not like", value, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameIn(List<String> values) {
            addCriterion("repname in", values, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameNotIn(List<String> values) {
            addCriterion("repname not in", values, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameBetween(String value1, String value2) {
            addCriterion("repname between", value1, value2, "repname");
            return (Criteria) this;
        }

        public Criteria andRepnameNotBetween(String value1, String value2) {
            addCriterion("repname not between", value1, value2, "repname");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Boolean value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Boolean value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Boolean value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Boolean value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Boolean value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Boolean value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Boolean> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Boolean> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Boolean value1, Boolean value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Boolean value1, Boolean value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andContactIsNull() {
            addCriterion("contact is null");
            return (Criteria) this;
        }

        public Criteria andContactIsNotNull() {
            addCriterion("contact is not null");
            return (Criteria) this;
        }

        public Criteria andContactEqualTo(String value) {
            addCriterion("contact =", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotEqualTo(String value) {
            addCriterion("contact <>", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThan(String value) {
            addCriterion("contact >", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactGreaterThanOrEqualTo(String value) {
            addCriterion("contact >=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThan(String value) {
            addCriterion("contact <", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLessThanOrEqualTo(String value) {
            addCriterion("contact <=", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactLike(String value) {
            addCriterion("contact like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotLike(String value) {
            addCriterion("contact not like", value, "contact");
            return (Criteria) this;
        }

        public Criteria andContactIn(List<String> values) {
            addCriterion("contact in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotIn(List<String> values) {
            addCriterion("contact not in", values, "contact");
            return (Criteria) this;
        }

        public Criteria andContactBetween(String value1, String value2) {
            addCriterion("contact between", value1, value2, "contact");
            return (Criteria) this;
        }

        public Criteria andContactNotBetween(String value1, String value2) {
            addCriterion("contact not between", value1, value2, "contact");
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

        public Criteria andZipcodeIsNull() {
            addCriterion("zipcode is null");
            return (Criteria) this;
        }

        public Criteria andZipcodeIsNotNull() {
            addCriterion("zipcode is not null");
            return (Criteria) this;
        }

        public Criteria andZipcodeEqualTo(String value) {
            addCriterion("zipcode =", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotEqualTo(String value) {
            addCriterion("zipcode <>", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThan(String value) {
            addCriterion("zipcode >", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("zipcode >=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThan(String value) {
            addCriterion("zipcode <", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLessThanOrEqualTo(String value) {
            addCriterion("zipcode <=", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeLike(String value) {
            addCriterion("zipcode like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotLike(String value) {
            addCriterion("zipcode not like", value, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeIn(List<String> values) {
            addCriterion("zipcode in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotIn(List<String> values) {
            addCriterion("zipcode not in", values, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeBetween(String value1, String value2) {
            addCriterion("zipcode between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andZipcodeNotBetween(String value1, String value2) {
            addCriterion("zipcode not between", value1, value2, "zipcode");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNull() {
            addCriterion("identify is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyIsNotNull() {
            addCriterion("identify is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyEqualTo(Integer value) {
            addCriterion("identify =", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotEqualTo(Integer value) {
            addCriterion("identify <>", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThan(Integer value) {
            addCriterion("identify >", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyGreaterThanOrEqualTo(Integer value) {
            addCriterion("identify >=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThan(Integer value) {
            addCriterion("identify <", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyLessThanOrEqualTo(Integer value) {
            addCriterion("identify <=", value, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyIn(List<Integer> values) {
            addCriterion("identify in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotIn(List<Integer> values) {
            addCriterion("identify not in", values, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyBetween(Integer value1, Integer value2) {
            addCriterion("identify between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andIdentifyNotBetween(Integer value1, Integer value2) {
            addCriterion("identify not between", value1, value2, "identify");
            return (Criteria) this;
        }

        public Criteria andAtypeIsNull() {
            addCriterion("atype is null");
            return (Criteria) this;
        }

        public Criteria andAtypeIsNotNull() {
            addCriterion("atype is not null");
            return (Criteria) this;
        }

        public Criteria andAtypeEqualTo(String value) {
            addCriterion("atype =", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotEqualTo(String value) {
            addCriterion("atype <>", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeGreaterThan(String value) {
            addCriterion("atype >", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeGreaterThanOrEqualTo(String value) {
            addCriterion("atype >=", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLessThan(String value) {
            addCriterion("atype <", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLessThanOrEqualTo(String value) {
            addCriterion("atype <=", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeLike(String value) {
            addCriterion("atype like", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotLike(String value) {
            addCriterion("atype not like", value, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeIn(List<String> values) {
            addCriterion("atype in", values, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotIn(List<String> values) {
            addCriterion("atype not in", values, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeBetween(String value1, String value2) {
            addCriterion("atype between", value1, value2, "atype");
            return (Criteria) this;
        }

        public Criteria andAtypeNotBetween(String value1, String value2) {
            addCriterion("atype not between", value1, value2, "atype");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNull() {
            addCriterion("companyname is null");
            return (Criteria) this;
        }

        public Criteria andCompanynameIsNotNull() {
            addCriterion("companyname is not null");
            return (Criteria) this;
        }

        public Criteria andCompanynameEqualTo(String value) {
            addCriterion("companyname =", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotEqualTo(String value) {
            addCriterion("companyname <>", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThan(String value) {
            addCriterion("companyname >", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("companyname >=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThan(String value) {
            addCriterion("companyname <", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLessThanOrEqualTo(String value) {
            addCriterion("companyname <=", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameLike(String value) {
            addCriterion("companyname like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotLike(String value) {
            addCriterion("companyname not like", value, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameIn(List<String> values) {
            addCriterion("companyname in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotIn(List<String> values) {
            addCriterion("companyname not in", values, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameBetween(String value1, String value2) {
            addCriterion("companyname between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanynameNotBetween(String value1, String value2) {
            addCriterion("companyname not between", value1, value2, "companyname");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNull() {
            addCriterion("companyaddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIsNotNull() {
            addCriterion("companyaddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressEqualTo(String value) {
            addCriterion("companyaddress =", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotEqualTo(String value) {
            addCriterion("companyaddress <>", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThan(String value) {
            addCriterion("companyaddress >", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("companyaddress >=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThan(String value) {
            addCriterion("companyaddress <", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLessThanOrEqualTo(String value) {
            addCriterion("companyaddress <=", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressLike(String value) {
            addCriterion("companyaddress like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotLike(String value) {
            addCriterion("companyaddress not like", value, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressIn(List<String> values) {
            addCriterion("companyaddress in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotIn(List<String> values) {
            addCriterion("companyaddress not in", values, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressBetween(String value1, String value2) {
            addCriterion("companyaddress between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyaddressNotBetween(String value1, String value2) {
            addCriterion("companyaddress not between", value1, value2, "companyaddress");
            return (Criteria) this;
        }

        public Criteria andCompanyteleIsNull() {
            addCriterion("companytele is null");
            return (Criteria) this;
        }

        public Criteria andCompanyteleIsNotNull() {
            addCriterion("companytele is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyteleEqualTo(String value) {
            addCriterion("companytele =", value, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleNotEqualTo(String value) {
            addCriterion("companytele <>", value, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleGreaterThan(String value) {
            addCriterion("companytele >", value, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleGreaterThanOrEqualTo(String value) {
            addCriterion("companytele >=", value, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleLessThan(String value) {
            addCriterion("companytele <", value, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleLessThanOrEqualTo(String value) {
            addCriterion("companytele <=", value, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleLike(String value) {
            addCriterion("companytele like", value, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleNotLike(String value) {
            addCriterion("companytele not like", value, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleIn(List<String> values) {
            addCriterion("companytele in", values, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleNotIn(List<String> values) {
            addCriterion("companytele not in", values, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleBetween(String value1, String value2) {
            addCriterion("companytele between", value1, value2, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyteleNotBetween(String value1, String value2) {
            addCriterion("companytele not between", value1, value2, "companytele");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeIsNull() {
            addCriterion("companyzipcode is null");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeIsNotNull() {
            addCriterion("companyzipcode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeEqualTo(String value) {
            addCriterion("companyzipcode =", value, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeNotEqualTo(String value) {
            addCriterion("companyzipcode <>", value, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeGreaterThan(String value) {
            addCriterion("companyzipcode >", value, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("companyzipcode >=", value, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeLessThan(String value) {
            addCriterion("companyzipcode <", value, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeLessThanOrEqualTo(String value) {
            addCriterion("companyzipcode <=", value, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeLike(String value) {
            addCriterion("companyzipcode like", value, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeNotLike(String value) {
            addCriterion("companyzipcode not like", value, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeIn(List<String> values) {
            addCriterion("companyzipcode in", values, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeNotIn(List<String> values) {
            addCriterion("companyzipcode not in", values, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeBetween(String value1, String value2) {
            addCriterion("companyzipcode between", value1, value2, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andCompanyzipcodeNotBetween(String value1, String value2) {
            addCriterion("companyzipcode not between", value1, value2, "companyzipcode");
            return (Criteria) this;
        }

        public Criteria andHappentimeIsNull() {
            addCriterion("happentime is null");
            return (Criteria) this;
        }

        public Criteria andHappentimeIsNotNull() {
            addCriterion("happentime is not null");
            return (Criteria) this;
        }

        public Criteria andHappentimeEqualTo(Date value) {
            addCriterionForJDBCDate("happentime =", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("happentime <>", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeGreaterThan(Date value) {
            addCriterionForJDBCDate("happentime >", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("happentime >=", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeLessThan(Date value) {
            addCriterionForJDBCDate("happentime <", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("happentime <=", value, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeIn(List<Date> values) {
            addCriterionForJDBCDate("happentime in", values, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("happentime not in", values, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("happentime between", value1, value2, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappentimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("happentime not between", value1, value2, "happentime");
            return (Criteria) this;
        }

        public Criteria andHappendaddressIsNull() {
            addCriterion("happendaddress is null");
            return (Criteria) this;
        }

        public Criteria andHappendaddressIsNotNull() {
            addCriterion("happendaddress is not null");
            return (Criteria) this;
        }

        public Criteria andHappendaddressEqualTo(String value) {
            addCriterion("happendaddress =", value, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressNotEqualTo(String value) {
            addCriterion("happendaddress <>", value, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressGreaterThan(String value) {
            addCriterion("happendaddress >", value, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressGreaterThanOrEqualTo(String value) {
            addCriterion("happendaddress >=", value, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressLessThan(String value) {
            addCriterion("happendaddress <", value, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressLessThanOrEqualTo(String value) {
            addCriterion("happendaddress <=", value, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressLike(String value) {
            addCriterion("happendaddress like", value, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressNotLike(String value) {
            addCriterion("happendaddress not like", value, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressIn(List<String> values) {
            addCriterion("happendaddress in", values, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressNotIn(List<String> values) {
            addCriterion("happendaddress not in", values, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressBetween(String value1, String value2) {
            addCriterion("happendaddress between", value1, value2, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andHappendaddressNotBetween(String value1, String value2) {
            addCriterion("happendaddress not between", value1, value2, "happendaddress");
            return (Criteria) this;
        }

        public Criteria andBelongareaIsNull() {
            addCriterion("belongarea is null");
            return (Criteria) this;
        }

        public Criteria andBelongareaIsNotNull() {
            addCriterion("belongarea is not null");
            return (Criteria) this;
        }

        public Criteria andBelongareaEqualTo(Integer value) {
            addCriterion("belongarea =", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotEqualTo(Integer value) {
            addCriterion("belongarea <>", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaGreaterThan(Integer value) {
            addCriterion("belongarea >", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaGreaterThanOrEqualTo(Integer value) {
            addCriterion("belongarea >=", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaLessThan(Integer value) {
            addCriterion("belongarea <", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaLessThanOrEqualTo(Integer value) {
            addCriterion("belongarea <=", value, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaIn(List<Integer> values) {
            addCriterion("belongarea in", values, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotIn(List<Integer> values) {
            addCriterion("belongarea not in", values, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaBetween(Integer value1, Integer value2) {
            addCriterion("belongarea between", value1, value2, "belongarea");
            return (Criteria) this;
        }

        public Criteria andBelongareaNotBetween(Integer value1, Integer value2) {
            addCriterion("belongarea not between", value1, value2, "belongarea");
            return (Criteria) this;
        }

        public Criteria andContentdescIsNull() {
            addCriterion("contentdesc is null");
            return (Criteria) this;
        }

        public Criteria andContentdescIsNotNull() {
            addCriterion("contentdesc is not null");
            return (Criteria) this;
        }

        public Criteria andContentdescEqualTo(String value) {
            addCriterion("contentdesc =", value, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescNotEqualTo(String value) {
            addCriterion("contentdesc <>", value, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescGreaterThan(String value) {
            addCriterion("contentdesc >", value, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescGreaterThanOrEqualTo(String value) {
            addCriterion("contentdesc >=", value, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescLessThan(String value) {
            addCriterion("contentdesc <", value, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescLessThanOrEqualTo(String value) {
            addCriterion("contentdesc <=", value, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescLike(String value) {
            addCriterion("contentdesc like", value, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescNotLike(String value) {
            addCriterion("contentdesc not like", value, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescIn(List<String> values) {
            addCriterion("contentdesc in", values, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescNotIn(List<String> values) {
            addCriterion("contentdesc not in", values, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescBetween(String value1, String value2) {
            addCriterion("contentdesc between", value1, value2, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andContentdescNotBetween(String value1, String value2) {
            addCriterion("contentdesc not between", value1, value2, "contentdesc");
            return (Criteria) this;
        }

        public Criteria andProcessstatuIsNull() {
            addCriterion("processstatu is null");
            return (Criteria) this;
        }

        public Criteria andProcessstatuIsNotNull() {
            addCriterion("processstatu is not null");
            return (Criteria) this;
        }

        public Criteria andProcessstatuEqualTo(String value) {
            addCriterion("processstatu =", value, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuNotEqualTo(String value) {
            addCriterion("processstatu <>", value, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuGreaterThan(String value) {
            addCriterion("processstatu >", value, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuGreaterThanOrEqualTo(String value) {
            addCriterion("processstatu >=", value, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuLessThan(String value) {
            addCriterion("processstatu <", value, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuLessThanOrEqualTo(String value) {
            addCriterion("processstatu <=", value, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuLike(String value) {
            addCriterion("processstatu like", value, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuNotLike(String value) {
            addCriterion("processstatu not like", value, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuIn(List<String> values) {
            addCriterion("processstatu in", values, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuNotIn(List<String> values) {
            addCriterion("processstatu not in", values, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuBetween(String value1, String value2) {
            addCriterion("processstatu between", value1, value2, "processstatu");
            return (Criteria) this;
        }

        public Criteria andProcessstatuNotBetween(String value1, String value2) {
            addCriterion("processstatu not between", value1, value2, "processstatu");
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