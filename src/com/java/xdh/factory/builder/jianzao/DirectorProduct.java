package com.java.xdh.factory.builder.jianzao;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 19:48
 * @description 这是我的代码风格
 */
public class DirectorProduct {

    public Product builder(Builder builder){

        builder.BuilderB();
        builder.BuilderA();
        builder.BuilderC();
        builder.BuiledrD();

        return builder.getProduct();
    }
}
