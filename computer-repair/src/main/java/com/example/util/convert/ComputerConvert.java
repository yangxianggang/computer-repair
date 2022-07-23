package com.example.util.convert;

import com.example.param.SaveComputerFailureParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerUserInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


@Mapper
public interface ComputerConvert {
    ComputerConvert INSTANCE= Mappers.getMapper(ComputerConvert.class);

    ComputerFailureInfo  computerFailureParamToInfoVo(SaveComputerFailureParam student);

    ComputerUserInfo computerUserInfoParamToInfoVo(SaveComputerFailureParam student);

}
