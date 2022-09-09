import java.util.Scanner;

public class ReplaceDigit {
    public static void main(String[] args) {
        String str = "";
        String str2 = "";
        System.out.println("Enter number");
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '0') {
                str2 = str2 + '1';
            }
            else
            {
                str2 = str2 + str.charAt(i);
            }
        }
        System.out.println(str2);
    }
}
