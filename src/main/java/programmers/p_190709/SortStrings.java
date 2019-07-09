package programmers.p_190709;

public class SortStrings {
    // 문자열 내 마음대로 정렬하기
    /*
    문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
    예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를 정렬합니다.

    strings	            n	    return
    [sun, bed, car]	    1	    [car, bed, sun]
    [abce, abcd, cdx]	2	    [abcd, abce, cdx]

     */
    public String[] solution(String[] strings, int n) {
        String temp = null;

        for(int i = 0;i < strings.length-1; i++) {
            boolean changed = false;


            for(int k = 0; k < strings.length-1-i; k++ ){
                if(strings[k].charAt(n) > strings[k+1].charAt(n)) {
                    temp = strings[k];
                    strings[k] = strings[k+1];
                    strings[k+1] = temp;
                    changed = true;
                }
                // 인덱스 n번째 문자가 같은 문자열이 여럿 일 경우, 사전순으로 앞선 문자열이 앞쪽에 위치

            }

            if(!changed) break;

        }



        return strings;
    }
}
