package programmers;

import java.util.Scanner;

public class CenterCharBring {
    // 가운데 글자 가져오기
    public static void main(String[] args) {
        CenterCharBring ct = new CenterCharBring();
        String st;
        Scanner sc = new Scanner(System.in);

        System.out.println("문자를 입력하세요 :");

        st = sc.nextLine();

        System.out.println("입력받은 문자 : " + st);

        if(st.length() >= 1 && st.length() <=100) {
            System.out.println(ct.solution(st));
//            ct.solution(st);
        }
        else
            System.out.println("retry..");


    }

    public String solution(String s) {
        int a = s.length() % 2;
        int b = s.length() / 2;

        if(a == 1) {
            return Character.toString(s.charAt(b));
        } else
            return s.substring(b-1, b+1);       // 시작, 끝(포함X)

//        return (a == 1) ? s.substring(b,b+1) : s.substring(b-1,b+1);
    }

}
