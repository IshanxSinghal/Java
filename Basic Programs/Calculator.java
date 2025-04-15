import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ans = 0;
        System.out.println("Enter X or x to terminate!");

        while (true) {

            System.out.print("Enter an operator: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter number 1: ");
                int num1 = in.nextInt();
                System.out.print("Enter number 2: ");
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } if (op == '-') {
                    ans = num1 - num2;
                } if (op == '/') {
                    if (num2 != 0){
                        ans = num1 / num2;
                    }
                    else {
                        System.out.println("Division Not Possible.");  //solve the error: instead of breaking take it to input op
                        continue; // solved (added continue instead of break)
                    }
                } if (op == '%') {
                    ans = num1 % num2;
                } if (op == '*') {
                    ans = num1 * num2;
                }
                System.out.println("The answer is: " + ans);
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operator!!");
                break;
            }
        }
    }
}
