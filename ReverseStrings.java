import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");

        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i] + " ");
        }
    }
}
