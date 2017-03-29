package com.roroterminal.lksys.params;

import java.util.List;

/**
 * Program :  com.roroterminal.lksys
 * Description : 야드 자동차 도메인
 * Author  :  kimhak
 * Date    :  2017. 03. 28.
 */
public class CarListVO extends BaseVO {
    private List<CarVO> carVOList;
    private String car_cnt;

    public List<CarVO> getCarVOList() {
        return carVOList;
    }

    public void setCarVOList(List<CarVO> carVOList) {
        this.carVOList = carVOList;
    }

    public String getCar_cnt() {
        return car_cnt;
    }

    public void setCar_cnt(String car_cnt) {
        this.car_cnt = car_cnt;
    }
}
