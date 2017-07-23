package cn.gov.wh.complain.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ReportinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportinfoExample() {
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

        public Criteria andReportidIsNull() {
            addCriterion("reportid is null");
            return (Criteria) this;
        }

        public Criteria andReportidIsNotNull() {
            addCriterion("reportid is not null");
            return (Criteria) this;
        }

        public Criteria andReportidEqualTo(String value) {
            addCriterion("reportid =", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotEqualTo(String value) {
            addCriterion("reportid <>", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThan(String value) {
            addCriterion("reportid >", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidGreaterThanOrEqualTo(String value) {
            addCriterion("reportid >=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThan(String value) {
            addCriterion("reportid <", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLessThanOrEqualTo(String value) {
            addCriterion("reportid <=", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidLike(String value) {
            addCriterion("reportid like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotLike(String value) {
            addCriterion("reportid not like", value, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidIn(List<String> values) {
            addCriterion("reportid in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotIn(List<String> values) {
            addCriterion("reportid not in", values, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidBetween(String value1, String value2) {
            addCriterion("reportid between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andReportidNotBetween(String value1, String value2) {
            addCriterion("reportid not between", value1, value2, "reportid");
            return (Criteria) this;
        }

        public Criteria andUrgentIsNull() {
            addCriterion("urgent is null");
            return (Criteria) this;
        }

        public Criteria andUrgentIsNotNull() {
            addCriterion("urgent is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentEqualTo(String value) {
            addCriterion("urgent =", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotEqualTo(String value) {
            addCriterion("urgent <>", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentGreaterThan(String value) {
            addCriterion("urgent >", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentGreaterThanOrEqualTo(String value) {
            addCriterion("urgent >=", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLessThan(String value) {
            addCriterion("urgent <", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLessThanOrEqualTo(String value) {
            addCriterion("urgent <=", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentLike(String value) {
            addCriterion("urgent like", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotLike(String value) {
            addCriterion("urgent not like", value, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentIn(List<String> values) {
            addCriterion("urgent in", values, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotIn(List<String> values) {
            addCriterion("urgent not in", values, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentBetween(String value1, String value2) {
            addCriterion("urgent between", value1, value2, "urgent");
            return (Criteria) this;
        }

        public Criteria andUrgentNotBetween(String value1, String value2) {
            addCriterion("urgent not between", value1, value2, "urgent");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNull() {
            addCriterion("_subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("_subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(String value) {
            addCriterion("_subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(String value) {
            addCriterion("_subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(String value) {
            addCriterion("_subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("_subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(String value) {
            addCriterion("_subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(String value) {
            addCriterion("_subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLike(String value) {
            addCriterion("_subject like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotLike(String value) {
            addCriterion("_subject not like", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<String> values) {
            addCriterion("_subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<String> values) {
            addCriterion("_subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(String value1, String value2) {
            addCriterion("_subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(String value1, String value2) {
            addCriterion("_subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyIsNull() {
            addCriterion("createCompany is null");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyIsNotNull() {
            addCriterion("createCompany is not null");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyEqualTo(String value) {
            addCriterion("createCompany =", value, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyNotEqualTo(String value) {
            addCriterion("createCompany <>", value, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyGreaterThan(String value) {
            addCriterion("createCompany >", value, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyGreaterThanOrEqualTo(String value) {
            addCriterion("createCompany >=", value, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyLessThan(String value) {
            addCriterion("createCompany <", value, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyLessThanOrEqualTo(String value) {
            addCriterion("createCompany <=", value, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyLike(String value) {
            addCriterion("createCompany like", value, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyNotLike(String value) {
            addCriterion("createCompany not like", value, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyIn(List<String> values) {
            addCriterion("createCompany in", values, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyNotIn(List<String> values) {
            addCriterion("createCompany not in", values, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyBetween(String value1, String value2) {
            addCriterion("createCompany between", value1, value2, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatecompanyNotBetween(String value1, String value2) {
            addCriterion("createCompany not between", value1, value2, "createcompany");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("createTime not between", value1, value2, "createtime");
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