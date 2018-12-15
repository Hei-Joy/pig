package com.mall.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class companyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public companyExample() {
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

        public Criteria andFullnameIsNull() {
            addCriterion("fullName is null");
            return (Criteria) this;
        }

        public Criteria andFullnameIsNotNull() {
            addCriterion("fullName is not null");
            return (Criteria) this;
        }

        public Criteria andFullnameEqualTo(String value) {
            addCriterion("fullName =", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotEqualTo(String value) {
            addCriterion("fullName <>", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThan(String value) {
            addCriterion("fullName >", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameGreaterThanOrEqualTo(String value) {
            addCriterion("fullName >=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThan(String value) {
            addCriterion("fullName <", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLessThanOrEqualTo(String value) {
            addCriterion("fullName <=", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameLike(String value) {
            addCriterion("fullName like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotLike(String value) {
            addCriterion("fullName not like", value, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameIn(List<String> values) {
            addCriterion("fullName in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotIn(List<String> values) {
            addCriterion("fullName not in", values, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameBetween(String value1, String value2) {
            addCriterion("fullName between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andFullnameNotBetween(String value1, String value2) {
            addCriterion("fullName not between", value1, value2, "fullname");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNull() {
            addCriterion("organizationCode is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIsNotNull() {
            addCriterion("organizationCode is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeEqualTo(String value) {
            addCriterion("organizationCode =", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotEqualTo(String value) {
            addCriterion("organizationCode <>", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThan(String value) {
            addCriterion("organizationCode >", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeGreaterThanOrEqualTo(String value) {
            addCriterion("organizationCode >=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThan(String value) {
            addCriterion("organizationCode <", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLessThanOrEqualTo(String value) {
            addCriterion("organizationCode <=", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeLike(String value) {
            addCriterion("organizationCode like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotLike(String value) {
            addCriterion("organizationCode not like", value, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeIn(List<String> values) {
            addCriterion("organizationCode in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotIn(List<String> values) {
            addCriterion("organizationCode not in", values, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeBetween(String value1, String value2) {
            addCriterion("organizationCode between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andOrganizationcodeNotBetween(String value1, String value2) {
            addCriterion("organizationCode not between", value1, value2, "organizationcode");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyIsNull() {
            addCriterion("troopsOrSecrecy is null");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyIsNotNull() {
            addCriterion("troopsOrSecrecy is not null");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyEqualTo(Boolean value) {
            addCriterion("troopsOrSecrecy =", value, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyNotEqualTo(Boolean value) {
            addCriterion("troopsOrSecrecy <>", value, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyGreaterThan(Boolean value) {
            addCriterion("troopsOrSecrecy >", value, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("troopsOrSecrecy >=", value, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyLessThan(Boolean value) {
            addCriterion("troopsOrSecrecy <", value, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyLessThanOrEqualTo(Boolean value) {
            addCriterion("troopsOrSecrecy <=", value, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyIn(List<Boolean> values) {
            addCriterion("troopsOrSecrecy in", values, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyNotIn(List<Boolean> values) {
            addCriterion("troopsOrSecrecy not in", values, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyBetween(Boolean value1, Boolean value2) {
            addCriterion("troopsOrSecrecy between", value1, value2, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andTroopsorsecrecyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("troopsOrSecrecy not between", value1, value2, "troopsorsecrecy");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("bank is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("bank is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("bank =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("bank <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("bank >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("bank >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("bank <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("bank <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("bank like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("bank not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("bank in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("bank not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("bank between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("bank not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNull() {
            addCriterion("postalCode is null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIsNotNull() {
            addCriterion("postalCode is not null");
            return (Criteria) this;
        }

        public Criteria andPostalcodeEqualTo(Integer value) {
            addCriterion("postalCode =", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotEqualTo(Integer value) {
            addCriterion("postalCode <>", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThan(Integer value) {
            addCriterion("postalCode >", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("postalCode >=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThan(Integer value) {
            addCriterion("postalCode <", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeLessThanOrEqualTo(Integer value) {
            addCriterion("postalCode <=", value, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeIn(List<Integer> values) {
            addCriterion("postalCode in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotIn(List<Integer> values) {
            addCriterion("postalCode not in", values, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeBetween(Integer value1, Integer value2) {
            addCriterion("postalCode between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andPostalcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("postalCode not between", value1, value2, "postalcode");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyIsNull() {
            addCriterion("unitproperty is null");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyIsNotNull() {
            addCriterion("unitproperty is not null");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyEqualTo(String value) {
            addCriterion("unitproperty =", value, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyNotEqualTo(String value) {
            addCriterion("unitproperty <>", value, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyGreaterThan(String value) {
            addCriterion("unitproperty >", value, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyGreaterThanOrEqualTo(String value) {
            addCriterion("unitproperty >=", value, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyLessThan(String value) {
            addCriterion("unitproperty <", value, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyLessThanOrEqualTo(String value) {
            addCriterion("unitproperty <=", value, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyLike(String value) {
            addCriterion("unitproperty like", value, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyNotLike(String value) {
            addCriterion("unitproperty not like", value, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyIn(List<String> values) {
            addCriterion("unitproperty in", values, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyNotIn(List<String> values) {
            addCriterion("unitproperty not in", values, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyBetween(String value1, String value2) {
            addCriterion("unitproperty between", value1, value2, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitpropertyNotBetween(String value1, String value2) {
            addCriterion("unitproperty not between", value1, value2, "unitproperty");
            return (Criteria) this;
        }

        public Criteria andUnitattributeIsNull() {
            addCriterion("unitattribute is null");
            return (Criteria) this;
        }

        public Criteria andUnitattributeIsNotNull() {
            addCriterion("unitattribute is not null");
            return (Criteria) this;
        }

        public Criteria andUnitattributeEqualTo(String value) {
            addCriterion("unitattribute =", value, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeNotEqualTo(String value) {
            addCriterion("unitattribute <>", value, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeGreaterThan(String value) {
            addCriterion("unitattribute >", value, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeGreaterThanOrEqualTo(String value) {
            addCriterion("unitattribute >=", value, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeLessThan(String value) {
            addCriterion("unitattribute <", value, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeLessThanOrEqualTo(String value) {
            addCriterion("unitattribute <=", value, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeLike(String value) {
            addCriterion("unitattribute like", value, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeNotLike(String value) {
            addCriterion("unitattribute not like", value, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeIn(List<String> values) {
            addCriterion("unitattribute in", values, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeNotIn(List<String> values) {
            addCriterion("unitattribute not in", values, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeBetween(String value1, String value2) {
            addCriterion("unitattribute between", value1, value2, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andUnitattributeNotBetween(String value1, String value2) {
            addCriterion("unitattribute not between", value1, value2, "unitattribute");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentIsNull() {
            addCriterion("competentDepartment is null");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentIsNotNull() {
            addCriterion("competentDepartment is not null");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentEqualTo(String value) {
            addCriterion("competentDepartment =", value, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentNotEqualTo(String value) {
            addCriterion("competentDepartment <>", value, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentGreaterThan(String value) {
            addCriterion("competentDepartment >", value, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("competentDepartment >=", value, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentLessThan(String value) {
            addCriterion("competentDepartment <", value, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentLessThanOrEqualTo(String value) {
            addCriterion("competentDepartment <=", value, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentLike(String value) {
            addCriterion("competentDepartment like", value, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentNotLike(String value) {
            addCriterion("competentDepartment not like", value, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentIn(List<String> values) {
            addCriterion("competentDepartment in", values, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentNotIn(List<String> values) {
            addCriterion("competentDepartment not in", values, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentBetween(String value1, String value2) {
            addCriterion("competentDepartment between", value1, value2, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andCompetentdepartmentNotBetween(String value1, String value2) {
            addCriterion("competentDepartment not between", value1, value2, "competentdepartment");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNull() {
            addCriterion("accountNumber is null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIsNotNull() {
            addCriterion("accountNumber is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnumberEqualTo(Integer value) {
            addCriterion("accountNumber =", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotEqualTo(Integer value) {
            addCriterion("accountNumber <>", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThan(Integer value) {
            addCriterion("accountNumber >", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("accountNumber >=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThan(Integer value) {
            addCriterion("accountNumber <", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberLessThanOrEqualTo(Integer value) {
            addCriterion("accountNumber <=", value, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberIn(List<Integer> values) {
            addCriterion("accountNumber in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotIn(List<Integer> values) {
            addCriterion("accountNumber not in", values, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberBetween(Integer value1, Integer value2) {
            addCriterion("accountNumber between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andAccountnumberNotBetween(Integer value1, Integer value2) {
            addCriterion("accountNumber not between", value1, value2, "accountnumber");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsIsNull() {
            addCriterion("unitCharacteristics is null");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsIsNotNull() {
            addCriterion("unitCharacteristics is not null");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsEqualTo(String value) {
            addCriterion("unitCharacteristics =", value, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsNotEqualTo(String value) {
            addCriterion("unitCharacteristics <>", value, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsGreaterThan(String value) {
            addCriterion("unitCharacteristics >", value, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsGreaterThanOrEqualTo(String value) {
            addCriterion("unitCharacteristics >=", value, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsLessThan(String value) {
            addCriterion("unitCharacteristics <", value, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsLessThanOrEqualTo(String value) {
            addCriterion("unitCharacteristics <=", value, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsLike(String value) {
            addCriterion("unitCharacteristics like", value, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsNotLike(String value) {
            addCriterion("unitCharacteristics not like", value, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsIn(List<String> values) {
            addCriterion("unitCharacteristics in", values, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsNotIn(List<String> values) {
            addCriterion("unitCharacteristics not in", values, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsBetween(String value1, String value2) {
            addCriterion("unitCharacteristics between", value1, value2, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andUnitcharacteristicsNotBetween(String value1, String value2) {
            addCriterion("unitCharacteristics not between", value1, value2, "unitcharacteristics");
            return (Criteria) this;
        }

        public Criteria andAffiliationIsNull() {
            addCriterion("affiliation is null");
            return (Criteria) this;
        }

        public Criteria andAffiliationIsNotNull() {
            addCriterion("affiliation is not null");
            return (Criteria) this;
        }

        public Criteria andAffiliationEqualTo(String value) {
            addCriterion("affiliation =", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotEqualTo(String value) {
            addCriterion("affiliation <>", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationGreaterThan(String value) {
            addCriterion("affiliation >", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("affiliation >=", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLessThan(String value) {
            addCriterion("affiliation <", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLessThanOrEqualTo(String value) {
            addCriterion("affiliation <=", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationLike(String value) {
            addCriterion("affiliation like", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotLike(String value) {
            addCriterion("affiliation not like", value, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationIn(List<String> values) {
            addCriterion("affiliation in", values, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotIn(List<String> values) {
            addCriterion("affiliation not in", values, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationBetween(String value1, String value2) {
            addCriterion("affiliation between", value1, value2, "affiliation");
            return (Criteria) this;
        }

        public Criteria andAffiliationNotBetween(String value1, String value2) {
            addCriterion("affiliation not between", value1, value2, "affiliation");
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