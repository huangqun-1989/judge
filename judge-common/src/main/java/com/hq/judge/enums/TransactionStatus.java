package com.hq.judge.enums;

/**
 * @author huangqun
 */
public enum TransactionStatus {

    SUCCESS(1, "成功"),
    FAILURE(-1, "失败"),
    PENDING(0, "挂起");

    private final int value;

    private final String desc;

    private TransactionStatus(final int value, final String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return this.value;
    }

    public String getDesc(final int code) {
        TransactionStatus[] values = TransactionStatus.values();
        for (TransactionStatus value: values) {
            if (code == value.value) return value.desc;
        }

        return null;
    }

}



