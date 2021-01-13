package com.java.xdh.factory.method;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
public class WuLing implements Car{
    @Override
    public void name() {
        System.out.println("这是工厂方法实现的:五菱神车");
    }
}
