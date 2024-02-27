import classes.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTestCase {
    public Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void trash() {
        calculator = null;
    }

    @Test
    public void CalculatorAdd_ShouldSucceed_ReturnCorrectAnswer() {
        int result = calculator.add(2, 2);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void CalculatorAdd_ShouldNotSucceed_NotEquals() {
        int result = calculator.add(2,2);
        Assertions.assertNotEquals(5,result);
    }
}
