package com.example.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Test {



    public ArrayList<ScheduleMenuVo> getScheduleMenuVo(Integer sectionStatus, Date biddingStartTime, Date biddingEndTime) {
        ArrayList<ScheduleMenuVo> arrayList = new ArrayList<>();
        ScheduleMenuVo menuVo = new ScheduleMenuVo();
        menuVo.setScheduleMenuIndex(ScheduleMenuEnum.需求完善.getSerialNumber());
        menuVo.setScheduleMenuLabel(ScheduleMenuEnum.需求完善.getScheduleMenuName());

        arrayList.add(menuVo);


        //之前为 false 之后 为true
        boolean before = new Date().before(biddingEndTime);


        //需求完善  状态为草稿
        //开始报价  //投标开始时间之后 投标结束时间之前
        Date date = new Date();
        if (date.before(biddingStartTime) && !date.before(biddingEndTime))
            //截止报价  //投标结束时间之后
            if (date.before(biddingEndTime)){}

                return null;
    }


    public static void testee(){
         String endTime = "2022-08-13 15:26:32";

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
             Date date2 = format.parse(endTime);

             //之前为 false 之后 为true
            boolean before = new Date().before(date2);

            System.out.println(before);

        } catch (ParseException e) {
            e.printStackTrace();
        }



   }

    public static void main(String[] args) {
        Test.testee();
    }
}
