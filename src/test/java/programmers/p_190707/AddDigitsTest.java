package programmers.p_190707;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddDigitsTest {
    private AddDigits addDigits = new AddDigits();

    @Test
    void test() {
        int a = addDigits.solution(123);
        assertEquals(6,a);
    }

    @Test
    void test2() {
        int a = addDigits.solution(987);
        assertEquals(24, a);
    }

}