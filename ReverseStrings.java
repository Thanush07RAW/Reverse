import java.util.Scanner;

public class ReverseStrings {
public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter a string: ");
                String inputString = scanner.nextLine();
                System.out.println("Reversed string: " + new StringBuilder(inputString).reverse());
                scanner.close();
            }
        }
    }