package programmers.p_190709;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortStringsTest {

    private SortStrings sortStrings = new SortStrings();

    @Test
    void test() {
        String[] a  = {"car", "bed", "sun"};

        String[] b  = {"sun", "bed", "car"};


        String[] c = sortStrings.solution(b,1);
        //assertEquals(a,c);
        assertEquals(Arrays.toString(a),Arrays.toString(c));

    }

}