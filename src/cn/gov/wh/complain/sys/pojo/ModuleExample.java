package cn.gov.wh.complain.sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class ModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ModuleExample() {
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

        public Criteria andModuleidIsNull() {
            addCriterion("moduleid is null");
            return (Criteria) this;
        }

        public Criteria andModuleidIsNotNull() {
            addCriterion("moduleid is not null");
            return (Criteria) this;
        }

        public Criteria andModuleidEqualTo(String value) {
            addCriterion("moduleid =", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotEqualTo(String value) {
            addCriterion("moduleid <>", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThan(String value) {
            addCriterion("moduleid >", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidGreaterThanOrEqualTo(String value) {
            addCriterion("moduleid >=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThan(String value) {
            addCriterion("moduleid <", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLessThanOrEqualTo(String value) {
            addCriterion("moduleid <=", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidLike(String value) {
            addCriterion("moduleid like", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotLike(String value) {
            addCriterion("moduleid not like", value, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidIn(List<String> values) {
            addCriterion("moduleid in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotIn(List<String> values) {
            addCriterion("moduleid not in", values, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidBetween(String value1, String value2) {
            addCriterion("moduleid between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andModuleidNotBetween(String value1, String value2) {
            addCriterion("moduleid not between", value1, value2, "moduleid");
            return (Criteria) this;
        }

        public Criteria andParentidIsNull() {
            addCriterion("parentid is null");
            return (Criteria) this;
        }

        public Criteria andParentidIsNotNull() {
            addCriterion("parentid is not null");
            return (Criteria) this;
        }

        public Criteria andParentidEqualTo(String value) {
            addCriterion("parentid =", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotEqualTo(String value) {
            addCriterion("parentid <>", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThan(String value) {
            addCriterion("parentid >", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidGreaterThanOrEqualTo(String value) {
            addCriterion("parentid >=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThan(String value) {
            addCriterion("parentid <", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLessThanOrEqualTo(String value) {
            addCriterion("parentid <=", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidLike(String value) {
            addCriterion("parentid like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotLike(String value) {
            addCriterion("parentid not like", value, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidIn(List<String> values) {
            addCriterion("parentid in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotIn(List<String> values) {
            addCriterion("parentid not in", values, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidBetween(String value1, String value2) {
            addCriterion("parentid between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentidNotBetween(String value1, String value2) {
            addCriterion("parentid not between", value1, value2, "parentid");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNull() {
            addCriterion("parentname is null");
            return (Criteria) this;
        }

        public Criteria andParentnameIsNotNull() {
            addCriterion("parentname is not null");
            return (Criteria) this;
        }

        public Criteria andParentnameEqualTo(String value) {
            addCriterion("parentname =", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotEqualTo(String value) {
            addCriterion("parentname <>", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThan(String value) {
            addCriterion("parentname >", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameGreaterThanOrEqualTo(String value) {
            addCriterion("parentname >=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThan(String value) {
            addCriterion("parentname <", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLessThanOrEqualTo(String value) {
            addCriterion("parentname <=", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameLike(String value) {
            addCriterion("parentname like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotLike(String value) {
            addCriterion("parentname not like", value, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameIn(List<String> values) {
            addCriterion("parentname in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotIn(List<String> values) {
            addCriterion("parentname not in", values, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameBetween(String value1, String value2) {
            addCriterion("parentname between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andParentnameNotBetween(String value1, String value2) {
            addCriterion("parentname not between", value1, value2, "parentname");
            return (Criteria) this;
        }

        public Criteria andModulenameIsNull() {
            addCriterion("modulename is null");
            return (Criteria) this;
        }

        public Criteria andModulenameIsNotNull() {
            addCriterion("modulename is not null");
            return (Criteria) this;
        }

        public Criteria andModulenameEqualTo(String value) {
            addCriterion("modulename =", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotEqualTo(String value) {
            addCriterion("modulename <>", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameGreaterThan(String value) {
            addCriterion("modulename >", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameGreaterThanOrEqualTo(String value) {
            addCriterion("modulename >=", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLessThan(String value) {
            addCriterion("modulename <", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLessThanOrEqualTo(String value) {
            addCriterion("modulename <=", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameLike(String value) {
            addCriterion("modulename like", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotLike(String value) {
            addCriterion("modulename not like", value, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameIn(List<String> values) {
            addCriterion("modulename in", values, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotIn(List<String> values) {
            addCriterion("modulename not in", values, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameBetween(String value1, String value2) {
            addCriterion("modulename between", value1, value2, "modulename");
            return (Criteria) this;
        }

        public Criteria andModulenameNotBetween(String value1, String value2) {
            addCriterion("modulename not between", value1, value2, "modulename");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("ordernum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("ordernum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("ordernum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("ordernum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("ordernum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("ordernum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("ordernum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("ordernum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("ordernum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("ordernum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("ordernum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("ordernum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
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