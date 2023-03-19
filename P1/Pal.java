import java.util.*;

public class Pal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;

        int r = 0;
        while (num > 0) {
            int t = num % 10;
            r = (r * 10) + t;
            num = num / 10;
        }
        if (temp == r) {
            System.out.println("The number is palindrome");
        } else {
            System.err.println("The number is not palindrome");
        }

        sc.close();
    }
}
