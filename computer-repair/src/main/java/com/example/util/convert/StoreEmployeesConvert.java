package com.example.util.convert;

import com.example.param.StoreEmployeesInfoParam;
import com.example.param.StoreInfoParam;
import com.example.pojo.StoreEmployeesInfo;
import com.example.pojo.StoreEmployeesInfoVo;
import com.example.pojo.StoreInfo;
import com.example.pojo.StoreInfoVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface StoreEmployeesConvert {
    StoreEmployeesConvert INSTANCE= Mappers.getMapper(StoreEmployeesConvert.class);

    StoreEmployeesInfo storeEmployeesInfoConvert(StoreEmployeesInfoParam storeEmployeesInfoParam);

    StoreInfo storeInfoParamConvert(StoreInfoParam  storeInfoParam);


    List<StoreInfoVo>storeInfoListConvert(List<StoreInfo> storeInfos);

    List<StoreEmployeesInfoVo>employeesInfoConvert(List<StoreEmployeesInfo> storeEmployeesInfos);

}
