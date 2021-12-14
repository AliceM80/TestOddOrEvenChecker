package test.java;

import main.java.OddEvenChecker;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddEvenCheckerTest {

    private OddEvenChecker oddEvenChecker = new OddEvenChecker();

    @ParameterizedTest(name = "test odd number with: {arguments} ")
    @ValueSource(ints = {25,15})
    public void testOddNumber(int number) {
        assertTrue(oddEvenChecker.isOddNumber(number));
    }

    @ParameterizedTest(name = "test even number with: {arguments} ")
    @ValueSource(ints = {20, 10})
    public void testEvenNumber(int number) {
        assertFalse(oddEvenChecker.isOddNumber(number));
    }
}