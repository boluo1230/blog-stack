package com.mini.blogstack.base.bean;

public class Result {

    private static final int SUCCESS_CODE = 1;
    private static final int FAIL_CODE = 0;

    private int code;
    private String message;
    private Object data;

    public int getCode() {
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Result(int code) {
        this.setCode(code);
    }

    public Result(int code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public Result(int code, Object data) {
        this.setCode(code);
        this.setData(data);
    }

    public Result(int code, String message, Object data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public static Result success() {
        return new Result(SUCCESS_CODE);
    }

    public static Result success(String msg) {
        return new Result(SUCCESS_CODE, msg);
    }

    public static Result success(Object data) {
        return new Result(SUCCESS_CODE, data);
    }

    public static Result success(String msg, Object data) {
        return new Result(SUCCESS_CODE, msg, data);
    }

    public static Result fail() {
        return new Result(FAIL_CODE);
    }

    public static Result fail(String msg) {
        return new Result(FAIL_CODE, msg);
    }

    public static Result fail(Object data) {
        return new Result(FAIL_CODE, data);
    }

    public static Result fail(String msg, Object data) {
        return new Result(FAIL_CODE, msg, data);
    }
}
