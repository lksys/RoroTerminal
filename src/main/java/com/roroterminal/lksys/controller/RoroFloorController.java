package com.roroterminal.lksys.controller;

import com.roroterminal.lksys.params.BaseVO;
import com.roroterminal.lksys.params.CarVO;
import com.roroterminal.lksys.params.YardVO;
import com.roroterminal.lksys.service.RoroFloorService;
import org.apache.commons.collections.map.LinkedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by kimha on 2017-03-27.
 */
@RestController
@RequestMapping(value="/v1/roroFloor")
public class RoroFloorController extends BaseController{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private RoroFloorService roroFloorService;
    @RequestMapping("/Object_Floor_Info")
    public Map<String,Object> getRoroFloorInfo(@Valid YardVO params, BindingResult result){
        if (result.hasErrors()) {
            setValidationFailed();
        }
        Map<String,Object> map = new LinkedMap();
        map.put("state",setSuccess("YardInfo"));

        YardVO yardVO = new YardVO();
        yardVO = roroFloorService.getRoroFloorInfo();
        map.put("data",yardVO);
        return map;
    }
}
