public class Primenumber {
    public static void main(String[] args) {
        System.out.println("Prime number from 1 to 100 are:");

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

    }

    private static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

}
