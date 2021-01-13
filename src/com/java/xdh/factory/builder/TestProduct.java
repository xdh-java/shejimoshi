package com.java.xdh.factory.builder;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 16:27
 * @description 这是我的代码风格
 */
public class TestProduct {
    //测试产品的建造。
    public static void main(String[] args) {

        //指挥
        Director director = new Director();
        Product build = director.build(new Worker());
        System.out.println(build);
        Product build1 = director.build(new Worker2());
        System.out.println(build1);

    }
}
