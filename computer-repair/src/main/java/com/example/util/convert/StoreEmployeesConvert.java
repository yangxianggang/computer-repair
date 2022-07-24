package com.example.util.convert;

import com.example.param.StoreEmployeesInfoParam;
import com.example.param.StoreInfoParam;
import com.example.pojo.StoreEmployeesInfo;
import com.example.pojo.StoreInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StoreEmployeesConvert {
    StoreEmployeesConvert INSTANCE= Mappers.getMapper(StoreEmployeesConvert.class);

    StoreEmployeesInfo storeEmployeesInfoConvert(StoreEmployeesInfoParam storeEmployeesInfoParam);

    StoreInfo storeInfoParamConvert(StoreInfoParam  storeInfoParam);

}
