package Basics;

public class isPalindrome {
    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindromeMehtod(x));
    }

    private static boolean isPalindromeMehtod(int x) {
        if (x < 0){
            return false;
        }
        // 121 % 10 = 1, 12 % 10 = 2, 1 % 10 = 1
        int n = x;
        int revNum = 0;

        while (n > 0){
            int rem = n % 10;
            revNum = revNum * 10 + rem;

            n = n/10;
        }
        if (revNum == x){
            return true;
        } else {
            return false;
        }
    }
}
