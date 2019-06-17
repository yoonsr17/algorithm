package programmers;

public class RepetitionPatternMaintain {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i<n;i++){
            if(i%2==0) {
                answer += "수";
            } else
            answer += "박";
        }
        return answer;
    }

    public String solution2(int n) {
        String answer = "";
        for(int i=0; i<n; i++){
            answer += (i%2==0) ? "수" : "박";
        }
        return answer;
    }

}
