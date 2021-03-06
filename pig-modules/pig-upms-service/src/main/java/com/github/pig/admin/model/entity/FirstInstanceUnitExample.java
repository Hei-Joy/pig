package com.github.pig.admin.model.entity;

import java.util.ArrayList;
import java.util.List;

public class FirstInstanceUnitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FirstInstanceUnitExample() {
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

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_Id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_Id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_Id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_Id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_Id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_Id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_Id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_Id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_Id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_Id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_Id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_Id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_Id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_Id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeIsNull() {
            addCriterion("examinationType is null");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeIsNotNull() {
            addCriterion("examinationType is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeEqualTo(String value) {
            addCriterion("examinationType =", value, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeNotEqualTo(String value) {
            addCriterion("examinationType <>", value, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeGreaterThan(String value) {
            addCriterion("examinationType >", value, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeGreaterThanOrEqualTo(String value) {
            addCriterion("examinationType >=", value, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeLessThan(String value) {
            addCriterion("examinationType <", value, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeLessThanOrEqualTo(String value) {
            addCriterion("examinationType <=", value, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeLike(String value) {
            addCriterion("examinationType like", value, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeNotLike(String value) {
            addCriterion("examinationType not like", value, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeIn(List<String> values) {
            addCriterion("examinationType in", values, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeNotIn(List<String> values) {
            addCriterion("examinationType not in", values, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeBetween(String value1, String value2) {
            addCriterion("examinationType between", value1, value2, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationtypeNotBetween(String value1, String value2) {
            addCriterion("examinationType not between", value1, value2, "examinationtype");
            return (Criteria) this;
        }

        public Criteria andExaminationnameIsNull() {
            addCriterion("examinationName is null");
            return (Criteria) this;
        }

        public Criteria andExaminationnameIsNotNull() {
            addCriterion("examinationName is not null");
            return (Criteria) this;
        }

        public Criteria andExaminationnameEqualTo(String value) {
            addCriterion("examinationName =", value, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameNotEqualTo(String value) {
            addCriterion("examinationName <>", value, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameGreaterThan(String value) {
            addCriterion("examinationName >", value, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameGreaterThanOrEqualTo(String value) {
            addCriterion("examinationName >=", value, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameLessThan(String value) {
            addCriterion("examinationName <", value, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameLessThanOrEqualTo(String value) {
            addCriterion("examinationName <=", value, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameLike(String value) {
            addCriterion("examinationName like", value, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameNotLike(String value) {
            addCriterion("examinationName not like", value, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameIn(List<String> values) {
            addCriterion("examinationName in", values, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameNotIn(List<String> values) {
            addCriterion("examinationName not in", values, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameBetween(String value1, String value2) {
            addCriterion("examinationName between", value1, value2, "examinationname");
            return (Criteria) this;
        }

        public Criteria andExaminationnameNotBetween(String value1, String value2) {
            addCriterion("examinationName not between", value1, value2, "examinationname");
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