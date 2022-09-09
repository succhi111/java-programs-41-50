import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();


        int digit = 0;
        while (number != 0) {
            int rem = number % 10;
            number = number / 10;
            digit++;
        }


        System.out.print("Number of Digits = " + digit);

    }
}
