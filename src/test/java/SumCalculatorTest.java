import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTest {
    private SumCalculator sumcalc;
    @BeforeEach
    public void beforeEach() {
        sumcalc = new SumCalculator();
    }

    @Test
    public void testSumCalculatorForOne() {
        //When
        int actual = sumcalc.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumCalculatorForThree() {
        //When
        int actual = sumcalc.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSumCalculatorForZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            int sum = sumcalc.sum(0);
        });
    }
}
