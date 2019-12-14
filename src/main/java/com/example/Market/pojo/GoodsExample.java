package com.example.Market.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public GoodsExample() {
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

        public Criteria andGoods_SheifTimeIsNull() {
            addCriterion("Goods_SheifTime is null");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeIsNotNull() {
            addCriterion("Goods_SheifTime is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeEqualTo(Date value) {
            addCriterion("Goods_SheifTime =", value, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeNotEqualTo(Date value) {
            addCriterion("Goods_SheifTime <>", value, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeGreaterThan(Date value) {
            addCriterion("Goods_SheifTime >", value, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Goods_SheifTime >=", value, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeLessThan(Date value) {
            addCriterion("Goods_SheifTime <", value, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeLessThanOrEqualTo(Date value) {
            addCriterion("Goods_SheifTime <=", value, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeIn(List<Date> values) {
            addCriterion("Goods_SheifTime in", values, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeNotIn(List<Date> values) {
            addCriterion("Goods_SheifTime not in", values, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeBetween(Date value1, Date value2) {
            addCriterion("Goods_SheifTime between", value1, value2, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_SheifTimeNotBetween(Date value1, Date value2) {
            addCriterion("Goods_SheifTime not between", value1, value2, "goods_SheifTime");
            return (Criteria) this;
        }

        public Criteria andGoods_NameIsNull() {
            addCriterion("Goods_Name is null");
            return (Criteria) this;
        }

        public Criteria andGoods_NameIsNotNull() {
            addCriterion("Goods_Name is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_NameEqualTo(String value) {
            addCriterion("Goods_Name =", value, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameNotEqualTo(String value) {
            addCriterion("Goods_Name <>", value, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameGreaterThan(String value) {
            addCriterion("Goods_Name >", value, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Name >=", value, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameLessThan(String value) {
            addCriterion("Goods_Name <", value, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameLessThanOrEqualTo(String value) {
            addCriterion("Goods_Name <=", value, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameLike(String value) {
            addCriterion("Goods_Name like", value, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameNotLike(String value) {
            addCriterion("Goods_Name not like", value, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameIn(List<String> values) {
            addCriterion("Goods_Name in", values, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameNotIn(List<String> values) {
            addCriterion("Goods_Name not in", values, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameBetween(String value1, String value2) {
            addCriterion("Goods_Name between", value1, value2, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_NameNotBetween(String value1, String value2) {
            addCriterion("Goods_Name not between", value1, value2, "goods_Name");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelIsNull() {
            addCriterion("Goods_Level is null");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelIsNotNull() {
            addCriterion("Goods_Level is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelEqualTo(Integer value) {
            addCriterion("Goods_Level =", value, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelNotEqualTo(Integer value) {
            addCriterion("Goods_Level <>", value, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelGreaterThan(Integer value) {
            addCriterion("Goods_Level >", value, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_Level >=", value, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelLessThan(Integer value) {
            addCriterion("Goods_Level <", value, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_Level <=", value, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelIn(List<Integer> values) {
            addCriterion("Goods_Level in", values, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelNotIn(List<Integer> values) {
            addCriterion("Goods_Level not in", values, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Level between", value1, value2, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_LevelNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Level not between", value1, value2, "goods_Level");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkIsNull() {
            addCriterion("Goods_Remark is null");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkIsNotNull() {
            addCriterion("Goods_Remark is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkEqualTo(String value) {
            addCriterion("Goods_Remark =", value, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkNotEqualTo(String value) {
            addCriterion("Goods_Remark <>", value, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkGreaterThan(String value) {
            addCriterion("Goods_Remark >", value, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Remark >=", value, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkLessThan(String value) {
            addCriterion("Goods_Remark <", value, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkLessThanOrEqualTo(String value) {
            addCriterion("Goods_Remark <=", value, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkLike(String value) {
            addCriterion("Goods_Remark like", value, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkNotLike(String value) {
            addCriterion("Goods_Remark not like", value, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkIn(List<String> values) {
            addCriterion("Goods_Remark in", values, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkNotIn(List<String> values) {
            addCriterion("Goods_Remark not in", values, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkBetween(String value1, String value2) {
            addCriterion("Goods_Remark between", value1, value2, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_RemarkNotBetween(String value1, String value2) {
            addCriterion("Goods_Remark not between", value1, value2, "goods_Remark");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceIsNull() {
            addCriterion("Goods_Price is null");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceIsNotNull() {
            addCriterion("Goods_Price is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceEqualTo(BigDecimal value) {
            addCriterion("Goods_Price =", value, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceNotEqualTo(BigDecimal value) {
            addCriterion("Goods_Price <>", value, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceGreaterThan(BigDecimal value) {
            addCriterion("Goods_Price >", value, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Goods_Price >=", value, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceLessThan(BigDecimal value) {
            addCriterion("Goods_Price <", value, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Goods_Price <=", value, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceIn(List<BigDecimal> values) {
            addCriterion("Goods_Price in", values, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceNotIn(List<BigDecimal> values) {
            addCriterion("Goods_Price not in", values, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Goods_Price between", value1, value2, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_PriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Goods_Price not between", value1, value2, "goods_Price");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeIsNull() {
            addCriterion("Goods_CommodityType is null");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeIsNotNull() {
            addCriterion("Goods_CommodityType is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeEqualTo(Integer value) {
            addCriterion("Goods_CommodityType =", value, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeNotEqualTo(Integer value) {
            addCriterion("Goods_CommodityType <>", value, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeGreaterThan(Integer value) {
            addCriterion("Goods_CommodityType >", value, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_CommodityType >=", value, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeLessThan(Integer value) {
            addCriterion("Goods_CommodityType <", value, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_CommodityType <=", value, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeIn(List<Integer> values) {
            addCriterion("Goods_CommodityType in", values, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeNotIn(List<Integer> values) {
            addCriterion("Goods_CommodityType not in", values, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeBetween(Integer value1, Integer value2) {
            addCriterion("Goods_CommodityType between", value1, value2, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CommodityTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_CommodityType not between", value1, value2, "goods_CommodityType");
            return (Criteria) this;
        }

        public Criteria andGoods_CountIsNull() {
            addCriterion("Goods_Count is null");
            return (Criteria) this;
        }

        public Criteria andGoods_CountIsNotNull() {
            addCriterion("Goods_Count is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_CountEqualTo(Integer value) {
            addCriterion("Goods_Count =", value, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountNotEqualTo(Integer value) {
            addCriterion("Goods_Count <>", value, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountGreaterThan(Integer value) {
            addCriterion("Goods_Count >", value, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_Count >=", value, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountLessThan(Integer value) {
            addCriterion("Goods_Count <", value, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_Count <=", value, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountIn(List<Integer> values) {
            addCriterion("Goods_Count in", values, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountNotIn(List<Integer> values) {
            addCriterion("Goods_Count not in", values, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Count between", value1, value2, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_CountNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Count not between", value1, value2, "goods_Count");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayIsNull() {
            addCriterion("Goods_Display is null");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayIsNotNull() {
            addCriterion("Goods_Display is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayEqualTo(String value) {
            addCriterion("Goods_Display =", value, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayNotEqualTo(String value) {
            addCriterion("Goods_Display <>", value, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayGreaterThan(String value) {
            addCriterion("Goods_Display >", value, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Display >=", value, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayLessThan(String value) {
            addCriterion("Goods_Display <", value, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayLessThanOrEqualTo(String value) {
            addCriterion("Goods_Display <=", value, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayLike(String value) {
            addCriterion("Goods_Display like", value, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayNotLike(String value) {
            addCriterion("Goods_Display not like", value, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayIn(List<String> values) {
            addCriterion("Goods_Display in", values, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayNotIn(List<String> values) {
            addCriterion("Goods_Display not in", values, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayBetween(String value1, String value2) {
            addCriterion("Goods_Display between", value1, value2, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_DisplayNotBetween(String value1, String value2) {
            addCriterion("Goods_Display not between", value1, value2, "goods_Display");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewIsNull() {
            addCriterion("Goods_View is null");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewIsNotNull() {
            addCriterion("Goods_View is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewEqualTo(Integer value) {
            addCriterion("Goods_View =", value, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewNotEqualTo(Integer value) {
            addCriterion("Goods_View <>", value, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewGreaterThan(Integer value) {
            addCriterion("Goods_View >", value, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_View >=", value, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewLessThan(Integer value) {
            addCriterion("Goods_View <", value, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_View <=", value, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewIn(List<Integer> values) {
            addCriterion("Goods_View in", values, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewNotIn(List<Integer> values) {
            addCriterion("Goods_View not in", values, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewBetween(Integer value1, Integer value2) {
            addCriterion("Goods_View between", value1, value2, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_ViewNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_View not between", value1, value2, "goods_View");
            return (Criteria) this;
        }

        public Criteria andGoods_UidIsNull() {
            addCriterion("Goods_Uid is null");
            return (Criteria) this;
        }

        public Criteria andGoods_UidIsNotNull() {
            addCriterion("Goods_Uid is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_UidEqualTo(Integer value) {
            addCriterion("Goods_Uid =", value, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidNotEqualTo(Integer value) {
            addCriterion("Goods_Uid <>", value, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidGreaterThan(Integer value) {
            addCriterion("Goods_Uid >", value, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Goods_Uid >=", value, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidLessThan(Integer value) {
            addCriterion("Goods_Uid <", value, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidLessThanOrEqualTo(Integer value) {
            addCriterion("Goods_Uid <=", value, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidIn(List<Integer> values) {
            addCriterion("Goods_Uid in", values, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidNotIn(List<Integer> values) {
            addCriterion("Goods_Uid not in", values, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Uid between", value1, value2, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_UidNotBetween(Integer value1, Integer value2) {
            addCriterion("Goods_Uid not between", value1, value2, "goods_Uid");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageIsNull() {
            addCriterion("Goods_Image is null");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageIsNotNull() {
            addCriterion("Goods_Image is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageEqualTo(String value) {
            addCriterion("Goods_Image =", value, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageNotEqualTo(String value) {
            addCriterion("Goods_Image <>", value, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageGreaterThan(String value) {
            addCriterion("Goods_Image >", value, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Image >=", value, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageLessThan(String value) {
            addCriterion("Goods_Image <", value, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageLessThanOrEqualTo(String value) {
            addCriterion("Goods_Image <=", value, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageLike(String value) {
            addCriterion("Goods_Image like", value, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageNotLike(String value) {
            addCriterion("Goods_Image not like", value, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageIn(List<String> values) {
            addCriterion("Goods_Image in", values, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageNotIn(List<String> values) {
            addCriterion("Goods_Image not in", values, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageBetween(String value1, String value2) {
            addCriterion("Goods_Image between", value1, value2, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_ImageNotBetween(String value1, String value2) {
            addCriterion("Goods_Image not between", value1, value2, "goods_Image");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2IsNull() {
            addCriterion("Goods_Image2 is null");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2IsNotNull() {
            addCriterion("Goods_Image2 is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2EqualTo(String value) {
            addCriterion("Goods_Image2 =", value, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2NotEqualTo(String value) {
            addCriterion("Goods_Image2 <>", value, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2GreaterThan(String value) {
            addCriterion("Goods_Image2 >", value, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2GreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Image2 >=", value, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2LessThan(String value) {
            addCriterion("Goods_Image2 <", value, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2LessThanOrEqualTo(String value) {
            addCriterion("Goods_Image2 <=", value, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2Like(String value) {
            addCriterion("Goods_Image2 like", value, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2NotLike(String value) {
            addCriterion("Goods_Image2 not like", value, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2In(List<String> values) {
            addCriterion("Goods_Image2 in", values, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2NotIn(List<String> values) {
            addCriterion("Goods_Image2 not in", values, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2Between(String value1, String value2) {
            addCriterion("Goods_Image2 between", value1, value2, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image2NotBetween(String value1, String value2) {
            addCriterion("Goods_Image2 not between", value1, value2, "goods_Image2");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3IsNull() {
            addCriterion("Goods_Image3 is null");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3IsNotNull() {
            addCriterion("Goods_Image3 is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3EqualTo(String value) {
            addCriterion("Goods_Image3 =", value, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3NotEqualTo(String value) {
            addCriterion("Goods_Image3 <>", value, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3GreaterThan(String value) {
            addCriterion("Goods_Image3 >", value, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3GreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Image3 >=", value, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3LessThan(String value) {
            addCriterion("Goods_Image3 <", value, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3LessThanOrEqualTo(String value) {
            addCriterion("Goods_Image3 <=", value, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3Like(String value) {
            addCriterion("Goods_Image3 like", value, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3NotLike(String value) {
            addCriterion("Goods_Image3 not like", value, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3In(List<String> values) {
            addCriterion("Goods_Image3 in", values, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3NotIn(List<String> values) {
            addCriterion("Goods_Image3 not in", values, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3Between(String value1, String value2) {
            addCriterion("Goods_Image3 between", value1, value2, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image3NotBetween(String value1, String value2) {
            addCriterion("Goods_Image3 not between", value1, value2, "goods_Image3");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4IsNull() {
            addCriterion("Goods_Image4 is null");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4IsNotNull() {
            addCriterion("Goods_Image4 is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4EqualTo(String value) {
            addCriterion("Goods_Image4 =", value, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4NotEqualTo(String value) {
            addCriterion("Goods_Image4 <>", value, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4GreaterThan(String value) {
            addCriterion("Goods_Image4 >", value, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4GreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Image4 >=", value, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4LessThan(String value) {
            addCriterion("Goods_Image4 <", value, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4LessThanOrEqualTo(String value) {
            addCriterion("Goods_Image4 <=", value, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4Like(String value) {
            addCriterion("Goods_Image4 like", value, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4NotLike(String value) {
            addCriterion("Goods_Image4 not like", value, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4In(List<String> values) {
            addCriterion("Goods_Image4 in", values, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4NotIn(List<String> values) {
            addCriterion("Goods_Image4 not in", values, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4Between(String value1, String value2) {
            addCriterion("Goods_Image4 between", value1, value2, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_Image4NotBetween(String value1, String value2) {
            addCriterion("Goods_Image4 not between", value1, value2, "goods_Image4");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceIsNull() {
            addCriterion("Goods_truePrice is null");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceIsNotNull() {
            addCriterion("Goods_truePrice is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceEqualTo(BigDecimal value) {
            addCriterion("Goods_truePrice =", value, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceNotEqualTo(BigDecimal value) {
            addCriterion("Goods_truePrice <>", value, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceGreaterThan(BigDecimal value) {
            addCriterion("Goods_truePrice >", value, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Goods_truePrice >=", value, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceLessThan(BigDecimal value) {
            addCriterion("Goods_truePrice <", value, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Goods_truePrice <=", value, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceIn(List<BigDecimal> values) {
            addCriterion("Goods_truePrice in", values, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceNotIn(List<BigDecimal> values) {
            addCriterion("Goods_truePrice not in", values, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Goods_truePrice between", value1, value2, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_truePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Goods_truePrice not between", value1, value2, "goods_truePrice");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleIsNull() {
            addCriterion("Goods_Title is null");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleIsNotNull() {
            addCriterion("Goods_Title is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleEqualTo(String value) {
            addCriterion("Goods_Title =", value, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleNotEqualTo(String value) {
            addCriterion("Goods_Title <>", value, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleGreaterThan(String value) {
            addCriterion("Goods_Title >", value, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Title >=", value, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleLessThan(String value) {
            addCriterion("Goods_Title <", value, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleLessThanOrEqualTo(String value) {
            addCriterion("Goods_Title <=", value, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleLike(String value) {
            addCriterion("Goods_Title like", value, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleNotLike(String value) {
            addCriterion("Goods_Title not like", value, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleIn(List<String> values) {
            addCriterion("Goods_Title in", values, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleNotIn(List<String> values) {
            addCriterion("Goods_Title not in", values, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleBetween(String value1, String value2) {
            addCriterion("Goods_Title between", value1, value2, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_TitleNotBetween(String value1, String value2) {
            addCriterion("Goods_Title not between", value1, value2, "goods_Title");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceIsNull() {
            addCriterion("Goods_Source is null");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceIsNotNull() {
            addCriterion("Goods_Source is not null");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceEqualTo(String value) {
            addCriterion("Goods_Source =", value, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceNotEqualTo(String value) {
            addCriterion("Goods_Source <>", value, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceGreaterThan(String value) {
            addCriterion("Goods_Source >", value, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceGreaterThanOrEqualTo(String value) {
            addCriterion("Goods_Source >=", value, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceLessThan(String value) {
            addCriterion("Goods_Source <", value, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceLessThanOrEqualTo(String value) {
            addCriterion("Goods_Source <=", value, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceLike(String value) {
            addCriterion("Goods_Source like", value, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceNotLike(String value) {
            addCriterion("Goods_Source not like", value, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceIn(List<String> values) {
            addCriterion("Goods_Source in", values, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceNotIn(List<String> values) {
            addCriterion("Goods_Source not in", values, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceBetween(String value1, String value2) {
            addCriterion("Goods_Source between", value1, value2, "goods_Source");
            return (Criteria) this;
        }

        public Criteria andGoods_SourceNotBetween(String value1, String value2) {
            addCriterion("Goods_Source not between", value1, value2, "goods_Source");
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