package com.example.controller;

import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerFailureInfoExample;
import com.example.service.ComputerFailureService;
import com.weicoder.common.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/computerFailure")
public class ComputerFailureController {

    @Autowired
    private ComputerFailureService computerFailureService;


    @GetMapping("/queryAllPageComputerFailure")
    public List<ComputerFailureInfo> selectByExample(){
        ComputerFailureInfoExample example=new ComputerFailureInfoExample();
        return  computerFailureService.selectByExample(example);
    }

}
