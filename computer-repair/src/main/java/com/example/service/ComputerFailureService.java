package com.example.service;

import com.example.param.ComputerFailureParam;
import com.example.param.SaveComputerFailureParam;
import com.example.param.UpdateComputerFailureInfoParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerFailureInfoExample;
import com.example.pojo.StoreEmployeesInfo;
import com.example.pojo.StoreEmployeesInfoExample;
import com.example.util.RdfaData;

import java.util.List;

/**
 *  1.电脑故障信息
 *     1.1 电脑故障信息登记列表
 * 	1.2 电脑故障信息 新增操作
 * 	1.3 电脑故障信息 修改操作
 * 	1.4 电脑故障信息 删除操作

 *
 */

public interface ComputerFailureService {
    /**
     * 电脑故障登记
     *  1.记录客户信息
     *  2.记录故障信息
     */


    RdfaData saveComputerFailure( SaveComputerFailureParam saveComputerFailureParam);





    /**
     * 电脑故障列表
     */

    RdfaData  queryAllPageComputerFailure(ComputerFailureParam param);


    /**
     * 电脑故障状态修改
     */

    RdfaData updateComputerFailureInfoMaintenanceStatus(UpdateComputerFailureInfoParam param);

    /**
     * 电脑故障信息删除
     */


    RdfaData updateComputerFailureInfoDeleteFlag(UpdateComputerFailureInfoParam param);


    /**
     *
     */



}
