package base.struct;

public class Loop {

    public static void main(String[] args) {
        //while:输出1~100；
        int i=0;
        while(i<100){
            i++;
            //System.out.println(i);
        }

            //System.out.println(101*50);

        //do···while
        int j = 0;
        int sum = 0;
        do{
            sum+=j;
            j++;
        }while(j<=100);
        System.out.println(sum);
        System.out.println("===========");

        //两者区别
        int a= 0;
        while (a<0){//先判断后执行
            System.out.println(a);
            a++;
        }
        do{ //先执行一次再判断
            System.out.println(a);
            a++;
        }while(a<0);
        System.out.println("===========");

        //for循环
        System.out.println("for循环");
        for (int d = 1; d <= 50; d++) {
            System.out.print(d+" ");
        }
        System.out.println("循环结束");
        System.out.println("===========");
        //for打印1-500中5的倍数，三个一行
        for (int k = 0,flag=0; k <= 500; k++) {
            if(k%5==0) {
                System.out.print(k + "\t");
                flag++;
                if(flag%3==0) System.out.println();
                //System.out.print("\n");
            }
        }
        System.out.println("===========");
        //for打印 99乘法表    嵌套for
        for (int m = 1; m <= 9; m++) {
            for (int n = 1; n <=m; n++) {
                System.out.print(n+"*"+m+"="+m*n+"\t");
                if (m==n) System.out.println();
            }
        }
        System.out.println();

        //增强for
        int[] numbers = {1, 2, 3, 4, 6};
        for (int x : numbers) {
            System.out.print(x+"\t");
        }
        System.out.println();
        System.out.println("对比普通for   ");
        for (int i1 = 0; i1 < numbers.length; i1++) {
            System.out.print(numbers[i1]+"\t");
        }
        System.out.println();

        //打印2到1000之间的质数，质数是指除了1和本身以外，没有其他的因数的自然数
        System.out.println("打印101到150之间的质数，质数是指除了1和本身以外，没有其他的因数的自然数");
        int count1= 0;
        int count2=0;
        for (int m = 2; m <1000 ; m++) {
            boolean flag=false;
            for (int n = 2; n <= Math.sqrt(m); n++) {
                count2++;
                if (m%n==0) {
                    flag=true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.print(m+" ");
                count1++;
            }

        }
        System.out.println();
        System.out.println("质数数量"+count1);//15      15
        System.out.println("遍历次数"+count2);//349    sqrt94


        //筛法
        boolean prime[] = new boolean[1001];
        int count11 = 0;//质数个数
        int count22 = 0;//循环次数
        for(int i2=2;i2<1000;i2++){
            prime[i2] = true;
        }
        for(int i3=2;i3<=1000;i3++){
            if(prime[i3]){
                for(int j3=i3+i3;j3<1000;j3+=i3){
                    count22++;
                    prime[j3] = false;//筛选掉倍数
                }
            }
        }
        for(int i4=0;i4<= 1000;i4++){
            if(prime[i4] == true){
                count11++;
            }
        }
        System.out.println(count11);
        System.out.println(count22);

    }

}
