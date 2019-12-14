package com.example.Market.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order_TableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public Order_TableExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
        return offset;
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

        public Criteria andOrder_IdIsNull() {
            addCriterion("order_Id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_IdIsNotNull() {
            addCriterion("order_Id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_IdEqualTo(Integer value) {
            addCriterion("order_Id =", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotEqualTo(Integer value) {
            addCriterion("order_Id <>", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdGreaterThan(Integer value) {
            addCriterion("order_Id >", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_Id >=", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdLessThan(Integer value) {
            addCriterion("order_Id <", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdLessThanOrEqualTo(Integer value) {
            addCriterion("order_Id <=", value, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdIn(List<Integer> values) {
            addCriterion("order_Id in", values, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotIn(List<Integer> values) {
            addCriterion("order_Id not in", values, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdBetween(Integer value1, Integer value2) {
            addCriterion("order_Id between", value1, value2, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_Id not between", value1, value2, "order_Id");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdIsNull() {
            addCriterion("order_GoodId is null");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdIsNotNull() {
            addCriterion("order_GoodId is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdEqualTo(Integer value) {
            addCriterion("order_GoodId =", value, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdNotEqualTo(Integer value) {
            addCriterion("order_GoodId <>", value, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdGreaterThan(Integer value) {
            addCriterion("order_GoodId >", value, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_GoodId >=", value, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdLessThan(Integer value) {
            addCriterion("order_GoodId <", value, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_GoodId <=", value, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdIn(List<Integer> values) {
            addCriterion("order_GoodId in", values, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdNotIn(List<Integer> values) {
            addCriterion("order_GoodId not in", values, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdBetween(Integer value1, Integer value2) {
            addCriterion("order_GoodId between", value1, value2, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_GoodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_GoodId not between", value1, value2, "order_GoodId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdIsNull() {
            addCriterion("order_userId is null");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdIsNotNull() {
            addCriterion("order_userId is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdEqualTo(Integer value) {
            addCriterion("order_userId =", value, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdNotEqualTo(Integer value) {
            addCriterion("order_userId <>", value, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdGreaterThan(Integer value) {
            addCriterion("order_userId >", value, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_userId >=", value, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdLessThan(Integer value) {
            addCriterion("order_userId <", value, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_userId <=", value, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdIn(List<Integer> values) {
            addCriterion("order_userId in", values, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdNotIn(List<Integer> values) {
            addCriterion("order_userId not in", values, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdBetween(Integer value1, Integer value2) {
            addCriterion("order_userId between", value1, value2, "order_userId");
            return (Criteria) this;
        }

        public Criteria andOrder_userIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_userId not between", value1, value2, "order_userId");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("DateTime is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("DateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterion("DateTime =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterion("DateTime <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterion("DateTime >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DateTime >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterion("DateTime <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DateTime <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterion("DateTime in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterion("DateTime not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterion("DateTime between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DateTime not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andOrder_stateIsNull() {
            addCriterion("order_state is null");
            return (Criteria) this;
        }

        public Criteria andOrder_stateIsNotNull() {
            addCriterion("order_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_stateEqualTo(String value) {
            addCriterion("order_state =", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateNotEqualTo(String value) {
            addCriterion("order_state <>", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateGreaterThan(String value) {
            addCriterion("order_state >", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateGreaterThanOrEqualTo(String value) {
            addCriterion("order_state >=", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateLessThan(String value) {
            addCriterion("order_state <", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateLessThanOrEqualTo(String value) {
            addCriterion("order_state <=", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateLike(String value) {
            addCriterion("order_state like", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateNotLike(String value) {
            addCriterion("order_state not like", value, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateIn(List<String> values) {
            addCriterion("order_state in", values, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateNotIn(List<String> values) {
            addCriterion("order_state not in", values, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateBetween(String value1, String value2) {
            addCriterion("order_state between", value1, value2, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_stateNotBetween(String value1, String value2) {
            addCriterion("order_state not between", value1, value2, "order_state");
            return (Criteria) this;
        }

        public Criteria andOrder_newIsNull() {
            addCriterion("order_new is null");
            return (Criteria) this;
        }

        public Criteria andOrder_newIsNotNull() {
            addCriterion("order_new is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_newEqualTo(String value) {
            addCriterion("order_new =", value, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newNotEqualTo(String value) {
            addCriterion("order_new <>", value, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newGreaterThan(String value) {
            addCriterion("order_new >", value, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newGreaterThanOrEqualTo(String value) {
            addCriterion("order_new >=", value, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newLessThan(String value) {
            addCriterion("order_new <", value, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newLessThanOrEqualTo(String value) {
            addCriterion("order_new <=", value, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newLike(String value) {
            addCriterion("order_new like", value, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newNotLike(String value) {
            addCriterion("order_new not like", value, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newIn(List<String> values) {
            addCriterion("order_new in", values, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newNotIn(List<String> values) {
            addCriterion("order_new not in", values, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newBetween(String value1, String value2) {
            addCriterion("order_new between", value1, value2, "order_new");
            return (Criteria) this;
        }

        public Criteria andOrder_newNotBetween(String value1, String value2) {
            addCriterion("order_new not between", value1, value2, "order_new");
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