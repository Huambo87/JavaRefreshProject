import StaticClassesEnumsExceptions.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void additionTest(){
        double a = 5;
        double b = 6;
        double expectedResult = 11;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.ADDITION);

        assertEquals(expectedResult, actualResult, "Addition Result Incorrect");
    }

    @Test
    public void divisionTest(){
        double a = 10;
        double b = 2;
        double expectedResult = 5;

        double actualResult = Calculator.calculate(a, b, Calculator.Type.DIVISION);

//        assertNull(actualResult);
        assertNotNull(actualResult, "Result Returns Null");
        assertEquals(expectedResult, actualResult, "Division Result Incorrect");
        assertTrue(expectedResult==actualResult);
        assertTrue(actualResult>0);
        assertFalse(actualResult==0);
    }

    @Test
    @DisplayName("Null Pointer Exception Test")
    public void errorTest(){

        double a = 10;
        double b = 2;
        double expectedResult = 5;

        assertThrows(NullPointerException.class, () -> {Calculator.calculate(a, b, null);});

    }


}
