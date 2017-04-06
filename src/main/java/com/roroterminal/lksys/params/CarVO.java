package com.roroterminal.lksys.params;

/**
 * Program :  com.roroterminal.lksys
 * Description : 야드 자동차 도메인
 * Author  :  kimhak
 * Date    :  2017. 03. 28.
 */
public class CarVO{
    private int carId;
    private String carName;
    private String fbxInfo;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getFbxInfo() {
        return fbxInfo;
    }

    public void setFbxInfo(String fbxInfo) {
        this.fbxInfo = fbxInfo;
    }
}
