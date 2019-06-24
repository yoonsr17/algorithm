package programmers.p_190624;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NotLikeSameNumberTest {

    private NotLikeSameNumber notLikeSameNumber = new NotLikeSameNumber();

    @Test
    void test() {
        int[] arr = {1,1,3,3,0,1,1};

        int[] arr2 = {1,3,0,1};

        int[] answer = notLikeSameNumber.solution(arr);
        assertEquals(Arrays.toString(arr2),Arrays.toString(answer));

    }

    @Test
    void test2() {
        int[] arr = {4,4,4,3,3};

        int[] arr2 = {4,3};

        int[] answer = notLikeSameNumber.solution(arr);
        assertEquals(Arrays.toString(arr2),Arrays.toString(answer));

    }

    @Test
    void test3() {
        int[] arr = {5,4,4,2,3};

        int[] arr2 = {5,4,2,3};

        int[] answer = notLikeSameNumber.solution(arr);
        assertEquals(Arrays.toString(arr2),Arrays.toString(answer));

    }

}