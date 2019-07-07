package programmers.p_190627;

public class CreateStrangeCharacters {
    // 이상한 문자 만들기
    /*
    문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
    각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

    ex )
    try hello world는 세 단어 try, hello, world로 구성되어 있습니다.
    각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 TrY, HeLlO, WoRlD입니다.
    따라서 TrY HeLlO WoRlD 를 리턴합니다.
    */
    public String solution(String s) {
        //String answer = "";

        String[] array = s.split(" ");
        StringBuffer sb = new StringBuffer();

        //출력
        for(int i=0;i<array.length;i++) {
            for(int j = 0; j<array[i].length(); j++) {
                if(j%2 == 0) {
                    sb.append(Character.toUpperCase(array[i].charAt(j)));
                } else {
                    sb.append(Character.toLowerCase(array[i].charAt(j)));
                }
            }
        }
        return sb.toString();
    }


}
