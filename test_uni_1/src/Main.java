import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        LocalTime now = java.time.LocalTime.now();
        LocalTime noon = LocalTime.parse("12:00:00");
        int timeDiff = now.compareTo(noon);

        boolean isMorning = false;

        if (timeDiff < 0) {
            isMorning = true;
            System.out.print("Good morning and welcome! \n");
        } else {
            System.out.print("Good afternoon and welcome! \n");
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

            if (Objects.equals(System.getProperty("user.language"), "fr")) {
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