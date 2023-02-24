import java.util.Scanner;

public class StringPermutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        printPermutations(inputString, "");
    }

    private static void printPermutations(String remainingString, String currentString) {
        int stringLength = remainingString.length();

        // Base case: If the remaining string is empty, we have a permutation
        if (stringLength == 0) {
            System.out.println(currentString);
        }

        // Recursive case: For each character in the remaining string, add it to the current string and
        // recursively find permutations of the remaining characters
        for (int i = 0; i < stringLength; i++) {
            char currentChar = remainingString.charAt(i);
            String newRemainingString = remainingString.substring(0, i) + remainingString.substring(i + 1);
            String newCurrentString = currentString + currentChar;
            printPermutations(newRemainingString, newCurrentString);
        }
    }
}
