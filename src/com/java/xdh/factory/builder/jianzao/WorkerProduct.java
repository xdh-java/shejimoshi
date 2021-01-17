package com.java.xdh.factory.builder.jianzao;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 19:44
 * @description 这是我的代码风格
 */
public class WorkerProduct extends Builder {


    private Product product;

    public WorkerProduct() {
       product = new Product();
    }

    @Override
    void BuilderA() {
        product.setBuilderA("地基");
        System.out.println(product.getBuilderA());
    }

    @Override
    void BuilderB() {
        product.setBuilderB("钢筋");
        System.out.println(product.getBuilderB());
    }

    @Override
    void BuilderC() {
        product.setBuilderC("水泥");
        System.out.println(product.getBuilderC());
    }

    @Override
    void BuiledrD() {
        product.setBuilderD("地板");
        System.out.println(product.getBuilderD());
    }

    @Override
    Product getProduct() {
        return product;
    }
}
