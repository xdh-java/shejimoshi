package com.java.xdh.factory.builder.demo2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 17:07
 * @description 这是我的代码风格
 */
public class Worker extends Builder{

    private Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    Builder builderA(String msg) {

        product.setBuilderA(msg);
        return this;
    }

    @Override
    Builder builderB(String msg) {
        product.setBuilderB(msg);
        return this;
    }

    @Override
    Builder builderC(String msg) {
        product.setBuilderC(msg);
        return this;
    }

    @Override
    Builder builderD(String msg) {
        product.setBuilderD(msg);
        return this;
    }

    @Override
    Product getProduct() {
        return product;
    }
}
