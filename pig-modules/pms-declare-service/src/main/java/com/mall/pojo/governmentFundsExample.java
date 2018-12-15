package com.mall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class governmentFundsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public governmentFundsExample() {
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

        public Criteria andEntrynameIsNull() {
            addCriterion("entryName is null");
            return (Criteria) this;
        }

        public Criteria andEntrynameIsNotNull() {
            addCriterion("entryName is not null");
            return (Criteria) this;
        }

        public Criteria andEntrynameEqualTo(String value) {
            addCriterion("entryName =", value, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameNotEqualTo(String value) {
            addCriterion("entryName <>", value, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameGreaterThan(String value) {
            addCriterion("entryName >", value, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameGreaterThanOrEqualTo(String value) {
            addCriterion("entryName >=", value, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameLessThan(String value) {
            addCriterion("entryName <", value, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameLessThanOrEqualTo(String value) {
            addCriterion("entryName <=", value, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameLike(String value) {
            addCriterion("entryName like", value, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameNotLike(String value) {
            addCriterion("entryName not like", value, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameIn(List<String> values) {
            addCriterion("entryName in", values, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameNotIn(List<String> values) {
            addCriterion("entryName not in", values, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameBetween(String value1, String value2) {
            addCriterion("entryName between", value1, value2, "entryname");
            return (Criteria) this;
        }

        public Criteria andEntrynameNotBetween(String value1, String value2) {
            addCriterion("entryName not between", value1, value2, "entryname");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentIsNull() {
            addCriterion("fundingDepartment is null");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentIsNotNull() {
            addCriterion("fundingDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentEqualTo(String value) {
            addCriterion("fundingDepartment =", value, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentNotEqualTo(String value) {
            addCriterion("fundingDepartment <>", value, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentGreaterThan(String value) {
            addCriterion("fundingDepartment >", value, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("fundingDepartment >=", value, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentLessThan(String value) {
            addCriterion("fundingDepartment <", value, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentLessThanOrEqualTo(String value) {
            addCriterion("fundingDepartment <=", value, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentLike(String value) {
            addCriterion("fundingDepartment like", value, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentNotLike(String value) {
            addCriterion("fundingDepartment not like", value, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentIn(List<String> values) {
            addCriterion("fundingDepartment in", values, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentNotIn(List<String> values) {
            addCriterion("fundingDepartment not in", values, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentBetween(String value1, String value2) {
            addCriterion("fundingDepartment between", value1, value2, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingdepartmentNotBetween(String value1, String value2) {
            addCriterion("fundingDepartment not between", value1, value2, "fundingdepartment");
            return (Criteria) this;
        }

        public Criteria andFundingtimeIsNull() {
            addCriterion("fundingTime is null");
            return (Criteria) this;
        }

        public Criteria andFundingtimeIsNotNull() {
            addCriterion("fundingTime is not null");
            return (Criteria) this;
        }

        public Criteria andFundingtimeEqualTo(Date value) {
            addCriterionForJDBCDate("fundingTime =", value, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fundingTime <>", value, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fundingTime >", value, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fundingTime >=", value, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeLessThan(Date value) {
            addCriterionForJDBCDate("fundingTime <", value, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fundingTime <=", value, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeIn(List<Date> values) {
            addCriterionForJDBCDate("fundingTime in", values, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fundingTime not in", values, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fundingTime between", value1, value2, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andFundingtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fundingTime not between", value1, value2, "fundingtime");
            return (Criteria) this;
        }

        public Criteria andTotalfundsIsNull() {
            addCriterion("totalFunds is null");
            return (Criteria) this;
        }

        public Criteria andTotalfundsIsNotNull() {
            addCriterion("totalFunds is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfundsEqualTo(Double value) {
            addCriterion("totalFunds =", value, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsNotEqualTo(Double value) {
            addCriterion("totalFunds <>", value, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsGreaterThan(Double value) {
            addCriterion("totalFunds >", value, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsGreaterThanOrEqualTo(Double value) {
            addCriterion("totalFunds >=", value, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsLessThan(Double value) {
            addCriterion("totalFunds <", value, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsLessThanOrEqualTo(Double value) {
            addCriterion("totalFunds <=", value, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsIn(List<Double> values) {
            addCriterion("totalFunds in", values, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsNotIn(List<Double> values) {
            addCriterion("totalFunds not in", values, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsBetween(Double value1, Double value2) {
            addCriterion("totalFunds between", value1, value2, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andTotalfundsNotBetween(Double value1, Double value2) {
            addCriterion("totalFunds not between", value1, value2, "totalfunds");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptIsNull() {
            addCriterion("checkAndAccept is null");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptIsNotNull() {
            addCriterion("checkAndAccept is not null");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptEqualTo(Boolean value) {
            addCriterion("checkAndAccept =", value, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptNotEqualTo(Boolean value) {
            addCriterion("checkAndAccept <>", value, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptGreaterThan(Boolean value) {
            addCriterion("checkAndAccept >", value, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptGreaterThanOrEqualTo(Boolean value) {
            addCriterion("checkAndAccept >=", value, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptLessThan(Boolean value) {
            addCriterion("checkAndAccept <", value, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptLessThanOrEqualTo(Boolean value) {
            addCriterion("checkAndAccept <=", value, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptIn(List<Boolean> values) {
            addCriterion("checkAndAccept in", values, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptNotIn(List<Boolean> values) {
            addCriterion("checkAndAccept not in", values, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptBetween(Boolean value1, Boolean value2) {
            addCriterion("checkAndAccept between", value1, value2, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCheckandacceptNotBetween(Boolean value1, Boolean value2) {
            addCriterion("checkAndAccept not between", value1, value2, "checkandaccept");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterionForJDBCDate("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CreateDate not between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNull() {
            addCriterion("OperatorId is null");
            return (Criteria) this;
        }

        public Criteria andOperatoridIsNotNull() {
            addCriterion("OperatorId is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoridEqualTo(String value) {
            addCriterion("OperatorId =", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotEqualTo(String value) {
            addCriterion("OperatorId <>", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThan(String value) {
            addCriterion("OperatorId >", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridGreaterThanOrEqualTo(String value) {
            addCriterion("OperatorId >=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThan(String value) {
            addCriterion("OperatorId <", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLessThanOrEqualTo(String value) {
            addCriterion("OperatorId <=", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridLike(String value) {
            addCriterion("OperatorId like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotLike(String value) {
            addCriterion("OperatorId not like", value, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridIn(List<String> values) {
            addCriterion("OperatorId in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotIn(List<String> values) {
            addCriterion("OperatorId not in", values, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridBetween(String value1, String value2) {
            addCriterion("OperatorId between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andOperatoridNotBetween(String value1, String value2) {
            addCriterion("OperatorId not between", value1, value2, "operatorid");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNull() {
            addCriterion("isDelete is null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIsNotNull() {
            addCriterion("isDelete is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeleteEqualTo(Boolean value) {
            addCriterion("isDelete =", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotEqualTo(Boolean value) {
            addCriterion("isDelete <>", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThan(Boolean value) {
            addCriterion("isDelete >", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDelete >=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThan(Boolean value) {
            addCriterion("isDelete <", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("isDelete <=", value, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteIn(List<Boolean> values) {
            addCriterion("isDelete in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotIn(List<Boolean> values) {
            addCriterion("isDelete not in", values, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("isDelete between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andIsdeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDelete not between", value1, value2, "isdelete");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNull() {
            addCriterion("updateDate is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIsNotNull() {
            addCriterion("updateDate is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedateEqualTo(Date value) {
            addCriterionForJDBCDate("updateDate =", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotEqualTo(Date value) {
            addCriterionForJDBCDate("updateDate <>", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThan(Date value) {
            addCriterionForJDBCDate("updateDate >", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updateDate >=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThan(Date value) {
            addCriterionForJDBCDate("updateDate <", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("updateDate <=", value, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateIn(List<Date> values) {
            addCriterionForJDBCDate("updateDate in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotIn(List<Date> values) {
            addCriterionForJDBCDate("updateDate not in", values, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updateDate between", value1, value2, "updatedate");
            return (Criteria) this;
        }

        public Criteria andUpdatedateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("updateDate not between", value1, value2, "updatedate");
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