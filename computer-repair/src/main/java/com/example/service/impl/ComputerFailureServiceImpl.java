package com.example.service.impl;

import com.example.dao.ComputerFailureInfoMapper;
import com.example.dao.ComputerFailureInfoMapperExt;
import com.example.param.ComputerFailureParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.service.ComputerFailureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ComputerFailureServiceImpl  implements ComputerFailureService {
    @Autowired
    private ComputerFailureInfoMapper computerFailureInfoMapper;

    @Autowired
    private ComputerFailureInfoMapperExt computerFailureInfoMapperExt;

    @Override
    public    List<ComputerFailureInfo> selectByExample(ComputerFailureParam param){
        List<ComputerFailureInfo> failureInfos = computerFailureInfoMapperExt.selectByExample(param);
        return  failureInfos;
    }
}
