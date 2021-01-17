package com.java.xdh.factory.builder.jianzao;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 19:51
 * @description 这是我的代码风格
 */
public class TestDemo {

    public static void main(String[] args) {

        DirectorProduct directorProduct = new DirectorProduct();
        Product products = directorProduct.builder(new WorkerProduct());
        
        System.out.println("products:"+products);

    }
}
