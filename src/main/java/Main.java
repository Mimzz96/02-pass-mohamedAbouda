public class Main {
    public static void main(String[] args) {
        BasicCalculator basicCalculator = new BasicCalculator();
        AdvancedCalculator advancedCalculator = new AdvancedCalculator();

        int resultMultiply = basicCalculator.multiply(5, 2);
        System.out.println(resultMultiply);

        double resultDivision = basicCalculator.divide(5, 2);
        System.out.println(resultDivision);

        int resultSquare = advancedCalculator.square(9);
        System.out.println(resultSquare);

        int resultAbsolute = advancedCalculator.absolute(-15);
        System.out.println(resultAbsolute);


    }
}