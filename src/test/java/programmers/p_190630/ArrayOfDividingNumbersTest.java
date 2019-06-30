package programmers.p_190630;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfDividingNumbersTest {
    private ArrayOfDividingNumbers arrayOfDividingNumbers = new ArrayOfDividingNumbers();

    @Test
    void test() {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        int[] arr2 = {5,10};

        int[] answer = arrayOfDividingNumbers.solution(arr,divisor);
        assertEquals(Arrays.toString(arr2),Arrays.toString(answer));
    }


    @Test
    void test2() {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;

        int[] arr2 = {1,2,3,36};

        int[] answer = arrayOfDividingNumbers.solution(arr,divisor);
        assertEquals(Arrays.toString(arr2),Arrays.toString(answer));
    }

    @Test
    void test3() {
        int[] arr = {3,2,6};
        int divisor = 10;

        int[] arr2 = {-1};

        int[] answer = arrayOfDividingNumbers.solution(arr,divisor);
        assertEquals(Arrays.toString(arr2),Arrays.toString(answer));
    }


}