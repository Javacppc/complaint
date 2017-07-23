package cn.gov.wh.complain.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportfeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportfeedbackExample() {
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

        public Criteria andRetypeIsNull() {
            addCriterion("retype is null");
            return (Criteria) this;
        }

        public Criteria andRetypeIsNotNull() {
            addCriterion("retype is not null");
            return (Criteria) this;
        }

        public Criteria andRetypeEqualTo(String value) {
            addCriterion("retype =", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotEqualTo(String value) {
            addCriterion("retype <>", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeGreaterThan(String value) {
            addCriterion("retype >", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeGreaterThanOrEqualTo(String value) {
            addCriterion("retype >=", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLessThan(String value) {
            addCriterion("retype <", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLessThanOrEqualTo(String value) {
            addCriterion("retype <=", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeLike(String value) {
            addCriterion("retype like", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotLike(String value) {
            addCriterion("retype not like", value, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeIn(List<String> values) {
            addCriterion("retype in", values, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotIn(List<String> values) {
            addCriterion("retype not in", values, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeBetween(String value1, String value2) {
            addCriterion("retype between", value1, value2, "retype");
            return (Criteria) this;
        }

        public Criteria andRetypeNotBetween(String value1, String value2) {
            addCriterion("retype not between", value1, value2, "retype");
            return (Criteria) this;
        }

        public Criteria andReportstatusIsNull() {
            addCriterion("reportstatus is null");
            return (Criteria) this;
        }

        public Criteria andReportstatusIsNotNull() {
            addCriterion("reportstatus is not null");
            return (Criteria) this;
        }

        public Criteria andReportstatusEqualTo(String value) {
            addCriterion("reportstatus =", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusNotEqualTo(String value) {
            addCriterion("reportstatus <>", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusGreaterThan(String value) {
            addCriterion("reportstatus >", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusGreaterThanOrEqualTo(String value) {
            addCriterion("reportstatus >=", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusLessThan(String value) {
            addCriterion("reportstatus <", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusLessThanOrEqualTo(String value) {
            addCriterion("reportstatus <=", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusLike(String value) {
            addCriterion("reportstatus like", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusNotLike(String value) {
            addCriterion("reportstatus not like", value, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusIn(List<String> values) {
            addCriterion("reportstatus in", values, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusNotIn(List<String> values) {
            addCriterion("reportstatus not in", values, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusBetween(String value1, String value2) {
            addCriterion("reportstatus between", value1, value2, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andReportstatusNotBetween(String value1, String value2) {
            addCriterion("reportstatus not between", value1, value2, "reportstatus");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentIsNull() {
            addCriterion("feebackcontent is null");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentIsNotNull() {
            addCriterion("feebackcontent is not null");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentEqualTo(String value) {
            addCriterion("feebackcontent =", value, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentNotEqualTo(String value) {
            addCriterion("feebackcontent <>", value, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentGreaterThan(String value) {
            addCriterion("feebackcontent >", value, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentGreaterThanOrEqualTo(String value) {
            addCriterion("feebackcontent >=", value, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentLessThan(String value) {
            addCriterion("feebackcontent <", value, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentLessThanOrEqualTo(String value) {
            addCriterion("feebackcontent <=", value, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentLike(String value) {
            addCriterion("feebackcontent like", value, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentNotLike(String value) {
            addCriterion("feebackcontent not like", value, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentIn(List<String> values) {
            addCriterion("feebackcontent in", values, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentNotIn(List<String> values) {
            addCriterion("feebackcontent not in", values, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentBetween(String value1, String value2) {
            addCriterion("feebackcontent between", value1, value2, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andFeebackcontentNotBetween(String value1, String value2) {
            addCriterion("feebackcontent not between", value1, value2, "feebackcontent");
            return (Criteria) this;
        }

        public Criteria andDeadtimIsNull() {
            addCriterion("deadtim is null");
            return (Criteria) this;
        }

        public Criteria andDeadtimIsNotNull() {
            addCriterion("deadtim is not null");
            return (Criteria) this;
        }

        public Criteria andDeadtimEqualTo(Date value) {
            addCriterionForJDBCDate("deadtim =", value, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimNotEqualTo(Date value) {
            addCriterionForJDBCDate("deadtim <>", value, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimGreaterThan(Date value) {
            addCriterionForJDBCDate("deadtim >", value, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadtim >=", value, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimLessThan(Date value) {
            addCriterionForJDBCDate("deadtim <", value, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadtim <=", value, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimIn(List<Date> values) {
            addCriterionForJDBCDate("deadtim in", values, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimNotIn(List<Date> values) {
            addCriterionForJDBCDate("deadtim not in", values, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadtim between", value1, value2, "deadtim");
            return (Criteria) this;
        }

        public Criteria andDeadtimNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadtim not between", value1, value2, "deadtim");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubIsNull() {
            addCriterion("involvedsub is null");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubIsNotNull() {
            addCriterion("involvedsub is not null");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubEqualTo(String value) {
            addCriterion("involvedsub =", value, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubNotEqualTo(String value) {
            addCriterion("involvedsub <>", value, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubGreaterThan(String value) {
            addCriterion("involvedsub >", value, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubGreaterThanOrEqualTo(String value) {
            addCriterion("involvedsub >=", value, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubLessThan(String value) {
            addCriterion("involvedsub <", value, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubLessThanOrEqualTo(String value) {
            addCriterion("involvedsub <=", value, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubLike(String value) {
            addCriterion("involvedsub like", value, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubNotLike(String value) {
            addCriterion("involvedsub not like", value, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubIn(List<String> values) {
            addCriterion("involvedsub in", values, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubNotIn(List<String> values) {
            addCriterion("involvedsub not in", values, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubBetween(String value1, String value2) {
            addCriterion("involvedsub between", value1, value2, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andInvolvedsubNotBetween(String value1, String value2) {
            addCriterion("involvedsub not between", value1, value2, "involvedsub");
            return (Criteria) this;
        }

        public Criteria andSdeptIsNull() {
            addCriterion("sdept is null");
            return (Criteria) this;
        }

        public Criteria andSdeptIsNotNull() {
            addCriterion("sdept is not null");
            return (Criteria) this;
        }

        public Criteria andSdeptEqualTo(String value) {
            addCriterion("sdept =", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptNotEqualTo(String value) {
            addCriterion("sdept <>", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptGreaterThan(String value) {
            addCriterion("sdept >", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptGreaterThanOrEqualTo(String value) {
            addCriterion("sdept >=", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptLessThan(String value) {
            addCriterion("sdept <", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptLessThanOrEqualTo(String value) {
            addCriterion("sdept <=", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptLike(String value) {
            addCriterion("sdept like", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptNotLike(String value) {
            addCriterion("sdept not like", value, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptIn(List<String> values) {
            addCriterion("sdept in", values, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptNotIn(List<String> values) {
            addCriterion("sdept not in", values, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptBetween(String value1, String value2) {
            addCriterion("sdept between", value1, value2, "sdept");
            return (Criteria) this;
        }

        public Criteria andSdeptNotBetween(String value1, String value2) {
            addCriterion("sdept not between", value1, value2, "sdept");
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