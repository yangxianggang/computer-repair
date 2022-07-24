package com.example.dao;

import com.example.param.StoreEmployeesInfoParam;
import com.example.param.UpdateStoreEmployeesInfoParam;
import com.example.pojo.StoreEmployeesInfo;

import java.util.List;

public interface StoreEmployeesInfoMapperExt {

    List<StoreEmployeesInfo>queryAllStoreEmployeesInfo(StoreEmployeesInfoParam param);

    Integer updateStoreEmployeesInfoDeleteFlag(UpdateStoreEmployeesInfoParam param);
}
