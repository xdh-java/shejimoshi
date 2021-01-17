package com.java.xdh.factory.builder.jianzao2;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 20:27
 * @description 这是我的代码风格
 */
public class TestBuilder2 {

    public static void main(String[] args) {
        Work work = new Work();
        ProductInfo2 productInfo1 = work.getProductInfo();
        System.out.println(productInfo1);
        String builderA = work.getProductInfo().getBuilderA();
        System.out.println(builderA);
        ProductInfo2 productInfo = work.builderA("包子").getProductInfo();
        System.out.println(productInfo);
    }
}
