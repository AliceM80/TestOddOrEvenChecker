package test.java;

import main.java.OddOrEven;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestOddOrEven {

    private static OddOrEven oddOrEven;

    @BeforeAll
    public static void setUp(){
        oddOrEven = new OddOrEven();
    }

    @Test
    public void testOddNumber() {
        assertTrue(oddOrEven.isOddNumber(4));
    }

    @Test
    public void testEvenNumber() {
        assertTrue(oddOrEven.isOddNumber(5));
    }
}
