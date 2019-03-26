package com.yann.springbootvalidationoverjson.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

/**
 * @program: demo3
 * @description: 统一错误码异常处理
 * @author: Yann
 * @create: 2019-03-26 15:07
 **/
@RestControllerAdvice
public class GlobalErrorInfoHandler {

    @ExceptionHandler(value = GlobalErrorInfoException.class)
    public ResultBody errorHandlerOverJson(HttpServletResponse request,GlobalErrorInfoException exception){
        ErrorInfoInterface errorInfo = exception.getErrorInfo();
        ResultBody result = new ResultBody(errorInfo);
        return result;
    }
}
