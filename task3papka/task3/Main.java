package task3papka.task3;

import java.util.Scanner;

public class Main {

    public static final Line L1 = new Line(-1, 6, 2.5);

    public static final Parabola P1 = new Parabola(2, 1, 2);

    public static Colors getColor(double x, double y) {
        if (P1.isPointRightOfParabola(x, y)) {
            return Colors.ORANGE;
        }

        if (y < -2) {
            if (L1.isPointAboveLine(x, y)) {
                return Colors.GREEN;
            } else {
                return Colors.YELLOW;
            }
        }

        return Colors.GRAY;
    }

    public static void printColorForPoint(double x, double y) {
        Colors color = getColor(x, y);
        System.out.println(" ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(color);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nВведите координаты точек:");
        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            printColorForPoint(x, y);
            System.out.println();
        }

        scanner.close();
    }
}