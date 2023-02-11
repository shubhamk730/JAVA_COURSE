import java.util.Scanner;

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
        Scanner scn = new Scanner(System.in);
        while(day <= 10) {
            System.out.print("Enter the day : ");
            day = scn.nextInt();
            System.out.println();
            switch(day) {
                case 1: System.out.println("Monday");
                        break;
                case 2: System.out.println("Tuesday");
                        break;
                case 3: System.out.println("wednesday");
                        break;
                case 4: System.out.println("Thursday");
                        break;
                case 5: System.out.println("Friday");
                        break;
                case 6: System.out.println("Saturday");
                        break;
                case 7: System.out.println("Sunday");
                        break;
                default: System.out.println("Invalid");
                        // System.exit(0);
                        break;
            }
            System.out.println("Stil inside");
        }
        
        System.out.println("out now");
        scn.close();
    }
}
