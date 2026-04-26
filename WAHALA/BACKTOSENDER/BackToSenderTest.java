import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
 

public class BackToSenderTest {

    @Test
    public void testThatDailyWageIsCalculatedCorrectlyForLessThan50() {
        // Given
        int number = 25;

        // When
        int expected = BackToSender.DailyWage(number);

        // Check
        int actual = 9000;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatDailyWageIsCalculatedCorrectlyFor50To59() {
        // Given
        int number = 55;

        // When
        int expected = BackToSender.DailyWage(number);

        // Check
        int actual = 16000;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatDailyWageIsCalculatedCorrectlyFor60To69() {
        // Given
        int number = 65;

        // When
        int expected = BackToSender.DailyWage(number);

        // Check
        int actual = 21250;
        assertEquals(actual, expected);
    }

    @Test
    public void testThatDailyWageIsCalculatedCorrectlyFor70AndAbove() {
        // Given
        int number = 80;

        // When
        int expected = BackToSender.DailyWage(number);

        // Check
        int actual = 45000;
        assertEquals(actual, expected);
    }
}
