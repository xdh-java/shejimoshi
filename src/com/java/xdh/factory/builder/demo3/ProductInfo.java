package com.java.xdh.factory.builder.demo3;

/**
 * @author 薛登辉
 * @time 2021/1/13 0013 18:08
 * @description 这是我的代码风格
 */
public class ProductInfo {

    private String builderA = "鸡腿";
    private String builderB = "可乐";
    private String builderC = "汉堡";
    private String builderD = "薯条";

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
        return "ProductInfo{" +
                "builderA='" + builderA + '\'' +
                ", builderB='" + builderB + '\'' +
                ", builderC='" + builderC + '\'' +
                ", builderD='" + builderD + '\'' +
                '}';
    }
}
