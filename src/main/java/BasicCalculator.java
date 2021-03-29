public class BasicCalculator implements BasicOperations {


    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int substract(int x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public double divide(int x, int y) {
        return (double)x / y;
    }
}
