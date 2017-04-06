package com.roroterminal.lksys.params;

/**
 *  File Name : BaseVO.java
 *  Description : VO 상위 클래스. 공통 domain정의.
 *  Author  : kimhak
 *  Date    : 2017.03.27
 */
public class BaseVO {
    private String code;
    private String msg;
    private String rsType;

    public BaseVO() {}

    public BaseVO(String code, String msg,String rsType) {
        this.code = code;
        this.msg = msg;
        this.rsType = rsType;
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
    public String getRsType() {
        return rsType;
    }

    public void setRsType(String rsType) {
        this.rsType = rsType;
    }
    public void setResult(BaseVO result){
        this.code = result.getCode();
        this.msg = result.getMsg();
        this.rsType = result.getRsType();
    }
}
