package com.java.xdh.factory.builder;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 16:50
 * @description 这是我的代码风格
 */
public class Worker2 extends Builder{

    private Product product;

    public Worker2() {
        product = new Product();
    }

    @Override
    void builderA() {
        product.setBuilderA("录取通知书");
        System.out.println(product.getBuilderA());
    }

    @Override
    void builderB() {
        product.setBuilderB("缴纳学费");
        System.out.println(product.getBuilderB());
    }

    @Override
    void builderC() {
        product.setBuilderC("办理学籍");
        System.out.println(product.getBuilderC());
    }

    @Override
    void builderD() {
        product.setBuilderD("入住宿舍");
        System.out.println(product.getBuilderD());
    }

    @Override
    Product getProduct() {
        return product;
    }
}
