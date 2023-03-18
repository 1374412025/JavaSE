package base.array;

import oop.Demo03.Person;

public class InitializeArray {//初始化，声明
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};//静态初始化
        Person[] person = {new Person(), new Person()};//静态初始化

        int[] arrayVar = new int[4];//动态初始化
//        int[] arrayVar2;
//        arrayVar2=new int[10];
        System.out.println(nums[2]);//3
        System.out.println(arrayVar[1]);//0

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");//1 2 3
        }
        System.out.println();//换行
        System.out.println(person[0].getName());//null

    }
}
