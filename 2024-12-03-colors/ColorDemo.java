//wasnt really able to test on mac, and my virtual machine stopped working :(
public class ColorDemo {
    // Constants for terminal control
    public static final String CLEAR_SCREEN = "\u001b[2J";
    public static final String HIDE_CURSOR = "\u001b[?25l";
    public static final String SHOW_CURSOR = "\u001b[?25h";
    public static final String RESET = "\u001b[0m";

    // Colors
    public static final int BLACK = 30;
    public static final int RED = 31;
    public static final int GREEN = 32;
    public static final int YELLOW = 33;
    public static final int BLUE = 34;
    public static final int MAGENTA = 35;
    public static final int CYAN = 36;
    public static final int WHITE = 37;

    public static void main(String[] args) {
        System.out.print(CLEAR_SCREEN + HIDE_CURSOR);

        // Colorful demo
        for (int i = 0; i < 10; i++) {
            go(5, 10); // Move to position (row 5, column 10)
            color(RED, BLACK);
            System.out.print("Red Text");

            go(6, 10);
            color(GREEN, BLACK);
            System.out.print("Green Text");

            go(7, 10);
            color(BLUE, BLACK);
            System.out.print("Blue Text");

            sleep(500); // Pause to simulate animation
            System.out.print(CLEAR_SCREEN); // Clear the screen
        }

        // Reset terminal to default before exiting
        System.out.print(RESET + SHOW_CURSOR);
    }

    // Set foreground and background colors
    public static void color(int foreground, int background) {
        System.out.print("\u001b[" + foreground + ";" + (background + 10) + "m");
    }

    // Move the cursor to a specific position
    public static void go(int row, int column) {
        System.out.print("\u001b[" + row + ";" + column + "f");
    }

    // Delay for a specified amount of milliseconds
    public static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("Sleep interrupted: " + e.getMessage());
        }
    }
}
