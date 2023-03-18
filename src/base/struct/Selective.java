package base.struct;

import java.util.Scanner;

public class Selective {
    public static void main(String[] args) {
        //if单选
        Scanner s1 = new Scanner(System.in);

        System.out.println("字符匹配：");
        String s = s1.nextLine();
        if (s.equals("hello")) {//equals判断字符串是否相等
            System.out.println(s);
        }
        System.out.println("===================================");

        //if双选
        System.out.println("输入成绩");
        int score= s1.nextInt();
        if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }
        System.out.println("清空scanner:"+s1.nextLine());
        System.out.println("===================================");


        //if多选      else if(){}
        System.out.println("输入成绩——多选择");
        int test=s1.nextInt();
        if(test==1){
            System.out.println("满分");
        }else if(test<100 && test>=90){
            System.out.println("A级");
        }else if(test<90 && test>=80){
            System.out.println("B级");
        }else if(test<80 && test>=60){
            System.out.println("C级");
        } else if (test >= 0 && test < 60) {
            System.out.println("不及格");
        }else System.out.println("不合法");

        System.out.println("清空scanner:"+s1.nextLine());
        System.out.println("===================================");


        //嵌套if
        System.out.println("嵌套if");
        int a= s1.nextInt();
        if(a>=0){
            if(a<=10) System.out.println("数在0~10;");
        }


        System.out.println("清空scanner"+s1.nextLine());
        System.out.println("===================================");

        //switch多选择结构
        System.out.println("Switch的char——C");
        char grade ='C';
        switch (grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
        }
        System.out.println("===================================");


        System.out.println("Switch的string——选择英雄");
        String  name = s1.nextLine();
        switch (name){
            case "剑圣":
                System.out.println("剑圣");
                break;
            case "剑豪":
                System.out.println("剑豪");
                break;
            case "剑姬":
                System.out.println("剑姬");
                break;
            default:
                System.out.println("没有该英雄");
        }




        s1.close();



    }
}
