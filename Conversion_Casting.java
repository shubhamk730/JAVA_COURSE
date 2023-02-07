public class Conversion_Casting {
    public static void main(String[] args) {
        // char c = 'p';
        // int a = c;
        // System.out.println(a);

        // casting
        // byte b = 9;
        // int a1 = 7;
        // b = (byte)a1;
        // System.out.println(b);

        // implicit conversion
        // a1 = b;
        // System.out.println(a1);

        // float f = 5.9f;
        // int i = (int)f;
        // System.out.println(i);

        // if out of range it takes modulo
        byte b = 9;
        int a1 = 260;
        b = (byte)a1;
        System.out.println(b);

        //type promotion
        byte a = 10;
        byte c = 40;
        int res = a*c;
        System.out.println(res);


    }
}
