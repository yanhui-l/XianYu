package com.example.Market.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageEmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public MessageEmailExample() {
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

        public Criteria andMessage_IdIsNull() {
            addCriterion("Message_Id is null");
            return (Criteria) this;
        }

        public Criteria andMessage_IdIsNotNull() {
            addCriterion("Message_Id is not null");
            return (Criteria) this;
        }

        public Criteria andMessage_IdEqualTo(Integer value) {
            addCriterion("Message_Id =", value, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdNotEqualTo(Integer value) {
            addCriterion("Message_Id <>", value, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdGreaterThan(Integer value) {
            addCriterion("Message_Id >", value, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Message_Id >=", value, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdLessThan(Integer value) {
            addCriterion("Message_Id <", value, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdLessThanOrEqualTo(Integer value) {
            addCriterion("Message_Id <=", value, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdIn(List<Integer> values) {
            addCriterion("Message_Id in", values, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdNotIn(List<Integer> values) {
            addCriterion("Message_Id not in", values, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdBetween(Integer value1, Integer value2) {
            addCriterion("Message_Id between", value1, value2, "message_Id");
            return (Criteria) this;
        }

        public Criteria andMessage_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("Message_Id not between", value1, value2, "message_Id");
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

        public Criteria andEmailTitleIsNull() {
            addCriterion("EmailTitle is null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIsNotNull() {
            addCriterion("EmailTitle is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTitleEqualTo(String value) {
            addCriterion("EmailTitle =", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotEqualTo(String value) {
            addCriterion("EmailTitle <>", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThan(String value) {
            addCriterion("EmailTitle >", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EmailTitle >=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThan(String value) {
            addCriterion("EmailTitle <", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLessThanOrEqualTo(String value) {
            addCriterion("EmailTitle <=", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleLike(String value) {
            addCriterion("EmailTitle like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotLike(String value) {
            addCriterion("EmailTitle not like", value, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleIn(List<String> values) {
            addCriterion("EmailTitle in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotIn(List<String> values) {
            addCriterion("EmailTitle not in", values, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleBetween(String value1, String value2) {
            addCriterion("EmailTitle between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailTitleNotBetween(String value1, String value2) {
            addCriterion("EmailTitle not between", value1, value2, "emailTitle");
            return (Criteria) this;
        }

        public Criteria andEmailContentIsNull() {
            addCriterion("EmailContent is null");
            return (Criteria) this;
        }

        public Criteria andEmailContentIsNotNull() {
            addCriterion("EmailContent is not null");
            return (Criteria) this;
        }

        public Criteria andEmailContentEqualTo(String value) {
            addCriterion("EmailContent =", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotEqualTo(String value) {
            addCriterion("EmailContent <>", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentGreaterThan(String value) {
            addCriterion("EmailContent >", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentGreaterThanOrEqualTo(String value) {
            addCriterion("EmailContent >=", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLessThan(String value) {
            addCriterion("EmailContent <", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLessThanOrEqualTo(String value) {
            addCriterion("EmailContent <=", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentLike(String value) {
            addCriterion("EmailContent like", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotLike(String value) {
            addCriterion("EmailContent not like", value, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentIn(List<String> values) {
            addCriterion("EmailContent in", values, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotIn(List<String> values) {
            addCriterion("EmailContent not in", values, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentBetween(String value1, String value2) {
            addCriterion("EmailContent between", value1, value2, "emailContent");
            return (Criteria) this;
        }

        public Criteria andEmailContentNotBetween(String value1, String value2) {
            addCriterion("EmailContent not between", value1, value2, "emailContent");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserIsNull() {
            addCriterion("SendEmailUser is null");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserIsNotNull() {
            addCriterion("SendEmailUser is not null");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserEqualTo(Integer value) {
            addCriterion("SendEmailUser =", value, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserNotEqualTo(Integer value) {
            addCriterion("SendEmailUser <>", value, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserGreaterThan(Integer value) {
            addCriterion("SendEmailUser >", value, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("SendEmailUser >=", value, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserLessThan(Integer value) {
            addCriterion("SendEmailUser <", value, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserLessThanOrEqualTo(Integer value) {
            addCriterion("SendEmailUser <=", value, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserIn(List<Integer> values) {
            addCriterion("SendEmailUser in", values, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserNotIn(List<Integer> values) {
            addCriterion("SendEmailUser not in", values, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserBetween(Integer value1, Integer value2) {
            addCriterion("SendEmailUser between", value1, value2, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andSendEmailUserNotBetween(Integer value1, Integer value2) {
            addCriterion("SendEmailUser not between", value1, value2, "sendEmailUser");
            return (Criteria) this;
        }

        public Criteria andEmailStateIsNull() {
            addCriterion("EmailState is null");
            return (Criteria) this;
        }

        public Criteria andEmailStateIsNotNull() {
            addCriterion("EmailState is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStateEqualTo(String value) {
            addCriterion("EmailState =", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotEqualTo(String value) {
            addCriterion("EmailState <>", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateGreaterThan(String value) {
            addCriterion("EmailState >", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateGreaterThanOrEqualTo(String value) {
            addCriterion("EmailState >=", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLessThan(String value) {
            addCriterion("EmailState <", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLessThanOrEqualTo(String value) {
            addCriterion("EmailState <=", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateLike(String value) {
            addCriterion("EmailState like", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotLike(String value) {
            addCriterion("EmailState not like", value, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateIn(List<String> values) {
            addCriterion("EmailState in", values, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotIn(List<String> values) {
            addCriterion("EmailState not in", values, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateBetween(String value1, String value2) {
            addCriterion("EmailState between", value1, value2, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailStateNotBetween(String value1, String value2) {
            addCriterion("EmailState not between", value1, value2, "emailState");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIsNull() {
            addCriterion("EmailType is null");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIsNotNull() {
            addCriterion("EmailType is not null");
            return (Criteria) this;
        }

        public Criteria andEmailTypeEqualTo(String value) {
            addCriterion("EmailType =", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotEqualTo(String value) {
            addCriterion("EmailType <>", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeGreaterThan(String value) {
            addCriterion("EmailType >", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeGreaterThanOrEqualTo(String value) {
            addCriterion("EmailType >=", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLessThan(String value) {
            addCriterion("EmailType <", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLessThanOrEqualTo(String value) {
            addCriterion("EmailType <=", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeLike(String value) {
            addCriterion("EmailType like", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotLike(String value) {
            addCriterion("EmailType not like", value, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeIn(List<String> values) {
            addCriterion("EmailType in", values, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotIn(List<String> values) {
            addCriterion("EmailType not in", values, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeBetween(String value1, String value2) {
            addCriterion("EmailType between", value1, value2, "emailType");
            return (Criteria) this;
        }

        public Criteria andEmailTypeNotBetween(String value1, String value2) {
            addCriterion("EmailType not between", value1, value2, "emailType");
            return (Criteria) this;
        }

        public Criteria andGoods_iDIsNull() {
            addCriterion("Goods_iD is null");
            return (Criteria) this;
        }

        public Criteria andGoods_iDIsNotNull() {
            addCriterion("Goods_iD is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_iDEqualTo(Integer value) {
            addCriterion("Goods_iD =", value, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDNotEqualTo(Integer value) {
            addCriterion("Goods_iD <>", value, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDGreaterThan(Integer value) {
            addCriterion("Goods_iD >", value, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_iD >=", value, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDLessThan(Integer value) {
            addCriterion("Goods_iD <", value, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_iD <=", value, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDIn(List<Integer> values) {
            addCriterion("Goods_iD in", values, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDNotIn(List<Integer> values) {
            addCriterion("Goods_iD not in", values, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDBetween(Integer value1, Integer value2) {
            addCriterion("Goods_iD between", value1, value2, "goods_iD");
            return (Criteria) this;
        }

        public Criteria andGoods_iDNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_iD not between", value1, value2, "goods_iD");
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