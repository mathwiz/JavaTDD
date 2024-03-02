package math;

public class Main {
    public static void main(String[] args) {
        double a = Double.valueOf(args[0]);
        double b = Double.valueOf(args[1]);
        System.out.printf("Max of %f and %f is %f\n", a, b, new Max().value(a,b));
    }
}

class Max {
    public double value(double a, double b) {
        return a < b ? b : a;
    }
}
