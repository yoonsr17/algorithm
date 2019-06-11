package programmers;

public class Solution {
    // 문자열 다루기 기본
    public boolean solution(String s) {
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for(int i=0;i<s.length();i++) {
                char ch = s.charAt(i);
                System.out.println("ch : " +ch);

                if(!Character.isDigit(ch)) {
                    answer = false;
                    return answer;
                }
            }
            return answer;
        } else
            return false;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String st = "123";

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