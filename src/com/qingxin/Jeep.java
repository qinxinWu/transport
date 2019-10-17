package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 20:40
 */
//吉普车
public class Jeep extends Vehicle{
    private int chassisHeight;//底盘高度

    public Jeep() {
    }

    public Jeep(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int wheels, String vNumber, int chassisHeight) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state, wheels, vNumber);
        this.chassisHeight = chassisHeight;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("吉普车行驶");
    }

    //重写装货方法
    @Override
    public void load() {
        System.out.println("吉普车装货");
    }

    //重写卸货方法
    @Override
    public void unload() {
        System.out.println("吉普车卸货");
    }

    public int getChassisHeight() {
        return chassisHeight;
    }

    public void setChassisHeight(int chassisHeight) {
        this.chassisHeight = chassisHeight;
    }
}
