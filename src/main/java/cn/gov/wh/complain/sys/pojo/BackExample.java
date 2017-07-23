package cn.gov.wh.complain.sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class BackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackExample() {
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

        public Criteria andReturnpersonIsNull() {
            addCriterion("returnperson is null");
            return (Criteria) this;
        }

        public Criteria andReturnpersonIsNotNull() {
            addCriterion("returnperson is not null");
            return (Criteria) this;
        }

        public Criteria andReturnpersonEqualTo(String value) {
            addCriterion("returnperson =", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonNotEqualTo(String value) {
            addCriterion("returnperson <>", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonGreaterThan(String value) {
            addCriterion("returnperson >", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonGreaterThanOrEqualTo(String value) {
            addCriterion("returnperson >=", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonLessThan(String value) {
            addCriterion("returnperson <", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonLessThanOrEqualTo(String value) {
            addCriterion("returnperson <=", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonLike(String value) {
            addCriterion("returnperson like", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonNotLike(String value) {
            addCriterion("returnperson not like", value, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonIn(List<String> values) {
            addCriterion("returnperson in", values, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonNotIn(List<String> values) {
            addCriterion("returnperson not in", values, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonBetween(String value1, String value2) {
            addCriterion("returnperson between", value1, value2, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturnpersonNotBetween(String value1, String value2) {
            addCriterion("returnperson not between", value1, value2, "returnperson");
            return (Criteria) this;
        }

        public Criteria andReturncauseIsNull() {
            addCriterion("returncause is null");
            return (Criteria) this;
        }

        public Criteria andReturncauseIsNotNull() {
            addCriterion("returncause is not null");
            return (Criteria) this;
        }

        public Criteria andReturncauseEqualTo(String value) {
            addCriterion("returncause =", value, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseNotEqualTo(String value) {
            addCriterion("returncause <>", value, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseGreaterThan(String value) {
            addCriterion("returncause >", value, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseGreaterThanOrEqualTo(String value) {
            addCriterion("returncause >=", value, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseLessThan(String value) {
            addCriterion("returncause <", value, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseLessThanOrEqualTo(String value) {
            addCriterion("returncause <=", value, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseLike(String value) {
            addCriterion("returncause like", value, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseNotLike(String value) {
            addCriterion("returncause not like", value, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseIn(List<String> values) {
            addCriterion("returncause in", values, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseNotIn(List<String> values) {
            addCriterion("returncause not in", values, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseBetween(String value1, String value2) {
            addCriterion("returncause between", value1, value2, "returncause");
            return (Criteria) this;
        }

        public Criteria andReturncauseNotBetween(String value1, String value2) {
            addCriterion("returncause not between", value1, value2, "returncause");
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