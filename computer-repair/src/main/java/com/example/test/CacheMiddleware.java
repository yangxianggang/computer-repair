package com.example.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CacheMiddleware<K, V> {

    private Map<K, V> cacheMap;
    private Map<K, Future<V>> futureMap;
    private ExecutorService executorService;
    private AService aService;
    private long expirationTime; // 缓存过期时间，单位：毫秒

    public CacheMiddleware(AService aService, long expirationTime) {
        this.cacheMap = new HashMap<>();
        this.futureMap = new HashMap<>();
        this.executorService = Executors.newFixedThreadPool(10);
        this.aService = aService;
        this.expirationTime = expirationTime;
    }

    public V get(K key) {
        //判断是否存在
        return cacheMap.get(key);

    }

    public void put(K key, V value) {
        //赋值
        cacheMap.put(key, value);
        //放入缓存，设置时间
        AService aService = new AService();
        new CacheMiddleware(aService, 10L);
    }

    public void remove(K key) {
    }

    public void update(K key) {
    }

    private void scheduleExpiration(K key) {
        //设计一个 Java 缓存中间件系统，该中间件的缓存写入后，经过指定时间缓存要自动失效。
        put(key, null);
        //在读取缓存时，如果缓存不存在，需要异步调用 AService.get(K) 接口获取实时数据更新 到缓存中。
        if (get(key) == null) { //不存在
            aService.get(key);
        }
    }

    class AService {
        public void get(K key) {
            //删除缓存
          remove(key);
            try {
                //休眠的时间，按业务的具体情况分析调整
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            put(key,null);
        }
    }


}
