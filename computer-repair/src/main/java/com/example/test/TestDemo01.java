package com.example.test;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class TestDemo01 {

    private static List<Long> list = new ArrayList<>();


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 0; i < 1000; i++) {
            list.add(Long.valueOf(i));
        }
        long startMillis = System.currentTimeMillis();
        Map<Long, String> longStringMap = Service.get(list);
        System.out.println(JSON.toJSONString(longStringMap));
        long endMillis = System.currentTimeMillis();
        System.out.println("最后耗时。。。。");
        System.out.println(endMillis - startMillis);
    }

    static class Service {
        public static Map<Long, String> get(List<Long> userIds) throws ExecutionException, InterruptedException {
            Map<Long, String> mapAll = new HashMap<>();
            ExecutorService executorService = Executors.newFixedThreadPool(20);
            List<Future<Map<Long, String>>> futures = new ArrayList<>();
            Future<Map<Long, String>> submit = executorService.submit(new CallInterfaceTask());
            futures.add(submit);
            for (Future<Map<Long, String>> future : futures) {
                mapAll.putAll(future.get());

            }

            return mapAll;
        }
    }

    static class CallInterfaceTask implements Callable<Map<Long, String>> {


        @Override
        public Map<Long, String> call() throws Exception {
            Map<Long, String> map = new HashMap<>();
            List<List<Long>> parts = Lists.partition(list, 50);


                for (int i = 0; i < 20; i++) {
                    Thread.sleep(100);
                    map.put(Long.valueOf(i), "test");
                }

            return map;

        }

    }
}


class UserService12 implements Callable<String> {
    public static Map<Long, String> getUserMap(List<Long> userIds) {
        if (userIds == null || userIds.size() > 50) {
            //return new RuntimeException("userids more than 50");
            return null;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Map<Long, String> result = new HashMap();
        for (Long userId : userIds) {
            result.put(userId, "test");
        }
        return result;
    }

    @Override
    public String call() throws Exception {
        return null;
    }
}
