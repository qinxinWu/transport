package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 20:59
 */
//航天飞机类
public class SpaceShuttle extends Aerocraft {
    private int flyDuration;//一次飞行续航时间

    public SpaceShuttle() {
    }

    public SpaceShuttle(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int engine, int height, int flyDuration) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state, engine, height);
        this.flyDuration = flyDuration;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("航天飞机发射");
    }

    //重写装货方法
    @Override
    public void load() {
        System.out.println("航天飞机装货");
    }

    //重写卸货方法
    @Override
    public void unload() {
        System.out.println("航天飞机卸货");
    }

    public int getFlyDuration() {
        return flyDuration;
    }

    public void setFlyDuration(int flyDuration) {
        this.flyDuration = flyDuration;
    }
}
