import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter empID: ");
        int empID = in.nextInt();

        System.out.print("Enter Department: ");
        String dept = in.next();

        switch (empID){
            case 1:
                System.out.println("Ishan Singhal");
                break;
            case 2:
                System.out.println("Rohit Gupta");
                break;
            case 3:
                System.out.println("Employee 3");
                switch (dept){
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    case "HR":
                        System.out.println("HR Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
        }
    }
}
