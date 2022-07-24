package com.example.controller;

import com.example.service.StoreEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("storeEmployees")
public class StoreEmployeesController {
    @Autowired
    private StoreEmployeesService storeEmployeesService;


    /**
     * 门店列表
     */

    /**
     * 新增门店信息
     */

    /**
     * 当前门店员工新增
     */

    /**
     * 门店员工列表
     */

    /**
     * 门店员工信息修改
     */
}
