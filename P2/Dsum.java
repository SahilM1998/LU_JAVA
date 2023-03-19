import java.util.*;

public class Dsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int r = num;
        int sum = 0, temp = 0;
        while (num > 0) {
            temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }

        System.out.println("The Sum of the Digits of the number " + r + " is: " + sum);
        sc.close();
    }
}
