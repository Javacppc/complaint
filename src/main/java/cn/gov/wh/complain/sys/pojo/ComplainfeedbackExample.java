package cn.gov.wh.complain.sys.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComplainfeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainfeedbackExample() {
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

        public Criteria andStypeIsNull() {
            addCriterion("stype is null");
            return (Criteria) this;
        }

        public Criteria andStypeIsNotNull() {
            addCriterion("stype is not null");
            return (Criteria) this;
        }

        public Criteria andStypeEqualTo(String value) {
            addCriterion("stype =", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotEqualTo(String value) {
            addCriterion("stype <>", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThan(String value) {
            addCriterion("stype >", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeGreaterThanOrEqualTo(String value) {
            addCriterion("stype >=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThan(String value) {
            addCriterion("stype <", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLessThanOrEqualTo(String value) {
            addCriterion("stype <=", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeLike(String value) {
            addCriterion("stype like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotLike(String value) {
            addCriterion("stype not like", value, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeIn(List<String> values) {
            addCriterion("stype in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotIn(List<String> values) {
            addCriterion("stype not in", values, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeBetween(String value1, String value2) {
            addCriterion("stype between", value1, value2, "stype");
            return (Criteria) this;
        }

        public Criteria andStypeNotBetween(String value1, String value2) {
            addCriterion("stype not between", value1, value2, "stype");
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

        public Criteria andSolvedeptIsNull() {
            addCriterion("solvedept is null");
            return (Criteria) this;
        }

        public Criteria andSolvedeptIsNotNull() {
            addCriterion("solvedept is not null");
            return (Criteria) this;
        }

        public Criteria andSolvedeptEqualTo(String value) {
            addCriterion("solvedept =", value, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptNotEqualTo(String value) {
            addCriterion("solvedept <>", value, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptGreaterThan(String value) {
            addCriterion("solvedept >", value, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptGreaterThanOrEqualTo(String value) {
            addCriterion("solvedept >=", value, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptLessThan(String value) {
            addCriterion("solvedept <", value, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptLessThanOrEqualTo(String value) {
            addCriterion("solvedept <=", value, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptLike(String value) {
            addCriterion("solvedept like", value, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptNotLike(String value) {
            addCriterion("solvedept not like", value, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptIn(List<String> values) {
            addCriterion("solvedept in", values, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptNotIn(List<String> values) {
            addCriterion("solvedept not in", values, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptBetween(String value1, String value2) {
            addCriterion("solvedept between", value1, value2, "solvedept");
            return (Criteria) this;
        }

        public Criteria andSolvedeptNotBetween(String value1, String value2) {
            addCriterion("solvedept not between", value1, value2, "solvedept");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyIsNull() {
            addCriterion("helpcompany is null");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyIsNotNull() {
            addCriterion("helpcompany is not null");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyEqualTo(String value) {
            addCriterion("helpcompany =", value, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyNotEqualTo(String value) {
            addCriterion("helpcompany <>", value, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyGreaterThan(String value) {
            addCriterion("helpcompany >", value, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyGreaterThanOrEqualTo(String value) {
            addCriterion("helpcompany >=", value, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyLessThan(String value) {
            addCriterion("helpcompany <", value, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyLessThanOrEqualTo(String value) {
            addCriterion("helpcompany <=", value, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyLike(String value) {
            addCriterion("helpcompany like", value, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyNotLike(String value) {
            addCriterion("helpcompany not like", value, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyIn(List<String> values) {
            addCriterion("helpcompany in", values, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyNotIn(List<String> values) {
            addCriterion("helpcompany not in", values, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyBetween(String value1, String value2) {
            addCriterion("helpcompany between", value1, value2, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andHelpcompanyNotBetween(String value1, String value2) {
            addCriterion("helpcompany not between", value1, value2, "helpcompany");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("manager is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("manager is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("manager =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("manager <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("manager >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("manager >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("manager <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("manager <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("manager like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("manager not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("manager in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("manager not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("manager between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("manager not between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andRegistorIsNull() {
            addCriterion("registor is null");
            return (Criteria) this;
        }

        public Criteria andRegistorIsNotNull() {
            addCriterion("registor is not null");
            return (Criteria) this;
        }

        public Criteria andRegistorEqualTo(String value) {
            addCriterion("registor =", value, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorNotEqualTo(String value) {
            addCriterion("registor <>", value, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorGreaterThan(String value) {
            addCriterion("registor >", value, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorGreaterThanOrEqualTo(String value) {
            addCriterion("registor >=", value, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorLessThan(String value) {
            addCriterion("registor <", value, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorLessThanOrEqualTo(String value) {
            addCriterion("registor <=", value, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorLike(String value) {
            addCriterion("registor like", value, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorNotLike(String value) {
            addCriterion("registor not like", value, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorIn(List<String> values) {
            addCriterion("registor in", values, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorNotIn(List<String> values) {
            addCriterion("registor not in", values, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorBetween(String value1, String value2) {
            addCriterion("registor between", value1, value2, "registor");
            return (Criteria) this;
        }

        public Criteria andRegistorNotBetween(String value1, String value2) {
            addCriterion("registor not between", value1, value2, "registor");
            return (Criteria) this;
        }

        public Criteria andSatypeIsNull() {
            addCriterion("satype is null");
            return (Criteria) this;
        }

        public Criteria andSatypeIsNotNull() {
            addCriterion("satype is not null");
            return (Criteria) this;
        }

        public Criteria andSatypeEqualTo(Integer value) {
            addCriterion("satype =", value, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeNotEqualTo(Integer value) {
            addCriterion("satype <>", value, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeGreaterThan(Integer value) {
            addCriterion("satype >", value, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("satype >=", value, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeLessThan(Integer value) {
            addCriterion("satype <", value, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeLessThanOrEqualTo(Integer value) {
            addCriterion("satype <=", value, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeIn(List<Integer> values) {
            addCriterion("satype in", values, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeNotIn(List<Integer> values) {
            addCriterion("satype not in", values, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeBetween(Integer value1, Integer value2) {
            addCriterion("satype between", value1, value2, "satype");
            return (Criteria) this;
        }

        public Criteria andSatypeNotBetween(Integer value1, Integer value2) {
            addCriterion("satype not between", value1, value2, "satype");
            return (Criteria) this;
        }

        public Criteria andCompensationIsNull() {
            addCriterion("compensation is null");
            return (Criteria) this;
        }

        public Criteria andCompensationIsNotNull() {
            addCriterion("compensation is not null");
            return (Criteria) this;
        }

        public Criteria andCompensationEqualTo(Float value) {
            addCriterion("compensation =", value, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationNotEqualTo(Float value) {
            addCriterion("compensation <>", value, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationGreaterThan(Float value) {
            addCriterion("compensation >", value, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationGreaterThanOrEqualTo(Float value) {
            addCriterion("compensation >=", value, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationLessThan(Float value) {
            addCriterion("compensation <", value, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationLessThanOrEqualTo(Float value) {
            addCriterion("compensation <=", value, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationIn(List<Float> values) {
            addCriterion("compensation in", values, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationNotIn(List<Float> values) {
            addCriterion("compensation not in", values, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationBetween(Float value1, Float value2) {
            addCriterion("compensation between", value1, value2, "compensation");
            return (Criteria) this;
        }

        public Criteria andCompensationNotBetween(Float value1, Float value2) {
            addCriterion("compensation not between", value1, value2, "compensation");
            return (Criteria) this;
        }

        public Criteria andQuamoneyIsNull() {
            addCriterion("quamoney is null");
            return (Criteria) this;
        }

        public Criteria andQuamoneyIsNotNull() {
            addCriterion("quamoney is not null");
            return (Criteria) this;
        }

        public Criteria andQuamoneyEqualTo(Float value) {
            addCriterion("quamoney =", value, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyNotEqualTo(Float value) {
            addCriterion("quamoney <>", value, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyGreaterThan(Float value) {
            addCriterion("quamoney >", value, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("quamoney >=", value, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyLessThan(Float value) {
            addCriterion("quamoney <", value, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyLessThanOrEqualTo(Float value) {
            addCriterion("quamoney <=", value, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyIn(List<Float> values) {
            addCriterion("quamoney in", values, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyNotIn(List<Float> values) {
            addCriterion("quamoney not in", values, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyBetween(Float value1, Float value2) {
            addCriterion("quamoney between", value1, value2, "quamoney");
            return (Criteria) this;
        }

        public Criteria andQuamoneyNotBetween(Float value1, Float value2) {
            addCriterion("quamoney not between", value1, value2, "quamoney");
            return (Criteria) this;
        }

        public Criteria andRestoreIsNull() {
            addCriterion("_restore is null");
            return (Criteria) this;
        }

        public Criteria andRestoreIsNotNull() {
            addCriterion("_restore is not null");
            return (Criteria) this;
        }

        public Criteria andRestoreEqualTo(Float value) {
            addCriterion("_restore =", value, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreNotEqualTo(Float value) {
            addCriterion("_restore <>", value, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreGreaterThan(Float value) {
            addCriterion("_restore >", value, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreGreaterThanOrEqualTo(Float value) {
            addCriterion("_restore >=", value, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreLessThan(Float value) {
            addCriterion("_restore <", value, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreLessThanOrEqualTo(Float value) {
            addCriterion("_restore <=", value, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreIn(List<Float> values) {
            addCriterion("_restore in", values, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreNotIn(List<Float> values) {
            addCriterion("_restore not in", values, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreBetween(Float value1, Float value2) {
            addCriterion("_restore between", value1, value2, "restore");
            return (Criteria) this;
        }

        public Criteria andRestoreNotBetween(Float value1, Float value2) {
            addCriterion("_restore not between", value1, value2, "restore");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentIsNull() {
            addCriterion("feedbackcontent is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentIsNotNull() {
            addCriterion("feedbackcontent is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentEqualTo(String value) {
            addCriterion("feedbackcontent =", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentNotEqualTo(String value) {
            addCriterion("feedbackcontent <>", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentGreaterThan(String value) {
            addCriterion("feedbackcontent >", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentGreaterThanOrEqualTo(String value) {
            addCriterion("feedbackcontent >=", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentLessThan(String value) {
            addCriterion("feedbackcontent <", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentLessThanOrEqualTo(String value) {
            addCriterion("feedbackcontent <=", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentLike(String value) {
            addCriterion("feedbackcontent like", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentNotLike(String value) {
            addCriterion("feedbackcontent not like", value, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentIn(List<String> values) {
            addCriterion("feedbackcontent in", values, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentNotIn(List<String> values) {
            addCriterion("feedbackcontent not in", values, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentBetween(String value1, String value2) {
            addCriterion("feedbackcontent between", value1, value2, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andFeedbackcontentNotBetween(String value1, String value2) {
            addCriterion("feedbackcontent not between", value1, value2, "feedbackcontent");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyIsNull() {
            addCriterion("spiritmoney is null");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyIsNotNull() {
            addCriterion("spiritmoney is not null");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyEqualTo(Float value) {
            addCriterion("spiritmoney =", value, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyNotEqualTo(Float value) {
            addCriterion("spiritmoney <>", value, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyGreaterThan(Float value) {
            addCriterion("spiritmoney >", value, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("spiritmoney >=", value, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyLessThan(Float value) {
            addCriterion("spiritmoney <", value, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyLessThanOrEqualTo(Float value) {
            addCriterion("spiritmoney <=", value, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyIn(List<Float> values) {
            addCriterion("spiritmoney in", values, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyNotIn(List<Float> values) {
            addCriterion("spiritmoney not in", values, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyBetween(Float value1, Float value2) {
            addCriterion("spiritmoney between", value1, value2, "spiritmoney");
            return (Criteria) this;
        }

        public Criteria andSpiritmoneyNotBetween(Float value1, Float value2) {
            addCriterion("spiritmoney not between", value1, value2, "spiritmoney");
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