package fr.laurent;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestSayHello {
    @ParameterizedTest
    @ValueSource(strings = {"test", "lol"})
    public void isSayHello(String input){

        int stringLength = input.length();

        assertNotEquals(0, stringLength);
    }
}
