import java.util.*;

public class Armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int check = n;
        int c = 0;
        int temp = n;
        while (temp != 0) {
            c++;
            temp = temp / 10;
        }
        int p = 0;
        while (n != 0) {
            int d = n % 10;
            p += Math.pow(d, c);
            n /= 10;
        }

        if (p == check) {
            System.out.println("The entered number is Armstrong number");
        } else {
            System.out.println("The entered number is Not Armstrong number");
        }
    }
}