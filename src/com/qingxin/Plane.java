package com.qingxin;

import java.util.List;

/**
 * @author qingxin
 * @create 2019-10-09 20:51
 */
//飞机类
public class Plane extends Aerocraft {
    private List<Integer> ticketPrices;//不同类别的机票价格

    public Plane() {
    }

    public Plane(String num, String department, int warrantyPeriod, int speed, int passengerCapacity, int loadingCapacity, String from, String to, String driver, boolean state, int engine, int height, List<Integer> ticketPrices) {
        super(num, department, warrantyPeriod, speed, passengerCapacity, loadingCapacity, from, to, driver, state, engine, height);
        this.ticketPrices = ticketPrices;
    }

    //重写移动方法
    @Override
    public void move() {
        System.out.println("飞机飞行");
    }

    //重写装货方法
    @Override
    public void load() {
        System.out.println("飞机装货");
    }

    //重写卸货方法
    @Override
    public void unload() {
        System.out.println("飞机卸货");
    }

    public List<Integer> getTicketPrices() {
        return ticketPrices;
    }

    public void setTicketPrices(List<Integer> ticketPrices) {
        this.ticketPrices = ticketPrices;
    }
}
