package programmers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("서울에서 김서방 찾기 TEST")
class FindingKimInSeoulTest {

    private FindingKimInSeoul findingKimInSeoul = new FindingKimInSeoul();

    @Test
    void test() {
        String[] a1 = {"ESens","Kim","Jane"};
        String a = findingKimInSeoul.solution(a1);
        assertEquals("김서방은 1에 있다",a);

    }

    @Test
    void test2() {
        String[] a1 = {"ESens","Kim","Jane"};
        String a = findingKimInSeoul.solution2(a1);
        assertEquals("김서방은 1에 있다",a);
    }

}