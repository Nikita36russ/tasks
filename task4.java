public class task4 {
    public static void main(String[] args) {
        double x = 2;
        
        double y = x / (x * x + 2.0 / (x * x + 4.0 / (x * x + 8.0 / (x * x + 25.0 / (x * x)))));
        
        System.out.println(y);
    }
}