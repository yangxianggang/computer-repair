package com.example.service.impl;

import com.example.dao.ComputerFailureInfoMapper;
import com.example.dao.ComputerFailureInfoMapperExt;
import com.example.dao.ComputerUserInfoMapper;
import com.example.param.ComputerFailureParam;
import com.example.param.SaveComputerFailureParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerUserInfo;
import com.example.service.ComputerFailureService;
import com.example.util.GetSnowIdUtil;
import com.example.util.RdfaData;
import com.example.util.convert.ComputerConvert;
import com.example.util.enums.ExceptionEnums;
import com.weicoder.common.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ComputerFailureServiceImpl  implements ComputerFailureService {
     @Autowired
    private ComputerFailureInfoMapper computerFailureInfoMapper;

    //电脑故障xml扩展
    @Autowired
    private ComputerFailureInfoMapperExt computerFailureInfoMapperExt;

    @Autowired
    private ComputerUserInfoMapper computerUserInfoMapper;


    /**
     * 电脑故障登记
     *  1.记录客户信息
     *  2.记录故障信息
     */
    @Override
    public RdfaData saveComputerFailure( SaveComputerFailureParam saveComputerFailureParam) {
        RdfaData rdfaData=new RdfaData();
        //保存客户信息
        // TODO: 2022-7-23  pom 文件
        //ComputerUserInfo userInfo = ComputerConvert.INSTANCE.computerUserInfoParamToInfoVo(saveComputerFailureParam);
        ComputerUserInfo userInfo=new ComputerUserInfo();
        userInfo.setComputerUserName(saveComputerFailureParam.getComputerUserName());
        userInfo.setComputerUserContact(saveComputerFailureParam.getComputerUserContact());
        userInfo.setComputerUserAddress(saveComputerFailureParam.getComputerUserAddress());
        userInfo.setComputerUserFaultyStatus(saveComputerFailureParam.getComputerUserFaultyStatus());
        userInfo.setComputerUserId(GetSnowIdUtil.getId());
        userInfo.setCreateTime(new Date());
        userInfo.setUpdateTime(new Date());
        computerUserInfoMapper.insertSelective(userInfo);
        //保存电脑故障信息
        // TODO: 2022-7-23 类转换异常
        //ComputerFailureInfo failureInfo = ComputerConvert.INSTANCE.computerFailureParamToInfoVo(saveComputerFailureParam);
        ComputerFailureInfo failureInfo=new ComputerFailureInfo();
        failureInfo.setBrandModels(saveComputerFailureParam.getBrandModels());
        failureInfo.setServeSerial(saveComputerFailureParam.getServeSerial());
        failureInfo.setQuickServiceCode(saveComputerFailureParam.getQuickServiceCode());
        failureInfo.setFailureInformation(saveComputerFailureParam.getFailureInformation());
        failureInfo.setFailureInformationDetailed(saveComputerFailureParam.getFailureInformationDetailed());
        failureInfo.setWarrantyFlag(saveComputerFailureParam.getWarrantyFlag());
        failureInfo.setFailureStatus(saveComputerFailureParam.getFailureStatus());
        failureInfo.setMaintenanceStatus(saveComputerFailureParam.getMaintenanceStatus());
        failureInfo.setComputerFailureId(GetSnowIdUtil.getId());//业务主键
        failureInfo.setComputerUserId(userInfo.getComputerUserId());//电脑用户id
        failureInfo.setComputerUserName(userInfo.getComputerUserName());//用户姓名
        failureInfo.setCreateTime(new Date());
        failureInfo.setUpateTime(new Date());
        computerFailureInfoMapper.insertSelective(failureInfo);
       //  return rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue(),"112");
        return  null;
    }


    /**
     * 电脑故障列表
     */
    @Override
    public RdfaData queryAllPageComputerFailure(ComputerFailureParam param){
        RdfaData rdfaData=new RdfaData();
        List<ComputerFailureInfo> failureInfos = computerFailureInfoMapperExt.queryAllPageComputerFailure(param);
         rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue(), failureInfos);
        return   rdfaData;
    }
}
