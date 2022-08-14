package com.example.service;

import com.example.param.MenuInformationParam;
import com.example.util.RdfaData;
import com.example.vo.MenuInformationVo;

import java.util.List;

public interface MenuInformationService {

   List<MenuInformationVo>  queryAllMenuInfo(MenuInformationParam param);

}
