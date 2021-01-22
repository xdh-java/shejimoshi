package com.java.xdh.factory.prototype.demo2;

import java.util.Date;

/**
 * @author 薛登辉
 * @time 2021/1/22 0022 20:43
 * @description 这是我的代码风格
 */
public class BiliBiliDeep {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        VideoDeep video1 = new VideoDeep("name",date);
        VideoDeep video2 = (VideoDeep) video1.clone();
        System.out.println("=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>");
        System.out.println(video1+"\t"+video1.hashCode());
        System.out.println(video2+"\t"+video2.hashCode());
        //修改日期时间
        date.setTime(111111);


        //那这里的意思就是说，video1就变了，但是我video2是不变的。
       System.out.println("=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>");
        System.out.println(video1+"\t"+video1.hashCode());
        System.out.println(video2+"\t"+video2.hashCode());
        System.out.println("=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>");




    }
}
