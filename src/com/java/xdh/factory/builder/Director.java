package com.java.xdh.factory.builder;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 16:25
 * @description 这是我的代码风格
 */
public class Director {
    //这是第四个，指挥者去指挥工人建造完成。

    public Product build(Builder builder){
        builder.builderA();
        builder.builderB();
        builder.builderC();
        builder.builderD();
        return builder.getProduct();
    }
}
