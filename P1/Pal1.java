import java.util.*;

public class Pal1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        String num = sc.nextLine();

        StringBuffer sb = new StringBuffer(num);
        sb.reverse();

        if (sb.toString().equals(num)) {
            System.out.println("The number is palindrome");
        } else {
            System.err.println("The number is not palindrome");
        }

    }
}
