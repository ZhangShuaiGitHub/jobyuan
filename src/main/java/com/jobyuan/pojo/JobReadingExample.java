package com.jobyuan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobReadingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobReadingExample() {
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

        public Criteria andInterIdIsNull() {
            addCriterion("inter_id is null");
            return (Criteria) this;
        }

        public Criteria andInterIdIsNotNull() {
            addCriterion("inter_id is not null");
            return (Criteria) this;
        }

        public Criteria andInterIdEqualTo(Integer value) {
            addCriterion("inter_id =", value, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdNotEqualTo(Integer value) {
            addCriterion("inter_id <>", value, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdGreaterThan(Integer value) {
            addCriterion("inter_id >", value, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("inter_id >=", value, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdLessThan(Integer value) {
            addCriterion("inter_id <", value, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdLessThanOrEqualTo(Integer value) {
            addCriterion("inter_id <=", value, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdIn(List<Integer> values) {
            addCriterion("inter_id in", values, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdNotIn(List<Integer> values) {
            addCriterion("inter_id not in", values, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdBetween(Integer value1, Integer value2) {
            addCriterion("inter_id between", value1, value2, "interId");
            return (Criteria) this;
        }

        public Criteria andInterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("inter_id not between", value1, value2, "interId");
            return (Criteria) this;
        }

        public Criteria andReadIsNull() {
            addCriterion("read is null");
            return (Criteria) this;
        }

        public Criteria andReadIsNotNull() {
            addCriterion("read is not null");
            return (Criteria) this;
        }

        public Criteria andReadEqualTo(Integer value) {
            addCriterion("read =", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotEqualTo(Integer value) {
            addCriterion("read <>", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadGreaterThan(Integer value) {
            addCriterion("read >", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadGreaterThanOrEqualTo(Integer value) {
            addCriterion("read >=", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadLessThan(Integer value) {
            addCriterion("read <", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadLessThanOrEqualTo(Integer value) {
            addCriterion("read <=", value, "read");
            return (Criteria) this;
        }

        public Criteria andReadIn(List<Integer> values) {
            addCriterion("read in", values, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotIn(List<Integer> values) {
            addCriterion("read not in", values, "read");
            return (Criteria) this;
        }

        public Criteria andReadBetween(Integer value1, Integer value2) {
            addCriterion("read between", value1, value2, "read");
            return (Criteria) this;
        }

        public Criteria andReadNotBetween(Integer value1, Integer value2) {
            addCriterion("read not between", value1, value2, "read");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNull() {
            addCriterion("readtime is null");
            return (Criteria) this;
        }

        public Criteria andReadtimeIsNotNull() {
            addCriterion("readtime is not null");
            return (Criteria) this;
        }

        public Criteria andReadtimeEqualTo(Date value) {
            addCriterion("readtime =", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotEqualTo(Date value) {
            addCriterion("readtime <>", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThan(Date value) {
            addCriterion("readtime >", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("readtime >=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThan(Date value) {
            addCriterion("readtime <", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeLessThanOrEqualTo(Date value) {
            addCriterion("readtime <=", value, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeIn(List<Date> values) {
            addCriterion("readtime in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotIn(List<Date> values) {
            addCriterion("readtime not in", values, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeBetween(Date value1, Date value2) {
            addCriterion("readtime between", value1, value2, "readtime");
            return (Criteria) this;
        }

        public Criteria andReadtimeNotBetween(Date value1, Date value2) {
            addCriterion("readtime not between", value1, value2, "readtime");
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