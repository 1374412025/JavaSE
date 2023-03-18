package base.scanner;

import java.util.Scanner;

public class Demo {//输入求和   平均数
    public static void main(String[] args) {
        //我们可以输入多个数字，并且其总和与平均数，
        // 每输入一个数字回车确认，通过输入非数字来结束输入并输出结果
        Scanner scanner = new Scanner(System.in);
        //和sum
        double sum = 0;
        //计算输入了多少个数字
        int num=0;
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            num++;
            sum+=x;
        }
        System.out.println(num+"个数的和："+sum);
        System.out.println(num+"个数的平均数："+(sum/num));

        scanner.close();


    }
}
