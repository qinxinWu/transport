package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 19:28
 */
//飞行器类
public class Aerocraft extends Transport {
    private int engine;//发动机的个数
    private int height;//飞行高度

    public Aerocraft() {
    }

    public Aerocraft(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int engine, int height) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state);
        this.engine = engine;
        this.height = height;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("飞行器飞行");
    }


    public int getEngine() {
        return engine;
    }

    public void setEngine(int engine) {
        this.engine = engine;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
