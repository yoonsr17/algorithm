package programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 다루기 기본 TEST")
class StringNumberCheckTest {

    private StringNumberCheck stringNumberCheck = new StringNumberCheck();

    @Test
    @DisplayName("길이가 4 or 6이 아닌 문자열을 넣으면 false를 반환한다. ")
    void test_not_length() {
        boolean a = stringNumberCheck.solution("123456789");
        assertEquals(a,false);

    }

    @Test
    @DisplayName("길이가 4이고 숫자로만 구성되어 있는 값을 넣으면 true를 반환한다. ")
   void test_length_four_all_integer(){
        boolean a = stringNumberCheck.solution("1234");
        assertEquals(a,true);
    }

    @Test
    @DisplayName("길이가 4이고 숫자와 문자로 구성되어 있는 값을 넣으면 false를 반환한다. ")
    void test_length_four_string_integer(){
        boolean a = stringNumberCheck.solution("123a");
        assertEquals(a,false);
    }


    @Test
    @DisplayName("길이가 6이고 숫자로만 구성되어 있는 값을 넣으면 true를 반환한다. ")
    void test_length_six_all_integer(){
        boolean a = stringNumberCheck.solution("435698");
        assertEquals(a,true);
    }

    @Test
    @DisplayName("길이가 6이고 숫자와 문자로 구성되어 있는 값을 넣으면 false를 반환한다. ")
    void test_length_six_string_integer(){
        boolean a = stringNumberCheck.solution("987anc");
        assertEquals(a,false);
    }
}