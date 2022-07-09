package com.example.service.impl;

import com.example.dao.ComputerFailureInfoMapper;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerFailureInfoExample;
import com.example.pojo.StoreEmployeesInfo;
import com.example.pojo.StoreEmployeesInfoExample;
import com.example.service.ComputerFailureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ComputerFailureServiceImpl  implements ComputerFailureService {
    @Autowired
    private ComputerFailureInfoMapper computerFailureInfoMapper;

    @Override
    public    List<ComputerFailureInfo> selectByExample(ComputerFailureInfoExample example){
        List<ComputerFailureInfo> failureInfos = computerFailureInfoMapper.selectByExample(example);
        return  failureInfos;
    }
}
