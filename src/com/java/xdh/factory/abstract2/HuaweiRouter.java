package com.java.xdh.factory.abstract2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 15:27
 * @description 这是我的代码风格
 */
public class HuaweiRouter implements IRouterProduct{
    @Override
    public void starterRouter() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void closeRouter() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void settingWifi() {
        System.out.println("华为路由器设置wifi");
    }

    @Override
    public void show() {
        System.out.println("华为路由器显示");
    }
}
