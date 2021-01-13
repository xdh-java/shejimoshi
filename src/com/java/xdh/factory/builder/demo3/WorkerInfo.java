package com.java.xdh.factory.builder.demo3;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 18:16
 * @description 这是我的代码风格
 */
public class WorkerInfo extends BuilderDemo3{

   private ProductInfo productInfo;

    public WorkerInfo() {
        productInfo = new ProductInfo();
    }

    @Override
    BuilderDemo3 builderA(String msg) {
        productInfo.setBuilderA(msg);
        return this;
    }

    @Override
    BuilderDemo3 builderB(String msg) {
        productInfo.setBuilderB(msg);
        return this;
    }

    @Override
    BuilderDemo3 builderC(String msg) {
        productInfo.setBuilderC(msg);
        return this;
    }

    @Override
    BuilderDemo3 builderD(String msg) {
        productInfo.setBuilderD(msg);
        return this;
    }

    @Override
    ProductInfo getProductInfo() {
        return productInfo;
    }


}
