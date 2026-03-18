import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double e = scanner.nextDouble();

        double a = 1.0;
        double sum1 = 0, sum2 = 0, sum3 = 0;

        for (int k = 0; k < n; k++) {
            sum1 += a;
            if (Math.abs(a) > e)      sum2 += a;
            if (Math.abs(a) > e / 10) sum3 += a;

            if (k < n - 1) {
                a = a * ((2.0 * k + 1) / (2.0 * k + 2)) * x * x;
            }
        }

        double exact = 1 / Math.sqrt(1 - x * x);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
        System.out.println(exact);

        scanner.close();
    }
}