package com.springapp.exception;

/**
 * @author zhangjin
 * @since 17/1/6
 */
public class BusinessException extends BaseException {

    public BusinessException() {
        super("10000", "网络异常");
    }

    public BusinessException(Object code, String message) {
        super(code, message);
    }
}
