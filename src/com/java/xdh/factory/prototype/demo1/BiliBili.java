package com.java.xdh.factory.prototype.demo1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 薛登辉
 * @time 2021/1/22 0022 20:13
 * @description 这是我的代码风格
 */
public class BiliBili {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date();
        Video v1 = new Video("zs",date);
        Video v2 = (Video) v1.clone();
        System.out.println("=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("-------------------------------------");
        date.setTime(22222);
        System.out.println(v1);
        System.out.println(v2);








       /* Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);*/


        /**
         * 测试数据
         *
        Date date = new Date();
        Video video1 = new Video("薛登辉说java",date);

        //v1 克隆v2
        Video video2 = (Video) video1.clone();
        System.out.println("video1:"+video1);
        System.out.println("video1:"+video1.hashCode());
        System.out.println("=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>");
        System.out.println("video2:"+video2);
        System.out.println("video2:"+video2.hashCode());
        System.out.println("=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>=>");
        video2.setName("Clone:薛登辉视屏的人");
        System.out.println("video2:"+video2);

         */


    }
}
