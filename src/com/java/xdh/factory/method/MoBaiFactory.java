package com.java.xdh.factory.method;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
public class MoBaiFactory implements CarFactory {
    @Override
    public Car getCar() {
        return new MoBai();
    }
}
