package com.java.xdh.factory.abstract2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 15:30
 * @description 这是我的代码风格
 */
public class XiaomiFactory implements IProductFactory{
    @Override
    public IPhoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct irouterProduct() {
        return new XiaoMiRouter();
    }
}
