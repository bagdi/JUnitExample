package general;

public class Calculator {

    private double res;

    public Calculator() {
    }

    public double multiply(double a, double b) {
        return a*b;
    }

    public double plus(double a, double b) {
        return a+b;
    }

    public double dim(double a, double b) {
        if(b == 0) throw new ArithmeticException();
        return a/b;
    }

    public double minus(double a, double b) {
        return a-b;
    }
}
