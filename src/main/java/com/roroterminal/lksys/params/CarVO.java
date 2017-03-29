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
    private String carType;
    private String carInfo;

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

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarInfo() {
        return carInfo;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
