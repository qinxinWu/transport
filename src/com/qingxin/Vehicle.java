package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 19:27
 */
//车类
public class Vehicle extends Transport {
    private int wheels;//轮胎数
    private String vNumber;//车牌号

    public Vehicle() {
    }

    public Vehicle(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int wheels,  String vNumber) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state);
        this.wheels = wheels;
        this.vNumber = vNumber;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("车行驶");
    }



    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }


    public String getvNumber() {
        return vNumber;
    }

    public void setvNumber(String vNumber) {
        this.vNumber = vNumber;
    }
}
