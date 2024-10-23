package aldovalzani.be_hw_m2_w1_d2.testClasses;

public class CalculatorClass {
    public int sum(int n1, int n2) {
        return n1 + n2;
    }

    public boolean oddOrEven(int num) {
        return num % 2 == 0;
    }

    public int divisione(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException("Non si può  dividere per 0");
        }
        return n1 / n2;
    }
}
