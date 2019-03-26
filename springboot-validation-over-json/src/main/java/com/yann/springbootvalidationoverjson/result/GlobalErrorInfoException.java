package com.yann.springbootvalidationoverjson.result;

/**
 * @program: demo3
 * @description: 统一错误码异常
 * @author: Yann
 * @create: 2019-03-26 15:10
 **/
public class GlobalErrorInfoException extends Exception {

    private ErrorInfoInterface errorInfo;

    public GlobalErrorInfoException (ErrorInfoInterface errorInfo){
        this.errorInfo = errorInfo;
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}
