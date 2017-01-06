package com.springapp.exception;

/**
 * @author zhangjin
 * @since 17/1/6
 */
public abstract class BaseException extends Exception {
    private static final long serialVersionUID = 1L;
    protected Object code;
    protected String message;
    public BaseException() {
    }
    public BaseException(Object code,String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public Object getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
