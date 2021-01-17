package com.java.xdh.factory.builder.jianzao;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 19:40
 * @description 这是我的代码风格
 */
public abstract class Builder {

    abstract void BuilderA();//地基
    abstract void BuilderB();//钢筋
    abstract void BuilderC();//水泥
    abstract void BuiledrD();//地板

    abstract Product getProduct();//得到产品的方法


}
