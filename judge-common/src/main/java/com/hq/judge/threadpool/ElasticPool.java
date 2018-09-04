package com.hq.judge.threadpool;

import org.omg.SendingContext.RunTime;

import java.util.concurrent.*;

public class ElasticPool {

    public static final ThreadFactory factory = new ThreadFactory() {
        public Thread newThread(Runnable r) {
            Thread t = new Thread();
            t.setName("elastic thread");
            return t;
        }
    };

    public static final RejectedExecutionHandler customPolicy = new RejectedExecutionHandler() {
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            try {
                executor.getQueue().put(r);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println(e);
            }
        }
    };

    public static final ThreadPoolExecutor executor = new ThreadPoolExecutor(
            Runtime.getRuntime().availableProcessors(),
            10,
            5,
            TimeUnit.MINUTES,
            new ArrayBlockingQueue<Runnable>(1000),
            factory,
            customPolicy
        );


    public static final CompletionService comPool = new ExecutorCompletionService(null);

    public static void main(String[] args) {
        executor.submit(null);
        comPool.submit();
    }

}
