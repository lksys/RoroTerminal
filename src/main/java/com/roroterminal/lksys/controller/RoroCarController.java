package com.roroterminal.lksys.controller;

import com.roroterminal.lksys.params.CarListVO;
import com.roroterminal.lksys.params.CarVO;
import com.roroterminal.lksys.service.RoroCarService;
import org.apache.commons.collections.map.LinkedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;

/**
 * Created by kimha on 2017-03-28.
 */
@RestController
@RequestMapping(value = "/v1/roroCar")
public class RoroCarController extends BaseController{

    @Autowired
    private RoroCarService roroCarService;

    @RequestMapping("/Object_Car_Info")
    public Map<String,Object> getCarList(@Valid CarVO carVO, BindingResult result) throws Exception{
        if(result.hasErrors()){
            setValidationFailed();
        }
        CarListVO carListVO = new CarListVO();
        List<CarVO> carList = roroCarService.getCarList();
        carListVO.setResult(setSuccess("CarInfo"));
        carListVO.setCarVOList(carList);
        carListVO.setCar_cnt(carList.size()+"");
        Map<String,Object> map = new LinkedMap();
        map.put("state",setSuccess("CarInfo"));
        map.put("data",carListVO);
        return map;
    }

}


