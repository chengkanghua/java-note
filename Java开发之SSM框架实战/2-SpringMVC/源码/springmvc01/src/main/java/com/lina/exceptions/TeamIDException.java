package com.lina.exceptions;

/**
 * 自定义的异常类
 */
public class TeamIDException extends TeamException {

    public TeamIDException() {
        super();
    }

    public TeamIDException(String message) {
        super(message);
    }
}
