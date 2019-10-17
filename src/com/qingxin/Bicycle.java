package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 20:29
 */
//自行车类
public class Bicycle extends Vehicle{

    public Bicycle() {
    }

    public Bicycle(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int wheels, String vNumber) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state, wheels, vNumber);
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("自行车行驶");
    }

    //重写装货方法
    @Override
    public void load() {
        System.out.println("自行车装货");
    }

    //重写卸货方法
    @Override
    public void unload() {
        System.out.println("自行车卸货");
    }
}
