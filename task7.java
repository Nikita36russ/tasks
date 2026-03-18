import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        runTests();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите свой массив.");
        int[] userArray = readArray(scanner);
        int pos = solution(userArray);
        System.out.print("Ваш массив: ");
        printArray(userArray);
        System.out.println("Индекс последнего минимального элемента: " + pos);
        scanner.close();
    }

    public static int solution(int[] arr) {
        if (arr.length == 0) return -1;
        int min = arr[0];
        int lastMinIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                lastMinIndex = i;
            }
        }
        return lastMinIndex;
    }

    public static int[] readArray(Scanner scanner) {
        System.out.print("Bведите размер массива:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        if (size > 0) {
            System.out.print("Теперь введите " + size + " целых чисел через пробел: ");
            for (int i = 0; i < size; i++) {
                arr[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Массив пуст.");
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void runTests() {
        System.out.println("Tестирование");
        test(new int[]{5, 2, 8, 1, 9}, 3);
        test(new int[]{3, 1, 4, 1, 5, 1}, 5);
        test(new int[]{42}, 0);
        test(new int[]{7, 7}, 1);
        test(new int[]{-3, 5}, 0);
        test(new int[]{-5, -2, -10, -1}, 2);
        test(new int[]{0, -1, 3, -1, 2}, 3);
        test(new int[]{}, -1);
        test(new int[]{4, 4, 4, 4}, 3);
        test(new int[]{1, 5, 3, 7}, 0);
        test(new int[]{8, 6, 4, 2}, 3);
        System.out.println("Тестирование завершено");
    }

    public static void test(int[] arr, int expected) {
        int result = solution(arr);
        System.out.print("Массив: ");
        printArray(arr);
        System.out.println("Ожидаемый индекс: " + expected + ", полученный: " + result);
        if (result == expected) {
            System.out.println("  Тест пройден");
        } else {
            System.out.println("  Тест НЕ пройден");
        }
    }
}