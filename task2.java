public class task2 {

    public static void main(String[] args) {
        double x = 3.5;
        double y = -2.0;
        
        if (x > 0 && y > 0) {
            System.out.println("1 четверть");
        } else if (x < 0 && y > 0) {
            System.out.println("2 четверть");
        } else if (x < 0 && y < 0) {
            System.out.println("3 четверть");
        } else if (x > 0 && y < 0) {
            System.out.println("4 четверть");
        } else if (x == 0 && y != 0) {
            System.out.println("ось Y");
        } else if (x != 0 && y == 0) {
            System.out.println("ось X");
        } else {
            System.out.println("начало координат");
        }
    }
}