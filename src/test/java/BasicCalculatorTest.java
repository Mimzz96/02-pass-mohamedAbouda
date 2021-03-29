import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class BasicCalculatorTest {

    @Test
    public void add() {
        int x = new Random().nextInt(100)-50;
        int y = new Random().nextInt(100)-50;
        BasicCalculator basicCalculator = new BasicCalculator();
        int result = basicCalculator.add(x,y);
        Assert.assertEquals(x+y,result);

    }

    @Test
    public void substract() {
        int x = new Random().nextInt(100)-50;
        int y = new Random().nextInt(100)-50;
        BasicCalculator basicCalculator = new BasicCalculator();
        int result = basicCalculator.substract(x,y);
        Assert.assertEquals(x-y,result);
    }

    @Test
    public void multiply() {
        int x = new Random().nextInt(100)-50;
        int y = new Random().nextInt(100)-50;
        BasicCalculator basicCalculator = new BasicCalculator();
        int result = basicCalculator.multiply(x,y);
        Assert.assertEquals(x*y,result);
    }

    @Test
    public void divide() {
        int x = new Random().nextInt(100)-50;
        int y = new Random().nextInt(100)-50;
        BasicCalculator basicCalculator = new BasicCalculator();
        double result = basicCalculator.divide(x,y);
        Assert.assertEquals((double)x/y,result, 10);
    }
}