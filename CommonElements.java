import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] first = scanner.nextLine().split(" ");
        String[] second = scanner.nextLine().split(" ");

        for (String s2 : second) {
            for (String s1 : first) {
                if (s2.equals(s1)) {
                    System.out.print(s2 + " ");
                    break;
                }
            }
        }
    }
}
