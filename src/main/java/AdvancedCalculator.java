public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {


    @Override
    public int square(int x) {
        return x ^ 2;
    }

    @Override
    public int power(int x, int p) {
        return x ^ p;
    }

    @Override
    public double squareRoot(int x) {
        return Math.sqrt(x);
    }

    @Override
    public double root(int x, int r) {
        return Math.pow(x, 1.0 / r);
    }

    @Override
    public int absolute(int x) {
        if (x >= 0)
            return x;
        else
            return -x;
    }
}
