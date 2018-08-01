package com.hq.judge.utils;

import java.util.UUID;

/**
 * Created by sanfeng on 2018/8/1.
 */
public class IdUtils {

    public static String genUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }


    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);

        String uuidIntStr = String.valueOf(UUID.randomUUID().hashCode() & 0x7fffffff);
        System.out.println(uuidIntStr);

        String genUUID = genUUID();
        System.out.println(genUUID);
    }

}
