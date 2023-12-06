import fr.laurent.Expressions;
import fr.laurent.Time;
import fr.laurent.isMirrorString;

import java.time.LocalTime;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String userLanguage = System.getProperty("user.language");
        LocalTime noon = LocalTime.parse("12:00:00");

        if (Time.whenAreWe(noon)) {
            if (Objects.equals(userLanguage, "fr")){
                System.out.print(Expressions.Bonjour);
            } else {
                System.out.print(Expressions.GoodMorning);
            }
        } else {
            if (Objects.equals(userLanguage, "fr")){
                System.out.print(Expressions.Bonsoir);
            } else {
                System.out.print(Expressions.GoodAfternoon);
            }
        }

        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        while (Objects.equals(userInput, "")) {
            userInput = in.nextLine();
        }

        String output = isMirrorString.check(userInput, userLanguage);

        System.out.print(output.concat("\n"));

        if (Time.whenAreWe(noon)) {
            System.out.print(Expressions.FinMatin);
        } else {
            System.out.print(Expressions.FinAprem);
        }
    }
}

