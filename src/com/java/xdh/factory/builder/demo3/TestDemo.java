package com.java.xdh.factory.builder.demo3;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 18:22
 * @description 这是我的代码风格
 */
public class TestDemo {
    public static void main(String[] args) {
        WorkerInfo workerInfo = new WorkerInfo();
        ProductInfo productInfo = workerInfo.getProductInfo();
        System.out.println(productInfo);
        String builderA = workerInfo.getProductInfo().getBuilderA();
        String builderB = workerInfo.getProductInfo().getBuilderB();
        ProductInfo productInfo1 = workerInfo.builderC("鸡米花").getProductInfo();
        System.out.println(builderA);
        System.out.println(builderB);
        System.out.println(productInfo1);

    }
}
