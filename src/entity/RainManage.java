package entity;

import java.io.Serializable;
import java.util.Date;

public class RainManage implements Serializable {
    private int id;//序号
    private String districtName;//区域名称
    private Date monitorTime;//监测时间
    private int rain;//雨量值
    private String monitoringStation;//监测站
    private String monitoringAddress;//站点地址

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public Date getMonitorTime() {
        return monitorTime;
    }

    public void setMonitorTime(Date monitorTime) {
        this.monitorTime = monitorTime;
    }

    public int getRain() {
        return rain;
    }

    public void setRain(int rain) {
        this.rain = rain;
    }

    public String getMonitoringStation() {
        return monitoringStation;
    }

    public void setMonitoringStation(String monitoringStation) {
        this.monitoringStation = monitoringStation;
    }

    public String getMonitoringAddress() {
        return monitoringAddress;
    }

    public void setMonitoringAddress(String monitoringAddress) {
        this.monitoringAddress = monitoringAddress;
    }

    public RainManage() {
        this.id = id;
        this.districtName = districtName;
        this.monitorTime = monitorTime;
        this.rain = rain;
        this.monitoringStation = monitoringStation;
        this.monitoringAddress = monitoringAddress;
    }
}
