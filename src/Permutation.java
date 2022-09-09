import java.util.Scanner;

public class Permutation {

        public static void main(String[] args) {

            int n, r, per, fact1 = 1, fact2 = 1;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Value of n: ");
            n = sc.nextInt();

            System.out.println("Enter the Value of r: ");
            r = sc.nextInt();

            //calculating factorial (n!)

            for (int i = 1; i <= n; i++) {
                fact1 = fact1 * i;
            }

            int number;

            number = n - r;

            //calculating factorial (n-r)!

            for (int i = 1; i <= number; i++) {
                fact2 = fact2 * i;
            }

            per = fact1 / fact2;  //calculating  nPr

            System.out.println(per + "ways");
        }
    }

