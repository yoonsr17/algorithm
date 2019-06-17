package programmers;

import java.util.Arrays;

public class FindingKimInSeoul {
    /*
    # 서울에서 김서방 찾기
    String형 배열 seoul의 element중 Kim의 위치 x를 찾아, 김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요.
    seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

    */

    public String solution(String[] seoul) {
        int a = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 " + a + "에 있다";
    }

    public String solution2(String[] seoul) {
        int x = 0;
        for (String name : seoul) {
            if(name.equals("Kim"))
                break;
            x++;
        }
        return "김서방은 "+ x + "에 있다";
    }


}
