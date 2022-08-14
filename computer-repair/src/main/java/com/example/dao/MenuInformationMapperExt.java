package com.example.dao;

import com.example.param.MenuInformationParam;
import com.example.pojo.MenuInformation;
import com.example.pojo.MenuInformationExample;

import java.util.List;

public interface MenuInformationMapperExt {

    List<MenuInformation> queryAllMenuInfo(MenuInformationParam param);
}
