package programmers.p_190630;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfDividingNumbers {
    // 나누어 떨어지는 숫자 배열
    /*
    array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
    divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.
    arr	             divisor	        return
    [5, 9, 7, 10]	    5	            [5, 10]
    [2, 36, 1, 3]	    1	            [1, 2, 3, 36]
    [3,2,6]        	    10	            [-1]

     */
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};

        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int idx : arr) {
            if (idx % divisor == 0) {
                al.add(idx);
            } else if (al.isEmpty()) {
                al.add(-1);
            }
        }

        answer = new int[al.size()];
        int size = 0;
        for (int idx : al) {
            answer[size++] = idx;
        }

        Arrays.sort(answer);

        return answer;

    }
}
