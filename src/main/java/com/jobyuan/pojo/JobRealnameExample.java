package com.jobyuan.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JobRealnameExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public JobRealnameExample() {
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

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("realname is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("realname is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("realname =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("realname <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("realname >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("realname >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("realname <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("realname <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("realname like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("realname not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("realname in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("realname not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("realname between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("realname not between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andNumberidIsNull() {
            addCriterion("numberid is null");
            return (Criteria) this;
        }

        public Criteria andNumberidIsNotNull() {
            addCriterion("numberid is not null");
            return (Criteria) this;
        }

        public Criteria andNumberidEqualTo(Integer value) {
            addCriterion("numberid =", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidNotEqualTo(Integer value) {
            addCriterion("numberid <>", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidGreaterThan(Integer value) {
            addCriterion("numberid >", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidGreaterThanOrEqualTo(Integer value) {
            addCriterion("numberid >=", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidLessThan(Integer value) {
            addCriterion("numberid <", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidLessThanOrEqualTo(Integer value) {
            addCriterion("numberid <=", value, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidIn(List<Integer> values) {
            addCriterion("numberid in", values, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidNotIn(List<Integer> values) {
            addCriterion("numberid not in", values, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidBetween(Integer value1, Integer value2) {
            addCriterion("numberid between", value1, value2, "numberid");
            return (Criteria) this;
        }

        public Criteria andNumberidNotBetween(Integer value1, Integer value2) {
            addCriterion("numberid not between", value1, value2, "numberid");
            return (Criteria) this;
        }

        public Criteria andIdimg1IsNull() {
            addCriterion("idimg1 is null");
            return (Criteria) this;
        }

        public Criteria andIdimg1IsNotNull() {
            addCriterion("idimg1 is not null");
            return (Criteria) this;
        }

        public Criteria andIdimg1EqualTo(String value) {
            addCriterion("idimg1 =", value, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1NotEqualTo(String value) {
            addCriterion("idimg1 <>", value, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1GreaterThan(String value) {
            addCriterion("idimg1 >", value, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1GreaterThanOrEqualTo(String value) {
            addCriterion("idimg1 >=", value, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1LessThan(String value) {
            addCriterion("idimg1 <", value, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1LessThanOrEqualTo(String value) {
            addCriterion("idimg1 <=", value, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1Like(String value) {
            addCriterion("idimg1 like", value, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1NotLike(String value) {
            addCriterion("idimg1 not like", value, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1In(List<String> values) {
            addCriterion("idimg1 in", values, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1NotIn(List<String> values) {
            addCriterion("idimg1 not in", values, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1Between(String value1, String value2) {
            addCriterion("idimg1 between", value1, value2, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg1NotBetween(String value1, String value2) {
            addCriterion("idimg1 not between", value1, value2, "idimg1");
            return (Criteria) this;
        }

        public Criteria andIdimg2IsNull() {
            addCriterion("idimg2 is null");
            return (Criteria) this;
        }

        public Criteria andIdimg2IsNotNull() {
            addCriterion("idimg2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdimg2EqualTo(String value) {
            addCriterion("idimg2 =", value, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2NotEqualTo(String value) {
            addCriterion("idimg2 <>", value, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2GreaterThan(String value) {
            addCriterion("idimg2 >", value, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2GreaterThanOrEqualTo(String value) {
            addCriterion("idimg2 >=", value, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2LessThan(String value) {
            addCriterion("idimg2 <", value, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2LessThanOrEqualTo(String value) {
            addCriterion("idimg2 <=", value, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2Like(String value) {
            addCriterion("idimg2 like", value, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2NotLike(String value) {
            addCriterion("idimg2 not like", value, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2In(List<String> values) {
            addCriterion("idimg2 in", values, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2NotIn(List<String> values) {
            addCriterion("idimg2 not in", values, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2Between(String value1, String value2) {
            addCriterion("idimg2 between", value1, value2, "idimg2");
            return (Criteria) this;
        }

        public Criteria andIdimg2NotBetween(String value1, String value2) {
            addCriterion("idimg2 not between", value1, value2, "idimg2");
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