package com.example.service.impl;

import com.example.dao.ComputerFailureInfoMapper;
import com.example.dao.ComputerFailureInfoMapperExt;
import com.example.dao.ComputerUserInfoMapper;
import com.example.param.ComputerFailureParam;
import com.example.param.SaveComputerFailureParam;
import com.example.param.UpdateComputerFailureInfoParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerUserInfo;
import com.example.service.ComputerFailureService;
import com.example.util.GetSnowIdUtil;
import com.example.util.RdfaData;
import com.example.util.convert.ComputerConvert;
import com.example.util.enums.DeleteFlagEnums;
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
        ComputerUserInfo userInfo = ComputerConvert.INSTANCE.computerUserInfoParamToInfoVo(saveComputerFailureParam);
        userInfo.setComputerUserId(GetSnowIdUtil.getId());
        userInfo.setCreateTime(new Date());
        userInfo.setUpdateTime(new Date());
        userInfo.setDeleteFlag(DeleteFlagEnums.未删除.getCode());
        computerUserInfoMapper.insertSelective(userInfo);
        //保存电脑故障信息
        // TODO: 2022-7-23 类转换异常
        ComputerFailureInfo failureInfo = ComputerConvert.INSTANCE.computerFailureParamToInfoVo(saveComputerFailureParam);
        failureInfo.setComputerFailureId(GetSnowIdUtil.getId());//业务主键
        failureInfo.setComputerUserId(userInfo.getComputerUserId());//电脑用户id
        failureInfo.setComputerUserName(userInfo.getComputerUserName());//用户姓名
        failureInfo.setCreateTime(new Date());
        failureInfo.setUpdateTime(new Date());
        failureInfo.setDeleteFlag(DeleteFlagEnums.未删除.getCode());
        computerFailureInfoMapper.insertSelective(failureInfo);
        rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue());
       return rdfaData;
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


    /**
     * 电脑故障状态修改
     */
    @Override
    public RdfaData updateComputerFailureInfoMaintenanceStatus(UpdateComputerFailureInfoParam param) {
        RdfaData rdfaData = updateComputerFailureInfo(param);
        return rdfaData;
    }

    /**
     * 电脑故障信息删除
     */

    @Override
    public RdfaData updateComputerFailureInfoDeleteFlag(UpdateComputerFailureInfoParam param) {
        RdfaData rdfaData = updateComputerFailureInfo(param);
        return rdfaData;
    }

    /**
     * 更新公共方法抽取
     * @param param
     * @return
     */

    public RdfaData updateComputerFailureInfo(UpdateComputerFailureInfoParam param){
        RdfaData rdfaData=new RdfaData();
        Integer integer = computerFailureInfoMapperExt.updateComputerFailureInfo(param);
        if (integer>0){
            rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue());
        }else {
            rdfaData.failed(ExceptionEnums.无更新.getKey(), ExceptionEnums.无更新.getValue());
        }
        return rdfaData;
    }
}
