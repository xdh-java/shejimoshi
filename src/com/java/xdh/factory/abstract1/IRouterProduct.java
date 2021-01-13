package com.java.xdh.factory.abstract1;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
public interface IRouterProduct {
    //开启
    void start();
    //关闭
    void shutdown();
    //打开wifi
    void openWifi();
    //设置
    void settings();
}
