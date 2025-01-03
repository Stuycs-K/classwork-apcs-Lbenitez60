import java.util.Random;

public class Driver {

    // Draw a border around the screen
    public static void drawBorder() {
        // Top border
        Text.color(Text.WHITE, Text.background(Text.BLUE), Text.BRIGHT);
        for (int col = 1; col <= 80; col++) {
            Text.go(1, col);
            System.out.print("#");
        }
        // Bottom border
        for (int col = 1; col <= 80; col++) {
            Text.go(30, col);
            System.out.print("#");
        }
        // Left and right borders
        for (int row = 2; row <= 29; row++) {
            Text.go(row, 1);
            System.out.print("#");
            Text.go(row, 80);
            System.out.print("#");
        }
    }

    // Display random integers with specific colors
    public static void displayRandomNumbers(int[] numbers) {
        int spacing = 80 / (numbers.length + 1); // Calculate spacing for even distribution
        Text.color(Text.WHITE, Text.background(Text.BLACK)); // Reset colors
        for (int i = 0; i < numbers.length; i++) {
            int col = spacing * (i + 1); // Determine position
            Text.go(2, col);
            // Choose color based on the value
            if (numbers[i] < 25) {
                Text.color(Text.BRIGHT, Text.RED);
            } else if (numbers[i] > 75) {
                Text.color(Text.BRIGHT, Text.GREEN);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print(numbers[i]);
        }
    }

    // Draw a horizontal separator
    public static void drawSeparator() {
        Text.color(Text.YELLOW, Text.background(Text.BLACK), Text.BRIGHT);
        for (int col = 2; col <= 79; col++) {
            Text.go(3, col);
            System.out.print("-");
        }
    }

    // Draw something in the middle of the screen
    public static void drawMiddleArt() {
        Text.color(Text.MAGENTA, Text.background(Text.CYAN), Text.BRIGHT);
        Text.go(15, 35); // Roughly the middle of the screen
        System.out.print("~* WELCOME *~");
    }

    public static void main(String[] args) {
        System.out.print(Text.CLEAR_SCREEN); // Clear the screen
        System.out.print(Text.HIDE_CURSOR); // Hide the cursor

        drawBorder(); // Step 1: Draw the border

        // Generate and display random numbers
        Random rand = new Random();
        int[] numbers = {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
        displayRandomNumbers(numbers);

        drawSeparator(); // Step 2: Draw a horizontal separator

        drawMiddleArt(); // Extra: Draw something in the middle

        Text.go(31, 1); // Move the cursor to line 31
        System.out.println(Text.RESET); // Reset terminal settings
    }
}
