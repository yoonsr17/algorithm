package programmers.p_190627;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateStrangeCharactersTest {

    private CreateStrangeCharacters csc = new CreateStrangeCharacters();

    @Test
    void test() {
        String a = "TrY HeLlO WoRlD";
        String b = csc.solution("try hello world");
        assertEquals(a, b);
    }

}