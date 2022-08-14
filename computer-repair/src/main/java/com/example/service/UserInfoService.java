package com.example.service;

import com.example.param.UserParam;
import com.example.pojo.UserInfo;
import com.example.util.RdfaData;

public interface UserInfoService {
    UserInfo getUserNameAndPasswordByLogin(UserParam userParam);

}
