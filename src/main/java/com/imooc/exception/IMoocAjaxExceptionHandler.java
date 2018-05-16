package com.imooc.exception;

import com.imooc.common.IMoocJSONResult;

import javax.servlet.http.HttpServletRequest;

/**
 * 异步异常捕获
 *
 */
/*@RestControllerAdvice*/
public class IMoocAjaxExceptionHandler {

    /*@ExceptionHandler(value = Exception.class)*/
    public IMoocJSONResult defaultErrorHandler(HttpServletRequest req,
                                               Exception e) throws Exception {

        e.printStackTrace();
        return IMoocJSONResult.errorException(e.getMessage());
    }
}