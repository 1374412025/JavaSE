package base.scanner;

import java.util.Scanner;

public class ScanWithoutIf {//输入不用hasNextLine()判定
    public static void main(String[] args) {
        boolean bool = true;
        Scanner scanner = new Scanner(System.in);
        while(bool){


            System.out.println("输入");
            String str = scanner.nextLine();
            System.out.println("输出 :"+str);



        String a="y";
            System.out.println("y or n");
            a=scanner.next();
            if (a.equals("y"))
                bool=true;
            else bool=false;
        }
        scanner.close();


    }
}

