package com.roroterminal.lksys.params;

import com.roroterminal.lksys.common.JsonResultCode;

/**
 *  File Name : BaseResultVO.java
 *  Description : API의 리턴인 경우 result_msg를 포함한 Json을 리턴
 *  Author  : kimhak
 *  Date    : 2017.03.27
 */
public class BaseResultVO extends BaseVO{
	private ResultVO result_msg;

	public ResultVO getResult_msg() {
		return result_msg;
	}
	public void setResult_msg(ResultVO result_msg) {
		this.result_msg = result_msg;
	}
	
	public BaseResultVO(){
		this.result_msg = new ResultVO(JsonResultCode.JC_SUCCESS, JsonResultCode.JM_SUCCESS);
	}
	
	/*public BaseResultVO(String code, String msg){
		super(JsonResultCode.JC_SUCCESS, JsonResultCode.JM_SUCCESS);
		this.result_msg = new ResultVO(code, msg); 
	}*/
	
	public void setResult(BaseResultVO resultVO) {
		super.setCode(resultVO.getCode());
		super.setMsg(resultVO.getMsg());
		this.setResult_msg(resultVO.getResult_msg()); 
	}
	
}
