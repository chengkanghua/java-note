package com.lina.exceptions;

/**
 * 自定义的异常类
 */
public class TeamException extends Exception {

    public TeamException() {
        super();
    }

    public TeamException(String message) {
        super(message);
    }
}
