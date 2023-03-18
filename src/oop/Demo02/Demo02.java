package oop.Demo02;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-10-28 17:41
 */


public class Demo02 {//new内存分析
    public static void main(String[] args) {

        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age = 3;
        dog.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);


    }
}
