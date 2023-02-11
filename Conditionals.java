public class Conditionals {
    public static void main(String[] args) {
        int a = 8, b = 9;
        if(a == 7 || b == 8) {
            System.out.println("Perfect");
        } else if (a == 8) {
            System.out.println("Works");
        } else {
            System.out.println("Bad");
        }


        //  ternary operator
        int x = 5;
        System.out.println(x % 2 == 0 ? "Even" : "Odd");

        // Switchh statement
        int day = 1;
        //  1 -> monday, ... , 7 -> Sunday
        switch(day) {
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            default: System.exit(0);
        }
        System.out.println("out now");
    }
}
