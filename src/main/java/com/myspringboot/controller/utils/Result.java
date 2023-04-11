package com.myspringboot.controller.utils;


public class Result {
    private Boolean flag;
    private Object data;

    private String msg;

    public Result(){}
    public Result(Boolean flag){
        this.flag = flag;
    }

    public Result(Boolean flag, Object data){
        this.flag = flag;
        this.data = data;
    }

    public Result(Boolean flag, String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
