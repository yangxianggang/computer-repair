package com.example.dao;


import com.example.param.StoreInfoParam;
import com.example.param.UpdateStoreInfoParam;
import com.example.pojo.StoreInfo;
import com.example.pojo.StoreInfoExample;

import java.util.List;

public interface StoreInfoMapperExt {

  /**
   * 列表查询
   * @param param
   * @return
   */
  List<StoreInfo> queryAllPageStoreInfo(StoreInfoParam param);

  /**
   * 更新状态
   */

  Integer updateStoreInfoDeleteFlag(UpdateStoreInfoParam updateStoreInfoParam);


  /**
   * 更新数据
   * @param storeInfo
   * @return
   */
  Integer updateByExampleSelective(StoreInfo storeInfo);


}