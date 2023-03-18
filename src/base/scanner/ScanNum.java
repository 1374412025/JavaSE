package base.scanner;

import java.util.Scanner;

public class ScanNum {//输入基本数据类型 int float double
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //输入数据类型
        int i =0;
        float f = 0.02f;
        double d =0.03d;
        System.out.println("输入整数");
        //hasNextInt()
        if (scanner.hasNextInt()) {
            i= scanner.nextInt();
            System.out.println("整数： "+i);
        }else{
            System.out.println(scanner.next()+"输入的不是整数");
            System.out.println("清空scanner:"+scanner.nextLine());

        }

        System.out.println("输入f小数");
        //hasNextFloat()
        if (scanner.hasNextFloat()) {
            f= scanner.nextFloat();
            System.out.println("f小数： "+f);
        }else{
            System.out.println(scanner.next()+" 不是f小数");
            System.out.println("清空scanner:"+scanner.nextLine());

        }
        System.out.println("输入d小数");

        //hasNextDouble()
        if (scanner.hasNextDouble()) {
            d = scanner.nextDouble();
            System.out.println("d小数： "+d);
        }else{
            System.out.println(scanner.next()+" 不是d小数");
            System.out.println("清空scanner:"+scanner.nextLine());

        }

        scanner.close();
    }
}
