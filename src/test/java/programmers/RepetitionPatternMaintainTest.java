package programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("수박수박수박수박수박수 TEST")
class RepetitionPatternMaintainTest {

    private RepetitionPatternMaintain repetitionPatternMaintain = new RepetitionPatternMaintain();

    @Test
    @DisplayName("한 글자를 입력하면 '수'를 반환한다.")
    void test_char() {
        String a = repetitionPatternMaintain.solution(1);
        assertEquals("수",a);
    }

    @Test
    @DisplayName("숫자 4를 입력하면 '수박수박'을 반환한다.")
    void test() {
        String a = repetitionPatternMaintain.solution(4);
        assertEquals("수박수박",a);
    }

    @Test
    @DisplayName("숫자 5를 입력하면 '수박수박수'을 반환한다.")
    void test_trinomial() {
        String a = repetitionPatternMaintain.solution2(5);
        assertEquals("수박수박수", a);
    }

}