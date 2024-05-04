import java.util.Random;
import java.util.Scanner;

public class StreakCounter {
    private static int streak = 0;
    private static boolean addiction = false;

    private static final String[] MOTIVATIONAL_QUOTES = {
            "Nallavangala Aandavan Sothippan Aana Kai Vidamaatan---super star","Illadha vaaipa uruvaakavum theriyum andha vaaipu nazhuvi pona adha izhuthu thakka vachikavum---- Aravindswamy",
            "Believe you can and you're halfway there. -Theodore Roosevelt",
            "The only way to do great work is to love what you do. -Steve Jobs",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. -Winston Churchill",
            "The only limit to our realization of tomorrow will be our doubts of today. -Franklin D. Roosevelt",
            "Don't watch the clock; do what it does. Keep going. -Sam Levenson"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Streak Counter!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Start Tracking Addiction");
            System.out.println("2. Mark Day Completed");
            System.out.println("3. Mark Relapse");
            System.out.println("4. View Current Streak");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    startTrackingAddiction();
                    break;
                case 2:
                    markDayCompleted();
                    break;
                case 3:
                    markRelapse();
                    break;
                case 4:
                    viewCurrentStreak();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void startTrackingAddiction() {
        addiction = true;
        System.out.println("Addiction tracking started successfully!");
    }

    private static void markDayCompleted() {
        if (!addiction) {
            System.out.println("You haven't started tracking any addiction yet. Please select 'Start Tracking Addiction' first.");
            return;
        }
        Random random = new Random();
        System.out.println("Congratulations! You've completed another day!");
        System.out.println("Here's a quote for you:");
        System.out.println(MOTIVATIONAL_QUOTES[random.nextInt(MOTIVATIONAL_QUOTES.length)]);
        streak++;
    }

    private static void markRelapse() {
        if (!addiction) {
            System.out.println("You haven't started tracking any addiction yet. Please select 'Start Tracking Addiction' first.");
            return;
        }
        Random random = new Random();
        System.out.println("Oh no! You've relapsed.");
        System.out.println("But don't give up! Here's a quote to inspire you to restart:");
        System.out.println(MOTIVATIONAL_QUOTES[random.nextInt(MOTIVATIONAL_QUOTES.length)]);
        streak = 0;
    }

    private static void viewCurrentStreak() {
        System.out.println("Current Streak: " + streak + " days");
    }
}