package com.java.xdh.factory.abstract2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 15:26
 * @description 这是我的代码风格
 */
public class HuaweiPhone implements IPhoneProduct{
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    @Override
    public void SendMessage() {
        System.out.println("华为手机发送信息");
    }

    @Override
    public void callUp() {
        System.out.println("华为手机打电话");
    }
}
