package com.example.Market.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsRequestLeaveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodsRequestLeaveExample() {
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

        public Criteria andGoodsRequestLeave_IdIsNull() {
            addCriterion("GoodsRequestLeave_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdIsNotNull() {
            addCriterion("GoodsRequestLeave_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdEqualTo(Integer value) {
            addCriterion("GoodsRequestLeave_Id =", value, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdNotEqualTo(Integer value) {
            addCriterion("GoodsRequestLeave_Id <>", value, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdGreaterThan(Integer value) {
            addCriterion("GoodsRequestLeave_Id >", value, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsRequestLeave_Id >=", value, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdLessThan(Integer value) {
            addCriterion("GoodsRequestLeave_Id <", value, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsRequestLeave_Id <=", value, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdIn(List<Integer> values) {
            addCriterion("GoodsRequestLeave_Id in", values, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdNotIn(List<Integer> values) {
            addCriterion("GoodsRequestLeave_Id not in", values, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdBetween(Integer value1, Integer value2) {
            addCriterion("GoodsRequestLeave_Id between", value1, value2, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequestLeave_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsRequestLeave_Id not between", value1, value2, "goodsRequestLeave_Id");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNull() {
            addCriterion("LeaveTime is null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIsNotNull() {
            addCriterion("LeaveTime is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeEqualTo(Date value) {
            addCriterion("LeaveTime =", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotEqualTo(Date value) {
            addCriterion("LeaveTime <>", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThan(Date value) {
            addCriterion("LeaveTime >", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LeaveTime >=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThan(Date value) {
            addCriterion("LeaveTime <", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("LeaveTime <=", value, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeIn(List<Date> values) {
            addCriterion("LeaveTime in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotIn(List<Date> values) {
            addCriterion("LeaveTime not in", values, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeBetween(Date value1, Date value2) {
            addCriterion("LeaveTime between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andLeaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("LeaveTime not between", value1, value2, "leaveTime");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdIsNull() {
            addCriterion("GoodsRequest_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdIsNotNull() {
            addCriterion("GoodsRequest_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdEqualTo(Integer value) {
            addCriterion("GoodsRequest_Id =", value, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdNotEqualTo(Integer value) {
            addCriterion("GoodsRequest_Id <>", value, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdGreaterThan(Integer value) {
            addCriterion("GoodsRequest_Id >", value, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsRequest_Id >=", value, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdLessThan(Integer value) {
            addCriterion("GoodsRequest_Id <", value, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsRequest_Id <=", value, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdIn(List<Integer> values) {
            addCriterion("GoodsRequest_Id in", values, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdNotIn(List<Integer> values) {
            addCriterion("GoodsRequest_Id not in", values, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdBetween(Integer value1, Integer value2) {
            addCriterion("GoodsRequest_Id between", value1, value2, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsRequest_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsRequest_Id not between", value1, value2, "goodsRequest_Id");
            return (Criteria) this;
        }

        public Criteria andLeaveContentIsNull() {
            addCriterion("LeaveContent is null");
            return (Criteria) this;
        }

        public Criteria andLeaveContentIsNotNull() {
            addCriterion("LeaveContent is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveContentEqualTo(String value) {
            addCriterion("LeaveContent =", value, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentNotEqualTo(String value) {
            addCriterion("LeaveContent <>", value, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentGreaterThan(String value) {
            addCriterion("LeaveContent >", value, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentGreaterThanOrEqualTo(String value) {
            addCriterion("LeaveContent >=", value, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentLessThan(String value) {
            addCriterion("LeaveContent <", value, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentLessThanOrEqualTo(String value) {
            addCriterion("LeaveContent <=", value, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentLike(String value) {
            addCriterion("LeaveContent like", value, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentNotLike(String value) {
            addCriterion("LeaveContent not like", value, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentIn(List<String> values) {
            addCriterion("LeaveContent in", values, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentNotIn(List<String> values) {
            addCriterion("LeaveContent not in", values, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentBetween(String value1, String value2) {
            addCriterion("LeaveContent between", value1, value2, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andLeaveContentNotBetween(String value1, String value2) {
            addCriterion("LeaveContent not between", value1, value2, "leaveContent");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("User_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("User_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("User_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("User_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("User_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("User_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("User_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("User_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("User_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("User_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("User_id not between", value1, value2, "user_id");
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