package com.example.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Service {
    private static final int MAX_USER_IDS = 50;
    private static final int TIMEOUT = 200;

    public static void main(String[] args) throws InterruptedException {
        List<Long> userIds = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            userIds.add(Long.valueOf(i));
        }
        Service.get(userIds);
    }

    public static Map<Long, String> get(List<Long> userIds) throws InterruptedException {

        long startMillis = System.currentTimeMillis();

        Map<Long, String> result = new HashMap<>();
        int size = userIds.size();
        int batchCount = (size + MAX_USER_IDS - 1) / MAX_USER_IDS;

        for (int i = 0; i < batchCount; i++) {
            int start = i * MAX_USER_IDS;
            int end = Math.min(start + MAX_USER_IDS, size);
            List<Long> batchUserIds = userIds.subList(start, end);

            Map<Long, String> userMap = UserService122.getUserMap(batchUserIds);
            result.putAll(userMap);

            if (i < batchCount - 1) {
                long sleepTime = TIMEOUT - 100;
                Thread.sleep(sleepTime);
            }
        }
        long endMillis = System.currentTimeMillis();
        System.out.println(endMillis - startMillis);
        return result;
    }
}

class UserService122 {
    public static Map<Long, String> getUserMap(List<Long> userIds) {
        // 模拟从数据库或其他数据源获取用户昵称的过程
        Map<Long, String> userMap = new HashMap<>();
        for (Long userId : userIds) {
            userMap.put(userId, "昵称" + userId);
        }
        return userMap;
    }
}


