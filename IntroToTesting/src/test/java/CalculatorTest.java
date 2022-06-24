import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Scanner;

public class CalculatorTest {


    //No constructor needed in this class
    // note we did not add a constructor to our 'Calculator' class either

    //implementing our tests
    @Test
    public void additionTest() {
        // this will show errors due to
        //Assertions.assertEquals(7, Calculator.addNumbers(3, 2));
        Assertions.assertEquals(7, Calculator.addNumbers(3, 4));

    }
    @Test
    public void multiplyTest() {
        // this will show errors due to
        //Assertions.assertEquals(7, Calculator.addNumbers(3, 2));
        Assertions.assertEquals(12, Calculator.multiplyNumbers(3, 4));

    }
    @Test
    public void divisionTest() {


        // this will show errors due to
        //Assertions.assertEquals(7, Calculator.addNumbers(3, 2));


        //Assertions.assertEquals(true, Calculator.isDivisible(2,4));

        //trying to take in user input but doesn't work currently
        Assertions.assertEquals(true, Calculator.isDivisible(12,9));

    }
    @Test
    public void subtractionTest() {
        // this will show errors due to
        //Assertions.assertEquals(7, Calculator.addNumbers(3, 2));
        Assertions.assertEquals(7, Calculator.subtractNumbers(3, 4));

    }
}
