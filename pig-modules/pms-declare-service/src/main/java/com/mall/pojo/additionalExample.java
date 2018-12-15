package com.mall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class additionalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public additionalExample() {
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
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCreditratingIsNull() {
            addCriterion("creditRating is null");
            return (Criteria) this;
        }

        public Criteria andCreditratingIsNotNull() {
            addCriterion("creditRating is not null");
            return (Criteria) this;
        }

        public Criteria andCreditratingEqualTo(String value) {
            addCriterion("creditRating =", value, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingNotEqualTo(String value) {
            addCriterion("creditRating <>", value, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingGreaterThan(String value) {
            addCriterion("creditRating >", value, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingGreaterThanOrEqualTo(String value) {
            addCriterion("creditRating >=", value, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingLessThan(String value) {
            addCriterion("creditRating <", value, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingLessThanOrEqualTo(String value) {
            addCriterion("creditRating <=", value, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingLike(String value) {
            addCriterion("creditRating like", value, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingNotLike(String value) {
            addCriterion("creditRating not like", value, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingIn(List<String> values) {
            addCriterion("creditRating in", values, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingNotIn(List<String> values) {
            addCriterion("creditRating not in", values, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingBetween(String value1, String value2) {
            addCriterion("creditRating between", value1, value2, "creditrating");
            return (Criteria) this;
        }

        public Criteria andCreditratingNotBetween(String value1, String value2) {
            addCriterion("creditRating not between", value1, value2, "creditrating");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNull() {
            addCriterion("registrationTime is null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIsNotNull() {
            addCriterion("registrationTime is not null");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeEqualTo(Date value) {
            addCriterionForJDBCDate("registrationTime =", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("registrationTime <>", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("registrationTime >", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registrationTime >=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThan(Date value) {
            addCriterionForJDBCDate("registrationTime <", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("registrationTime <=", value, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeIn(List<Date> values) {
            addCriterionForJDBCDate("registrationTime in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("registrationTime not in", values, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registrationTime between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegistrationtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("registrationTime not between", value1, value2, "registrationtime");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIsNull() {
            addCriterion("registeredCapital is null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIsNotNull() {
            addCriterion("registeredCapital is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalEqualTo(Double value) {
            addCriterion("registeredCapital =", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotEqualTo(Double value) {
            addCriterion("registeredCapital <>", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalGreaterThan(Double value) {
            addCriterion("registeredCapital >", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalGreaterThanOrEqualTo(Double value) {
            addCriterion("registeredCapital >=", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLessThan(Double value) {
            addCriterion("registeredCapital <", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalLessThanOrEqualTo(Double value) {
            addCriterion("registeredCapital <=", value, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalIn(List<Double> values) {
            addCriterion("registeredCapital in", values, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotIn(List<Double> values) {
            addCriterion("registeredCapital not in", values, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalBetween(Double value1, Double value2) {
            addCriterion("registeredCapital between", value1, value2, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andRegisteredcapitalNotBetween(Double value1, Double value2) {
            addCriterion("registeredCapital not between", value1, value2, "registeredcapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalIsNull() {
            addCriterion("proportionOfForeignCapital is null");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalIsNotNull() {
            addCriterion("proportionOfForeignCapital is not null");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalEqualTo(Integer value) {
            addCriterion("proportionOfForeignCapital =", value, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalNotEqualTo(Integer value) {
            addCriterion("proportionOfForeignCapital <>", value, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalGreaterThan(Integer value) {
            addCriterion("proportionOfForeignCapital >", value, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalGreaterThanOrEqualTo(Integer value) {
            addCriterion("proportionOfForeignCapital >=", value, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalLessThan(Integer value) {
            addCriterion("proportionOfForeignCapital <", value, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalLessThanOrEqualTo(Integer value) {
            addCriterion("proportionOfForeignCapital <=", value, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalIn(List<Integer> values) {
            addCriterion("proportionOfForeignCapital in", values, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalNotIn(List<Integer> values) {
            addCriterion("proportionOfForeignCapital not in", values, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalBetween(Integer value1, Integer value2) {
            addCriterion("proportionOfForeignCapital between", value1, value2, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andProportionofforeigncapitalNotBetween(Integer value1, Integer value2) {
            addCriterion("proportionOfForeignCapital not between", value1, value2, "proportionofforeigncapital");
            return (Criteria) this;
        }

        public Criteria andWorkforceIsNull() {
            addCriterion("workForce is null");
            return (Criteria) this;
        }

        public Criteria andWorkforceIsNotNull() {
            addCriterion("workForce is not null");
            return (Criteria) this;
        }

        public Criteria andWorkforceEqualTo(Integer value) {
            addCriterion("workForce =", value, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceNotEqualTo(Integer value) {
            addCriterion("workForce <>", value, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceGreaterThan(Integer value) {
            addCriterion("workForce >", value, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceGreaterThanOrEqualTo(Integer value) {
            addCriterion("workForce >=", value, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceLessThan(Integer value) {
            addCriterion("workForce <", value, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceLessThanOrEqualTo(Integer value) {
            addCriterion("workForce <=", value, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceIn(List<Integer> values) {
            addCriterion("workForce in", values, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceNotIn(List<Integer> values) {
            addCriterion("workForce not in", values, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceBetween(Integer value1, Integer value2) {
            addCriterion("workForce between", value1, value2, "workforce");
            return (Criteria) this;
        }

        public Criteria andWorkforceNotBetween(Integer value1, Integer value2) {
            addCriterion("workForce not between", value1, value2, "workforce");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberIsNull() {
            addCriterion("juniorCollegeNumber is null");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberIsNotNull() {
            addCriterion("juniorCollegeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberEqualTo(Integer value) {
            addCriterion("juniorCollegeNumber =", value, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberNotEqualTo(Integer value) {
            addCriterion("juniorCollegeNumber <>", value, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberGreaterThan(Integer value) {
            addCriterion("juniorCollegeNumber >", value, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("juniorCollegeNumber >=", value, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberLessThan(Integer value) {
            addCriterion("juniorCollegeNumber <", value, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberLessThanOrEqualTo(Integer value) {
            addCriterion("juniorCollegeNumber <=", value, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberIn(List<Integer> values) {
            addCriterion("juniorCollegeNumber in", values, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberNotIn(List<Integer> values) {
            addCriterion("juniorCollegeNumber not in", values, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberBetween(Integer value1, Integer value2) {
            addCriterion("juniorCollegeNumber between", value1, value2, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andJuniorcollegenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("juniorCollegeNumber not between", value1, value2, "juniorcollegenumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberIsNull() {
            addCriterion("developerNumber is null");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberIsNotNull() {
            addCriterion("developerNumber is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberEqualTo(Integer value) {
            addCriterion("developerNumber =", value, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberNotEqualTo(Integer value) {
            addCriterion("developerNumber <>", value, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberGreaterThan(Integer value) {
            addCriterion("developerNumber >", value, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("developerNumber >=", value, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberLessThan(Integer value) {
            addCriterion("developerNumber <", value, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberLessThanOrEqualTo(Integer value) {
            addCriterion("developerNumber <=", value, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberIn(List<Integer> values) {
            addCriterion("developerNumber in", values, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberNotIn(List<Integer> values) {
            addCriterion("developerNumber not in", values, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberBetween(Integer value1, Integer value2) {
            addCriterion("developerNumber between", value1, value2, "developernumber");
            return (Criteria) this;
        }

        public Criteria andDevelopernumberNotBetween(Integer value1, Integer value2) {
            addCriterion("developerNumber not between", value1, value2, "developernumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberIsNull() {
            addCriterion("undergraduateNumber is null");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberIsNotNull() {
            addCriterion("undergraduateNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberEqualTo(Integer value) {
            addCriterion("undergraduateNumber =", value, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberNotEqualTo(Integer value) {
            addCriterion("undergraduateNumber <>", value, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberGreaterThan(Integer value) {
            addCriterion("undergraduateNumber >", value, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("undergraduateNumber >=", value, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberLessThan(Integer value) {
            addCriterion("undergraduateNumber <", value, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberLessThanOrEqualTo(Integer value) {
            addCriterion("undergraduateNumber <=", value, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberIn(List<Integer> values) {
            addCriterion("undergraduateNumber in", values, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberNotIn(List<Integer> values) {
            addCriterion("undergraduateNumber not in", values, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberBetween(Integer value1, Integer value2) {
            addCriterion("undergraduateNumber between", value1, value2, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andUndergraduatenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("undergraduateNumber not between", value1, value2, "undergraduatenumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberIsNull() {
            addCriterion("middleManagementNumber is null");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberIsNotNull() {
            addCriterion("middleManagementNumber is not null");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberEqualTo(Integer value) {
            addCriterion("middleManagementNumber =", value, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberNotEqualTo(Integer value) {
            addCriterion("middleManagementNumber <>", value, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberGreaterThan(Integer value) {
            addCriterion("middleManagementNumber >", value, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("middleManagementNumber >=", value, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberLessThan(Integer value) {
            addCriterion("middleManagementNumber <", value, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberLessThanOrEqualTo(Integer value) {
            addCriterion("middleManagementNumber <=", value, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberIn(List<Integer> values) {
            addCriterion("middleManagementNumber in", values, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberNotIn(List<Integer> values) {
            addCriterion("middleManagementNumber not in", values, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberBetween(Integer value1, Integer value2) {
            addCriterion("middleManagementNumber between", value1, value2, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andMiddlemanagementnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("middleManagementNumber not between", value1, value2, "middlemanagementnumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberIsNull() {
            addCriterion("seniorTitleNumber is null");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberIsNotNull() {
            addCriterion("seniorTitleNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberEqualTo(Integer value) {
            addCriterion("seniorTitleNumber =", value, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberNotEqualTo(Integer value) {
            addCriterion("seniorTitleNumber <>", value, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberGreaterThan(Integer value) {
            addCriterion("seniorTitleNumber >", value, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("seniorTitleNumber >=", value, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberLessThan(Integer value) {
            addCriterion("seniorTitleNumber <", value, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberLessThanOrEqualTo(Integer value) {
            addCriterion("seniorTitleNumber <=", value, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberIn(List<Integer> values) {
            addCriterion("seniorTitleNumber in", values, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberNotIn(List<Integer> values) {
            addCriterion("seniorTitleNumber not in", values, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberBetween(Integer value1, Integer value2) {
            addCriterion("seniorTitleNumber between", value1, value2, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andSeniortitlenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("seniorTitleNumber not between", value1, value2, "seniortitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberIsNull() {
            addCriterion("intermediateTitleNumber is null");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberIsNotNull() {
            addCriterion("intermediateTitleNumber is not null");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberEqualTo(Integer value) {
            addCriterion("intermediateTitleNumber =", value, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberNotEqualTo(Integer value) {
            addCriterion("intermediateTitleNumber <>", value, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberGreaterThan(Integer value) {
            addCriterion("intermediateTitleNumber >", value, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("intermediateTitleNumber >=", value, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberLessThan(Integer value) {
            addCriterion("intermediateTitleNumber <", value, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberLessThanOrEqualTo(Integer value) {
            addCriterion("intermediateTitleNumber <=", value, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberIn(List<Integer> values) {
            addCriterion("intermediateTitleNumber in", values, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberNotIn(List<Integer> values) {
            addCriterion("intermediateTitleNumber not in", values, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberBetween(Integer value1, Integer value2) {
            addCriterion("intermediateTitleNumber between", value1, value2, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andIntermediatetitlenumberNotBetween(Integer value1, Integer value2) {
            addCriterion("intermediateTitleNumber not between", value1, value2, "intermediatetitlenumber");
            return (Criteria) this;
        }

        public Criteria andGrossincomeIsNull() {
            addCriterion("grossincome is null");
            return (Criteria) this;
        }

        public Criteria andGrossincomeIsNotNull() {
            addCriterion("grossincome is not null");
            return (Criteria) this;
        }

        public Criteria andGrossincomeEqualTo(Double value) {
            addCriterion("grossincome =", value, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeNotEqualTo(Double value) {
            addCriterion("grossincome <>", value, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeGreaterThan(Double value) {
            addCriterion("grossincome >", value, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeGreaterThanOrEqualTo(Double value) {
            addCriterion("grossincome >=", value, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeLessThan(Double value) {
            addCriterion("grossincome <", value, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeLessThanOrEqualTo(Double value) {
            addCriterion("grossincome <=", value, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeIn(List<Double> values) {
            addCriterion("grossincome in", values, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeNotIn(List<Double> values) {
            addCriterion("grossincome not in", values, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeBetween(Double value1, Double value2) {
            addCriterion("grossincome between", value1, value2, "grossincome");
            return (Criteria) this;
        }

        public Criteria andGrossincomeNotBetween(Double value1, Double value2) {
            addCriterion("grossincome not between", value1, value2, "grossincome");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueIsNull() {
            addCriterion("salesRevenue is null");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueIsNotNull() {
            addCriterion("salesRevenue is not null");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueEqualTo(Double value) {
            addCriterion("salesRevenue =", value, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueNotEqualTo(Double value) {
            addCriterion("salesRevenue <>", value, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueGreaterThan(Double value) {
            addCriterion("salesRevenue >", value, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueGreaterThanOrEqualTo(Double value) {
            addCriterion("salesRevenue >=", value, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueLessThan(Double value) {
            addCriterion("salesRevenue <", value, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueLessThanOrEqualTo(Double value) {
            addCriterion("salesRevenue <=", value, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueIn(List<Double> values) {
            addCriterion("salesRevenue in", values, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueNotIn(List<Double> values) {
            addCriterion("salesRevenue not in", values, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueBetween(Double value1, Double value2) {
            addCriterion("salesRevenue between", value1, value2, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andSalesrevenueNotBetween(Double value1, Double value2) {
            addCriterion("salesRevenue not between", value1, value2, "salesrevenue");
            return (Criteria) this;
        }

        public Criteria andValueaddedIsNull() {
            addCriterion("valueAdded is null");
            return (Criteria) this;
        }

        public Criteria andValueaddedIsNotNull() {
            addCriterion("valueAdded is not null");
            return (Criteria) this;
        }

        public Criteria andValueaddedEqualTo(Double value) {
            addCriterion("valueAdded =", value, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedNotEqualTo(Double value) {
            addCriterion("valueAdded <>", value, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedGreaterThan(Double value) {
            addCriterion("valueAdded >", value, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedGreaterThanOrEqualTo(Double value) {
            addCriterion("valueAdded >=", value, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedLessThan(Double value) {
            addCriterion("valueAdded <", value, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedLessThanOrEqualTo(Double value) {
            addCriterion("valueAdded <=", value, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedIn(List<Double> values) {
            addCriterion("valueAdded in", values, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedNotIn(List<Double> values) {
            addCriterion("valueAdded not in", values, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedBetween(Double value1, Double value2) {
            addCriterion("valueAdded between", value1, value2, "valueadded");
            return (Criteria) this;
        }

        public Criteria andValueaddedNotBetween(Double value1, Double value2) {
            addCriterion("valueAdded not between", value1, value2, "valueadded");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIsNull() {
            addCriterion("totalAssets is null");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIsNotNull() {
            addCriterion("totalAssets is not null");
            return (Criteria) this;
        }

        public Criteria andTotalassetsEqualTo(Double value) {
            addCriterion("totalAssets =", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotEqualTo(Double value) {
            addCriterion("totalAssets <>", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsGreaterThan(Double value) {
            addCriterion("totalAssets >", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsGreaterThanOrEqualTo(Double value) {
            addCriterion("totalAssets >=", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsLessThan(Double value) {
            addCriterion("totalAssets <", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsLessThanOrEqualTo(Double value) {
            addCriterion("totalAssets <=", value, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsIn(List<Double> values) {
            addCriterion("totalAssets in", values, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotIn(List<Double> values) {
            addCriterion("totalAssets not in", values, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsBetween(Double value1, Double value2) {
            addCriterion("totalAssets between", value1, value2, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalassetsNotBetween(Double value1, Double value2) {
            addCriterion("totalAssets not between", value1, value2, "totalassets");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesIsNull() {
            addCriterion("totalLiabilities is null");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesIsNotNull() {
            addCriterion("totalLiabilities is not null");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesEqualTo(Double value) {
            addCriterion("totalLiabilities =", value, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesNotEqualTo(Double value) {
            addCriterion("totalLiabilities <>", value, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesGreaterThan(Double value) {
            addCriterion("totalLiabilities >", value, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesGreaterThanOrEqualTo(Double value) {
            addCriterion("totalLiabilities >=", value, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesLessThan(Double value) {
            addCriterion("totalLiabilities <", value, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesLessThanOrEqualTo(Double value) {
            addCriterion("totalLiabilities <=", value, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesIn(List<Double> values) {
            addCriterion("totalLiabilities in", values, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesNotIn(List<Double> values) {
            addCriterion("totalLiabilities not in", values, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesBetween(Double value1, Double value2) {
            addCriterion("totalLiabilities between", value1, value2, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andTotalliabilitiesNotBetween(Double value1, Double value2) {
            addCriterion("totalLiabilities not between", value1, value2, "totalliabilities");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeIsNull() {
            addCriterion("enterpriseNetIncome is null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeIsNotNull() {
            addCriterion("enterpriseNetIncome is not null");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeEqualTo(Double value) {
            addCriterion("enterpriseNetIncome =", value, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeNotEqualTo(Double value) {
            addCriterion("enterpriseNetIncome <>", value, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeGreaterThan(Double value) {
            addCriterion("enterpriseNetIncome >", value, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeGreaterThanOrEqualTo(Double value) {
            addCriterion("enterpriseNetIncome >=", value, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeLessThan(Double value) {
            addCriterion("enterpriseNetIncome <", value, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeLessThanOrEqualTo(Double value) {
            addCriterion("enterpriseNetIncome <=", value, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeIn(List<Double> values) {
            addCriterion("enterpriseNetIncome in", values, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeNotIn(List<Double> values) {
            addCriterion("enterpriseNetIncome not in", values, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeBetween(Double value1, Double value2) {
            addCriterion("enterpriseNetIncome between", value1, value2, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andEnterprisenetincomeNotBetween(Double value1, Double value2) {
            addCriterion("enterpriseNetIncome not between", value1, value2, "enterprisenetincome");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentIsNull() {
            addCriterion("totalTaxPayment is null");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentIsNotNull() {
            addCriterion("totalTaxPayment is not null");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentEqualTo(Double value) {
            addCriterion("totalTaxPayment =", value, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentNotEqualTo(Double value) {
            addCriterion("totalTaxPayment <>", value, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentGreaterThan(Double value) {
            addCriterion("totalTaxPayment >", value, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentGreaterThanOrEqualTo(Double value) {
            addCriterion("totalTaxPayment >=", value, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentLessThan(Double value) {
            addCriterion("totalTaxPayment <", value, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentLessThanOrEqualTo(Double value) {
            addCriterion("totalTaxPayment <=", value, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentIn(List<Double> values) {
            addCriterion("totalTaxPayment in", values, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentNotIn(List<Double> values) {
            addCriterion("totalTaxPayment not in", values, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentBetween(Double value1, Double value2) {
            addCriterion("totalTaxPayment between", value1, value2, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andTotaltaxpaymentNotBetween(Double value1, Double value2) {
            addCriterion("totalTaxPayment not between", value1, value2, "totaltaxpayment");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningIsNull() {
            addCriterion("foreignExchangeEarning is null");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningIsNotNull() {
            addCriterion("foreignExchangeEarning is not null");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningEqualTo(Double value) {
            addCriterion("foreignExchangeEarning =", value, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningNotEqualTo(Double value) {
            addCriterion("foreignExchangeEarning <>", value, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningGreaterThan(Double value) {
            addCriterion("foreignExchangeEarning >", value, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningGreaterThanOrEqualTo(Double value) {
            addCriterion("foreignExchangeEarning >=", value, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningLessThan(Double value) {
            addCriterion("foreignExchangeEarning <", value, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningLessThanOrEqualTo(Double value) {
            addCriterion("foreignExchangeEarning <=", value, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningIn(List<Double> values) {
            addCriterion("foreignExchangeEarning in", values, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningNotIn(List<Double> values) {
            addCriterion("foreignExchangeEarning not in", values, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningBetween(Double value1, Double value2) {
            addCriterion("foreignExchangeEarning between", value1, value2, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andForeignexchangeearningNotBetween(Double value1, Double value2) {
            addCriterion("foreignExchangeEarning not between", value1, value2, "foreignexchangeearning");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureIsNull() {
            addCriterion("developmentExpenditure is null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureIsNotNull() {
            addCriterion("developmentExpenditure is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureEqualTo(Double value) {
            addCriterion("developmentExpenditure =", value, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureNotEqualTo(Double value) {
            addCriterion("developmentExpenditure <>", value, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureGreaterThan(Double value) {
            addCriterion("developmentExpenditure >", value, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureGreaterThanOrEqualTo(Double value) {
            addCriterion("developmentExpenditure >=", value, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureLessThan(Double value) {
            addCriterion("developmentExpenditure <", value, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureLessThanOrEqualTo(Double value) {
            addCriterion("developmentExpenditure <=", value, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureIn(List<Double> values) {
            addCriterion("developmentExpenditure in", values, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureNotIn(List<Double> values) {
            addCriterion("developmentExpenditure not in", values, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureBetween(Double value1, Double value2) {
            addCriterion("developmentExpenditure between", value1, value2, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andDevelopmentexpenditureNotBetween(Double value1, Double value2) {
            addCriterion("developmentExpenditure not between", value1, value2, "developmentexpenditure");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioIsNull() {
            addCriterion("assetLiabilityRatio is null");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioIsNotNull() {
            addCriterion("assetLiabilityRatio is not null");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioEqualTo(Double value) {
            addCriterion("assetLiabilityRatio =", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioNotEqualTo(Double value) {
            addCriterion("assetLiabilityRatio <>", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioGreaterThan(Double value) {
            addCriterion("assetLiabilityRatio >", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioGreaterThanOrEqualTo(Double value) {
            addCriterion("assetLiabilityRatio >=", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioLessThan(Double value) {
            addCriterion("assetLiabilityRatio <", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioLessThanOrEqualTo(Double value) {
            addCriterion("assetLiabilityRatio <=", value, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioIn(List<Double> values) {
            addCriterion("assetLiabilityRatio in", values, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioNotIn(List<Double> values) {
            addCriterion("assetLiabilityRatio not in", values, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioBetween(Double value1, Double value2) {
            addCriterion("assetLiabilityRatio between", value1, value2, "assetliabilityratio");
            return (Criteria) this;
        }

        public Criteria andAssetliabilityratioNotBetween(Double value1, Double value2) {
            addCriterion("assetLiabilityRatio not between", value1, value2, "assetliabilityratio");
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