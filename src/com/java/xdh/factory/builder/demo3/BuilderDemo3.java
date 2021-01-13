package com.java.xdh.factory.builder.demo3;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 18:06
 * @description 这是我的代码风格
 */
public abstract class  BuilderDemo3 {
    //这个类是材料

    abstract BuilderDemo3 builderA(String msg);
    abstract BuilderDemo3 builderB(String msg);
    abstract BuilderDemo3 builderC(String msg);
    abstract BuilderDemo3 builderD(String msg);
    //生产出来产品
    abstract ProductInfo getProductInfo();

}
