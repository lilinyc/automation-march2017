package unit;

/**
 * Created by PIIT_NYA on 5/6/2017.
 */
public class Calculator {

    public int addition(int a, int b) {
        int total = a + b;
        return total;
    }

    public int subtraction(int a, int b) {
        int total = a - b;
        return total;
    }

    public int multiplication (int a, int b) {
        int total = a * b;
        return total;
    }

    public double division(double a, double b) {
        double total = a / b;
        return total;
    }

    public double power (double a, double b){
        double total=Math.pow(a, b);
        return total;
    }



}


