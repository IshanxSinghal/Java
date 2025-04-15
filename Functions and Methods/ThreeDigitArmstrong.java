public class ThreeDigitArmstrong {
    public static void main(String[] args) {

        for (int i = 100; i<1000; i++){
            int ans = (isArmstrong(i);
            System.out.println(ans);
        }

    }

    static void isArmstrong(int i){
        int sum = 0;
        int original = i;
        while(i>0){
            int rem = i%10;
            sum = sum + rem*rem*rem;
            i = i/10;
        }
        if (sum == original) {
            return original;
        }
        return void;
    }
}


