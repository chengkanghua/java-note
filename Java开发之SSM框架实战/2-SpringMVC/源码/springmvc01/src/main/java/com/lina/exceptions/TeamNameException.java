package com.lina.exceptions;

/**
 * 自定义的异常类
 */
public class TeamNameException extends TeamException {

    public TeamNameException() {
        super();
    }

    public TeamNameException(String message) {
        super(message);
    }
}
