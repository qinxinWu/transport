package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 19:07
 */
//交通工具类
public class Transport {
    private String num;//编号
    private String department;//隶属于那个部门
    private int warrantyPeriod;//保修年限（单位：年）
    private int speed;//速度（单位：km/h）
    private int passengerCapacity;//载客量（单位：人，与座位数等同）
    private int loadingCapacity;//载货量（单位：吨）
    private String from;//出发地
    private String to;//目的地
    private String driver;//驾驶者名字
    private boolean state;//使用状态（true:正在使用中 false：当前未使用）

    public Transport() {
    }

    public Transport(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state) {
        this.num = num;
        this.department = department;
        this.warrantyPeriod = warrantyPeriod;
        this.speed = speed;
        this.passengerCapacity = passengerCapacity;
        this.loadingCapacity = loadingCapacity;
        this.from = from;
        this.to = to;
        this.driver = driver;
        this.state = state;
    }

    /*对于运输公司而言，我认为运输工具主要的功能就三个：行驶，装货，卸货。因此我也就在运输工具基类里定义了这三个基本方法，设置了空实现。
    * 子类里再重写这三个方法，具体化这三个方法的内容，并可构成多态。
    */

    //行驶
    public void move(){}
    //装货
    public void load(){}
    //卸货
    public void unload(){}



    public String getNum() {
        return num;
    }

    public String getDepartment() {
        return department;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public int getLoadingCapacity() {
        return loadingCapacity;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getDriver() {
        return driver;
    }

    public boolean isState() {
        return state;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public void setLoadingCapacity(int loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
