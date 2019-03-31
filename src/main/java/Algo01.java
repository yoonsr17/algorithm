public class Algo01 {

    public String solution(String[] participant, String[] completion) {
        boolean find = false;

        for (String s : participant) {
            find = false;
            for (String c:completion ) {
                if(s.equals(c)) {      // s=c 제외
                    find = true;
                    break;
                }

            }
            if(!find) {
                return s;
            }

        }

        // return type = String 이기 때문에
        return null;
    }

    public static void main(String[] args) {
        System.out.println("윤화이팅");

        Algo01 algo01 = new Algo01();

        /*
        * participant	    completion	return
        [leo, kiki, eden]	[eden, kiki]	leo
        [marina, josipa, nikola, vinko, filipa]	  [josipa, filipa, marina, nikola]	vinko
        [mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav
        *
        */

        String result3 = algo01.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"});
        String result2 = algo01.solution(new String[]{"marina", "josipa", "nikola","vinko","filipa"}, new String[]{"josipa", "filipa","marina","nikola"});
        String result = algo01.solution(new String[]{"mislav", "stanko", "mislav","ana"}, new String[]{"stanko", "ana", "mislav"});

        System.out.println("result3 : " + result3);
        System.out.println("result2 : " + result2);
        System.out.println("result : " + result);
    }
}
