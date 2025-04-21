import java.util.Scanner;

public class FormApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to Console FormApp ===");

        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter your Gender (Male/Female/Other): ");
        String gender = scanner.nextLine();

        System.out.print("Enter your Preferred Language: ");
        String language = scanner.nextLine();

        System.out.print("Enter your City: ");
        String city = scanner.nextLine();

        System.out.println("\n=== Submitted Data ===");
        System.out.println("Name     : " + name);
        System.out.println("Age      : " + age);
        System.out.println("Gender   : " + gender);
        System.out.println("Language : " + language);
        System.out.println("City     : " + city);

        scanner.close();
    }
}
