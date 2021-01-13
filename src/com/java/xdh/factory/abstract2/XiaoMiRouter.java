package com.java.xdh.factory.abstract2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 15:25
 * @description 这是我的代码风格
 */
public class XiaoMiRouter implements IRouterProduct{
    @Override
    public void starterRouter() {
        System.out.println("小米路由器开启");
    }

    @Override
    public void closeRouter() {
        System.out.println("小米路由器关闭");
    }

    @Override
    public void settingWifi() {
        System.out.println("小米wifi设置");
    }

    @Override
    public void show() {
        System.out.println("小米路由器显示");
    }
}
