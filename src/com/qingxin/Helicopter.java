package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 20:56
 */
//直升机类
public class Helicopter extends Aerocraft {
    private int pNumber;//螺旋桨的个数

    public Helicopter() {
    }

    public Helicopter(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int engine, int height, int pNumber) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state, engine, height);
        this.pNumber = pNumber;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("直升机飞行");
    }

    //重写装货方法
    @Override
    public void load() {
        System.out.println("直升机装货");
    }

    //重写卸货方法
    @Override
    public void unload() {
        System.out.println("直升机卸货");
    }


    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }
}
