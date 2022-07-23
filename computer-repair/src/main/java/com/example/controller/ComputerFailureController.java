package com.example.controller;

import com.example.param.ComputerFailureParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerFailureInfoExample;
import com.example.service.ComputerFailureService;
import com.example.util.RdfaData;
import com.example.util.enums.ExceptionEnums;
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
        RdfaData rdfaData=new RdfaData();
         List<ComputerFailureInfo> failureInfos = computerFailureService.selectByExample(param);
        rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue(),failureInfos);
        return  rdfaData;
    }

}
