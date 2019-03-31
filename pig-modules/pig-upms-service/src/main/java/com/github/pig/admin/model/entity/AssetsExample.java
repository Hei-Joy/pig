package com.github.pig.admin.model.entity;

import java.util.ArrayList;
import java.util.List;

public class AssetsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssetsExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTbValueIsNull() {
            addCriterion("tb_value is null");
            return (Criteria) this;
        }

        public Criteria andTbValueIsNotNull() {
            addCriterion("tb_value is not null");
            return (Criteria) this;
        }

        public Criteria andTbValueEqualTo(Integer value) {
            addCriterion("tb_value =", value, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueNotEqualTo(Integer value) {
            addCriterion("tb_value <>", value, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueGreaterThan(Integer value) {
            addCriterion("tb_value >", value, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueGreaterThanOrEqualTo(Integer value) {
            addCriterion("tb_value >=", value, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueLessThan(Integer value) {
            addCriterion("tb_value <", value, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueLessThanOrEqualTo(Integer value) {
            addCriterion("tb_value <=", value, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueIn(List<Integer> values) {
            addCriterion("tb_value in", values, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueNotIn(List<Integer> values) {
            addCriterion("tb_value not in", values, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueBetween(Integer value1, Integer value2) {
            addCriterion("tb_value between", value1, value2, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbValueNotBetween(Integer value1, Integer value2) {
            addCriterion("tb_value not between", value1, value2, "tbValue");
            return (Criteria) this;
        }

        public Criteria andTbTypeIsNull() {
            addCriterion("tb_type is null");
            return (Criteria) this;
        }

        public Criteria andTbTypeIsNotNull() {
            addCriterion("tb_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbTypeEqualTo(String value) {
            addCriterion("tb_type =", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeNotEqualTo(String value) {
            addCriterion("tb_type <>", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeGreaterThan(String value) {
            addCriterion("tb_type >", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeGreaterThanOrEqualTo(String value) {
            addCriterion("tb_type >=", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeLessThan(String value) {
            addCriterion("tb_type <", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeLessThanOrEqualTo(String value) {
            addCriterion("tb_type <=", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeLike(String value) {
            addCriterion("tb_type like", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeNotLike(String value) {
            addCriterion("tb_type not like", value, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeIn(List<String> values) {
            addCriterion("tb_type in", values, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeNotIn(List<String> values) {
            addCriterion("tb_type not in", values, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeBetween(String value1, String value2) {
            addCriterion("tb_type between", value1, value2, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbTypeNotBetween(String value1, String value2) {
            addCriterion("tb_type not between", value1, value2, "tbType");
            return (Criteria) this;
        }

        public Criteria andTbStaticIsNull() {
            addCriterion("tb_static is null");
            return (Criteria) this;
        }

        public Criteria andTbStaticIsNotNull() {
            addCriterion("tb_static is not null");
            return (Criteria) this;
        }

        public Criteria andTbStaticEqualTo(Boolean value) {
            addCriterion("tb_static =", value, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticNotEqualTo(Boolean value) {
            addCriterion("tb_static <>", value, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticGreaterThan(Boolean value) {
            addCriterion("tb_static >", value, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticGreaterThanOrEqualTo(Boolean value) {
            addCriterion("tb_static >=", value, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticLessThan(Boolean value) {
            addCriterion("tb_static <", value, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticLessThanOrEqualTo(Boolean value) {
            addCriterion("tb_static <=", value, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticIn(List<Boolean> values) {
            addCriterion("tb_static in", values, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticNotIn(List<Boolean> values) {
            addCriterion("tb_static not in", values, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticBetween(Boolean value1, Boolean value2) {
            addCriterion("tb_static between", value1, value2, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andTbStaticNotBetween(Boolean value1, Boolean value2) {
            addCriterion("tb_static not between", value1, value2, "tbStatic");
            return (Criteria) this;
        }

        public Criteria andRootidIsNull() {
            addCriterion("rootId is null");
            return (Criteria) this;
        }

        public Criteria andRootidIsNotNull() {
            addCriterion("rootId is not null");
            return (Criteria) this;
        }

        public Criteria andRootidEqualTo(String value) {
            addCriterion("rootId =", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotEqualTo(String value) {
            addCriterion("rootId <>", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThan(String value) {
            addCriterion("rootId >", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidGreaterThanOrEqualTo(String value) {
            addCriterion("rootId >=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThan(String value) {
            addCriterion("rootId <", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLessThanOrEqualTo(String value) {
            addCriterion("rootId <=", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidLike(String value) {
            addCriterion("rootId like", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotLike(String value) {
            addCriterion("rootId not like", value, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidIn(List<String> values) {
            addCriterion("rootId in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotIn(List<String> values) {
            addCriterion("rootId not in", values, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidBetween(String value1, String value2) {
            addCriterion("rootId between", value1, value2, "rootid");
            return (Criteria) this;
        }

        public Criteria andRootidNotBetween(String value1, String value2) {
            addCriterion("rootId not between", value1, value2, "rootid");
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