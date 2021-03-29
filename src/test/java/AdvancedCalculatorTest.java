import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AdvancedCalculatorTest {

    @Test
    public void square() {
        int x = new Random().nextInt(100)-50;
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        int result = advancedCalculator.square(x);
        Assert.assertEquals(x*x,result);
    }

    @Test
    public void power() {
        int x = new Random().nextInt(100)-50;
        int p = new Random().nextInt(100)-50;
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        int result = advancedCalculator.power(x,p);
        Assert.assertEquals((int)Math.pow(x,p),result);
    }

    @Test
    public void squareRoot() {
        int x = new Random().nextInt(100)-50;
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        double result = advancedCalculator.squareRoot(x);
        Assert.assertEquals(Math.sqrt(x),result, 10);
    }

    @Test
    public void root() {
        int x = new Random().nextInt(100)-50;
        int r = new Random().nextInt(100)-50;
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        double result = advancedCalculator.root(x,r);
        Assert.assertEquals(Math.pow(x, 1.0 / r),result,10);
    }

    @Test
    public void absolute() {
        int x = new Random().nextInt(100)-50;
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();
        int result = advancedCalculator.absolute(x);
        Assert.assertEquals(Math.abs(x), result);
    }
}