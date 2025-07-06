import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rotations = Integer.parseInt(scanner.nextLine());

        for (int r = 0; r < rotations; r++) {
            String first = input[0];
            for (int i = 0; i < input.length - 1; i++) {
                input[i] = input[i + 1];
            }
            input[input.length - 1] = first;
        }

        for (String s : input) System.out.print(s + " ");
    }
}