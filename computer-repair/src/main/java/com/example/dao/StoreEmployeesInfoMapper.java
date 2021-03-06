package com.example.dao;

import com.example.pojo.StoreEmployeesInfo;
import com.example.pojo.StoreEmployeesInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreEmployeesInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int countByExample(StoreEmployeesInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int deleteByExample(StoreEmployeesInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long storeEmployeesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int insert(StoreEmployeesInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int insertSelective(StoreEmployeesInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    List<StoreEmployeesInfo> selectByExample(StoreEmployeesInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    StoreEmployeesInfo selectByPrimaryKey(Long storeEmployeesId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") StoreEmployeesInfo record, @Param("example") StoreEmployeesInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") StoreEmployeesInfo record, @Param("example") StoreEmployeesInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(StoreEmployeesInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table store_employees_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(StoreEmployeesInfo record);
}