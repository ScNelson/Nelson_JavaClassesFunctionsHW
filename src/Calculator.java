public class Calculator {
    private int out;

    public int add(int num1, int num2) {
        out = num1 + num2;
        return out;
    }    

    public int subtract(int num1, int num2) {
        out = num1 - num2;
        return out;
    }

    public int multiplication(int num1, int num2) {
        out = num1 * num2;
        return out;
    }

    public int division(int num1, int num2) {
        out = num1 / num2;
        return out;
    }

    public int square(int num1, int num2) {
        out = num1;
        for (int i=1; i<num2;i++) {
            out = out * num1;
        }
        return out;
    }
}
