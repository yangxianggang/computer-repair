package com.example.service;


import com.example.param.StoreEmployeesInfoParam;
import com.example.param.StoreInfoParam;
import com.example.param.UpdateStoreEmployeesInfoParam;
import com.example.param.UpdateStoreInfoParam;
import com.example.util.RdfaData;

/**
 *
 *  * 2.门店信息
 *  *     门店列表：门店列表信息 新增门店 删除门店 门店详情
 *  *     门店详情 展示门店里的所有员工信息 对所有员工信息进行操作
 *
 */
public interface StoreEmployeesService {
    /**
     * 门店列表
     */

    RdfaData queryAllPageStoreInfo(StoreInfoParam param);

    /**
     * 新增门店信息
     */

    RdfaData saveStoreInfo(StoreInfoParam param);

    /**
     * 门店信息删除
     * @param param
     * @return
     */
    RdfaData updateStoreInfoDeleteFlag(UpdateStoreInfoParam param);

    /**
     * 门店信息修改
     * @param param
     * @return
     */
    RdfaData updateStoreInfo(StoreInfoParam param);

    /**
     * 当前门店员工新增
     */

    RdfaData saveStoreEmployeesInfo(StoreEmployeesInfoParam param);
    /**
     * 门店员工列表
     */

    RdfaData queryAllStoreEmployeesInfo(StoreEmployeesInfoParam param);

    /**
     * 门店员工信息修改
     */
    RdfaData updateStoreEmployeesInfo(StoreEmployeesInfoParam param);

    /**
     * 门店员工删除
     * @param param
     * @return
     */
    RdfaData updateStoreEmployeesInfoDeleteFlag(UpdateStoreEmployeesInfoParam param);
}
