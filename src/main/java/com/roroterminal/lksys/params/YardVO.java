package com.roroterminal.lksys.params;

/**
 * Created by kimha on 2017-03-27.
 */
public class YardVO extends BaseVO{
    private int YardId;
    private String YardName;
    private String YardInfo;

    public int getYardId() {
        return YardId;
    }

    public void setYardId(int yardId) {
        YardId = yardId;
    }

    public String getYardName() {
        return YardName;
    }

    public void setYardName(String yardName) {
        YardName = yardName;
    }

    public String getYardInfo() {
        return YardInfo;
    }

    public void setYardInfo(String yardInfo) {
        YardInfo = yardInfo;
    }
}
