import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
       inttoarray(5, 6, 76, 35, 234);
       stringtoarray("Ishan", "Rahul", "Rohit", "Shyam");
    }

    static void inttoarray(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void stringtoarray(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
