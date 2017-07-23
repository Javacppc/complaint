package cn.gov.wh.complain.sys.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ShuntExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShuntExample() {
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

        public Criteria andShuntreportIsNull() {
            addCriterion("shuntreport is null");
            return (Criteria) this;
        }

        public Criteria andShuntreportIsNotNull() {
            addCriterion("shuntreport is not null");
            return (Criteria) this;
        }

        public Criteria andShuntreportEqualTo(String value) {
            addCriterion("shuntreport =", value, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportNotEqualTo(String value) {
            addCriterion("shuntreport <>", value, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportGreaterThan(String value) {
            addCriterion("shuntreport >", value, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportGreaterThanOrEqualTo(String value) {
            addCriterion("shuntreport >=", value, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportLessThan(String value) {
            addCriterion("shuntreport <", value, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportLessThanOrEqualTo(String value) {
            addCriterion("shuntreport <=", value, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportLike(String value) {
            addCriterion("shuntreport like", value, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportNotLike(String value) {
            addCriterion("shuntreport not like", value, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportIn(List<String> values) {
            addCriterion("shuntreport in", values, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportNotIn(List<String> values) {
            addCriterion("shuntreport not in", values, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportBetween(String value1, String value2) {
            addCriterion("shuntreport between", value1, value2, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andShuntreportNotBetween(String value1, String value2) {
            addCriterion("shuntreport not between", value1, value2, "shuntreport");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNull() {
            addCriterion("deadline is null");
            return (Criteria) this;
        }

        public Criteria andDeadlineIsNotNull() {
            addCriterion("deadline is not null");
            return (Criteria) this;
        }

        public Criteria andDeadlineEqualTo(Date value) {
            addCriterionForJDBCDate("deadline =", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotEqualTo(Date value) {
            addCriterionForJDBCDate("deadline <>", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThan(Date value) {
            addCriterionForJDBCDate("deadline >", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadline >=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThan(Date value) {
            addCriterionForJDBCDate("deadline <", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("deadline <=", value, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineIn(List<Date> values) {
            addCriterionForJDBCDate("deadline in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotIn(List<Date> values) {
            addCriterionForJDBCDate("deadline not in", values, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadline between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andDeadlineNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("deadline not between", value1, value2, "deadline");
            return (Criteria) this;
        }

        public Criteria andInputcompanyIsNull() {
            addCriterion("inputcompany is null");
            return (Criteria) this;
        }

        public Criteria andInputcompanyIsNotNull() {
            addCriterion("inputcompany is not null");
            return (Criteria) this;
        }

        public Criteria andInputcompanyEqualTo(String value) {
            addCriterion("inputcompany =", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyNotEqualTo(String value) {
            addCriterion("inputcompany <>", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyGreaterThan(String value) {
            addCriterion("inputcompany >", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("inputcompany >=", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyLessThan(String value) {
            addCriterion("inputcompany <", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyLessThanOrEqualTo(String value) {
            addCriterion("inputcompany <=", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyLike(String value) {
            addCriterion("inputcompany like", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyNotLike(String value) {
            addCriterion("inputcompany not like", value, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyIn(List<String> values) {
            addCriterion("inputcompany in", values, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyNotIn(List<String> values) {
            addCriterion("inputcompany not in", values, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyBetween(String value1, String value2) {
            addCriterion("inputcompany between", value1, value2, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andInputcompanyNotBetween(String value1, String value2) {
            addCriterion("inputcompany not between", value1, value2, "inputcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyIsNull() {
            addCriterion("outcompany is null");
            return (Criteria) this;
        }

        public Criteria andOutcompanyIsNotNull() {
            addCriterion("outcompany is not null");
            return (Criteria) this;
        }

        public Criteria andOutcompanyEqualTo(String value) {
            addCriterion("outcompany =", value, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyNotEqualTo(String value) {
            addCriterion("outcompany <>", value, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyGreaterThan(String value) {
            addCriterion("outcompany >", value, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("outcompany >=", value, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyLessThan(String value) {
            addCriterion("outcompany <", value, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyLessThanOrEqualTo(String value) {
            addCriterion("outcompany <=", value, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyLike(String value) {
            addCriterion("outcompany like", value, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyNotLike(String value) {
            addCriterion("outcompany not like", value, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyIn(List<String> values) {
            addCriterion("outcompany in", values, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyNotIn(List<String> values) {
            addCriterion("outcompany not in", values, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyBetween(String value1, String value2) {
            addCriterion("outcompany between", value1, value2, "outcompany");
            return (Criteria) this;
        }

        public Criteria andOutcompanyNotBetween(String value1, String value2) {
            addCriterion("outcompany not between", value1, value2, "outcompany");
            return (Criteria) this;
        }

        public Criteria andShunttimeIsNull() {
            addCriterion("shunttime is null");
            return (Criteria) this;
        }

        public Criteria andShunttimeIsNotNull() {
            addCriterion("shunttime is not null");
            return (Criteria) this;
        }

        public Criteria andShunttimeEqualTo(Date value) {
            addCriterionForJDBCDate("shunttime =", value, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("shunttime <>", value, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeGreaterThan(Date value) {
            addCriterionForJDBCDate("shunttime >", value, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shunttime >=", value, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeLessThan(Date value) {
            addCriterionForJDBCDate("shunttime <", value, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("shunttime <=", value, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeIn(List<Date> values) {
            addCriterionForJDBCDate("shunttime in", values, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("shunttime not in", values, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shunttime between", value1, value2, "shunttime");
            return (Criteria) this;
        }

        public Criteria andShunttimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("shunttime not between", value1, value2, "shunttime");
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