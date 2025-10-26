public class task1 {
    public static void main(String[] args) {
        double a = 1, b = 1, c = 5;
        double d = 2, e = -1, f = 1;
        double A = a * e - b * d;
        
        if (A == 0) {
            System.out.println("Система не имеет решения");
        } else {
            double x = (c * e - b * f) / A;
            double y = (a * f - c * d) / A;
            System.out.println(x);
            System.out.println(y);
        }
    }
}