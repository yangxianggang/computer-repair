package com.example.controller;

import com.example.param.StoreEmployeesInfoParam;
import com.example.param.StoreInfoParam;
import com.example.param.UpdateStoreEmployeesInfoParam;
import com.example.param.UpdateStoreInfoParam;
import com.example.service.StoreEmployeesService;
import com.example.util.RdfaData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    @PostMapping("/queryAllPageStoreInfo")
    public RdfaData queryAllPageStoreInfo(@RequestBody StoreInfoParam param) {
        return storeEmployeesService.queryAllPageStoreInfo(param);
    }

    /**
     * 新增门店信息
     */
    @PostMapping("/saveStoreInfo")
    public RdfaData saveStoreInfo(@RequestBody StoreInfoParam param) {
        return storeEmployeesService.saveStoreInfo(param);
    }

    /**
     * 门店信息删除
     *
     * @param param
     * @return
     */
    @PostMapping("/updateStoreInfoDeleteFlag")
    public RdfaData updateStoreInfoDeleteFlag(@RequestBody UpdateStoreInfoParam param) {
        return storeEmployeesService.updateStoreInfoDeleteFlag(param);
    }

    /**
     * 门店信息修改
     *
     * @param param
     * @return
     */
    @PostMapping("/updateStoreInfo")
    public RdfaData updateStoreInfo(@RequestBody StoreInfoParam param) {
        return storeEmployeesService.updateStoreInfo(param);
    }

    /**
     * 当前门店员工新增
     */
    @PostMapping("/saveStoreEmployeesInfo")
    public RdfaData saveStoreEmployeesInfo(@RequestBody StoreEmployeesInfoParam param) {
        return storeEmployeesService.saveStoreEmployeesInfo(param);
    }

    /**
     * 门店员工列表
     */
    @PostMapping("/queryAllStoreEmployeesInfo")
    public RdfaData queryAllStoreEmployeesInfo(@RequestBody StoreEmployeesInfoParam param) {
        return storeEmployeesService.queryAllStoreEmployeesInfo(param);
    }

    /**
     * 门店员工信息修改
     */
    @PostMapping("/updateStoreEmployeesInfo")
    public RdfaData updateStoreEmployeesInfo(@RequestBody StoreEmployeesInfoParam param) {
        return storeEmployeesService.updateStoreEmployeesInfo(param);
    }

    /**
     * 门店员工删除
     *
     * @param param
     * @return
     */
    @PostMapping("/updateStoreEmployeesInfoDeleteFlag")
    public RdfaData updateStoreEmployeesInfoDeleteFlag( @RequestBody UpdateStoreEmployeesInfoParam param) {
        return storeEmployeesService.updateStoreEmployeesInfoDeleteFlag(param);
    }
}
