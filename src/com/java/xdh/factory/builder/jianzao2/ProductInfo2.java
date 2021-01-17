package com.java.xdh.factory.builder.jianzao2;

import java.util.Arrays;

/**
 * @author 薛登辉
 * @time 2021/1/17 0017 20:14
 * @description 这是我的代码风格
 */
public class ProductInfo2 {

    private String builderA = "汉堡";
    private String builderB = "薯条";
    private String builderC = "可乐";
    private String builderD = "炸鸡";

    public String getBuilderA() {
        return builderA;
    }

    public void setBuilderA(String builderA) {
        this.builderA = builderA;
    }

    public String getBuilderB() {
        return builderB;
    }

    public void setBuilderB(String builderB) {
        this.builderB = builderB;
    }

    public String getBuilderC() {
        return builderC;
    }

    public void setBuilderC(String builderC) {
        this.builderC = builderC;
    }

    public String getBuilderD() {
        return builderD;
    }

    public void setBuilderD(String builderD) {
        this.builderD = builderD;
    }

    @Override
    public String toString() {
        return "ProductInfo2{" +
                "builderA='" + builderA + '\'' +
                ", builderB='" + builderB + '\'' +
                ", builderC='" + builderC + '\'' +
                ", builderD='" + builderD + '\'' +
                '}';
    }
}
