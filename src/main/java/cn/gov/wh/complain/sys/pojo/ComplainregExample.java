package cn.gov.wh.complain.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ComplainregExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainregExample() {
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

        public Criteria andComplainregidIsNull() {
            addCriterion("complainregid is null");
            return (Criteria) this;
        }

        public Criteria andComplainregidIsNotNull() {
            addCriterion("complainregid is not null");
            return (Criteria) this;
        }

        public Criteria andComplainregidEqualTo(String value) {
            addCriterion("complainregid =", value, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidNotEqualTo(String value) {
            addCriterion("complainregid <>", value, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidGreaterThan(String value) {
            addCriterion("complainregid >", value, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidGreaterThanOrEqualTo(String value) {
            addCriterion("complainregid >=", value, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidLessThan(String value) {
            addCriterion("complainregid <", value, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidLessThanOrEqualTo(String value) {
            addCriterion("complainregid <=", value, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidLike(String value) {
            addCriterion("complainregid like", value, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidNotLike(String value) {
            addCriterion("complainregid not like", value, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidIn(List<String> values) {
            addCriterion("complainregid in", values, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidNotIn(List<String> values) {
            addCriterion("complainregid not in", values, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidBetween(String value1, String value2) {
            addCriterion("complainregid between", value1, value2, "complainregid");
            return (Criteria) this;
        }

        public Criteria andComplainregidNotBetween(String value1, String value2) {
            addCriterion("complainregid not between", value1, value2, "complainregid");
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

        public Criteria andFeedbackidIsNull() {
            addCriterion("feedbackid is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackidIsNotNull() {
            addCriterion("feedbackid is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackidEqualTo(String value) {
            addCriterion("feedbackid =", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotEqualTo(String value) {
            addCriterion("feedbackid <>", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidGreaterThan(String value) {
            addCriterion("feedbackid >", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidGreaterThanOrEqualTo(String value) {
            addCriterion("feedbackid >=", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidLessThan(String value) {
            addCriterion("feedbackid <", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidLessThanOrEqualTo(String value) {
            addCriterion("feedbackid <=", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidLike(String value) {
            addCriterion("feedbackid like", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotLike(String value) {
            addCriterion("feedbackid not like", value, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidIn(List<String> values) {
            addCriterion("feedbackid in", values, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotIn(List<String> values) {
            addCriterion("feedbackid not in", values, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidBetween(String value1, String value2) {
            addCriterion("feedbackid between", value1, value2, "feedbackid");
            return (Criteria) this;
        }

        public Criteria andFeedbackidNotBetween(String value1, String value2) {
            addCriterion("feedbackid not between", value1, value2, "feedbackid");
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

        public Criteria andRegdeptIsNull() {
            addCriterion("regdept is null");
            return (Criteria) this;
        }

        public Criteria andRegdeptIsNotNull() {
            addCriterion("regdept is not null");
            return (Criteria) this;
        }

        public Criteria andRegdeptEqualTo(String value) {
            addCriterion("regdept =", value, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptNotEqualTo(String value) {
            addCriterion("regdept <>", value, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptGreaterThan(String value) {
            addCriterion("regdept >", value, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptGreaterThanOrEqualTo(String value) {
            addCriterion("regdept >=", value, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptLessThan(String value) {
            addCriterion("regdept <", value, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptLessThanOrEqualTo(String value) {
            addCriterion("regdept <=", value, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptLike(String value) {
            addCriterion("regdept like", value, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptNotLike(String value) {
            addCriterion("regdept not like", value, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptIn(List<String> values) {
            addCriterion("regdept in", values, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptNotIn(List<String> values) {
            addCriterion("regdept not in", values, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptBetween(String value1, String value2) {
            addCriterion("regdept between", value1, value2, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegdeptNotBetween(String value1, String value2) {
            addCriterion("regdept not between", value1, value2, "regdept");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNull() {
            addCriterion("register is null");
            return (Criteria) this;
        }

        public Criteria andRegisterIsNotNull() {
            addCriterion("register is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterEqualTo(String value) {
            addCriterion("register =", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotEqualTo(String value) {
            addCriterion("register <>", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThan(String value) {
            addCriterion("register >", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterGreaterThanOrEqualTo(String value) {
            addCriterion("register >=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThan(String value) {
            addCriterion("register <", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLessThanOrEqualTo(String value) {
            addCriterion("register <=", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterLike(String value) {
            addCriterion("register like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotLike(String value) {
            addCriterion("register not like", value, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterIn(List<String> values) {
            addCriterion("register in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotIn(List<String> values) {
            addCriterion("register not in", values, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterBetween(String value1, String value2) {
            addCriterion("register between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegisterNotBetween(String value1, String value2) {
            addCriterion("register not between", value1, value2, "register");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNull() {
            addCriterion("regtime is null");
            return (Criteria) this;
        }

        public Criteria andRegtimeIsNotNull() {
            addCriterion("regtime is not null");
            return (Criteria) this;
        }

        public Criteria andRegtimeEqualTo(Date value) {
            addCriterionForJDBCDate("regtime =", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("regtime <>", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("regtime >", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("regtime >=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThan(Date value) {
            addCriterionForJDBCDate("regtime <", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("regtime <=", value, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeIn(List<Date> values) {
            addCriterionForJDBCDate("regtime in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("regtime not in", values, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("regtime between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andRegtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("regtime not between", value1, value2, "regtime");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("_type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("_type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("_type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("_type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("_type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("_type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("_type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("_type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("_type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("_type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("_type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("_type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("_type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("_type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
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

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andRespectIsNull() {
            addCriterion("respect is null");
            return (Criteria) this;
        }

        public Criteria andRespectIsNotNull() {
            addCriterion("respect is not null");
            return (Criteria) this;
        }

        public Criteria andRespectEqualTo(String value) {
            addCriterion("respect =", value, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectNotEqualTo(String value) {
            addCriterion("respect <>", value, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectGreaterThan(String value) {
            addCriterion("respect >", value, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectGreaterThanOrEqualTo(String value) {
            addCriterion("respect >=", value, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectLessThan(String value) {
            addCriterion("respect <", value, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectLessThanOrEqualTo(String value) {
            addCriterion("respect <=", value, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectLike(String value) {
            addCriterion("respect like", value, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectNotLike(String value) {
            addCriterion("respect not like", value, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectIn(List<String> values) {
            addCriterion("respect in", values, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectNotIn(List<String> values) {
            addCriterion("respect not in", values, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectBetween(String value1, String value2) {
            addCriterion("respect between", value1, value2, "respect");
            return (Criteria) this;
        }

        public Criteria andRespectNotBetween(String value1, String value2) {
            addCriterion("respect not between", value1, value2, "respect");
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

        public Criteria andBecompanyIsNull() {
            addCriterion("becompany is null");
            return (Criteria) this;
        }

        public Criteria andBecompanyIsNotNull() {
            addCriterion("becompany is not null");
            return (Criteria) this;
        }

        public Criteria andBecompanyEqualTo(String value) {
            addCriterion("becompany =", value, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyNotEqualTo(String value) {
            addCriterion("becompany <>", value, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyGreaterThan(String value) {
            addCriterion("becompany >", value, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("becompany >=", value, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyLessThan(String value) {
            addCriterion("becompany <", value, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyLessThanOrEqualTo(String value) {
            addCriterion("becompany <=", value, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyLike(String value) {
            addCriterion("becompany like", value, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyNotLike(String value) {
            addCriterion("becompany not like", value, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyIn(List<String> values) {
            addCriterion("becompany in", values, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyNotIn(List<String> values) {
            addCriterion("becompany not in", values, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyBetween(String value1, String value2) {
            addCriterion("becompany between", value1, value2, "becompany");
            return (Criteria) this;
        }

        public Criteria andBecompanyNotBetween(String value1, String value2) {
            addCriterion("becompany not between", value1, value2, "becompany");
            return (Criteria) this;
        }

        public Criteria andComteleIsNull() {
            addCriterion("comtele is null");
            return (Criteria) this;
        }

        public Criteria andComteleIsNotNull() {
            addCriterion("comtele is not null");
            return (Criteria) this;
        }

        public Criteria andComteleEqualTo(String value) {
            addCriterion("comtele =", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleNotEqualTo(String value) {
            addCriterion("comtele <>", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleGreaterThan(String value) {
            addCriterion("comtele >", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleGreaterThanOrEqualTo(String value) {
            addCriterion("comtele >=", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleLessThan(String value) {
            addCriterion("comtele <", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleLessThanOrEqualTo(String value) {
            addCriterion("comtele <=", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleLike(String value) {
            addCriterion("comtele like", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleNotLike(String value) {
            addCriterion("comtele not like", value, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleIn(List<String> values) {
            addCriterion("comtele in", values, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleNotIn(List<String> values) {
            addCriterion("comtele not in", values, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleBetween(String value1, String value2) {
            addCriterion("comtele between", value1, value2, "comtele");
            return (Criteria) this;
        }

        public Criteria andComteleNotBetween(String value1, String value2) {
            addCriterion("comtele not between", value1, value2, "comtele");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andComzipcodeIsNull() {
            addCriterion("comzipcode is null");
            return (Criteria) this;
        }

        public Criteria andComzipcodeIsNotNull() {
            addCriterion("comzipcode is not null");
            return (Criteria) this;
        }

        public Criteria andComzipcodeEqualTo(String value) {
            addCriterion("comzipcode =", value, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeNotEqualTo(String value) {
            addCriterion("comzipcode <>", value, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeGreaterThan(String value) {
            addCriterion("comzipcode >", value, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeGreaterThanOrEqualTo(String value) {
            addCriterion("comzipcode >=", value, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeLessThan(String value) {
            addCriterion("comzipcode <", value, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeLessThanOrEqualTo(String value) {
            addCriterion("comzipcode <=", value, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeLike(String value) {
            addCriterion("comzipcode like", value, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeNotLike(String value) {
            addCriterion("comzipcode not like", value, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeIn(List<String> values) {
            addCriterion("comzipcode in", values, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeNotIn(List<String> values) {
            addCriterion("comzipcode not in", values, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeBetween(String value1, String value2) {
            addCriterion("comzipcode between", value1, value2, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComzipcodeNotBetween(String value1, String value2) {
            addCriterion("comzipcode not between", value1, value2, "comzipcode");
            return (Criteria) this;
        }

        public Criteria andComaddIsNull() {
            addCriterion("comadd is null");
            return (Criteria) this;
        }

        public Criteria andComaddIsNotNull() {
            addCriterion("comadd is not null");
            return (Criteria) this;
        }

        public Criteria andComaddEqualTo(String value) {
            addCriterion("comadd =", value, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddNotEqualTo(String value) {
            addCriterion("comadd <>", value, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddGreaterThan(String value) {
            addCriterion("comadd >", value, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddGreaterThanOrEqualTo(String value) {
            addCriterion("comadd >=", value, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddLessThan(String value) {
            addCriterion("comadd <", value, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddLessThanOrEqualTo(String value) {
            addCriterion("comadd <=", value, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddLike(String value) {
            addCriterion("comadd like", value, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddNotLike(String value) {
            addCriterion("comadd not like", value, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddIn(List<String> values) {
            addCriterion("comadd in", values, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddNotIn(List<String> values) {
            addCriterion("comadd not in", values, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddBetween(String value1, String value2) {
            addCriterion("comadd between", value1, value2, "comadd");
            return (Criteria) this;
        }

        public Criteria andComaddNotBetween(String value1, String value2) {
            addCriterion("comadd not between", value1, value2, "comadd");
            return (Criteria) this;
        }

        public Criteria andHappendtimeIsNull() {
            addCriterion("happendtime is null");
            return (Criteria) this;
        }

        public Criteria andHappendtimeIsNotNull() {
            addCriterion("happendtime is not null");
            return (Criteria) this;
        }

        public Criteria andHappendtimeEqualTo(Date value) {
            addCriterionForJDBCDate("happendtime =", value, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("happendtime <>", value, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("happendtime >", value, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("happendtime >=", value, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeLessThan(Date value) {
            addCriterionForJDBCDate("happendtime <", value, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("happendtime <=", value, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeIn(List<Date> values) {
            addCriterionForJDBCDate("happendtime in", values, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("happendtime not in", values, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("happendtime between", value1, value2, "happendtime");
            return (Criteria) this;
        }

        public Criteria andHappendtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("happendtime not between", value1, value2, "happendtime");
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

        public Criteria andYuanIsNull() {
            addCriterion("yuan is null");
            return (Criteria) this;
        }

        public Criteria andYuanIsNotNull() {
            addCriterion("yuan is not null");
            return (Criteria) this;
        }

        public Criteria andYuanEqualTo(Float value) {
            addCriterion("yuan =", value, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanNotEqualTo(Float value) {
            addCriterion("yuan <>", value, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanGreaterThan(Float value) {
            addCriterion("yuan >", value, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanGreaterThanOrEqualTo(Float value) {
            addCriterion("yuan >=", value, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanLessThan(Float value) {
            addCriterion("yuan <", value, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanLessThanOrEqualTo(Float value) {
            addCriterion("yuan <=", value, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanIn(List<Float> values) {
            addCriterion("yuan in", values, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanNotIn(List<Float> values) {
            addCriterion("yuan not in", values, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanBetween(Float value1, Float value2) {
            addCriterion("yuan between", value1, value2, "yuan");
            return (Criteria) this;
        }

        public Criteria andYuanNotBetween(Float value1, Float value2) {
            addCriterion("yuan not between", value1, value2, "yuan");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDisputeIsNull() {
            addCriterion("dispute is null");
            return (Criteria) this;
        }

        public Criteria andDisputeIsNotNull() {
            addCriterion("dispute is not null");
            return (Criteria) this;
        }

        public Criteria andDisputeEqualTo(String value) {
            addCriterion("dispute =", value, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeNotEqualTo(String value) {
            addCriterion("dispute <>", value, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeGreaterThan(String value) {
            addCriterion("dispute >", value, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeGreaterThanOrEqualTo(String value) {
            addCriterion("dispute >=", value, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeLessThan(String value) {
            addCriterion("dispute <", value, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeLessThanOrEqualTo(String value) {
            addCriterion("dispute <=", value, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeLike(String value) {
            addCriterion("dispute like", value, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeNotLike(String value) {
            addCriterion("dispute not like", value, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeIn(List<String> values) {
            addCriterion("dispute in", values, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeNotIn(List<String> values) {
            addCriterion("dispute not in", values, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeBetween(String value1, String value2) {
            addCriterion("dispute between", value1, value2, "dispute");
            return (Criteria) this;
        }

        public Criteria andDisputeNotBetween(String value1, String value2) {
            addCriterion("dispute not between", value1, value2, "dispute");
            return (Criteria) this;
        }

        public Criteria andSpecificIsNull() {
            addCriterion("_specific is null");
            return (Criteria) this;
        }

        public Criteria andSpecificIsNotNull() {
            addCriterion("_specific is not null");
            return (Criteria) this;
        }

        public Criteria andSpecificEqualTo(String value) {
            addCriterion("_specific =", value, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificNotEqualTo(String value) {
            addCriterion("_specific <>", value, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificGreaterThan(String value) {
            addCriterion("_specific >", value, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificGreaterThanOrEqualTo(String value) {
            addCriterion("_specific >=", value, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificLessThan(String value) {
            addCriterion("_specific <", value, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificLessThanOrEqualTo(String value) {
            addCriterion("_specific <=", value, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificLike(String value) {
            addCriterion("_specific like", value, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificNotLike(String value) {
            addCriterion("_specific not like", value, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificIn(List<String> values) {
            addCriterion("_specific in", values, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificNotIn(List<String> values) {
            addCriterion("_specific not in", values, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificBetween(String value1, String value2) {
            addCriterion("_specific between", value1, value2, "specific");
            return (Criteria) this;
        }

        public Criteria andSpecificNotBetween(String value1, String value2) {
            addCriterion("_specific not between", value1, value2, "specific");
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