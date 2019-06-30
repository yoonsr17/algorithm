package programmers.p_190630;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDivisorsTest {
    private SumOfDivisors sumOfDivisors = new SumOfDivisors();

    @Test
    void test() {
        int b = sumOfDivisors.solution(12);
        assertEquals(28, b);
    }

    @Test
    void test2() {
        int b = sumOfDivisors.solution(5);
        assertEquals(6, b);
    }

}