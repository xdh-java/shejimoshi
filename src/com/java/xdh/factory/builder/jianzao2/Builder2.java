package com.java.xdh.factory.builder.jianzao2;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 20:13
 * @description 这是我的代码风格
 */
public abstract class Builder2 {
    abstract Builder2 builderA(String msg);
    abstract Builder2 builderB(String msg);
    abstract Builder2 builderC(String msg);
    abstract Builder2 builderD(String msg);

    abstract ProductInfo2 getProductInfo();

}
