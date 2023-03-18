package base.method;
public class StaticReload {//静态方法和重载
    //main()方法
    public static void main(String[] args) {
        //静态方法直接调用
        System.out.println(add(1,2));//3

        //非静态方法 调用需要实例化
        StaticReload staticReload = new StaticReload();
        System.out.println(staticReload.sub(1,2));//-1

        //重载静态方法调用
        System.out.println(add(1.1,1.2));//2.3
    }
    //静态    加法
    public static int add(int a,int b){
    return a+b;
    }
    //非静态   加法
    public  int sub(int a,int b){
        return a-b;
    }
    //重载 add为double类型
    public static double add(double a, double b) {
        return a+b;
    }
    public void one(){
        System.out.println(1);
        this.two();//非静态可以用this.方法()
        this.three();
        int c = add(1,3);
    }
    public static void two(){
        System.out.println(2);
    }
    public void three(){
        System.out.println(3);
    }
}

