package oop.Demo02;

/**
 * @version: java version 1.8
 * @Author: Tao
 * @description:
 * @date: 2022-10-28 17:39
 */


public class Pet {
    public String  name;
    public int age;

    public void shout(){
        System.out.println("叫一声");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
