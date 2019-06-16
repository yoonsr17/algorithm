package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("두 정수 사이의 합 TEST")
class SumOfTwoIntegersTest {

    private SumOfTwoIntegers sumOfTwoIntegers = new SumOfTwoIntegers();

    @Test
    @DisplayName("a가 b보다 크다면 b부터 a까지의 합을 구한다.")
    void test_b_to_a(){
        long a = sumOfTwoIntegers.solution(5,1);
        assertEquals(15,a);

    }

    @Test
    @DisplayName("a와 b가 같다면 a를 반환한다.")
    void test_a() {
        long a = sumOfTwoIntegers.solution(3,3);
        assertEquals(3,a);
    }

    @Test
    @DisplayName("b가 a보다 크다면 a부터 b까지의 합을 구한다.")
    void test_a_to_b() {
        long a = sumOfTwoIntegers.solution(1,3);
        assertEquals(6,a);
    }

}