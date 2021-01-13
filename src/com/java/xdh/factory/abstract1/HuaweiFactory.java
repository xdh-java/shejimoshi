package com.java.xdh.factory.abstract1;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
public class HuaweiFactory implements IProductFactory{

    @Override
    public IphoneProduct iphoneProduct() {
        return null;
    }

    @Override
    public IRouterProduct irouterProduct() {
        return null;
    }
}
