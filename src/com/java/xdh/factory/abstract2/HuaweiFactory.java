package com.java.xdh.factory.abstract2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 15:32
 * @description 这是我的代码风格
 */
public class HuaweiFactory implements IProductFactory{
    @Override
    public IPhoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new HuaweiRouter();
    }
}
