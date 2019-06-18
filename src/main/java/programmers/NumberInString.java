package programmers;

public class NumberInString {
    boolean solution(String s) {
        int cntP = 0;
        int cntY = 0;

        for(int i = 0; i<s.length();i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                cntP ++;
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                cntY ++;
            }
        }

        if(cntP == 0 && cntY == 0) return true;

        return cntP == cntY ? true : false ;
    }

}
