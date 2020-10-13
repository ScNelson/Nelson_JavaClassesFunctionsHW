public class MagicCalculator extends Calculator {
    private double out;

    public double squareRoot(double num) {
        out = Math.sqrt(num);
        return out;
    }

    public double sine(double num){
        out = Math.toRadians(num);
        out = Math.sin(out);
        return out;
    }

    public double cosine(double num){
        out = Math.toRadians(num);
        out = Math.cos(out);
        return out;
    }

    public double tan(double num){
        out = Math.toRadians(num);
        out = Math.tan(out);
        return out;
    }

    public double factorial(double num){
        out = 1;
        for (int i = 1; i <= num; i++) {
            out = out * i;
        }
        return out;
    }
}
