package base.base;

public class VariableConstant {//变量和常量

//常量
//final static double PI =3.14;
    static final double PI = 3.14;//修饰符不存在先后顺序

//类变量 static
    static double salary = 2500;

//实例变量：从属于对象；   若不自行初始化，视为该类型默认值
    String name;    //默认值null
    int age;        //默认值0
    boolean flag;   //默认值flase
    float fl;       //0.0
    char ch;        //u0000


//main方法
    public static void main(String[] args) {
//局部变量  方法内有用
        int d=1,e=2;
        String name ="taotao";
        char x='x';
        double db=22;
        System.out.println(d);

//常量
        System.out.println(PI);

//类变量
        System.out.println(salary);//不用new了

//实例变量
//变量类型 变量名 = new ...
        VariableConstant bvc = new VariableConstant();//实例化
        System.out.println(bvc.name);

    }
//=======================================================
//其他方法
    public void add(){
        System.out.println(salary);//类变量
        System.out.println(PI);//常量

    }

}
