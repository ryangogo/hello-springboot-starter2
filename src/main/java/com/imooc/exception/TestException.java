package com.imooc.exception;

/**
 * Created by Administrator on 2018/5/14.
 */
public class TestException extends Exception{

    public TestException(String msg) {
        super(msg);
    }

    public TestException(Throwable cause) {
        super(cause);
    }

    public TestException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
