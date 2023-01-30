import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text to reverse: ");
        String input = scanner.nextLine();

        StringBuilder output = new StringBuilder();

        System.out.print("The reverse form of that text is: ");

        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }

        System.out.println(output);
    }

}