import java.util.Scanner;

public class INRtoUSD {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the currency in INR: ");

        float inr = in.nextFloat();

        float usd = inr/83.88f;
        System.out.println("The value in USD is: " + usd + " usd");


    }
}
