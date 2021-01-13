package com.java.xdh.factory.simple;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
public class Consumer {
    public static void main(String[] args) {


        /**
         * 常用方法
         */
     /*
        Car car1 = new TesLa();
        Car car2 = new WuLing();
        car1.name();
        car2.name();
        */
        /**
         * 静态工厂模式(也叫简单工厂模式)
         */
        /**
         *
        Car car1 = CarFactory.getCar("五菱");
        Car car2 = CarFactory.getCar("特斯拉");
        Car car3 = CarFactory.getCar("摩拜单车");
        car1.name();
        car2.name();
        car3.name();
        */
        //自定义实现方法

        Car wuLing = CarFactory.getWuLing();
        Car moBai = CarFactory.getMoBai();
        Car testLa = CarFactory.getTestLa();

        wuLing.name();
        moBai.name();
        testLa.name();


    }
}
