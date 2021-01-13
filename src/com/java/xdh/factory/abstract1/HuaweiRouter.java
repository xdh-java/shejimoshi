package com.java.xdh.factory.abstract1;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
public class HuaweiRouter implements IRouterProduct{
    @Override
    public void start() {
        System.out.println("华为路由器开启");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关闭");
    }

    @Override
    public void openWifi() {
        System.out.println("华为路由器wifi设置");
    }

    @Override
    public void settings() {
        System.out.println("华为路由器设置");
    }
}
