import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StandardDeviationTest {
    
    @Test
    public void testThatTheCalculateSumIsWorking() {

        double[] numbers = {2.0, 4.0, 6.0};

        double result = StandardDeviation.calculateSum(numbers);

        assertEquals(12.0, result, 0.001);
    }

    @Test
    public void testThatTheAverageIsGottenAfterUsingTheMethodCalculateMean() {

        double[] numbers = {2.0, 4.0, 6.0};

        double result = StandardDeviation.calculateMean(numbers);

        assertEquals(4.0, result, 0.001);
    }

    @Test
    public void testThatItSumsThSquaresNumbersUsingCalculateSumOfSquares() {

        double[] numbers = {2.0, 4.0, 6.0};

        double mean = 4.0;

        double result = StandardDeviation.calculateSumOfSquares(numbers, mean);

        assertEquals(8.0, result, 0.001);
    }

    @Test
    public void testStandardDeviationCalculation() {

        double[] numbers = {2.0, 4.0, 6.0};

        double expected = 1.63299;

        double result = StandardDeviation.caculateStandardDeviation(numbers);

        assertEquals(expected, result, 0.001);
    }

}
