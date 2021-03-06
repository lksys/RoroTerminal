package com.roroterminal.lksys.params;

/**
 *  File Name : ResultVO.java
 *  Description : VO 상위 클래스. 공통 domain정의.
 *  Author  : kimhak
 *  Date    : 2017.03.27
 */
public class ResultVO {
    private String code;
    private String msg;

    public ResultVO() {}

    public ResultVO(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code == null ? "" : code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg == null ? "" : msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setResult(ResultVO result){
        this.code = result.getCode();
        this.msg = result.getMsg();
    }
}
