import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a fruit name: ");

        String fruit = in.next();

        switch (fruit) {
            case "mango":
                System.out.println("King of fruits");
                break;
            case "apple":
                System.out.println("A red fruit");
                break;
            case "grapes":
                System.out.println("Small fruits");
                break;
            default:
                System.out.println("Please, enter a valid fruit.");


                // better way to write (much cleaner & precise)
                switch (fruit) {
                    case "mango" -> System.out.println("King of fruits");
                    case "apple" -> System.out.println("A red fruit");
                    case "grapes" -> System.out.println("Small fruits");
                    default -> System.out.println("Please, enter a valid fruit.");
                }
        }

    }
}

