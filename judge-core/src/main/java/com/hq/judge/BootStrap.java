package com.hq.judge;

import com.hq.judge.launcher.ClearLauncher;
import com.hq.judge.launcher.CompensateLauncher;

/**
 * Created by sanfeng on 2018/8/1.
 */
public class BootStrap {


    public void startup() {

        long begin = System.currentTimeMillis();

        new ClearLauncher().launch();
        new CompensateLauncher().launch();

        long end = System.currentTimeMillis();

        long cost = end - begin;
        System.out.println("bootstrap startup success, cost time" + cost + " ms");

    }


    public static void main(String[] args) {

        new BootStrap().startup();

    }
}
