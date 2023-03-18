package base.homework;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,c;
        String   b;
        String  i;
        boolean flag=true;
        while(flag){
            if(scanner.hasNextFloat()) {
                a=scanner.nextFloat();
                b=scanner.next();
                c=scanner.nextFloat();
                System.out.println("out :"+calculate(a,b,c));
            }
            System.out.println("是否继续：y/n");
            i=scanner.next();
            if(i=="y")flag=true;
            else flag=false;
        }


        scanner.close();
    }

    public static double calculate(double a,String b,double c){
        switch (b) {
            case "+":
                return a + c;
            case "-":
                return a - c;
            case "*":
                return a * c;
            case "/":
                if(c==0) {System.out.println("除数为0");
                            break;}
                else return a / c;
            case "^":
                if(c==0) return 1;
                else return Math.pow(a,c);
            case "%":
                if(a*c==0) {System.out.println("输入不合法");
                break;}
                else return a % c;
            default:
                System.out.println("输入不合法");

        }
        return 0;
    }


}


