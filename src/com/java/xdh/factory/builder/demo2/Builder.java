package com.java.xdh.factory.builder.demo2;
/**
 * @author 薛登辉
 * @time 2021/1/13 0013 17:03
 * @description 这是我的代码风格
 */
//这个是建造者
public  abstract class Builder {

    abstract Builder builderA(String msg);
    abstract Builder builderB(String msg);
    abstract Builder builderC(String msg);
    abstract Builder builderD(String msg);

    abstract Product getProduct();

}
