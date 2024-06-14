package com.example.test;


import java.util.HashMap;
import java.util.Map;

public class UserService {
    public static final int PAGE_SOURCE_A = 1;
    public static final int PAGE_SOURCE_B = 2;

    /**
     * 返回尺寸为 height * width 的头像 url
     * 可直接使用 */
    private static String getUserPicWithTargetSize(int height, int width){
        return String.format("http://userpic_mock h %d w %d", height, width);
    }

    /**
     * 返回页面对应尺寸的头像 url
     */
    private  String getUserPicForPage(int pageSource,Map<Integer,int[]>userPicWithTargetMap){
        return getUserPicWithTargetSize(userPicWithTargetMap.get(pageSource)[0],userPicWithTargetMap.get(pageSource)[1]);


    }

    public static void main(String[] args) {
        UserService userService = new UserService();
        Map<Integer,int[]>userPicWithTargetMap = new HashMap<>();
        int[] arrA = new int[]{1,1};
        int[] arrB = new int[]{2,2};
        userPicWithTargetMap.put(UserService.PAGE_SOURCE_A,arrA);
        userPicWithTargetMap.put(UserService.PAGE_SOURCE_B,arrB);
        System.out.println(userService.getUserPicForPage(UserService.PAGE_SOURCE_A,userPicWithTargetMap));
        System.out.println(userService.getUserPicForPage(UserService.PAGE_SOURCE_B,userPicWithTargetMap));
    }
}
