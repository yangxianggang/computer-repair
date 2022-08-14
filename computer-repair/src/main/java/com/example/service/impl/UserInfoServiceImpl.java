package com.example.service.impl;

import com.example.dao.UserInfoMapperExt;
import com.example.param.UserParam;
import com.example.pojo.UserInfo;
import com.example.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl  implements UserInfoService {
    @Autowired
    private UserInfoMapperExt userInfoMapperExt;
    @Autowired
    private UserInfoService userInfoService;
    @Override
    public UserInfo getUserNameAndPasswordByLogin(UserParam userParam) {
        return userInfoMapperExt.getUserNameAndPasswordByLogin(userParam);
    }
}
