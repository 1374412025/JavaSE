package oop.Demo06;


/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-11-01 16:13
 */


public class Demo06 {//instanceof

    public static void main(String[] args) {
/*
Object>String
Object>Person>Student
Object>Person>Teacher
 */
        Object object = new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false

        Person pe = new Student();
        System.out.println(pe instanceof Student);;//true
        System.out.println(pe instanceof Person);;//true
        System.out.println(pe instanceof Object);;//true
        System.out.println(pe instanceof Teacher);;//false
        //System.out.println(pe instanceof String);;//报错
        //编译报错1，因为pe和String不在一个继承树上

        Student st = new Student();
        System.out.println(st instanceof Student);;//true
        System.out.println(st instanceof Person);;//true
        System.out.println(st instanceof Object);;//true
        //System.out.println(st instanceof Teacher);;//
        //System.out.println(st instanceof String);;//
        //编译报错1，因为pe和String不在一个继承树上

    }
}
