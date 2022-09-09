public class Prime1to100 {
    public static void main(String arg[]) {
        int j, i, count;
        System.out.println("Prime numbers between 1 to 100 are");
        for (j = 2; j <= 100; j++) {

            count = 0;

            for (i = 1; i <= j; i++) {

                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                System.out.print(j + " ");
        }
    }
}

