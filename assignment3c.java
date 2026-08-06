import java.util.Scanner;
public class assignment3c {
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the principal amount: ");
            double p = sc.nextDouble();
            System.out.print("Enter the rate of interest: ");
            double r = sc.nextDouble();
            System.out.print("Enter the time period: ");
            double t = sc.nextDouble();
            double interest = (p * r * t) / 100;
            System.out.println("The simple interest is: " + interest);
        }
    }

}    

