package com.hq.judge;

import com.hq.judge.enums.TransactionStatus;


/**
 *
 * @author huangqun
 */
public  class TransactionFruit<T> {

    private TransactionStatus status;

    private T data;

    public TransactionFruit buildSuccess(T data) {
        return build(TransactionStatus.SUCCESS, data);
    }

    public  TransactionFruit buildFailure(T data) {
        return build(TransactionStatus.FAILURE, data);
    }

    public  TransactionFruit buildPending(T data) {
        return build(TransactionStatus.PENDING, data);
    }

    public TransactionStatus getStatus() {
        return this.status;
    }

    public T getData() {
        return this.data;
    }


    private TransactionFruit build(TransactionStatus status, T data) {
        TransactionFruit fruit = new TransactionFruit();
        fruit.status = status;
        fruit.data = data;
        return  fruit;
    }


}
