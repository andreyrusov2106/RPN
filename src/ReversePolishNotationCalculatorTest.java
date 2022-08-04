import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationCalculatorTest {
    @Test
    void calculateExample1() {
        ReversePolishNotationCalculator calculator =new ReversePolishNotationCalculator();
        int res=calculator.calculatePolishNotation("1 2 3 - +");
        assertEquals(0, res, "Неверный результат");
    }
    @Test
    void calculateExample2() {
        ReversePolishNotationCalculator calculator =new ReversePolishNotationCalculator();
        int res=calculator.calculatePolishNotation("1 2 3 - *");
        assertEquals(-1, res, "Неверный результат");
    }
    @Test
    void calculateExampleWithFirstSpace() {
        ReversePolishNotationCalculator calculator =new ReversePolishNotationCalculator();
        int res=calculator.calculatePolishNotation(" 1 2 3 - *");
        assertEquals(-1, res, "Неверный результат");
    }

}