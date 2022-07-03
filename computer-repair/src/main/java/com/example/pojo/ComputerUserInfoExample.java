package com.example.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ComputerUserInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public ComputerUserInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
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

        public Criteria andComputerUserIdIsNull() {
            addCriterion("computer_user_id is null");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdIsNotNull() {
            addCriterion("computer_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdEqualTo(Long value) {
            addCriterion("computer_user_id =", value, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdNotEqualTo(Long value) {
            addCriterion("computer_user_id <>", value, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdGreaterThan(Long value) {
            addCriterion("computer_user_id >", value, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("computer_user_id >=", value, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdLessThan(Long value) {
            addCriterion("computer_user_id <", value, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdLessThanOrEqualTo(Long value) {
            addCriterion("computer_user_id <=", value, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdIn(List<Long> values) {
            addCriterion("computer_user_id in", values, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdNotIn(List<Long> values) {
            addCriterion("computer_user_id not in", values, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdBetween(Long value1, Long value2) {
            addCriterion("computer_user_id between", value1, value2, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserIdNotBetween(Long value1, Long value2) {
            addCriterion("computer_user_id not between", value1, value2, "computerUserId");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameIsNull() {
            addCriterion("computer_user_name is null");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameIsNotNull() {
            addCriterion("computer_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameEqualTo(String value) {
            addCriterion("computer_user_name =", value, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameNotEqualTo(String value) {
            addCriterion("computer_user_name <>", value, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameGreaterThan(String value) {
            addCriterion("computer_user_name >", value, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("computer_user_name >=", value, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameLessThan(String value) {
            addCriterion("computer_user_name <", value, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameLessThanOrEqualTo(String value) {
            addCriterion("computer_user_name <=", value, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameLike(String value) {
            addCriterion("computer_user_name like", value, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameNotLike(String value) {
            addCriterion("computer_user_name not like", value, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameIn(List<String> values) {
            addCriterion("computer_user_name in", values, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameNotIn(List<String> values) {
            addCriterion("computer_user_name not in", values, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameBetween(String value1, String value2) {
            addCriterion("computer_user_name between", value1, value2, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserNameNotBetween(String value1, String value2) {
            addCriterion("computer_user_name not between", value1, value2, "computerUserName");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactIsNull() {
            addCriterion("computer_user_contact is null");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactIsNotNull() {
            addCriterion("computer_user_contact is not null");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactEqualTo(String value) {
            addCriterion("computer_user_contact =", value, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactNotEqualTo(String value) {
            addCriterion("computer_user_contact <>", value, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactGreaterThan(String value) {
            addCriterion("computer_user_contact >", value, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactGreaterThanOrEqualTo(String value) {
            addCriterion("computer_user_contact >=", value, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactLessThan(String value) {
            addCriterion("computer_user_contact <", value, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactLessThanOrEqualTo(String value) {
            addCriterion("computer_user_contact <=", value, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactLike(String value) {
            addCriterion("computer_user_contact like", value, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactNotLike(String value) {
            addCriterion("computer_user_contact not like", value, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactIn(List<String> values) {
            addCriterion("computer_user_contact in", values, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactNotIn(List<String> values) {
            addCriterion("computer_user_contact not in", values, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactBetween(String value1, String value2) {
            addCriterion("computer_user_contact between", value1, value2, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserContactNotBetween(String value1, String value2) {
            addCriterion("computer_user_contact not between", value1, value2, "computerUserContact");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressIsNull() {
            addCriterion("computer_user_address is null");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressIsNotNull() {
            addCriterion("computer_user_address is not null");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressEqualTo(String value) {
            addCriterion("computer_user_address =", value, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressNotEqualTo(String value) {
            addCriterion("computer_user_address <>", value, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressGreaterThan(String value) {
            addCriterion("computer_user_address >", value, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressGreaterThanOrEqualTo(String value) {
            addCriterion("computer_user_address >=", value, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressLessThan(String value) {
            addCriterion("computer_user_address <", value, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressLessThanOrEqualTo(String value) {
            addCriterion("computer_user_address <=", value, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressLike(String value) {
            addCriterion("computer_user_address like", value, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressNotLike(String value) {
            addCriterion("computer_user_address not like", value, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressIn(List<String> values) {
            addCriterion("computer_user_address in", values, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressNotIn(List<String> values) {
            addCriterion("computer_user_address not in", values, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressBetween(String value1, String value2) {
            addCriterion("computer_user_address between", value1, value2, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andComputerUserAddressNotBetween(String value1, String value2) {
            addCriterion("computer_user_address not between", value1, value2, "computerUserAddress");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdIsNull() {
            addCriterion("create_by_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdIsNotNull() {
            addCriterion("create_by_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdEqualTo(Long value) {
            addCriterion("create_by_user_id =", value, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdNotEqualTo(Long value) {
            addCriterion("create_by_user_id <>", value, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdGreaterThan(Long value) {
            addCriterion("create_by_user_id >", value, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_by_user_id >=", value, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdLessThan(Long value) {
            addCriterion("create_by_user_id <", value, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_by_user_id <=", value, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdIn(List<Long> values) {
            addCriterion("create_by_user_id in", values, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdNotIn(List<Long> values) {
            addCriterion("create_by_user_id not in", values, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdBetween(Long value1, Long value2) {
            addCriterion("create_by_user_id between", value1, value2, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andCreateByUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_by_user_id not between", value1, value2, "createByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterionForJDBCDate("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdIsNull() {
            addCriterion("update_by_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdIsNotNull() {
            addCriterion("update_by_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdEqualTo(Long value) {
            addCriterion("update_by_user_id =", value, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdNotEqualTo(Long value) {
            addCriterion("update_by_user_id <>", value, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdGreaterThan(Long value) {
            addCriterion("update_by_user_id >", value, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_by_user_id >=", value, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdLessThan(Long value) {
            addCriterion("update_by_user_id <", value, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_by_user_id <=", value, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdIn(List<Long> values) {
            addCriterion("update_by_user_id in", values, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdNotIn(List<Long> values) {
            addCriterion("update_by_user_id not in", values, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdBetween(Long value1, Long value2) {
            addCriterion("update_by_user_id between", value1, value2, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateByUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_by_user_id not between", value1, value2, "updateByUserId");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table computer_user_info
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
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