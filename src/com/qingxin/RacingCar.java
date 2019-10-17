package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 20:20
 */
//赛车类
public class RacingCar extends Vehicle {
    private int maxEnginePower;//引擎最大功率（单位是：马力）

    public RacingCar() {
    }

    public RacingCar(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int wheels, String vNumber, int maxEnginePower) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state, wheels, vNumber);
        this.maxEnginePower = maxEnginePower;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("赛车飞速行驶");
    }



    public int getMaxEnginePower() {
        return maxEnginePower;
    }

    public void setMaxEnginePower(int maxEnginePower) {
        this.maxEnginePower = maxEnginePower;
    }
}
