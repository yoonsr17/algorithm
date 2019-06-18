package programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("문자열 내 p와 y의 개수 TEST")
class NumberInStringTest {
    private NumberInString numberInString = new NumberInString();

    @Test
    @DisplayName("p와 y의 개수가 같을때 true를 반환한다.")
    void test_count_same() {
        boolean a = numberInString.solution("pPoooyY");
        assertEquals(true,a);

    }

    @Test
    @DisplayName("p와 y의 개수가 다를때 false를 반환한다.")
    void test_count_differ() {
        boolean a = numberInString.solution("Pyy");
        assertEquals(false,a);

    }

    @Test
    @DisplayName("p와 y가 모두 0개일때 true를 반환한다.")
    void test_count_same_zero() {
        boolean a = numberInString.solution("aabasdjlk");
        assertEquals(true,a);

    }

    @Test
    @DisplayName("y가 없을때 false를 반환한다.")
    void test_not_contain_y() {
        boolean a = numberInString.solution("aspPsss");
        assertEquals(false,a);

    }

    @Test
    @DisplayName("p가 없을때 false를 반환한다.")
    void test_not_contain_p() {
        boolean a = numberInString.solution("ayasssYonjn");
        assertEquals(false,a);

    }



}