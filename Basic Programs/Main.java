import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first and last name: ");
        String name = input.nextLine();
        System.out.println("Your name is: " + name);

        System.out.print("Enter your class roll number: ");
        int rollno = input.nextInt();
        System.out.println("Your class roll number is: " + rollno);

        System.out.print("Enter University ID: ");
        long rno = input.nextLong();
        System.out.println("Your University ID is: " + rno);

    }
    }
