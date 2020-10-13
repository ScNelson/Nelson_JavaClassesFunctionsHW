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
        for (int i=0; i<num2;i++) {
            num1 = num1 * num1;
        }
        out = num1;
        return out;
    }
}
