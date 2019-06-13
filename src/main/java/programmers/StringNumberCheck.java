package programmers;

import java.util.Scanner;

public class StringNumberCheck {
    // 문자열 다루기 기본
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) return false;

        for (char chh: s.toCharArray()) {
            if (!Character.isDigit(chh)) {
                return false;
            }
        }
            return true;
    }

    public static void main(String[] args) {
        StringNumberCheck s = new StringNumberCheck();
        String st;
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요 :");

        st = sc.nextLine();

        System.out.println("입력받은 문자 : " + st);

        if (st.length() >= 1 && st.length() <= 8) {
            System.out.println(s.solution(st));
        } else
            System.out.println("retry");
    }

}


/*
문제 설명
문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요.
예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.


제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
*/