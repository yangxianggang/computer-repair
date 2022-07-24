package com.example.dao;

import com.example.param.ComputerFailureParam;
import com.example.param.UpdateComputerFailureInfoParam;
import com.example.pojo.ComputerFailureInfo;
import com.example.pojo.ComputerFailureInfoExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ComputerFailureInfoMapperExt {

    /**
     * 查询电脑故障集合数据
     * @param param
     * @return
     */
    List<ComputerFailureInfo> queryAllPageComputerFailure(ComputerFailureParam param);

    /**
     * 更新电脑状态
     * @param param
     * @return
     */
    Integer updateComputerFailureInfo(UpdateComputerFailureInfoParam param);

}
