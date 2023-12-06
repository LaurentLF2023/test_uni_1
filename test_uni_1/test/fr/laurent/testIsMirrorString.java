package fr.laurent;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testIsMirrorString {
    @ParameterizedTest
    @ValueSource(strings = {"test", "epsi"})
    public void isMirrorString(String input){
        // ETANT DONNE une chaîne n'étant pas un palindrome
        // QUAND on vérifie si c'est un palindrome
        String résultat = isMirrorString.check(input,"fr");

        // ALORS on obtient son miroir
        String inversion = new StringBuilder(input)
                .reverse()
                .toString();
        assertEquals(inversion, résultat);
    }

    @Test
    public void isNotMirrorString(){
        // ETANT DONNE un palindrome
        String palindrome = "radar";

        // QUAND on vérifie si c'est un palindrome
        String résultat = isMirrorString.check(palindrome, "fr");

        // ALORS la chaîne est répétée, suivie de "Bien dit !"
        String attendu = palindrome + System.lineSeparator() + Expressions.Biendit;
        assertEquals(attendu, résultat);
    }
}
