package com.java.xdh.factory.abstract1;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 14:41
 * @description 这是我的代码风格
 */
public class Consumer {
    public static void main(String[] args) {
        System.out.println("=================小米系列产品=================");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.start();
        iphoneProduct.sendSMS();
        iphoneProduct.callup();

        IRouterProduct iRouterProduct = xiaomiFactory.irouterProduct();
        iRouterProduct.openWifi();
        iRouterProduct.settings();
        iRouterProduct.shutdown();
        System.out.println("=================华为系列产品=================");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct iphoneProduct1 = huaweiFactory.iphoneProduct();
        iphoneProduct1.callup();
        iphoneProduct1.sendSMS();
        //华为路由器
        IRouterProduct iRouterProduct1 = huaweiFactory.irouterProduct();
        iRouterProduct1.openWifi();
        iRouterProduct1.settings();

    }




}
