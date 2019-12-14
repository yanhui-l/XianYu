package com.example.Market.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsRequestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodsRequestExample() {
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

        public Criteria andRequest_IdIsNull() {
            addCriterion("Request_Id is null");
            return (Criteria) this;
        }

        public Criteria andRequest_IdIsNotNull() {
            addCriterion("Request_Id is not null");
            return (Criteria) this;
        }

        public Criteria andRequest_IdEqualTo(Integer value) {
            addCriterion("Request_Id =", value, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdNotEqualTo(Integer value) {
            addCriterion("Request_Id <>", value, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdGreaterThan(Integer value) {
            addCriterion("Request_Id >", value, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Request_Id >=", value, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdLessThan(Integer value) {
            addCriterion("Request_Id <", value, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Request_Id <=", value, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdIn(List<Integer> values) {
            addCriterion("Request_Id in", values, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdNotIn(List<Integer> values) {
            addCriterion("Request_Id not in", values, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdBetween(Integer value1, Integer value2) {
            addCriterion("Request_Id between", value1, value2, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequest_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Request_Id not between", value1, value2, "request_Id");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleIsNull() {
            addCriterion("RequestGoodsTitle is null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleIsNotNull() {
            addCriterion("RequestGoodsTitle is not null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleEqualTo(String value) {
            addCriterion("RequestGoodsTitle =", value, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleNotEqualTo(String value) {
            addCriterion("RequestGoodsTitle <>", value, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleGreaterThan(String value) {
            addCriterion("RequestGoodsTitle >", value, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleGreaterThanOrEqualTo(String value) {
            addCriterion("RequestGoodsTitle >=", value, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleLessThan(String value) {
            addCriterion("RequestGoodsTitle <", value, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleLessThanOrEqualTo(String value) {
            addCriterion("RequestGoodsTitle <=", value, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleLike(String value) {
            addCriterion("RequestGoodsTitle like", value, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleNotLike(String value) {
            addCriterion("RequestGoodsTitle not like", value, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleIn(List<String> values) {
            addCriterion("RequestGoodsTitle in", values, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleNotIn(List<String> values) {
            addCriterion("RequestGoodsTitle not in", values, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleBetween(String value1, String value2) {
            addCriterion("RequestGoodsTitle between", value1, value2, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTitleNotBetween(String value1, String value2) {
            addCriterion("RequestGoodsTitle not between", value1, value2, "requestGoodsTitle");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureIsNull() {
            addCriterion("RequestGoodsPicture is null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureIsNotNull() {
            addCriterion("RequestGoodsPicture is not null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureEqualTo(String value) {
            addCriterion("RequestGoodsPicture =", value, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureNotEqualTo(String value) {
            addCriterion("RequestGoodsPicture <>", value, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureGreaterThan(String value) {
            addCriterion("RequestGoodsPicture >", value, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureGreaterThanOrEqualTo(String value) {
            addCriterion("RequestGoodsPicture >=", value, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureLessThan(String value) {
            addCriterion("RequestGoodsPicture <", value, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureLessThanOrEqualTo(String value) {
            addCriterion("RequestGoodsPicture <=", value, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureLike(String value) {
            addCriterion("RequestGoodsPicture like", value, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureNotLike(String value) {
            addCriterion("RequestGoodsPicture not like", value, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureIn(List<String> values) {
            addCriterion("RequestGoodsPicture in", values, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureNotIn(List<String> values) {
            addCriterion("RequestGoodsPicture not in", values, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureBetween(String value1, String value2) {
            addCriterion("RequestGoodsPicture between", value1, value2, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsPictureNotBetween(String value1, String value2) {
            addCriterion("RequestGoodsPicture not between", value1, value2, "requestGoodsPicture");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyIsNull() {
            addCriterion("RequestGoodsMoney is null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyIsNotNull() {
            addCriterion("RequestGoodsMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyEqualTo(BigDecimal value) {
            addCriterion("RequestGoodsMoney =", value, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyNotEqualTo(BigDecimal value) {
            addCriterion("RequestGoodsMoney <>", value, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyGreaterThan(BigDecimal value) {
            addCriterion("RequestGoodsMoney >", value, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RequestGoodsMoney >=", value, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyLessThan(BigDecimal value) {
            addCriterion("RequestGoodsMoney <", value, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RequestGoodsMoney <=", value, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyIn(List<BigDecimal> values) {
            addCriterion("RequestGoodsMoney in", values, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyNotIn(List<BigDecimal> values) {
            addCriterion("RequestGoodsMoney not in", values, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RequestGoodsMoney between", value1, value2, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RequestGoodsMoney not between", value1, value2, "requestGoodsMoney");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountIsNull() {
            addCriterion("RequestGoodsCount is null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountIsNotNull() {
            addCriterion("RequestGoodsCount is not null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountEqualTo(Integer value) {
            addCriterion("RequestGoodsCount =", value, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountNotEqualTo(Integer value) {
            addCriterion("RequestGoodsCount <>", value, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountGreaterThan(Integer value) {
            addCriterion("RequestGoodsCount >", value, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("RequestGoodsCount >=", value, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountLessThan(Integer value) {
            addCriterion("RequestGoodsCount <", value, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountLessThanOrEqualTo(Integer value) {
            addCriterion("RequestGoodsCount <=", value, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountIn(List<Integer> values) {
            addCriterion("RequestGoodsCount in", values, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountNotIn(List<Integer> values) {
            addCriterion("RequestGoodsCount not in", values, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountBetween(Integer value1, Integer value2) {
            addCriterion("RequestGoodsCount between", value1, value2, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("RequestGoodsCount not between", value1, value2, "requestGoodsCount");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeIsNull() {
            addCriterion("RequestGoodsType is null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeIsNotNull() {
            addCriterion("RequestGoodsType is not null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeEqualTo(Integer value) {
            addCriterion("RequestGoodsType =", value, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeNotEqualTo(Integer value) {
            addCriterion("RequestGoodsType <>", value, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeGreaterThan(Integer value) {
            addCriterion("RequestGoodsType >", value, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RequestGoodsType >=", value, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeLessThan(Integer value) {
            addCriterion("RequestGoodsType <", value, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("RequestGoodsType <=", value, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeIn(List<Integer> values) {
            addCriterion("RequestGoodsType in", values, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeNotIn(List<Integer> values) {
            addCriterion("RequestGoodsType not in", values, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("RequestGoodsType between", value1, value2, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("RequestGoodsType not between", value1, value2, "requestGoodsType");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeIsNull() {
            addCriterion("RequestGoodsTime is null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeIsNotNull() {
            addCriterion("RequestGoodsTime is not null");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeEqualTo(Date value) {
            addCriterion("RequestGoodsTime =", value, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeNotEqualTo(Date value) {
            addCriterion("RequestGoodsTime <>", value, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeGreaterThan(Date value) {
            addCriterion("RequestGoodsTime >", value, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RequestGoodsTime >=", value, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeLessThan(Date value) {
            addCriterion("RequestGoodsTime <", value, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeLessThanOrEqualTo(Date value) {
            addCriterion("RequestGoodsTime <=", value, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeIn(List<Date> values) {
            addCriterion("RequestGoodsTime in", values, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeNotIn(List<Date> values) {
            addCriterion("RequestGoodsTime not in", values, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeBetween(Date value1, Date value2) {
            addCriterion("RequestGoodsTime between", value1, value2, "requestGoodsTime");
            return (Criteria) this;
        }

        public Criteria andRequestGoodsTimeNotBetween(Date value1, Date value2) {
            addCriterion("RequestGoodsTime not between", value1, value2, "requestGoodsTime");
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