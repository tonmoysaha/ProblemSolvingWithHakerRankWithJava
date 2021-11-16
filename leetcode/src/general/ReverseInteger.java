package general;

public class ReverseInteger {
    public static void main(String[] args) {
        int x=1534236469;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int reverse =0, check;
        int value = Math.abs(x);
        while (value > 0){
            check = value%10;
            reverse = (reverse*10) +check;
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && check > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && check < -8)) return 0;
            value = value/10;
        }
        return x > 0 ? reverse : -reverse ;

    }

}
