package programmers.p_190624;

import java.util.ArrayList;

public class NotLikeSameNumber {
    // 같은 숫자는 싫어

    public int[] solution(int[] arr) {
        int[] answer = {};

        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(arr[0]);

        for(int i = 0; i<arr.length-1;i++) {
            if(arr[i+1] == arr[i]) {
            } else {
                al.add(arr[i+1]);
            }
        }

        answer = new int[al.size()];
        int size = 0;
        for(int idx:al) {
            answer[size++] = idx;
        }

        return answer;
    }
}
