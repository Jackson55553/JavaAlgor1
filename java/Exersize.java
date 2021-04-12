public class Exersize {
    public static void main(String[] args) {
        int a = 1;
        byte b = 1;
        boolean bool = true;
        long d = 1;
        short s = 1;
        char ch = 65;
        float f = 1f;

        String c = "String";
        Integer in = 1;
        Long l = Long.valueOf(1);
        Short sh = 1;
        Float fl = 1f;
        Byte bt = 1;

        System.out.println(in == a);
        System.out.println(l == d);
        System.out.println(s == sh);
        System.out.println(f == fl);
        System.out.println(b == bt);
        System.out.println("=============================================");

        System.out.println(in == d);
        System.out.println(s == in);
        System.out.println(a == b);
        System.out.println(f == b);


        Cat cat = new Cat("Pushok");
        System.out.println("=============================================");
        System.out.println(a);
        System.out.println(b);
        System.out.println(bool);
        System.out.println(s);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(f);
        System.out.println(cat.getName());
        
    }


}
