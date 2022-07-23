package com.example.dao;

import com.example.param.ComputerFailureParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerFailureInfoExample;

import java.util.List;

public interface ComputerFailureInfoMapperExt {

    /**
     * 查询电脑故障集合数据
     * @param param
     * @return
     */
    List<ComputerFailureInfo> queryAllPageComputerFailure(ComputerFailureParam param);

}
