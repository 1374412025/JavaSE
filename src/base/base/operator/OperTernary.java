package base.base.operator;

public class OperTernary {//三元运算符
    public static void main(String[] args) {
        //x?y:z
        //如果x==ture，则结果为y，否则为z
        int socre = 80;
        String output = socre < 60 ? "不及格" : "及格";
        System.out.println("out = " + output);


    }
}
