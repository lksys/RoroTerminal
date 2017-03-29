package com.roroterminal.lksys.controller;

import com.roroterminal.lksys.common.JsonResultCode;
import com.roroterminal.lksys.exception.ValidationFailedException;
import com.roroterminal.lksys.params.BaseResultVO;
import com.roroterminal.lksys.params.BaseVO;

/**
 * Created by kimha on 2017-03-27.
 */
public class BaseController {
    public BaseVO setSuccess() {
        return new BaseVO(JsonResultCode.JC_SUCCESS, JsonResultCode.JM_SUCCESS);
    }

    public BaseVO setValidationFailed() {
        throw new ValidationFailedException();
    }

    /**
     * result_msg에 code 및 message 세팅
     * @param code
     * @param msg
     * @return
     */
    public BaseResultVO setResultCode(String code, String msg){
        return new BaseResultVO(code, msg);
    }

    /**
     * result_msg에 message 세팅 (code : 200)
     * @param msg
     * @return
     */
    public BaseResultVO setSuccess(String msg) {
        return new BaseResultVO(JsonResultCode.JC_SUCCESS, msg);
    }
}
