public class Operators {
    public static void main(String[] args) {
        // final variable can not be assigned
        // final int n = 6;
        // n=7;
        // System.out.println(n);

        // Arithemtic -> +. -. *, /, %
        // Relational ->   <, >, <=, >=, ==, !=
        // Logical -> &&, ||, !
        int num = 7;
        num += 1;
        num++;
        System.out.println(num);

        // pre and post increment -> ans should be 18 for operation given below.
        int a = 5, b = 6;
        int res = a++ + b + ++a;
        System.out.println(res);
    }
}
