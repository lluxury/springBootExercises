package com.yann.springbootvalidationoverjson.result;

/**
 * @program: demo3
 * @description: 返回体
 * @author: Yann
 * @create: 2019-03-26 15:18
 **/
public class ResultBody {

    private String code;

    private String message;

    private  Object result;

    public ResultBody(ErrorInfoInterface errorInfo){
        this.code = errorInfo.getCode();
        this.message = errorInfo.getMessage();
    }

    public ResultBody(Object result){
        this.code = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.message=GlobalErrorInfoEnum.SUCCESS.getMessage();
        this.result = result;
    }

    public String getCode(){
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
