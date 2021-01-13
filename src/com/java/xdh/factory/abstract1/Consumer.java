package com.java.xdh.factory.abstract1;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
public class Consumer {
    public static void main(String[] args) {

        System.out.println("=========================小米系列产品=========================");

        XiaomiFactroy xiaomiFactroy = new XiaomiFactroy();
        IphoneProduct iphoneProduct = xiaomiFactroy.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.start();
        iphoneProduct.sendSMS();

        IRouterProduct iRouterProduct = xiaomiFactroy.ipouterProduct();
        iRouterProduct.openWifi();
        iRouterProduct.settings();

        System.out.println("=========================华为系列产品=========================");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct iphoneProduct1 = huaweiFactory.iphoneProduct();
        iphoneProduct1.sendSMS();
        iphoneProduct1.callup();
        IRouterProduct iRouterProduct1 = huaweiFactory.ipouterProduct();
        iRouterProduct1.settings();
        iRouterProduct1.openWifi();


    }
}

