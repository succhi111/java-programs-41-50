
import java.util.Scanner;
public class Circle
    {
        static double pi=3.14;
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the radius");
            int radius=sc.nextInt();

            //formula for area of a circle
            double area = pi * radius * radius;
            System.out.println("Area of circle = " +area);

        }
    }

