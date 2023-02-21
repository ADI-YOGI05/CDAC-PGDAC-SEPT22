import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.print("The prime factors of " + num + " are: ");
        printPrimeFactors(num);

        input.close();
    }

    public static void printPrimeFactors(int num) {
        if (num <= 1) {
            return;
        }

        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
                printPrimeFactors(num / i);
                break;
            }
        }
    }

}
