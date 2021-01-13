package com.java.xdh.factory.builder.demo2;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 17:12
 * @description 这是我的代码风格
 */
public class TestDemo {
    public static void main(String[] args) {
        Worker worker = new Worker();
        Product product = worker.getProduct();
        System.out.println(product);
        Product product1 = worker.builderA("鸡腿堡").builderB("土豆条").getProduct();
        Product builder = worker.builderB("牛肉拉丝").getProduct();
        System.out.println(product1);
        System.out.println(builder);

    }
}
