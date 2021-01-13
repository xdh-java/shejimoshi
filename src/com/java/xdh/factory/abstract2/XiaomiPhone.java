package com.java.xdh.factory.abstract2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 15:24
 * @description 这是我的代码风格
 */
public class XiaomiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void SendMessage() {
        System.out.println("小米手机发送短信");
    }

    @Override
    public void callUp() {
        System.out.println("小米手机打电话");
    }
}
