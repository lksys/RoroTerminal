package com.roroterminal.lksys.common;

/**
 * Program :  com.roroterminal.lksys.common
 * Description : JSON Result 값.
 * Author  :  kimhak
 * Date    :  2017. 3. 27.
 */
public class JsonResultCode {

    public static final String JC_SUCCESS = "200";
    public static final String JM_SUCCESS = "Success";
    
    /* 예외상황 */
    public static final String JC_FAIL_INPUT_EMPTY = "410";
    public static final String JM_FAIL_INPUT_EMPTY = "Input empty";
    public static final String JC_FAIL_UPDATE_FAIL = "510";
    public static final String JM_FAIL_UPDATE_FAIL = "Update Fail";
    public static final String JC_FAIL_INSERT_FAIL = "610";
    public static final String JM_FAIL_INSERT_FAIL = "Insert Fail";
    
    public static final String JC_ERROR_SYSTEM = "-100";
    public static final String JM_ERROR_SYSTEM = "System error";
    public static final String JC_NO_MATCHED = "-200";
    public static final String JM_NO_MATCHED = "No matched";
    
    public JsonResultCode() {
    }
}
