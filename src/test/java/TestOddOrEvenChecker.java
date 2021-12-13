import main.java.OddOrEven;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestOddOrEvenChecker {

    private static OddOrEven oddOrEven;

    @BeforeAll
    public static void setUp(){
        oddOrEven = new OddOrEven();
    }

    @Test
    public static void testOddNumber() {
        assertTrue(oddOrEven.isOddNumber(4));
    }
}
