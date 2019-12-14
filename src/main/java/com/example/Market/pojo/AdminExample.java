package com.example.Market.pojo;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public AdminExample() {
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

        public Criteria andAdmin_IdIsNull() {
            addCriterion("admin_Id is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdIsNotNull() {
            addCriterion("admin_Id is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdEqualTo(Integer value) {
            addCriterion("admin_Id =", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdNotEqualTo(Integer value) {
            addCriterion("admin_Id <>", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdGreaterThan(Integer value) {
            addCriterion("admin_Id >", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_Id >=", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdLessThan(Integer value) {
            addCriterion("admin_Id <", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_Id <=", value, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdIn(List<Integer> values) {
            addCriterion("admin_Id in", values, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdNotIn(List<Integer> values) {
            addCriterion("admin_Id not in", values, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdBetween(Integer value1, Integer value2) {
            addCriterion("admin_Id between", value1, value2, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_Id not between", value1, value2, "admin_Id");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountIsNull() {
            addCriterion("admin_Account is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountIsNotNull() {
            addCriterion("admin_Account is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountEqualTo(String value) {
            addCriterion("admin_Account =", value, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountNotEqualTo(String value) {
            addCriterion("admin_Account <>", value, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountGreaterThan(String value) {
            addCriterion("admin_Account >", value, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Account >=", value, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountLessThan(String value) {
            addCriterion("admin_Account <", value, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountLessThanOrEqualTo(String value) {
            addCriterion("admin_Account <=", value, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountLike(String value) {
            addCriterion("admin_Account like", value, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountNotLike(String value) {
            addCriterion("admin_Account not like", value, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountIn(List<String> values) {
            addCriterion("admin_Account in", values, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountNotIn(List<String> values) {
            addCriterion("admin_Account not in", values, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountBetween(String value1, String value2) {
            addCriterion("admin_Account between", value1, value2, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_AccountNotBetween(String value1, String value2) {
            addCriterion("admin_Account not between", value1, value2, "admin_Account");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordIsNull() {
            addCriterion("admin_Password is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordIsNotNull() {
            addCriterion("admin_Password is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordEqualTo(String value) {
            addCriterion("admin_Password =", value, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordNotEqualTo(String value) {
            addCriterion("admin_Password <>", value, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordGreaterThan(String value) {
            addCriterion("admin_Password >", value, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Password >=", value, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordLessThan(String value) {
            addCriterion("admin_Password <", value, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_Password <=", value, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordLike(String value) {
            addCriterion("admin_Password like", value, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordNotLike(String value) {
            addCriterion("admin_Password not like", value, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordIn(List<String> values) {
            addCriterion("admin_Password in", values, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordNotIn(List<String> values) {
            addCriterion("admin_Password not in", values, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordBetween(String value1, String value2) {
            addCriterion("admin_Password between", value1, value2, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PasswordNotBetween(String value1, String value2) {
            addCriterion("admin_Password not between", value1, value2, "admin_Password");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneIsNull() {
            addCriterion("admin_Phone is null");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneIsNotNull() {
            addCriterion("admin_Phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneEqualTo(String value) {
            addCriterion("admin_Phone =", value, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneNotEqualTo(String value) {
            addCriterion("admin_Phone <>", value, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneGreaterThan(String value) {
            addCriterion("admin_Phone >", value, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Phone >=", value, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneLessThan(String value) {
            addCriterion("admin_Phone <", value, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_Phone <=", value, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneLike(String value) {
            addCriterion("admin_Phone like", value, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneNotLike(String value) {
            addCriterion("admin_Phone not like", value, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneIn(List<String> values) {
            addCriterion("admin_Phone in", values, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneNotIn(List<String> values) {
            addCriterion("admin_Phone not in", values, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneBetween(String value1, String value2) {
            addCriterion("admin_Phone between", value1, value2, "admin_Phone");
            return (Criteria) this;
        }

        public Criteria andAdmin_PhoneNotBetween(String value1, String value2) {
            addCriterion("admin_Phone not between", value1, value2, "admin_Phone");
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