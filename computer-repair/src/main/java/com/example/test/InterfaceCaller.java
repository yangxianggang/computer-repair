package com.example.test;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class InterfaceCaller {
    private static final int THREAD_POOL_SIZE = 4; // 根据硬件资源和接口响应时间设置
    private static List<Long> listAll = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        List<Future< Map<Long,String>>> futures = new ArrayList<>();
        long startMillis = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            listAll.add(Long.valueOf(i));
        }
        List<List<Long>> parts = Lists.partition(listAll, 50);


        for (int i = 0; i < parts.size(); i++) {
            Future< Map<Long,String>> future = executorService.submit(new CallInterfaceTask());
            futures.add(future);
        }

         Map<Long,String> resultsMap = new HashMap<>();
        for (Future< Map<Long,String>> future : futures) {
            resultsMap.putAll(future.get());
        }

        executorService.shutdown();

        System.out.println("All results: " + JSON.toJSONString(resultsMap));

        long endMillis = System.currentTimeMillis();
        System.out.println("最后耗时。。。。");
        System.out.println(endMillis - startMillis);
    }

    static class CallInterfaceTask implements Callable<Map<Long,String>> {
        @Override
        public Map<Long,String> call() throws Exception {

            Map<Long,String> map = new HashMap<>();
            // 调用接口的代码

            List<List<Long>> parts = Lists.partition(listAll, 50);
            for (List<Long> part : parts) {
                Thread.sleep(100); // 模拟接口耗时100ms
                for (Long aLong : part) {

                    map.put(aLong,"test");
                }
            }
             return map;
        }
    }


}
