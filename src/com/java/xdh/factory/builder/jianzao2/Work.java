package com.java.xdh.factory.builder.jianzao2;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 20:15
 * @description 这是我的代码风格
 */
public class Work extends Builder2{

    private ProductInfo2 productInfo2;

    public Work() {
        productInfo2 = new ProductInfo2();
    }

    @Override
    Builder2 builderA(String msg) {
        this.productInfo2.setBuilderA(msg);
        return this;
    }

    @Override
    Builder2 builderB(String msg) {
        this.productInfo2.setBuilderB(msg);
        return this;
    }

    @Override
    Builder2 builderC(String msg) {
        this.productInfo2.setBuilderC(msg);
        return this;
    }

    @Override
    Builder2 builderD(String msg) {
        this.productInfo2.setBuilderD(msg);
        return this;
    }

    @Override
    ProductInfo2 getProductInfo() {
        return productInfo2;
    }
}
