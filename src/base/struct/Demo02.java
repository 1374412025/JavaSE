package base.struct;

public class Demo02 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            if(i==3)
                continue;//，跳过sout、直接进行i++
            System.out.println(i);
        }
        //打印三角形
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("#");
            }
            for (int j = 1; j <i ; j++) {
                System.out.print("#");
            }
            System.out.println();
        }








    }
}
