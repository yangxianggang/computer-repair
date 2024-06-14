//package com.example.test;
//
//public class Test001 {
//
//        private static final int 4 = 4; // 根据硬件资源和接口响应时间设置
//        private static final int TASK_COUNT = 20;
//
//        public static void main(String[] args) throws InterruptedException, ExecutionException {
//            ExecutorService executorService = Executors.newFixedThreadPool(THREAD_POOL_SIZE);
//            List<Future<String>> futures = new ArrayList<>();
//
//            for (int i = 0; i < TASK_COUNT; i++) {
//                Future<String> future = executorService.submit(new CallInterfaceTask());
//                futures.add(future);
//            }
//
//            List<String> results = new ArrayList<>();
//            for (Future<String> future : futures) {
//                results.add(future.get());
//            }
//
//            executorService.shutdown();
//
//            System.out.println("All results: " + results);
//        }
//
//        static class CallInterfaceTask implements Callable<String> {
//            @Override
//            public String call() throws Exception {
//                // 调用接口的代码
//                Thread.sleep(100); // 模拟接口耗时100ms
//                return "result";
//            }
//        }
//
//
//}
