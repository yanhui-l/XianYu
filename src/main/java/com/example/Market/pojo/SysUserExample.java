package com.example.Market.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public SysUserExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andUser_IdIsNull() {
            addCriterion("User_Id is null");
            return (Criteria) this;
        }

        public Criteria andUser_IdIsNotNull() {
            addCriterion("User_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_IdEqualTo(Integer value) {
            addCriterion("User_Id =", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdNotEqualTo(Integer value) {
            addCriterion("User_Id <>", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdGreaterThan(Integer value) {
            addCriterion("User_Id >", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Id >=", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdLessThan(Integer value) {
            addCriterion("User_Id <", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdLessThanOrEqualTo(Integer value) {
            addCriterion("User_Id <=", value, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdIn(List<Integer> values) {
            addCriterion("User_Id in", values, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdNotIn(List<Integer> values) {
            addCriterion("User_Id not in", values, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdBetween(Integer value1, Integer value2) {
            addCriterion("User_Id between", value1, value2, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_IdNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Id not between", value1, value2, "user_Id");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("User_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("User_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("User_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("User_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("User_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("User_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("User_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("User_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("User_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("User_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("User_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("User_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("User_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("User_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("Phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("Phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("Phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("Phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("Phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("Phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("Phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("Phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("Phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("Phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("Phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("Phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("Phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("Phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andUser_realNameIsNull() {
            addCriterion("User_realName is null");
            return (Criteria) this;
        }

        public Criteria andUser_realNameIsNotNull() {
            addCriterion("User_realName is not null");
            return (Criteria) this;
        }

        public Criteria andUser_realNameEqualTo(String value) {
            addCriterion("User_realName =", value, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameNotEqualTo(String value) {
            addCriterion("User_realName <>", value, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameGreaterThan(String value) {
            addCriterion("User_realName >", value, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_realName >=", value, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameLessThan(String value) {
            addCriterion("User_realName <", value, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameLessThanOrEqualTo(String value) {
            addCriterion("User_realName <=", value, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameLike(String value) {
            addCriterion("User_realName like", value, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameNotLike(String value) {
            addCriterion("User_realName not like", value, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameIn(List<String> values) {
            addCriterion("User_realName in", values, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameNotIn(List<String> values) {
            addCriterion("User_realName not in", values, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameBetween(String value1, String value2) {
            addCriterion("User_realName between", value1, value2, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_realNameNotBetween(String value1, String value2) {
            addCriterion("User_realName not between", value1, value2, "user_realName");
            return (Criteria) this;
        }

        public Criteria andUser_ClassIsNull() {
            addCriterion("User_Class is null");
            return (Criteria) this;
        }

        public Criteria andUser_ClassIsNotNull() {
            addCriterion("User_Class is not null");
            return (Criteria) this;
        }

        public Criteria andUser_ClassEqualTo(String value) {
            addCriterion("User_Class =", value, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassNotEqualTo(String value) {
            addCriterion("User_Class <>", value, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassGreaterThan(String value) {
            addCriterion("User_Class >", value, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassGreaterThanOrEqualTo(String value) {
            addCriterion("User_Class >=", value, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassLessThan(String value) {
            addCriterion("User_Class <", value, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassLessThanOrEqualTo(String value) {
            addCriterion("User_Class <=", value, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassLike(String value) {
            addCriterion("User_Class like", value, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassNotLike(String value) {
            addCriterion("User_Class not like", value, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassIn(List<String> values) {
            addCriterion("User_Class in", values, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassNotIn(List<String> values) {
            addCriterion("User_Class not in", values, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassBetween(String value1, String value2) {
            addCriterion("User_Class between", value1, value2, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_ClassNotBetween(String value1, String value2) {
            addCriterion("User_Class not between", value1, value2, "user_Class");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryIsNull() {
            addCriterion("User_Dormitory is null");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryIsNotNull() {
            addCriterion("User_Dormitory is not null");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryEqualTo(String value) {
            addCriterion("User_Dormitory =", value, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryNotEqualTo(String value) {
            addCriterion("User_Dormitory <>", value, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryGreaterThan(String value) {
            addCriterion("User_Dormitory >", value, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryGreaterThanOrEqualTo(String value) {
            addCriterion("User_Dormitory >=", value, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryLessThan(String value) {
            addCriterion("User_Dormitory <", value, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryLessThanOrEqualTo(String value) {
            addCriterion("User_Dormitory <=", value, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryLike(String value) {
            addCriterion("User_Dormitory like", value, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryNotLike(String value) {
            addCriterion("User_Dormitory not like", value, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryIn(List<String> values) {
            addCriterion("User_Dormitory in", values, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryNotIn(List<String> values) {
            addCriterion("User_Dormitory not in", values, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryBetween(String value1, String value2) {
            addCriterion("User_Dormitory between", value1, value2, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_DormitoryNotBetween(String value1, String value2) {
            addCriterion("User_Dormitory not between", value1, value2, "user_Dormitory");
            return (Criteria) this;
        }

        public Criteria andUser_GenderIsNull() {
            addCriterion("User_Gender is null");
            return (Criteria) this;
        }

        public Criteria andUser_GenderIsNotNull() {
            addCriterion("User_Gender is not null");
            return (Criteria) this;
        }

        public Criteria andUser_GenderEqualTo(String value) {
            addCriterion("User_Gender =", value, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderNotEqualTo(String value) {
            addCriterion("User_Gender <>", value, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderGreaterThan(String value) {
            addCriterion("User_Gender >", value, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderGreaterThanOrEqualTo(String value) {
            addCriterion("User_Gender >=", value, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderLessThan(String value) {
            addCriterion("User_Gender <", value, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderLessThanOrEqualTo(String value) {
            addCriterion("User_Gender <=", value, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderLike(String value) {
            addCriterion("User_Gender like", value, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderNotLike(String value) {
            addCriterion("User_Gender not like", value, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderIn(List<String> values) {
            addCriterion("User_Gender in", values, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderNotIn(List<String> values) {
            addCriterion("User_Gender not in", values, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderBetween(String value1, String value2) {
            addCriterion("User_Gender between", value1, value2, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_GenderNotBetween(String value1, String value2) {
            addCriterion("User_Gender not between", value1, value2, "user_Gender");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeIsNull() {
            addCriterion("User_Createtime is null");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeIsNotNull() {
            addCriterion("User_Createtime is not null");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeEqualTo(Date value) {
            addCriterion("User_Createtime =", value, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeNotEqualTo(Date value) {
            addCriterion("User_Createtime <>", value, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeGreaterThan(Date value) {
            addCriterion("User_Createtime >", value, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("User_Createtime >=", value, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeLessThan(Date value) {
            addCriterion("User_Createtime <", value, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("User_Createtime <=", value, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeIn(List<Date> values) {
            addCriterion("User_Createtime in", values, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeNotIn(List<Date> values) {
            addCriterion("User_Createtime not in", values, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeBetween(Date value1, Date value2) {
            addCriterion("User_Createtime between", value1, value2, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_CreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("User_Createtime not between", value1, value2, "user_Createtime");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarIsNull() {
            addCriterion("User_Avatar is null");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarIsNotNull() {
            addCriterion("User_Avatar is not null");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarEqualTo(String value) {
            addCriterion("User_Avatar =", value, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarNotEqualTo(String value) {
            addCriterion("User_Avatar <>", value, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarGreaterThan(String value) {
            addCriterion("User_Avatar >", value, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarGreaterThanOrEqualTo(String value) {
            addCriterion("User_Avatar >=", value, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarLessThan(String value) {
            addCriterion("User_Avatar <", value, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarLessThanOrEqualTo(String value) {
            addCriterion("User_Avatar <=", value, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarLike(String value) {
            addCriterion("User_Avatar like", value, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarNotLike(String value) {
            addCriterion("User_Avatar not like", value, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarIn(List<String> values) {
            addCriterion("User_Avatar in", values, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarNotIn(List<String> values) {
            addCriterion("User_Avatar not in", values, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarBetween(String value1, String value2) {
            addCriterion("User_Avatar between", value1, value2, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_AvatarNotBetween(String value1, String value2) {
            addCriterion("User_Avatar not between", value1, value2, "user_Avatar");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountIsNull() {
            addCriterion("User_ViolationCount is null");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountIsNotNull() {
            addCriterion("User_ViolationCount is not null");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountEqualTo(Integer value) {
            addCriterion("User_ViolationCount =", value, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountNotEqualTo(Integer value) {
            addCriterion("User_ViolationCount <>", value, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountGreaterThan(Integer value) {
            addCriterion("User_ViolationCount >", value, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_ViolationCount >=", value, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountLessThan(Integer value) {
            addCriterion("User_ViolationCount <", value, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountLessThanOrEqualTo(Integer value) {
            addCriterion("User_ViolationCount <=", value, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountIn(List<Integer> values) {
            addCriterion("User_ViolationCount in", values, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountNotIn(List<Integer> values) {
            addCriterion("User_ViolationCount not in", values, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountBetween(Integer value1, Integer value2) {
            addCriterion("User_ViolationCount between", value1, value2, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_ViolationCountNotBetween(Integer value1, Integer value2) {
            addCriterion("User_ViolationCount not between", value1, value2, "user_ViolationCount");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordIsNull() {
            addCriterion("User_Password is null");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordIsNotNull() {
            addCriterion("User_Password is not null");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordEqualTo(String value) {
            addCriterion("User_Password =", value, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordNotEqualTo(String value) {
            addCriterion("User_Password <>", value, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordGreaterThan(String value) {
            addCriterion("User_Password >", value, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordGreaterThanOrEqualTo(String value) {
            addCriterion("User_Password >=", value, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordLessThan(String value) {
            addCriterion("User_Password <", value, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordLessThanOrEqualTo(String value) {
            addCriterion("User_Password <=", value, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordLike(String value) {
            addCriterion("User_Password like", value, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordNotLike(String value) {
            addCriterion("User_Password not like", value, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordIn(List<String> values) {
            addCriterion("User_Password in", values, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordNotIn(List<String> values) {
            addCriterion("User_Password not in", values, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordBetween(String value1, String value2) {
            addCriterion("User_Password between", value1, value2, "user_Password");
            return (Criteria) this;
        }

        public Criteria andUser_PasswordNotBetween(String value1, String value2) {
            addCriterion("User_Password not between", value1, value2, "user_Password");
            return (Criteria) this;
        }

        public Criteria andRanDomIsNull() {
            addCriterion("ranDom is null");
            return (Criteria) this;
        }

        public Criteria andRanDomIsNotNull() {
            addCriterion("ranDom is not null");
            return (Criteria) this;
        }

        public Criteria andRanDomEqualTo(String value) {
            addCriterion("ranDom =", value, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomNotEqualTo(String value) {
            addCriterion("ranDom <>", value, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomGreaterThan(String value) {
            addCriterion("ranDom >", value, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomGreaterThanOrEqualTo(String value) {
            addCriterion("ranDom >=", value, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomLessThan(String value) {
            addCriterion("ranDom <", value, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomLessThanOrEqualTo(String value) {
            addCriterion("ranDom <=", value, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomLike(String value) {
            addCriterion("ranDom like", value, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomNotLike(String value) {
            addCriterion("ranDom not like", value, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomIn(List<String> values) {
            addCriterion("ranDom in", values, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomNotIn(List<String> values) {
            addCriterion("ranDom not in", values, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomBetween(String value1, String value2) {
            addCriterion("ranDom between", value1, value2, "ranDom");
            return (Criteria) this;
        }

        public Criteria andRanDomNotBetween(String value1, String value2) {
            addCriterion("ranDom not between", value1, value2, "ranDom");
            return (Criteria) this;
        }

        public Criteria andUser_qqIsNull() {
            addCriterion("User_qq is null");
            return (Criteria) this;
        }

        public Criteria andUser_qqIsNotNull() {
            addCriterion("User_qq is not null");
            return (Criteria) this;
        }

        public Criteria andUser_qqEqualTo(String value) {
            addCriterion("User_qq =", value, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqNotEqualTo(String value) {
            addCriterion("User_qq <>", value, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqGreaterThan(String value) {
            addCriterion("User_qq >", value, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqGreaterThanOrEqualTo(String value) {
            addCriterion("User_qq >=", value, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqLessThan(String value) {
            addCriterion("User_qq <", value, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqLessThanOrEqualTo(String value) {
            addCriterion("User_qq <=", value, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqLike(String value) {
            addCriterion("User_qq like", value, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqNotLike(String value) {
            addCriterion("User_qq not like", value, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqIn(List<String> values) {
            addCriterion("User_qq in", values, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqNotIn(List<String> values) {
            addCriterion("User_qq not in", values, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqBetween(String value1, String value2) {
            addCriterion("User_qq between", value1, value2, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqNotBetween(String value1, String value2) {
            addCriterion("User_qq not between", value1, value2, "user_qq");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailIsNull() {
            addCriterion("User_qqEmail is null");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailIsNotNull() {
            addCriterion("User_qqEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailEqualTo(String value) {
            addCriterion("User_qqEmail =", value, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailNotEqualTo(String value) {
            addCriterion("User_qqEmail <>", value, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailGreaterThan(String value) {
            addCriterion("User_qqEmail >", value, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailGreaterThanOrEqualTo(String value) {
            addCriterion("User_qqEmail >=", value, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailLessThan(String value) {
            addCriterion("User_qqEmail <", value, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailLessThanOrEqualTo(String value) {
            addCriterion("User_qqEmail <=", value, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailLike(String value) {
            addCriterion("User_qqEmail like", value, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailNotLike(String value) {
            addCriterion("User_qqEmail not like", value, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailIn(List<String> values) {
            addCriterion("User_qqEmail in", values, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailNotIn(List<String> values) {
            addCriterion("User_qqEmail not in", values, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailBetween(String value1, String value2) {
            addCriterion("User_qqEmail between", value1, value2, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_qqEmailNotBetween(String value1, String value2) {
            addCriterion("User_qqEmail not between", value1, value2, "user_qqEmail");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeIsNull() {
            addCriterion("User_ForbiddenTime is null");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeIsNotNull() {
            addCriterion("User_ForbiddenTime is not null");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeEqualTo(Date value) {
            addCriterionForJDBCDate("User_ForbiddenTime =", value, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("User_ForbiddenTime <>", value, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("User_ForbiddenTime >", value, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("User_ForbiddenTime >=", value, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeLessThan(Date value) {
            addCriterionForJDBCDate("User_ForbiddenTime <", value, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("User_ForbiddenTime <=", value, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeIn(List<Date> values) {
            addCriterionForJDBCDate("User_ForbiddenTime in", values, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("User_ForbiddenTime not in", values, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("User_ForbiddenTime between", value1, value2, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_ForbiddenTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("User_ForbiddenTime not between", value1, value2, "user_ForbiddenTime");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneIsNull() {
            addCriterion("User_AntistopOne is null");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneIsNotNull() {
            addCriterion("User_AntistopOne is not null");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneEqualTo(String value) {
            addCriterion("User_AntistopOne =", value, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneNotEqualTo(String value) {
            addCriterion("User_AntistopOne <>", value, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneGreaterThan(String value) {
            addCriterion("User_AntistopOne >", value, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneGreaterThanOrEqualTo(String value) {
            addCriterion("User_AntistopOne >=", value, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneLessThan(String value) {
            addCriterion("User_AntistopOne <", value, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneLessThanOrEqualTo(String value) {
            addCriterion("User_AntistopOne <=", value, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneLike(String value) {
            addCriterion("User_AntistopOne like", value, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneNotLike(String value) {
            addCriterion("User_AntistopOne not like", value, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneIn(List<String> values) {
            addCriterion("User_AntistopOne in", values, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneNotIn(List<String> values) {
            addCriterion("User_AntistopOne not in", values, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneBetween(String value1, String value2) {
            addCriterion("User_AntistopOne between", value1, value2, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopOneNotBetween(String value1, String value2) {
            addCriterion("User_AntistopOne not between", value1, value2, "user_AntistopOne");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoIsNull() {
            addCriterion("User_AntistopTwo is null");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoIsNotNull() {
            addCriterion("User_AntistopTwo is not null");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoEqualTo(String value) {
            addCriterion("User_AntistopTwo =", value, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoNotEqualTo(String value) {
            addCriterion("User_AntistopTwo <>", value, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoGreaterThan(String value) {
            addCriterion("User_AntistopTwo >", value, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoGreaterThanOrEqualTo(String value) {
            addCriterion("User_AntistopTwo >=", value, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoLessThan(String value) {
            addCriterion("User_AntistopTwo <", value, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoLessThanOrEqualTo(String value) {
            addCriterion("User_AntistopTwo <=", value, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoLike(String value) {
            addCriterion("User_AntistopTwo like", value, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoNotLike(String value) {
            addCriterion("User_AntistopTwo not like", value, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoIn(List<String> values) {
            addCriterion("User_AntistopTwo in", values, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoNotIn(List<String> values) {
            addCriterion("User_AntistopTwo not in", values, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoBetween(String value1, String value2) {
            addCriterion("User_AntistopTwo between", value1, value2, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_AntistopTwoNotBetween(String value1, String value2) {
            addCriterion("User_AntistopTwo not between", value1, value2, "user_AntistopTwo");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationIsNull() {
            addCriterion("User_Reputation is null");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationIsNotNull() {
            addCriterion("User_Reputation is not null");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationEqualTo(Integer value) {
            addCriterion("User_Reputation =", value, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationNotEqualTo(Integer value) {
            addCriterion("User_Reputation <>", value, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationGreaterThan(Integer value) {
            addCriterion("User_Reputation >", value, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Reputation >=", value, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationLessThan(Integer value) {
            addCriterion("User_Reputation <", value, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationLessThanOrEqualTo(Integer value) {
            addCriterion("User_Reputation <=", value, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationIn(List<Integer> values) {
            addCriterion("User_Reputation in", values, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationNotIn(List<Integer> values) {
            addCriterion("User_Reputation not in", values, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationBetween(Integer value1, Integer value2) {
            addCriterion("User_Reputation between", value1, value2, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_ReputationNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Reputation not between", value1, value2, "user_Reputation");
            return (Criteria) this;
        }

        public Criteria andUser_MediumIsNull() {
            addCriterion("User_Medium is null");
            return (Criteria) this;
        }

        public Criteria andUser_MediumIsNotNull() {
            addCriterion("User_Medium is not null");
            return (Criteria) this;
        }

        public Criteria andUser_MediumEqualTo(Integer value) {
            addCriterion("User_Medium =", value, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumNotEqualTo(Integer value) {
            addCriterion("User_Medium <>", value, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumGreaterThan(Integer value) {
            addCriterion("User_Medium >", value, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Medium >=", value, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumLessThan(Integer value) {
            addCriterion("User_Medium <", value, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumLessThanOrEqualTo(Integer value) {
            addCriterion("User_Medium <=", value, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumIn(List<Integer> values) {
            addCriterion("User_Medium in", values, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumNotIn(List<Integer> values) {
            addCriterion("User_Medium not in", values, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumBetween(Integer value1, Integer value2) {
            addCriterion("User_Medium between", value1, value2, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_MediumNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Medium not between", value1, value2, "user_Medium");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeIsNull() {
            addCriterion("User_Negative is null");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeIsNotNull() {
            addCriterion("User_Negative is not null");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeEqualTo(Integer value) {
            addCriterion("User_Negative =", value, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeNotEqualTo(Integer value) {
            addCriterion("User_Negative <>", value, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeGreaterThan(Integer value) {
            addCriterion("User_Negative >", value, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Negative >=", value, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeLessThan(Integer value) {
            addCriterion("User_Negative <", value, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeLessThanOrEqualTo(Integer value) {
            addCriterion("User_Negative <=", value, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeIn(List<Integer> values) {
            addCriterion("User_Negative in", values, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeNotIn(List<Integer> values) {
            addCriterion("User_Negative not in", values, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeBetween(Integer value1, Integer value2) {
            addCriterion("User_Negative between", value1, value2, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_NegativeNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Negative not between", value1, value2, "user_Negative");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintIsNull() {
            addCriterion("User_Complaint is null");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintIsNotNull() {
            addCriterion("User_Complaint is not null");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintEqualTo(Integer value) {
            addCriterion("User_Complaint =", value, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintNotEqualTo(Integer value) {
            addCriterion("User_Complaint <>", value, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintGreaterThan(Integer value) {
            addCriterion("User_Complaint >", value, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Complaint >=", value, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintLessThan(Integer value) {
            addCriterion("User_Complaint <", value, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintLessThanOrEqualTo(Integer value) {
            addCriterion("User_Complaint <=", value, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintIn(List<Integer> values) {
            addCriterion("User_Complaint in", values, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintNotIn(List<Integer> values) {
            addCriterion("User_Complaint not in", values, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintBetween(Integer value1, Integer value2) {
            addCriterion("User_Complaint between", value1, value2, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_ComplaintNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Complaint not between", value1, value2, "user_Complaint");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreIsNull() {
            addCriterion("User_CreditScore is null");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreIsNotNull() {
            addCriterion("User_CreditScore is not null");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreEqualTo(Integer value) {
            addCriterion("User_CreditScore =", value, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreNotEqualTo(Integer value) {
            addCriterion("User_CreditScore <>", value, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreGreaterThan(Integer value) {
            addCriterion("User_CreditScore >", value, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_CreditScore >=", value, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreLessThan(Integer value) {
            addCriterion("User_CreditScore <", value, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreLessThanOrEqualTo(Integer value) {
            addCriterion("User_CreditScore <=", value, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreIn(List<Integer> values) {
            addCriterion("User_CreditScore in", values, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreNotIn(List<Integer> values) {
            addCriterion("User_CreditScore not in", values, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreBetween(Integer value1, Integer value2) {
            addCriterion("User_CreditScore between", value1, value2, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_CreditScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("User_CreditScore not between", value1, value2, "user_CreditScore");
            return (Criteria) this;
        }

        public Criteria andUser_BuyIsNull() {
            addCriterion("User_Buy is null");
            return (Criteria) this;
        }

        public Criteria andUser_BuyIsNotNull() {
            addCriterion("User_Buy is not null");
            return (Criteria) this;
        }

        public Criteria andUser_BuyEqualTo(Integer value) {
            addCriterion("User_Buy =", value, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyNotEqualTo(Integer value) {
            addCriterion("User_Buy <>", value, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyGreaterThan(Integer value) {
            addCriterion("User_Buy >", value, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Buy >=", value, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyLessThan(Integer value) {
            addCriterion("User_Buy <", value, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyLessThanOrEqualTo(Integer value) {
            addCriterion("User_Buy <=", value, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyIn(List<Integer> values) {
            addCriterion("User_Buy in", values, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyNotIn(List<Integer> values) {
            addCriterion("User_Buy not in", values, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyBetween(Integer value1, Integer value2) {
            addCriterion("User_Buy between", value1, value2, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_BuyNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Buy not between", value1, value2, "user_Buy");
            return (Criteria) this;
        }

        public Criteria andUser_SellIsNull() {
            addCriterion("User_Sell is null");
            return (Criteria) this;
        }

        public Criteria andUser_SellIsNotNull() {
            addCriterion("User_Sell is not null");
            return (Criteria) this;
        }

        public Criteria andUser_SellEqualTo(Integer value) {
            addCriterion("User_Sell =", value, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellNotEqualTo(Integer value) {
            addCriterion("User_Sell <>", value, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellGreaterThan(Integer value) {
            addCriterion("User_Sell >", value, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Sell >=", value, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellLessThan(Integer value) {
            addCriterion("User_Sell <", value, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellLessThanOrEqualTo(Integer value) {
            addCriterion("User_Sell <=", value, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellIn(List<Integer> values) {
            addCriterion("User_Sell in", values, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellNotIn(List<Integer> values) {
            addCriterion("User_Sell not in", values, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellBetween(Integer value1, Integer value2) {
            addCriterion("User_Sell between", value1, value2, "user_Sell");
            return (Criteria) this;
        }

        public Criteria andUser_SellNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Sell not between", value1, value2, "user_Sell");
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