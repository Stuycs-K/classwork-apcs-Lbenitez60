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







    public static void main(String[] args) {

    }
}
