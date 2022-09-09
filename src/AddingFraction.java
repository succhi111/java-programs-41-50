
import java.util.Scanner;

public class AddingFraction {


    public static void main(String[] args) {

        int hcf = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numerator and denominator of first fraction ");
        int nume1 = sc.nextInt();
        int deno1 = sc.nextInt();


        System.out.println("Enter numerator and denominator of second fraction  ");
        int nume2 = sc.nextInt();
        int deno2 = sc.nextInt();


        System.out.println("Entered Fraction is (" + nume1 + " / " + deno1 + ") + (" + nume2 + " / " + deno2 + ")");

        int numerator = (nume1 * deno2) + (deno1 * nume2);

        int denominator = deno1 * deno2;

        for (int i = 1; i < numerator || i < denominator; i++) {

            if (numerator % i == 0 && denominator % i == 0) {
                hcf = i;
            }

        }

        System.out.println("The added fraction is " + numerator / hcf + " / " + denominator / hcf);

    }
}

