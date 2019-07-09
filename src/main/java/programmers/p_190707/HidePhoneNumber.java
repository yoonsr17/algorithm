package programmers.p_190707;

public class HidePhoneNumber {
    // 핸드폰 번호 가리기
    /*
    프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
    전화번호가 문자열 phone_number로 주어졌을 때,
    전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
    */
    public String solution(String phone_number) {
        String answer = "";

        String lastPhone = "";
        lastPhone = phone_number.substring(phone_number.length()-4, phone_number.length());

        String replacePhone = "";
        replacePhone = phone_number.substring(0,phone_number.length()-4);

        for(int i = 0; i < replacePhone.length(); i++) {
            answer += "*";
        }

        answer = answer+lastPhone;

        return answer;
    }

    public String solution2(String phone_number) {
        char[] ch = phone_number.toCharArray();
        for(int i = 0; i < ch.length - 4; i ++){
            ch[i] = '*';
        }
        return String.valueOf(ch);
    }
}
