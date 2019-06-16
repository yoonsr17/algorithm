package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfTwoIntegersTest {

    private SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();

    @Test
    void test(){
        long a = sumOfTwoIntegers.solution(5,1);
        assertEquals(15,a);

    }

    @Test
    void test2() {
        long a = sumOfTwoIntegers.solution(3,3);
        assertEquals(3,a);
    }

    @Test
    void test3() {
        long a = sumOfTwoIntegers.solution(1,3);
        assertEquals(6,a);
    }

}