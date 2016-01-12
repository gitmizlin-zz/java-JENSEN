import org.junit.Test;
import static org.junit.Assert.*;

public class YatzyRulesTest {

    @Test
    public void testIsYatzyWhenWeHaveFiveFours() throws Exception {
        int[] testDices = {4, 4, 4, 4};

        boolean result = YatzyRules.isYatzy(testDices);

        assertEquals(true, result);
    }

    @Test
    public void testIsYatzyWhenWeHaveFiveFives() throws Exception {
        int[] testDices = {5, 5, 5, 5, 5};

        boolean result = YatzyRules.isYatzy(testDices);

        assertEquals(true, result);
    }
}