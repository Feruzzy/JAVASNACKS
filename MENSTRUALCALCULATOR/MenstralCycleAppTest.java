import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstralCycleAppTest {

    @Test
    public void testThatDayOneIsPeriodDay() {
        // Given
        int day = 1;
        int periodLength = 5;
        int cycleLength = 28;

        // When
        String actual = MenstralCycleApp.getDayStatus(day, periodLength, cycleLength);

        // Then
        assertEquals("Period", actual);
    }

    @Test
    public void testThatDaySixIsFreeDayForFiveDayPeriod() {
        // Given
        int day = 6;
        int periodLength = 5;
        int cycleLength = 28;

        // When
        String actual = MenstralCycleApp.getDayStatus(day, periodLength, cycleLength);

        // Then
        assertEquals("Free Day", actual);
    }

    @Test
    public void testThatDayTwentyEightIsAFreeDay() {
        // Given
        int day = 28;
        int periodLength = 5;
        int cycleLength = 28;

        // When
        String actual = MenstralCycleApp.getDayStatus(day, periodLength, cycleLength);

        // Then
        assertEquals("Free Day", actual);
    }

    @Test
    public void testThatDayFourteenIsAFreeDay() {
        // Given
        int day = 14;
        int periodLength = 5;
        int cycleLength = 28;

        // When
        String actual = MenstralCycleApp.getDayStatus(day, periodLength, cycleLength);

        // Then
        assertEquals("Free Day", actual);
    }

    @Test
    public void testThatDayTwentyIsAFreeDay() {
        // Given
        int day = 20;
        int periodLength = 5;
        int cycleLength = 28;

        // When
        String actual = MenstralCycleApp.getDayStatus(day, periodLength, cycleLength);

        // Then
        assertEquals("Free Day", actual);
    }
}
