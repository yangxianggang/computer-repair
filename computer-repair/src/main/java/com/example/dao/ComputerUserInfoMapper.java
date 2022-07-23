package com.example.dao;

import com.example.pojo.ComputerUserInfo;
import com.example.pojo.ComputerUserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComputerUserInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int countByExample(ComputerUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int deleteByExample(ComputerUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long computerUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int insert(ComputerUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int insertSelective(ComputerUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    List<ComputerUserInfo> selectByExample(ComputerUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    ComputerUserInfo selectByPrimaryKey(Long computerUserId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") ComputerUserInfo record, @Param("example") ComputerUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") ComputerUserInfo record, @Param("example") ComputerUserInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ComputerUserInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table computer_user_info
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ComputerUserInfo record);
}