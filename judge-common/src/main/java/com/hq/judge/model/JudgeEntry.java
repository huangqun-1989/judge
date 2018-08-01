package com.hq.judge.model;

import java.util.Date;

/**
 * Created by sanfeng on 2018/8/1.
 */
public class JudgeEntry {

    /**
     *  2^64   <br>
     *  值范围： -9223372036854774808~9223372036854774807     <br>
     *  足够用了 <br>
     */
    private long id;

    /**
     * UUID
     */
    private String judgeId;

    /**
     * 每个应用是独立的一个域，命名一个appId
     */
    private String appId;

    /**
     * AppId域下的流程Id
     */
    private String processId;

    /**
     * 事务状态
     */
    private int status;

    /**
     * 事务类型
     */
    private String type;

    /**
     * 尝试补偿次数
     */
    private int tryCount;

    /**
     * 反查器开关
     */
    private int reverseLookupSwitch;

    /**
     * 最近的执行信息
     */
    private String latestExecuteTrace;

    /**
     * 单据创建时间
     */
    private Date createTime;

    /**
     * 单据修改时间
     */
    private Date modifyTime;

}
