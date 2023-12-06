import java.time.LocalTime;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        String userLanguage = System.getProperty("user.language");
        LocalTime now = java.time.LocalTime.now();
        LocalTime noon = LocalTime.parse("12:00:00");
        int timeDiff = now.compareTo(noon);

        boolean isMorning = false;

        if (timeDiff < 0) {
            isMorning = true;

            if (Objects.equals(userLanguage, "fr")){
                System.out.print("Bonjour et bienvenue! \n");
            } else {
                System.out.print("Good morning and welcome! \n");
            }
        } else {
            if (Objects.equals(userLanguage, "fr")){
                System.out.print("Bonsoir et bienvenue! \n");
            } else {
                System.out.print("Good afternoon and welcome! \n");
            }
        }

        Scanner in = new Scanner(System.in);
        String userInput = in.nextLine();

        while (Objects.equals(userInput, "")) {
            userInput = in.nextLine();

        }

        StringBuilder input1 = new StringBuilder();
        input1.append(userInput);
        input1.reverse();

        if (input1.toString().equals(userInput)) {

            if (Objects.equals(userLanguage, "fr")) {
                System.out.print("Bien dit! \n");
            } else {
                System.out.print("Well said! \n");
            }
        }

        System.out.print(userInput.concat("\n"));

        if (isMorning) {
            System.out.print("Bonne fin de matinée.");
        } else {
            System.out.print("Bonne fin de journée.");
        }

    }
}