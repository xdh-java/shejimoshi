package com.java.xdh.factory.abstract2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 15:33
 * @description 这是我的代码风格
 */
public class Consumer {
    public static void main(String[] args) {

        System.out.println("=====================华为产品=====================");
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IPhoneProduct iPhoneProduct = huaweiFactory.iphoneProduct();
        IRouterProduct iRouterProduct = huaweiFactory.irouterProduct();

        iPhoneProduct.callUp();
        iPhoneProduct.SendMessage();
        iRouterProduct.closeRouter();
        iRouterProduct.settingWifi();
        System.out.println("=====================小米产品=====================");
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IPhoneProduct iPhoneProduct1= xiaomiFactory.iphoneProduct();
        iPhoneProduct1.SendMessage();

    }
}
