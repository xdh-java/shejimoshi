package com.java.xdh.factory.abstract1;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
//手机产品接口
public interface IphoneProduct {

    //开机
    void start();
    //关机
    void shutdown();
    //打电话
    void callup();
    //发短信
    void sendSMS();
}
