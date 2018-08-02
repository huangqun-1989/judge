package com.hq.judge.enums;

public enum TusTransactionStatus {

    Finish((byte)0x00, "完成"),
    UnFinish((byte)0x01, "未完成");

    private byte code;

    private String message;

    private TusTransactionStatus(byte code, String message) {
        this.code = code;
        this.message = message;
    }

    public byte getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}
