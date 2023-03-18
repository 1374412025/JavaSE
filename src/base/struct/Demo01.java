package base.struct;
public class Demo01 {
    public static void main(String[] args) {
        StringBuffer sb1=new StringBuffer("abc");
        StringBuffer sb2=new StringBuffer("abc");
        System.out.println("sb1.equals(sb2): "+sb1.equals(sb2));

            int int1 = 12;
            int int2 = 12;
            int int3 = 127;
            int int4=int1;

            Integer integer1 = new Integer(12);
            Integer integer2 = new Integer(12);
            Integer integer3 = new Integer(127);

            Integer a1 = 127;
            Integer a2 = 127;

            Integer a = 128;
            Integer b = 128;
            Integer c = a;
            System.out.println(c);
            System.out.println(c.hashCode());
            System.out.println(a.hashCode());
            a=129;
            System.out.println(c.hashCode());
            System.out.println(a.hashCode());
            System.out.println(a);

            System.out.println("int1 == int2 -> " + (int1 == int2));
            System.out.println("int1 == integer1 -> " + (int1 == integer1));
            System.out.println("integer1 == integer2 -> " + (integer1 == integer2));
            System.out.println("integer3 == a1 -> " + (integer3 == a1));
            System.out.println("a1 == a2 -> " + (a1 == a2));
            System.out.println("a == b -> " + (a == b));
            System.out.println(a1==int3);



    }
}
