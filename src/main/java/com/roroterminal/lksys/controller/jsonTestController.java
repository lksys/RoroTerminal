package com.roroterminal.lksys.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;

/**
 * Created by kimha on 2017-03-28.
 */
public class jsonTestController {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String str = "[{FBXHeaderVersion: '1003',FBXVersion: '7300',CreationTimeStamp: '123'}]" ;  // 一个未转化的字符串

        JSONArray json = JSONArray.fromObject(str); // 首先把字符串转成 JSONArray  对象

        if(json.size()>0){
            for(int i=0;i<json.size();i++){
                JSONObject job = json.getJSONObject(i);  // 遍历 jsonarray 数组，把每一个对象转成 json 对象
                System.out.println(job) ;  // 得到 每个对象中的属性值
            }
        }
    }


}
