package base.base.operator;

public class OperBinary {//运算符二元

    public static void main(String[] args) {

//========================================================================
        //二元运算符     +，-，*，/,%
        //Ctrl + D 复制当前行到下一行
        int a = 10;
        int b = 20;
        int e = 3;

        System.out.println("a+b =  "+(a+b));
        System.out.println("a-b =  "+(a-b));
        System.out.println("a*b =  "+(a*b));
        System.out.println("a/b =  "+(a/b));//0
        System.out.println("a/b类型转换后 = "+(double) a/b);//0.5
        System.out.println("e%a =  "+e%a);//3

        System.out.println("=================================================");

//========================================================================
        //多操作数二元运算
        long a1 = 12345678987654321L;
        int b1 = 123;
        short c1 = 10;
        byte d1 = 8;

        System.out.println(a1+b1+c1+d1);//Long 多个操作数中有一个是long结果就是long
        System.out.println(b1+c1+d1);//int     没有long的时候返回int
        System.out.println(c1+d1);//Int
        System.out.println((double) c1+d1);//Int
        //多个操作数中有一个是long结果就是long        double同理

        System.out.println("================================================");
//========================================================================
        //自增自减  一元运算符   ++  --
        int a2 = 3;
        int b2 = a2++;
        //a=a+1 先执行赋值，后自增1

        //a=a+1 先自增，再执行赋值
        int c2 = ++a2;
        System.out.println(a2); //5
        System.out.println(b2); //3
        System.out.println(c2); //5

        System.out.println("=================================================");
//========================================================================
        //关系运算符     true/fulse  布尔值

        int a3 = 10;
        int b3 = 20;

        System.out.println(a3 > b3);
        System.out.println(a3 < b3);
        System.out.println(a3 == b3);
        System.out.println(a3 != b3);

        System.out.println("=================================================");
//========================================================================
        //幂运算   用Math包
        double pow = Math.pow(2,3);
        double abs = Math.abs(-3);
        System.out.println(pow);//8.0
        System.out.println(abs);//3.0

        System.out.println("=================================================");
//========================================================================
        //逻辑运算符  &&与    ||或    !非
        boolean a4 = true;
        boolean b4 = false;

        System.out.println("a && b: " + (a4 && b4));
        System.out.println("a || b: " + (a4 || b4));
        System.out.println("!(a && b): " + !(a4 && b4));//取反

        System.out.println("=================================================");

        //短路运算
        int test = 5;
        boolean test2 = (test<4)&&(test++<4);
        System.out.println(test2);
        System.out.println(test);//没有进行test++

        System.out.println("=================================================");
//========================================================================
        //位运算(效率高)   &	 |	^	~	>>	<<	>>>
        /*
        A = 0011 1100
        B = 0000 1101
        A&B=0000 1100   对应位同为1 则为1
        A|B=0011 1101
        A^B=0011 0001   异或  相同为0，不同为1
        ~B=1111 0010

        面试题
        2*8=2*2*2*2     16
        0000 0010   0001 0000
        <<左移    *2
        >>右移    /2

         */
        long start = System.currentTimeMillis();
        System.out.println(2<<3);
        long end = System.currentTimeMillis();
        System.out.println("共耗时"+(end-start)+"毫秒");

        System.out.println("=================================================");
//========================================================================
        //扩展赋值运算符
        int a5 = 10;
        int b5 = 20;

        a5+=b5;//a = a + b
        System.out.println(a5);//30
        a5-=b5;//a = a - b
        System.out.println(a5);//10
        a5*=b5;//a = a * b
        System.out.println(a5);//200
        a5/=b5;//a = a / b
        System.out.println(a5);//10

        //字符串链接符    +   String
        System.out.println("后面"+a+b);   //不会计算
        System.out.println(a+b+"前面");   //会计算






    }
}
