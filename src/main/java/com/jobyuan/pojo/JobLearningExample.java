package com.jobyuan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobLearningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobLearningExample() {
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

        public Criteria andSubjectIsNull() {
            addCriterion("subject is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIsNotNull() {
            addCriterion("subject is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectEqualTo(Integer value) {
            addCriterion("subject =", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotEqualTo(Integer value) {
            addCriterion("subject <>", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThan(Integer value) {
            addCriterion("subject >", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("subject >=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThan(Integer value) {
            addCriterion("subject <", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectLessThanOrEqualTo(Integer value) {
            addCriterion("subject <=", value, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectIn(List<Integer> values) {
            addCriterion("subject in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotIn(List<Integer> values) {
            addCriterion("subject not in", values, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectBetween(Integer value1, Integer value2) {
            addCriterion("subject between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andSubjectNotBetween(Integer value1, Integer value2) {
            addCriterion("subject not between", value1, value2, "subject");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgIsNull() {
            addCriterion("primary_img is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgIsNotNull() {
            addCriterion("primary_img is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgEqualTo(String value) {
            addCriterion("primary_img =", value, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgNotEqualTo(String value) {
            addCriterion("primary_img <>", value, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgGreaterThan(String value) {
            addCriterion("primary_img >", value, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgGreaterThanOrEqualTo(String value) {
            addCriterion("primary_img >=", value, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgLessThan(String value) {
            addCriterion("primary_img <", value, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgLessThanOrEqualTo(String value) {
            addCriterion("primary_img <=", value, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgLike(String value) {
            addCriterion("primary_img like", value, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgNotLike(String value) {
            addCriterion("primary_img not like", value, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgIn(List<String> values) {
            addCriterion("primary_img in", values, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgNotIn(List<String> values) {
            addCriterion("primary_img not in", values, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgBetween(String value1, String value2) {
            addCriterion("primary_img between", value1, value2, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andPrimaryImgNotBetween(String value1, String value2) {
            addCriterion("primary_img not between", value1, value2, "primaryImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgIsNull() {
            addCriterion("middle_img is null");
            return (Criteria) this;
        }

        public Criteria andMiddleImgIsNotNull() {
            addCriterion("middle_img is not null");
            return (Criteria) this;
        }

        public Criteria andMiddleImgEqualTo(String value) {
            addCriterion("middle_img =", value, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgNotEqualTo(String value) {
            addCriterion("middle_img <>", value, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgGreaterThan(String value) {
            addCriterion("middle_img >", value, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgGreaterThanOrEqualTo(String value) {
            addCriterion("middle_img >=", value, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgLessThan(String value) {
            addCriterion("middle_img <", value, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgLessThanOrEqualTo(String value) {
            addCriterion("middle_img <=", value, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgLike(String value) {
            addCriterion("middle_img like", value, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgNotLike(String value) {
            addCriterion("middle_img not like", value, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgIn(List<String> values) {
            addCriterion("middle_img in", values, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgNotIn(List<String> values) {
            addCriterion("middle_img not in", values, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgBetween(String value1, String value2) {
            addCriterion("middle_img between", value1, value2, "middleImg");
            return (Criteria) this;
        }

        public Criteria andMiddleImgNotBetween(String value1, String value2) {
            addCriterion("middle_img not between", value1, value2, "middleImg");
            return (Criteria) this;
        }

        public Criteria andHighImgIsNull() {
            addCriterion("high_img is null");
            return (Criteria) this;
        }

        public Criteria andHighImgIsNotNull() {
            addCriterion("high_img is not null");
            return (Criteria) this;
        }

        public Criteria andHighImgEqualTo(String value) {
            addCriterion("high_img =", value, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgNotEqualTo(String value) {
            addCriterion("high_img <>", value, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgGreaterThan(String value) {
            addCriterion("high_img >", value, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgGreaterThanOrEqualTo(String value) {
            addCriterion("high_img >=", value, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgLessThan(String value) {
            addCriterion("high_img <", value, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgLessThanOrEqualTo(String value) {
            addCriterion("high_img <=", value, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgLike(String value) {
            addCriterion("high_img like", value, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgNotLike(String value) {
            addCriterion("high_img not like", value, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgIn(List<String> values) {
            addCriterion("high_img in", values, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgNotIn(List<String> values) {
            addCriterion("high_img not in", values, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgBetween(String value1, String value2) {
            addCriterion("high_img between", value1, value2, "highImg");
            return (Criteria) this;
        }

        public Criteria andHighImgNotBetween(String value1, String value2) {
            addCriterion("high_img not between", value1, value2, "highImg");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andReservel1IsNull() {
            addCriterion("reservel1 is null");
            return (Criteria) this;
        }

        public Criteria andReservel1IsNotNull() {
            addCriterion("reservel1 is not null");
            return (Criteria) this;
        }

        public Criteria andReservel1EqualTo(String value) {
            addCriterion("reservel1 =", value, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1NotEqualTo(String value) {
            addCriterion("reservel1 <>", value, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1GreaterThan(String value) {
            addCriterion("reservel1 >", value, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1GreaterThanOrEqualTo(String value) {
            addCriterion("reservel1 >=", value, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1LessThan(String value) {
            addCriterion("reservel1 <", value, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1LessThanOrEqualTo(String value) {
            addCriterion("reservel1 <=", value, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1Like(String value) {
            addCriterion("reservel1 like", value, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1NotLike(String value) {
            addCriterion("reservel1 not like", value, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1In(List<String> values) {
            addCriterion("reservel1 in", values, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1NotIn(List<String> values) {
            addCriterion("reservel1 not in", values, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1Between(String value1, String value2) {
            addCriterion("reservel1 between", value1, value2, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel1NotBetween(String value1, String value2) {
            addCriterion("reservel1 not between", value1, value2, "reservel1");
            return (Criteria) this;
        }

        public Criteria andReservel2IsNull() {
            addCriterion("reservel2 is null");
            return (Criteria) this;
        }

        public Criteria andReservel2IsNotNull() {
            addCriterion("reservel2 is not null");
            return (Criteria) this;
        }

        public Criteria andReservel2EqualTo(String value) {
            addCriterion("reservel2 =", value, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2NotEqualTo(String value) {
            addCriterion("reservel2 <>", value, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2GreaterThan(String value) {
            addCriterion("reservel2 >", value, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2GreaterThanOrEqualTo(String value) {
            addCriterion("reservel2 >=", value, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2LessThan(String value) {
            addCriterion("reservel2 <", value, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2LessThanOrEqualTo(String value) {
            addCriterion("reservel2 <=", value, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2Like(String value) {
            addCriterion("reservel2 like", value, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2NotLike(String value) {
            addCriterion("reservel2 not like", value, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2In(List<String> values) {
            addCriterion("reservel2 in", values, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2NotIn(List<String> values) {
            addCriterion("reservel2 not in", values, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2Between(String value1, String value2) {
            addCriterion("reservel2 between", value1, value2, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel2NotBetween(String value1, String value2) {
            addCriterion("reservel2 not between", value1, value2, "reservel2");
            return (Criteria) this;
        }

        public Criteria andReservel3IsNull() {
            addCriterion("reservel3 is null");
            return (Criteria) this;
        }

        public Criteria andReservel3IsNotNull() {
            addCriterion("reservel3 is not null");
            return (Criteria) this;
        }

        public Criteria andReservel3EqualTo(String value) {
            addCriterion("reservel3 =", value, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3NotEqualTo(String value) {
            addCriterion("reservel3 <>", value, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3GreaterThan(String value) {
            addCriterion("reservel3 >", value, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3GreaterThanOrEqualTo(String value) {
            addCriterion("reservel3 >=", value, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3LessThan(String value) {
            addCriterion("reservel3 <", value, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3LessThanOrEqualTo(String value) {
            addCriterion("reservel3 <=", value, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3Like(String value) {
            addCriterion("reservel3 like", value, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3NotLike(String value) {
            addCriterion("reservel3 not like", value, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3In(List<String> values) {
            addCriterion("reservel3 in", values, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3NotIn(List<String> values) {
            addCriterion("reservel3 not in", values, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3Between(String value1, String value2) {
            addCriterion("reservel3 between", value1, value2, "reservel3");
            return (Criteria) this;
        }

        public Criteria andReservel3NotBetween(String value1, String value2) {
            addCriterion("reservel3 not between", value1, value2, "reservel3");
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