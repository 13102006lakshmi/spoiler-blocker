
import java.util.Scanner;

public class SpoilerBlocker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] spoilers = {
            "dies", "death", "killer", "ending",
            "murder", "twist", "secret"
        };

        System.out.println("=== SPOILER BLOCKER ===");
        System.out.println("Enter your message:");

        String message = sc.nextLine();

        boolean found = false;

        for (String word : spoilers) {
            if (message.toLowerCase().contains(word)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Spoiler detected!");
            System.out.println("Message blocked.");
        } else {
            System.out.println("No spoiler detected.");
            System.out.println("Message: " + message);
        }

        sc.close();
    }
}
