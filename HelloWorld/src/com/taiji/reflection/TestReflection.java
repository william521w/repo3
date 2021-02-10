package com.taiji.reflection;

import charactor.Hero;
import charactor.Hero2;
import charactor.Hero3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {
    /*public static void main(String[] args) {
        String className = "charactor.Hero";
        try {
            Class pClass1=Class.forName(className);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
            //Class pClass2=Hero.class;
            Class pClass3=new Hero().getClass();
    }*/

    /*public static void main(String[] args) {
        //传统new创建对象
        Hero h1 = new Hero();
        h1.name = "teemo";
        System.out.println(h1);

        String className = null;
        try {
            //使用反射创建对象
            className = "charactor.Hero";
            //获取类对象
            Class pClass = Class.forName(className);
            //构造器
            Constructor c = pClass.getConstructor();
            //通过构造器实例化
            Hero h2 = (Hero) c.newInstance();
            h2.name = "gareen";
            System.out.println(h2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


    /*public static void main(String[] args) {
        Hero2 h = new Hero2();
        //传统方式修改名字
        h.name = "gareen";
        try {
            //获取类名字叫做name的字段
            Field f1 = h.getClass().getDeclaredField("name");
            //修改字段值
            f1.set(h, "teemo");
            //打印被修改后的值
            System.out.println(h.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        Hero3 h = new Hero3();
        try {
            //获取名字是setName,参数类型是String的方法
            Method m = h.getClass().getMethod("setName", String.class);
            //对h对象,调用这个方法
            m.invoke(h, "盖伦");
            //传统方式调用getName方法
            System.out.println(h.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
