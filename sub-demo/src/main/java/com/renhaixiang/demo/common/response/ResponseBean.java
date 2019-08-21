package com.renhaixiang.demo.common.response;

import lombok.Data;

/**
 * description: return result
 *
 * @author renhaixiang
 * @version 1.0
 * @date 2019/8/21 10:24
 **/
@Data
public class ResponseBean<T> {
    public static final String CODE_NAME = "code";
    public static final String MESSAGE_NAME = "message";
    public static final String RESULT_NAME = "result";
    /**
     * return code 0 success else fail
     */
    private String code;
    /**
     *  description
     */
    private String message;
    /**
     *  result
     */
    private T result;

    @Override
    public String toString() {
        return "ResponseBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
