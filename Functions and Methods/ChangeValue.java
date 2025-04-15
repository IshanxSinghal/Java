import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        int[] arr = {1,3,42,6};

        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99; //making a change in object via this ref variable,
        // original copy of it's also going to change
    }
}
