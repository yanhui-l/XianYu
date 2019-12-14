package com.example.Market.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsCommentReplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodsCommentReplyExample() {
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

        public Criteria andGoodsCommentReply_IdIsNull() {
            addCriterion("GoodsCommentReply_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdIsNotNull() {
            addCriterion("GoodsCommentReply_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdEqualTo(Integer value) {
            addCriterion("GoodsCommentReply_Id =", value, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdNotEqualTo(Integer value) {
            addCriterion("GoodsCommentReply_Id <>", value, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdGreaterThan(Integer value) {
            addCriterion("GoodsCommentReply_Id >", value, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GoodsCommentReply_Id >=", value, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdLessThan(Integer value) {
            addCriterion("GoodsCommentReply_Id <", value, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdLessThanOrEqualTo(Integer value) {
            addCriterion("GoodsCommentReply_Id <=", value, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdIn(List<Integer> values) {
            addCriterion("GoodsCommentReply_Id in", values, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdNotIn(List<Integer> values) {
            addCriterion("GoodsCommentReply_Id not in", values, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdBetween(Integer value1, Integer value2) {
            addCriterion("GoodsCommentReply_Id between", value1, value2, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoodsCommentReply_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("GoodsCommentReply_Id not between", value1, value2, "goodsCommentReply_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdIsNull() {
            addCriterion("Goods_Id is null");
            return (Criteria) this;
        }

        public Criteria andGoods_IdIsNotNull() {
            addCriterion("Goods_Id is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_IdEqualTo(Integer value) {
            addCriterion("Goods_Id =", value, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdNotEqualTo(Integer value) {
            addCriterion("Goods_Id <>", value, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdGreaterThan(Integer value) {
            addCriterion("Goods_Id >", value, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_Id >=", value, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdLessThan(Integer value) {
            addCriterion("Goods_Id <", value, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_Id <=", value, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdIn(List<Integer> values) {
            addCriterion("Goods_Id in", values, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdNotIn(List<Integer> values) {
            addCriterion("Goods_Id not in", values, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Id between", value1, value2, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andGoods_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Id not between", value1, value2, "goods_Id");
            return (Criteria) this;
        }

        public Criteria andComment_ContentIsNull() {
            addCriterion("Comment_Content is null");
            return (Criteria) this;
        }

        public Criteria andComment_ContentIsNotNull() {
            addCriterion("Comment_Content is not null");
            return (Criteria) this;
        }

        public Criteria andComment_ContentEqualTo(String value) {
            addCriterion("Comment_Content =", value, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentNotEqualTo(String value) {
            addCriterion("Comment_Content <>", value, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentGreaterThan(String value) {
            addCriterion("Comment_Content >", value, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentGreaterThanOrEqualTo(String value) {
            addCriterion("Comment_Content >=", value, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentLessThan(String value) {
            addCriterion("Comment_Content <", value, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentLessThanOrEqualTo(String value) {
            addCriterion("Comment_Content <=", value, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentLike(String value) {
            addCriterion("Comment_Content like", value, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentNotLike(String value) {
            addCriterion("Comment_Content not like", value, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentIn(List<String> values) {
            addCriterion("Comment_Content in", values, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentNotIn(List<String> values) {
            addCriterion("Comment_Content not in", values, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentBetween(String value1, String value2) {
            addCriterion("Comment_Content between", value1, value2, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andComment_ContentNotBetween(String value1, String value2) {
            addCriterion("Comment_Content not between", value1, value2, "comment_Content");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdIsNull() {
            addCriterion("Goods_UserId is null");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdIsNotNull() {
            addCriterion("Goods_UserId is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdEqualTo(Integer value) {
            addCriterion("Goods_UserId =", value, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdNotEqualTo(Integer value) {
            addCriterion("Goods_UserId <>", value, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdGreaterThan(Integer value) {
            addCriterion("Goods_UserId >", value, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_UserId >=", value, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdLessThan(Integer value) {
            addCriterion("Goods_UserId <", value, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_UserId <=", value, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdIn(List<Integer> values) {
            addCriterion("Goods_UserId in", values, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdNotIn(List<Integer> values) {
            addCriterion("Goods_UserId not in", values, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdBetween(Integer value1, Integer value2) {
            addCriterion("Goods_UserId between", value1, value2, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_UserId not between", value1, value2, "goods_UserId");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2IsNull() {
            addCriterion("Goods_UserId2 is null");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2IsNotNull() {
            addCriterion("Goods_UserId2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2EqualTo(Integer value) {
            addCriterion("Goods_UserId2 =", value, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2NotEqualTo(Integer value) {
            addCriterion("Goods_UserId2 <>", value, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2GreaterThan(Integer value) {
            addCriterion("Goods_UserId2 >", value, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2GreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_UserId2 >=", value, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2LessThan(Integer value) {
            addCriterion("Goods_UserId2 <", value, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2LessThanOrEqualTo(Integer value) {
            addCriterion("Goods_UserId2 <=", value, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2In(List<Integer> values) {
            addCriterion("Goods_UserId2 in", values, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2NotIn(List<Integer> values) {
            addCriterion("Goods_UserId2 not in", values, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2Between(Integer value1, Integer value2) {
            addCriterion("Goods_UserId2 between", value1, value2, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andGoods_UserId2NotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_UserId2 not between", value1, value2, "goods_UserId2");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("dateTime is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("dateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(Date value) {
            addCriterion("dateTime =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(Date value) {
            addCriterion("dateTime <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(Date value) {
            addCriterion("dateTime >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dateTime >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(Date value) {
            addCriterion("dateTime <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(Date value) {
            addCriterion("dateTime <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<Date> values) {
            addCriterion("dateTime in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<Date> values) {
            addCriterion("dateTime not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(Date value1, Date value2) {
            addCriterion("dateTime between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(Date value1, Date value2) {
            addCriterion("dateTime not between", value1, value2, "dateTime");
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