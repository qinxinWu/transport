package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 20:44
 */
//游轮类
public class Cruise extends Ship {
    private int windbreakGrade;//防风等级

    public Cruise() {
    }

    public Cruise(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int tonnage, int layers, int windbreakGrade) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state, tonnage, layers);
        this.windbreakGrade = windbreakGrade;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("游轮航行");
    }

    //重写装货方法
    @Override
    public void load() {
        System.out.println("游轮装货");
    }

    //重写卸货方法
    @Override
    public void unload() {
        System.out.println("游轮卸货");
    }

    public int getWindbreakGrade() {
        return windbreakGrade;
    }

    public void setWindbreakGrade(int windbreakGrade) {
        this.windbreakGrade = windbreakGrade;
    }
}
