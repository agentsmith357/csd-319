/**
 *
 * Author: Jelani Jenkins
 * Date: Jun 8, 2025
 * Class Name: Java for Programmers
 * Teacher: Elijah Finch
 */

public class patternmaker {
     public static void main(String[] args) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            StringBuilder line = new StringBuilder();

            for (int s = 0; s < rows - i - 1; s++) {
                line.append("  ");
            }

            int num = 1;
            for (int j = 0; j <= i; j++) {
                line.append(num).append(" ");
                num *= 2;
            }

            num /= 2;
            for (int j = 0; j < i; j++) {
                num /= 2;
                line.append(num).append(" ");
            }

            // This will always print the @ on the 31 line in the code
            while (line.length() < 32) {
                line.append(" ");
            }

            System.out.println(line.toString() + "@");
        }
    }
}