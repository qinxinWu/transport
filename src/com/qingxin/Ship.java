package com.qingxin;

/**
 * @author qingxin
 * @create 2019-10-09 19:28
 */
//船类
public class Ship extends Transport{
    private int tonnage;//吨位
    private int layers;//几层

    public Ship() {
    }

    public Ship(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int tonnage, int layers) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state);
        this.tonnage = tonnage;
        this.layers = layers;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("船航行");
    }


    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getLayers() {
        return layers;
    }

    public void setLayers(int layers) {
        this.layers = layers;
    }
}
