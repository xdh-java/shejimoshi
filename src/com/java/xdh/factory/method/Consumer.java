package com.java.xdh.factory.method;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
public class Consumer {
    public static void main(String[] args) {

        Car car1 = new TesLaFactory().getCar();
        Car car2 = new WuLingFactory().getCar();
        car1.name();
        car2.name();
        Car car3 = new MoBaiFactory().getCar();
        car3.name();
    }
}
