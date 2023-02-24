import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = reverseWords(inputString);
        System.out.println(reversedString);
    }

    private static String reverseWords(String inputString) {
        String[] words = inputString.split(" ");
        StringBuilder reversedString = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String reversedWord = reverseString(words[i]);
            reversedString.append(reversedWord).append(" ");
        }
        return reversedString.toString().trim();
    }

    private static String reverseString(String inputString) {
        StringBuilder reversedString = new StringBuilder(inputString);
        return reversedString.reverse().toString();
    }
}
