import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int sum = 0;

        while (num>0){
            int rem = num % 10;
            num /= 10;
            sum = sum*10 + rem;

        }
        System.out.println("The reverse is: " + sum);

    }
}

//Error: the prgram doesn't count zero if it is at one's place