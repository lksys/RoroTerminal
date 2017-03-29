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
    @RequestMapping("/object_floor_Info")
    public BaseVO getRoroFloorInfo(@Valid YardVO params, BindingResult result){
        if (result.hasErrors()) {
            setValidationFailed();
        }

        YardVO yardVO = new YardVO();
        yardVO.setResult(setSuccess());
        yardVO = roroFloorService.getRoroFloorInfo();
        return yardVO;
    }

    @RequestMapping("/apitest")
    public Map<String,Object> apiTest(){

        Map<String,Object> map = new LinkedMap();

        map.put("state",setSuccess());

        CarVO carVO = new CarVO();
        carVO.setCarId(1);
        carVO.setCarType("small");
        carVO.setCarName("sonata");
        carVO.setCarInfo("sonata CarInfo");
        map.put("data",carVO);
        //git test
        return map;
    }
}
