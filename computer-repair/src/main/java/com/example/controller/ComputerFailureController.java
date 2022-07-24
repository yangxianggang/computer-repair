package com.example.controller;

import com.example.param.ComputerFailureParam;
import com.example.param.SaveComputerFailureParam;
import com.example.param.UpdateComputerFailureInfoParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerFailureInfoExample;
import com.example.service.ComputerFailureService;
import com.example.util.RdfaData;
import com.example.util.enums.ExceptionEnums;
import com.weicoder.common.C;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/computerFailure")
public class ComputerFailureController {

    @Autowired
    private ComputerFailureService computerFailureService;



    /**
     * 电脑故障列表
     * @return
     */
    @PostMapping("/queryAllPageComputerFailure")
    public RdfaData queryAllPageComputerFailure(@RequestBody ComputerFailureParam param){
        RdfaData rdfaData = computerFailureService.queryAllPageComputerFailure(param);
         return  rdfaData;
    }
    /**
     * 电脑故障登记
     *  1.记录客户信息
     *  2.记录故障信息
     */

    @PostMapping("/saveComputerFailure")
    public RdfaData saveComputerFailure(@RequestBody SaveComputerFailureParam saveComputerFailureParam){
        RdfaData rdfaData = computerFailureService.saveComputerFailure(saveComputerFailureParam);
        return  rdfaData;
    }

    /**
     * 电脑故障状态修改
     */

   @PostMapping("/updateComputerFailureInfoMaintenanceStatus")
    public RdfaData updateComputerFailureInfoMaintenanceStatus(@RequestBody UpdateComputerFailureInfoParam param){
       RdfaData rdfaData = computerFailureService.updateComputerFailureInfoMaintenanceStatus(param);
       return  rdfaData;
   }


    /**
     * 电脑故障信息删除
     */

    @PostMapping("/updateComputerFailureInfoDeleteFlag")
    public RdfaData updateComputerFailureInfoDeleteFlag(@RequestBody UpdateComputerFailureInfoParam param){
        RdfaData rdfaData = computerFailureService.updateComputerFailureInfoDeleteFlag(param);
        return  rdfaData;
    }



    /**
     *
     */
}
