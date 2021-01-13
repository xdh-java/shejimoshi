package com.java.xdh.factory.simple;

/**
 * @author 薛登辉
 * @version 1.0
 * @time 2021/1/13 0013
 */
//开闭原则----解释：一个软件实体如类，模块和函数应该对扩展开放，对修改关闭
public class CarFactory {
    //方法一
    public static Car getCar(String car){

        if(car.equals("五菱")){
            return new WuLing();
        }else if(car.equals("特斯拉")){
            return new TesLa();
        }else if(car.equals("摩拜单车")){
            return new MoBai();
        }else {
            return null;
        }

    }
    //获取五菱宏光车辆
    public static Car getWuLing(){
        return new WuLing();
    }
    //获取特斯拉车辆
    public static  Car getTestLa(){
        return new TesLa();
    }
    //获取膜拜单车
    public static Car getMoBai(){
        return  new MoBai();
    }




}
