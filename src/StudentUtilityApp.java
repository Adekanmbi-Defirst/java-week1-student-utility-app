import java.util.Scanner;
public class StudentUtilityApp {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args ){
        System.out.print("=== STUDENT UTILITY APP=== \n " +
                "1.Add two numbers \n " +
                "2.Check a number if it EVEN or ODD \n " +
                "3.print number from 1 to N \n " +
                "4.Display days of the week \n 5.Exit \n Enter your choice:");
        int input = scanner.nextInt();
        if (input == 1){
            System.out.print("Enter the first number: ");
            int fnum = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int snum = scanner.nextInt();
            int result = addTwoInteger(fnum,snum);
            System.out.println(result);
        }
        else if(input==2){
            System.out.print("Enter an integer");
            int num = scanner.nextInt();
            String checker = OddEvenChecker(num);
            System.out.println(checker);
        }
        else if(input==3){
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(Nth(num));
        }
    }
    public static int addTwoInteger(int f_num, int s_num){
        return f_num + s_num;
    }
    public static String OddEvenChecker(int num){
        return (num%2==0)? "Even": "Odd";

    }
    public static String Nth(int num){
        String u = "";
        for (int i = 1;i<=num;i++){
             u =u+i+ " ";
        }
        return u;
    }
}