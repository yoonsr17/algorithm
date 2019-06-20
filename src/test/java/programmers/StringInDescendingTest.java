package programmers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringInDescendingTest {
    private StringInDescending stringInDescending = new StringInDescending();

    @Test
    void test_st() {
        String a = stringInDescending.solution("Zbcdefg");
        assertEquals("gfedcbZ",a);

    }

    @Test
    void test_st2() {
        String a = stringInDescending.solution("abc");
        assertEquals("cba",a);

    }

    @Test
    void test_st3() {
        String a = stringInDescending.solution("FdacZ");
        assertEquals("dcaZF",a);

    }

    @Test
    void test_st4() {
        String a = stringInDescending.solution("ABC");
        assertEquals("CBA",a);

    }


    @Test
    void test_st5() {
        String a = stringInDescending.solution("ABCefg");
        assertEquals("gfeCBA",a);

    }

    @Test
    void test_st6() {
        String a = stringInDescending.solution("fabc");
        assertEquals("fcba",a);

    }

    @Test
    void test_solu2() {
        String b = stringInDescending.solution2("azsxdc");
        assertEquals("zxsdca", b);

    }
}