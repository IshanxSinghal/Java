import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt();

        isArmstrong(n);
    }

    static void isArmstrong(int i){
        int sum = 0;
        int original = i;
        while(i>0){
            int rem = i%10;
            sum = sum + rem*rem*rem;
            i = i/10;
        }
        if (sum == original){
            System.out.println(original + " is Armstrong");
        }else {
            System.out.println(original + " is not Armstrong");
        }
    }
}

