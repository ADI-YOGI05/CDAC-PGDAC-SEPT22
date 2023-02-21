import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a palindrome: ");
        int num = input.nextInt();

        boolean isPalindrome = checkPalindrome(num);

        if (isPalindrome) {
            System.out.println(num + " is a palindrome number.");
        } else {
            System.out.println(num + " is not a palindrome number.");
        }

        input.close();
    }

    public static boolean checkPalindrome(int num) {
        int temp = num;
        int reversed = 0;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return num == reversed;
    }

}
