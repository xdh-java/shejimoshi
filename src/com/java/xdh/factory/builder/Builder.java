package com.java.xdh.factory.builder;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 16:08
 * @description 这是我的代码风格
 */
//抽象的建造者：方法
//先要创建这个Builder这个类

public abstract class Builder {
        abstract void builderA(); //地基
        abstract void builderB(); //钢筋工程
        abstract void builderC(); //铺电线
        abstract void builderD(); //粉刷
        //完工，得到产品
        abstract Product getProduct();//返回Product这个类

}
