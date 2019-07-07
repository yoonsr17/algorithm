package programmers.p_190707;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HidePhoneNumberTest {
    private HidePhoneNumber hidePhoneNumber = new HidePhoneNumber();

    @Test
    void test_solution() {
        String b = hidePhoneNumber.solution("01033334444");
        assertEquals("*******4444",b);
    }

    @Test
    void test_solution_2() {
        String b = hidePhoneNumber.solution("027778888");
        assertEquals("*****8888",b);
    }

    @Test
    void test_solution2() {
        String b = hidePhoneNumber.solution2("01033334444");
        assertEquals("*******4444",b);
    }

    @Test
    void test_solution2_2() {
        String b = hidePhoneNumber.solution2("027778888");
        assertEquals("*****8888",b);
    }

}