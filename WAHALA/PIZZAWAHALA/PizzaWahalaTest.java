import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PizzaWahalaTest {

    @Test
    public void testSapaSize() {

        int numberOfPeople = 10;
        int slicesPerBox = 4;
        int pricePerBox = 2500;

        int totalSlicesAccumulated = 0;
        int numberOfBoxes = 0;

        for (numberOfBoxes = 0;
             totalSlicesAccumulated < numberOfPeople;
             numberOfBoxes++) {

            totalSlicesAccumulated =
                    totalSlicesAccumulated + slicesPerBox;
        }

        int leftSlices =
                totalSlicesAccumulated - numberOfPeople;

        int totalPrice =
                numberOfBoxes * pricePerBox;

        assertEquals(3, numberOfBoxes);
        assertEquals(2, leftSlices);
        assertEquals(7500, totalPrice);
    }

    @Test
    public void testSmallMoney() {

        int numberOfPeople = 10;
        int slicesPerBox = 6;
        int pricePerBox = 2900;

        int totalSlicesAccumulated = 0;
        int numberOfBoxes = 0;

        for (numberOfBoxes = 0;
             totalSlicesAccumulated < numberOfPeople;
             numberOfBoxes++) {

            totalSlicesAccumulated =
                    totalSlicesAccumulated + slicesPerBox;
        }

        int leftSlices =
                totalSlicesAccumulated - numberOfPeople;

        int totalPrice =
                numberOfBoxes * pricePerBox;

        assertEquals(2, numberOfBoxes);
        assertEquals(2, leftSlices);
        assertEquals(5800, totalPrice);
    }

    @Test
    public void testBigBoys() {

        int numberOfPeople = 10;
        int slicesPerBox = 8;
        int pricePerBox = 4000;

        int totalSlicesAccumulated = 0;
        int numberOfBoxes = 0;

        for (numberOfBoxes = 0;
             totalSlicesAccumulated < numberOfPeople;
             numberOfBoxes++) {

            totalSlicesAccumulated =
                    totalSlicesAccumulated + slicesPerBox;
        }

        int leftSlices =
                totalSlicesAccumulated - numberOfPeople;

        int totalPrice =
                numberOfBoxes * pricePerBox;

        assertEquals(2, numberOfBoxes);
        assertEquals(6, leftSlices);
        assertEquals(8000, totalPrice);
    }

    @Test
    public void testOdogwu() {

        int numberOfPeople = 10;
        int slicesPerBox = 12;
        int pricePerBox = 5200;

        int totalSlicesAccumulated = 0;
        int numberOfBoxes = 0;

        for (numberOfBoxes = 0;
             totalSlicesAccumulated < numberOfPeople;
             numberOfBoxes++) {

            totalSlicesAccumulated =
                    totalSlicesAccumulated + slicesPerBox;
        }

        int leftSlices =
                totalSlicesAccumulated - numberOfPeople;

        int totalPrice =
                numberOfBoxes * pricePerBox;

        assertEquals(1, numberOfBoxes);
        assertEquals(2, leftSlices);
        assertEquals(5200, totalPrice);
    }
}
