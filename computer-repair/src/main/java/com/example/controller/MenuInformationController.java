package com.example.controller;


import com.example.param.MenuInformationParam;
import com.example.service.MenuInformationService;
import com.example.util.RdfaData;
import com.example.vo.MenuInformationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("menu")
public class MenuInformationController {

    @Autowired
    private MenuInformationService menuService;
    @PostMapping("/queryMenu")
    public List<MenuInformationVo> queryMenu(@RequestBody MenuInformationParam param){
        List<MenuInformationVo> list= menuService.queryAllMenuInfo(param);
         return  list;
    }
}
