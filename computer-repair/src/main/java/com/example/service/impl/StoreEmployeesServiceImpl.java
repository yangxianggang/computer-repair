package com.example.service.impl;

import com.example.dao.StoreEmployeesInfoMapper;
import com.example.dao.StoreEmployeesInfoMapperExt;
import com.example.dao.StoreInfoMapper;
import com.example.dao.StoreInfoMapperExt;
import com.example.param.StoreEmployeesInfoParam;
import com.example.param.StoreInfoParam;
import com.example.param.UpdateStoreEmployeesInfoParam;
import com.example.param.UpdateStoreInfoParam;
import com.example.pojo.StoreEmployeesInfo;
import com.example.pojo.StoreEmployeesInfoVo;
import com.example.pojo.StoreInfo;
import com.example.pojo.StoreInfoVo;
import com.example.service.StoreEmployeesService;
import com.example.util.GetSnowIdUtil;
import com.example.util.RdfaData;
import com.example.util.convert.StoreEmployeesConvert;
import com.example.util.enums.DeleteFlagEnums;
import com.example.util.enums.ExceptionEnums;
import com.example.util.enums.StoreEmployeesPositionEnums;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;


@Service
public class StoreEmployeesServiceImpl implements StoreEmployeesService {

    @Autowired
    private StoreInfoMapper storeInfoMapper;
    @Autowired
    private StoreInfoMapperExt storeInfoMapperExt;
    @Autowired
    private StoreEmployeesInfoMapper storeEmployeesInfoMapper;
    @Autowired
    private StoreEmployeesInfoMapperExt storeEmployeesInfoMapperExt;


    /**
     * 门店列表
     */
    @Override
    public RdfaData queryAllPageStoreInfo(StoreInfoParam param) {
        RdfaData rdfaData = new RdfaData();
        List<StoreInfo> storeInfos = storeInfoMapperExt.queryAllPageStoreInfo(param);
        List<StoreInfoVo> infoVos = StoreEmployeesConvert.INSTANCE.storeInfoListConvert(storeInfos);
        if (!CollectionUtils.isEmpty(infoVos)){
            for (StoreInfoVo infoVo : infoVos) {
                StoreEmployeesInfoParam storeEmployeesInfoParam=new StoreEmployeesInfoParam();
                storeEmployeesInfoParam.setStoreId(infoVo.getStoreId());
                List<StoreEmployeesInfo> storeEmployeesInfos = storeEmployeesInfoMapperExt.queryAllStoreEmployeesInfo(storeEmployeesInfoParam);
                infoVo.setStoreEmployeesInfoCount(storeEmployeesInfos.size());
            }
        }

        rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue(), infoVos);
        return rdfaData;
    }

    /**
     * 新增门店信息
     */

    @Override
    public RdfaData saveStoreInfo(StoreInfoParam param) {
        StoreInfo storeInfo = StoreEmployeesConvert.INSTANCE.storeInfoParamConvert(param);
        storeInfo.setStoreId(GetSnowIdUtil.getId());
        storeInfo.setCreateTime(new Date());
        storeInfo.setUpdateTime(new Date());
        storeInfo.setDeleteFlag(DeleteFlagEnums.未删除.getCode());
        int selective = storeInfoMapper.insertSelective(storeInfo);

        return publicRdfaDate(selective);
    }

    /**
     * 门店信息删除
     *
     * @param param
     * @return
     */
    @Override
    public RdfaData updateStoreInfoDeleteFlag(UpdateStoreInfoParam param) {
        param.setDeleteFlag(DeleteFlagEnums.已删除.getCode());
        Integer integer = storeInfoMapperExt.updateStoreInfoDeleteFlag(param);
        return publicRdfaDate(integer);
    }

    /**
     * 门店信息修改
     *
     * @param param
     * @return
     */
    @Override
    public RdfaData updateStoreInfo(StoreInfoParam param) {
        // TODO: 2022-7-24 主键转换没有转换过来 
        StoreInfo storeInfo = StoreEmployeesConvert.INSTANCE.storeInfoParamConvert(param);
        storeInfo.setStoreId(param.getStoreId());
         storeInfo.setUpdateTime(new Date());
        Integer integer = storeInfoMapperExt.updateByExampleSelective(storeInfo);
        return publicRdfaDate(integer);
    }

    /**
     * 当前门店员工新增
     */

    @Override
    public RdfaData saveStoreEmployeesInfo(StoreEmployeesInfoParam param) {
        StoreEmployeesInfo storeEmployeesInfo = StoreEmployeesConvert.INSTANCE.storeEmployeesInfoConvert(param);
        storeEmployeesInfo.setStoreEmployeesId(GetSnowIdUtil.getId());
        storeEmployeesInfo.setCreateTime(new Date());
        storeEmployeesInfo.setUpdateTime(new Date());
        storeEmployeesInfo.setDeleteFlag(DeleteFlagEnums.未删除.getCode());
        int i = storeEmployeesInfoMapper.insertSelective(storeEmployeesInfo);
        return publicRdfaDate(i);
    }

    /**
     * 门店员工列表
     */

    @Override
    public RdfaData queryAllStoreEmployeesInfo(StoreEmployeesInfoParam param) {
        RdfaData rdfaData = new RdfaData();
        List<StoreEmployeesInfo> storeEmployeesInfos = storeEmployeesInfoMapperExt.queryAllStoreEmployeesInfo(param);

        List<StoreEmployeesInfoVo> employeesInfoVos = StoreEmployeesConvert.INSTANCE.employeesInfoConvert(storeEmployeesInfos);
        if (!CollectionUtils.isEmpty(employeesInfoVos)){
            for (StoreEmployeesInfoVo infoVo : employeesInfoVos) {
                infoVo.setStoreEmployeesPositionName(StoreEmployeesPositionEnums.findEnumByCode(infoVo.getStoreEmployeesPosition()).getValue());
            }
        }


        rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue(), employeesInfoVos);
        return rdfaData;
    }

    /**
     * 门店员工信息修改
     */
    @Override
    public RdfaData updateStoreEmployeesInfo(StoreEmployeesInfoParam param) {
        StoreEmployeesInfo storeEmployeesInfo = StoreEmployeesConvert.INSTANCE.storeEmployeesInfoConvert(param);
        storeEmployeesInfo.setStoreEmployeesId(param.getStoreEmployeesId());
         storeEmployeesInfo.setUpdateTime(new Date());
        int updateByPrimaryKey = storeEmployeesInfoMapper.updateByPrimaryKeySelective(storeEmployeesInfo);
        return publicRdfaDate(updateByPrimaryKey);
    }

    /**
     * 门店员工删除
     *
     * @param param
     * @return
     */
    @Override
    public RdfaData updateStoreEmployeesInfoDeleteFlag(UpdateStoreEmployeesInfoParam param) {
        param.setDeleteFlag(DeleteFlagEnums.已删除.getCode());
        Integer integer = storeEmployeesInfoMapperExt.updateStoreEmployeesInfoDeleteFlag(param);
        return publicRdfaDate(integer);
    }


    public RdfaData publicRdfaDate(Integer integer) {
        RdfaData rdfaData = new RdfaData();
        if (integer > 0) {
            rdfaData.success(ExceptionEnums.成功.getKey(), ExceptionEnums.成功.getValue());
        } else {
            rdfaData.failed(ExceptionEnums.无更新.getKey(), ExceptionEnums.无更新.getValue());
        }
        return rdfaData;
    }
}
