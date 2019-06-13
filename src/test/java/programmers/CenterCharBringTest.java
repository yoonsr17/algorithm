package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("가운데 글자 가져오기 TEST")
class CenterCharBringTest {
    private CenterCharBring centerCharBring;

    @BeforeEach
    void setUp() {
        centerCharBring = new CenterCharBring();
    }

    @Test
    @DisplayName("bcd를 넣었을 때 (실행하면) c가 반환된다.")
    void test_bcd() {
        //solution 에서 return 값을 변수로 받는다.
        String a = centerCharBring.solution("bcd");
        assertEquals("c", a);
    }

    @Test
    @DisplayName("ab를 넣었을 때 (실행하면) ab가 반환된다.")
    void test_ab(){
        String a = centerCharBring.solution("ab");
        assertEquals("ab", a);
    }

    @Test
    @DisplayName("a를 넣었을 때 (실행하면) a가 반환된다.")
    void test_a() {
        String a = centerCharBring.solution("a");
        assertEquals("a", a);
    }

}