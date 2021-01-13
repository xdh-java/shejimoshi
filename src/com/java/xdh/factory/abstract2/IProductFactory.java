package com.java.xdh.factory.abstract2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 15:28
 * @description 这是我的代码风格
 */

//接口的接口封装
//抽象工厂
public interface IProductFactory {

    IPhoneProduct iphoneProduct();
    IRouterProduct irouterProduct();
}
