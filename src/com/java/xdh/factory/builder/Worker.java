package com.java.xdh.factory.builder;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 16:18
 * @description 这是我的代码风格
 */
//工人来建造这个产品
    //这是第三个工人自己去创建产品
public class Worker extends Builder{

    private Product product;


    //由工人自己去创建出来的产品
    public Worker() {
        product = new Product();
    }

    @Override
    protected void builderA() {
        product.setBuilderA("地基");
        System.out.println(product.getBuilderA());
    }

    @Override
    void builderB() {
        product.setBuilderB("钢筋工程");
        System.out.println(product.getBuilderB());

    }

    @Override
    void builderC() {
        product.setBuilderC("铺电线");
        System.out.println(product.getBuilderC());
    }

    @Override
    void builderD() {
        product.setBuilderD("粉刷");
        System.out.println(product.getBuilderD());
    }

    @Override
    Product getProduct() {
        return product;
    }
}
