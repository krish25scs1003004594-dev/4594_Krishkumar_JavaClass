import java.util.Scanner;
public class assignment3b {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.println("Student Details:");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        }
    }
}
