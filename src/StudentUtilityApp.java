import java.util.Scanner;
public class StudentUtilityApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args ){
        int input =  displayMenu();
        // test input validity
        while (input!=5) {
            if (input == 1) {
                System.out.print("Enter the first number: ");
                int fnum = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int snum = scanner.nextInt();
                int result = addTwoInteger(fnum, snum);
                System.out.println("The sum of "+fnum+" and "+snum+" is "+result);
                input = displayMenu();
            } else if (input == 2) {
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();
                String checker = OddEvenChecker(num);
                System.out.println(num+" is " + "an "+ checker);
                input = displayMenu();
            } else if (input == 3) {
                System.out.print("Enter a number: ");
                int num = scanner.nextInt();
                System.out.println(Nth(num));
                input = displayMenu();
            } else if (input == 4) {
                System.out.println("Enter a number(1-7): ");
                int day = scanner.nextInt();
                System.out.println(displayDayW(day));
                input = displayMenu();
            }
            else {
                System.out.println("invalid input");
                input= displayMenu();
            }
        }
        System.out.println("Thank you for using this app5");
    }
    // function to display the menu
    public static int displayMenu(){
        System.out.print("=== STUDENT UTILITY APP=== \n " +
                "1.Add two numbers \n " +
                "2.Check a number if it EVEN or ODD \n " +
                "3.print number from 1 to N \n " +
                "4.Display days of the week \n " +
                "5.Exit \n " +
                "Enter your choice:");
        return scanner.nextInt();
    }
    public static int addTwoInteger(int f_num, int s_num){
        return f_num + s_num;
    }
    public static String OddEvenChecker(int num){
        return (num%2==0)? "Even": "Odd";

    }
    public static String Nth(int num){
        String numb = "";
        for (int i = 1;i<=num;i++){
             numb =numb+i+ " ";
        }
        return numb;
    }
    public static String displayDayW(int num){
        switch (num){
            case 1:
                return "Monday";

            case 2 :
                return "Tuesday";
            case 3 :
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5 :
                return "Friday";
            case 6 :
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return " Invalid day";
        }
    }
}