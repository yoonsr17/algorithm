package programmers;

import java.util.Arrays;

public class StringInDescending {
    // 문자열 내림차순으로 배치하기
    public String solution(String s) {
        char[] sArr = s.toCharArray();

        for(int i = 0; i<sArr.length-1; i++) {
            boolean change = false;

            for(int j = 0; j<sArr.length-1-i;j++) {
                if(sArr[j] < sArr[j+1]) {
                    char temp = sArr[j];
                    sArr[j] = sArr[j + 1];
                    sArr[j + 1] = temp;
                    change = true;
                }

            }

            if(!change) break;

        }

        return String.valueOf(sArr);
    }

    public String solution2(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        StringBuffer sb = new StringBuffer(String.valueOf(ch));
        sb.reverse();

        return sb.toString();

    }

}
