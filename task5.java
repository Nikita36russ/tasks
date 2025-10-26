public class task5 {
    public static void main(String[] args) {
        int h = 5;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print((i + j) % 2 == 0 ? 'a' : 'b');
            System.out.println();
        }
    }
}