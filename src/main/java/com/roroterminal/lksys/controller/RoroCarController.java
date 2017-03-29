package com.roroterminal.lksys.controller;

import com.roroterminal.lksys.params.CarListVO;
import com.roroterminal.lksys.params.CarVO;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * Created by kimha on 2017-03-28.
 */
@RestController
@RequestMapping(value = "/v1/roroCar")
public class RoroCarController extends BaseController{

    public CarListVO getCarList(@Valid CarVO carVO, BindingResult result) throws Exception{
        if(result.hasErrors()){
            setValidationFailed();
        }

        CarListVO carListVO = new CarListVO();
        carListVO.setResult(setSuccess());
        carListVO.setCar_cnt("1000");
        
        return null;
    }

}


