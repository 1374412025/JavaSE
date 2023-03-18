package base.method;

public class Recursion {//递归

    public static void main(String[] args) {
        //Recursion recursion=new Recursion();
        //recursion.A();//java.lang.StackOverflowError
        System.out.println(f(4));


    }



    //阶乘 n!=n*(n-1)*(n-2）*...*1
    public static int f(int n) {
        if(n==1)
            return 1;   //递归头
        else
            return n*f(n-1);//递归体
    }

}
