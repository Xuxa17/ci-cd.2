import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3);
        assertEquals(8, sum, "Сложение работает некорректно");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int difference = calculator.subtract(10, 4);
        assertEquals(6, difference, "Вычитание работает некорректно");
    }
}
