package com.example.dao;


import com.example.param.UserParam;
import com.example.pojo.UserInfo;

public interface UserInfoMapperExt {

  UserInfo getUserNameAndPasswordByLogin(UserParam userParam);

}