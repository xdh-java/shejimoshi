package com.java.xdh.factory.prototype.demo2;
import com.java.xdh.factory.prototype.demo1.Video;

import java.util.Date;


/**
 * @author 薛登辉
 * @time 2021/1/22 0022 20:39
 * @description 这是我的代码风格
 */
public class VideoDeep implements Cloneable{
    private String name;
    private Date date;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //实现克隆，序列化，反序列化
        Object obj = super.clone();
        VideoDeep v = (VideoDeep) obj;
        //克隆date对象属性
         v.date = (Date) this.date.clone();

        return obj;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "VideoDeep{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public VideoDeep(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public VideoDeep() {

    }
}
