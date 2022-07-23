package com.example.param;

import com.alibaba.fastjson.JSONObject;

public class Tesat {
    public static void main(String[] args) {
        SaveComputerFailureParam saveComputerFailureParam=new SaveComputerFailureParam();
//        saveComputerFailureParam.setComputerUserName("张三");
//        saveComputerFailureParam.setComputerUserContact("17710472357");
//        saveComputerFailureParam.setComputerUserAddress("北京市朝阳区潘家园街道12号");
//        saveComputerFailureParam.setComputerUserFaultyStatus(1);
//
//        saveComputerFailureParam.setBrandModels("戴尔/DELL");
//        saveComputerFailureParam.setServeSerial("34235123789");
//        saveComputerFailureParam.setQuickServiceCode("K8675412");
//        saveComputerFailureParam.setFailureInformation("显示器");
//        saveComputerFailureParam.setFailureInformationDetailed("显示器出现花屏，无法正常使用");
//        saveComputerFailureParam.setWarrantyFlag(1);
//        saveComputerFailureParam.setFailureStatus(1);
//        saveComputerFailureParam.setMaintenanceStatus(1);

          System.out.println(JSONObject.toJSONString(saveComputerFailureParam.toString()));
    }
}
