import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OshoFreePromoEngineTest {

    @Test
    public void testStarter10DiscountAtMinimum() {
        assertEquals(4500.0, OshoFreePromoEngine.calculateFinalPrice(5000, "STARTER10"));
    }

    @Test
    public void testBigBoy20Discount() {
        assertEquals(14400.0, OshoFreePromoEngine.calculateFinalPrice(18000, "BIGBOY20"));
    }

    @Test
    public void testOshoFree35Discount() {
        assertEquals(19500.0, OshoFreePromoEngine.calculateFinalPrice(30000, "OSHOFREE35"));
    }

    @Test
    public void testInvalidPromoCode() {
        assertEquals(18000.0, OshoFreePromoEngine.calculateFinalPrice(18000, "FAKE99"));
    }

    @Test
    public void testBelowMinimumThreshold() {
        assertEquals(4000.0, OshoFreePromoEngine.calculateFinalPrice(4000, "STARTER10"));
    }
}
