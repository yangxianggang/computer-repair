package com.example.service.impl;

import com.example.dao.MenuInformationMapperExt;
import com.example.param.MenuInformationParam;
import com.example.pojo.MenuInformation;
import com.example.service.MenuInformationService;
import com.example.util.RdfaData;
import com.example.util.convert.MenuInformationConvert;
import com.example.util.enums.ExceptionEnums;
import com.example.vo.MenuInformationVo;
import com.weicoder.common.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MenuInformationServiceImpl implements MenuInformationService {
    @Autowired
    private MenuInformationMapperExt menuInformationMapperExt;
    @Autowired
    private MenuInformationService menuInformationService;
    @Override
    public List<MenuInformationVo>  queryAllMenuInfo(MenuInformationParam param) {
        RdfaData rdfaData=new RdfaData();
         List<MenuInformation> menuInformations = menuInformationMapperExt.queryAllMenuInfo(param);
        List<MenuInformationVo> list = MenuInformationConvert.INSTANCE.menuInfoConvert(menuInformations);
        //先筛选出主菜单
        List<MenuInformationVo> menuBeans = list.stream().filter(s -> s.getMenuCode().endsWith("000000")).collect(Collectors.toList());
        List<MenuInformationVo>menuVos=new ArrayList<>();
        for (MenuInformationVo menuBean : menuBeans) {
            MenuInformationVo    vo=new MenuInformationVo();
            vo.setMenuCode(menuBean.getMenuCode());
            vo.setMenuName(menuBean.getMenuName());
            vo.setMenuPath("");
            //第一个条件 排除主菜单本身，第二个条件 筛选主菜单下的子菜单
            List<MenuInformationVo> beans = list.stream().filter(s->!s.getMenuCode().endsWith("000000")
                    &&s.getMenuCode().substring(0,3).equals(menuBean.getMenuCode().substring(0,3))).collect(Collectors.toList());
            vo.setMenuBeans(beans);
            menuVos.add(vo);

        }

        rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue(),menuBeans);
        return menuVos;
    }
}
