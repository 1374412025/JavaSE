package base.method;

public class CmdPara {//命令行传参
    public static void main(String[] args) {
        //args.lenth数组长度
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]:"+args[i]);

        }
    }
}
