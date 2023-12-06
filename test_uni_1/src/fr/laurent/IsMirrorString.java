package fr.laurent;

import java.util.Objects;

public class IsMirrorString {
    public static String check(String userInput, String userLanguage){
        String revertedInput = new StringBuilder(userInput).reverse().toString();

        if (revertedInput.equals(userInput)) {
            if (Objects.equals(userLanguage, "fr")) {
                return revertedInput
                        + System.lineSeparator()
                        + Expressions.Biendit;
            } else {
                return revertedInput
                        + System.lineSeparator()
                        + Expressions.Wellsaid;
            }
        }
        return revertedInput;
    }
}
