package base.base;

public class Data {
    public static void main(String[] args) {
        //基本数据类型
        //整数
        byte by = 10;
        int i = 20;
        short sh = 30;
        long lo =40;
        //小数
        float ff = 52.f;
        float F = 52.F;
        System.out.println(ff);
        System.out.println(F);
        double d =1.1;
        //字符(串)
        char c = '啊';
        String String ="太阳";    //String 不是关键字，是类
        //布尔值
        boolean bo = false;
        boolean bo2 = true;


        String s ="String";
        System.out.println(s);
        System.out.println(ff);
        System.out.println(c);
        System.out.println("a = " + s);

//      System.out.println("num is:",a);
//======================================================

        //整数拓展，进制 二进制0b 十进制 八进制0   十六进制0x
        int i1=10;
        int i2=010;
        int i3=0x10;    //0~9   A~F  out16
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);

//======================================================
        //浮点数拓展
        System.out.println("===========================");
        //float     有限的 离散  舍入误差    接近但是不等于
        // double
        //最好完全避免使用浮点数比较     使用BigDecimal数学工具类
        float f =0.1f;
        double dd=1.0/10;
        System.out.println(f==dd);   //flase
        System.out.println(f);      //0.1
        System.out.println(dd);      //0.1

        double d1 = 2312312312312312d;
        double d2 =d1+1;
        System.out.println(d1==d2);  //false
        System.out.println(d1);      //2.312312312312312E15
        System.out.println(d2);      //2.312312312312313E15
//
//        double d1 = 23123123123123123d;
//        double d2 =d1+1;
//        System.out.println(d1==d2);  //true
//        System.out.println(d1);      //2.31231231231232E16
//        System.out.println(d2);      //2.31231231231232E16

//        float f1 = 231231231231231f;
//        float f2 =f1+1;
//        System.out.println(f1==f2);  //ture
//        System.out.println(f1);      //2.31231225E14
//        System.out.println(f2);      //2.31231225E14

        float f1 = 2312312f;
        float f2 =f1+1;
        System.out.println(f1==f2);  //false
        System.out.println(f1);      //2312312.0
        System.out.println(f2);      //2312312.0

//======================================================
        //字符拓展
        char c1 ='a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println(c2);

        System.out.println((int)c1);//强制转换数据类型
        System.out.println((int)c2);//强制数据类型转换
        //Unicode 2字节  65536    (Excel)表格2^16=65536
        //所有字符本质还是数字 97=a A=65
        //U0000-UFFFF   0-65536
        char c3 = '\u0061';
        System.out.println(c3); //a

        //ex
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa==sb);

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc==sd);
        //对象 从内存分析

//======================================================
        //布尔值拓展
        boolean flag = true;
        if(flag==true){}
        if(flag){}
    }
}
