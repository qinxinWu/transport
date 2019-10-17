package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 20:37
 */
//货车类
public class Lorry extends Vehicle{
    private String categoryOfGoods;//货物类别

    public Lorry() {
    }

    public Lorry(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int wheels, String vNumber, String categoryOfGoods) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state, wheels, vNumber);
        this.categoryOfGoods = categoryOfGoods;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("货车行驶");
    }

    //重写装货方法
    @Override
    public void load() {
        System.out.println("货车装货");
    }

    //重写卸货方法
    @Override
    public void unload() {
        System.out.println("货车卸货");
    }

    public String getCategoryOfGoods() {
        return categoryOfGoods;
    }

    public void setCategoryOfGoods(String categoryOfGoods) {
        this.categoryOfGoods = categoryOfGoods;
    }
}
