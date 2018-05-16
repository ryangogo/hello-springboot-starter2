package com.imooc.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2018/5/14.
 * 同步异常捕获
 */
/*@ControllerAdvice*/
public class IMoocExceptionHandler {

    //自定义错误页面名称
    public static final String IMOOC_ERROR_VIEW = "error";

    /**/@ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,
                  HttpServletResponse ressponse,Exception e) throws Exception{

        e.printStackTrace();

        ModelAndView mav = new ModelAndView();
        mav.addObject("exception", e);
        mav.addObject("url",request.getRequestURI());
        mav.setViewName(IMOOC_ERROR_VIEW);
        return mav;
    }

}
