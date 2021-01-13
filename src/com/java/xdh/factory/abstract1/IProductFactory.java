package com.java.xdh.factory.abstract1;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
//抽象产品工厂(抽象的抽象)
public interface IProductFactory {
    //生产手机
    IphoneProduct iphoneProduct();
    //生产路由器();
    IRouterProduct irouterProduct();

}
