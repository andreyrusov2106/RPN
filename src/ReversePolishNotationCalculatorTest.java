import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator calculator;

    @BeforeEach
    public void beforeEach(){
        calculator = new ReversePolishNotationCalculator();
    }
    @Test
    void calculateExampleWithMinusAndPlus() {
        int res = calculator.calculatePolishNotation("1 2 3 - +");
        assertEquals(0, res, "Неверный результат");
    }

    @Test
    void calculateExampleWithMinusAndMultiple() {
        int res = calculator.calculatePolishNotation("1 2 3 - *");
        assertEquals(-1, res, "Неверный результат");
    }

    @Test
    void calculateExampleWithFirstSpace() {
        int res = calculator.calculatePolishNotation(" 1 2 3 - *");
        assertEquals(-1, res, "Неверный результат");
    }

}