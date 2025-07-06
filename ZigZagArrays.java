import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            int num1 = Integer.parseInt(input[0]);
            int num2 = Integer.parseInt(input[1]);

            if (i % 2 == 0) {
                arr1[i] = num1;
                arr2[i] = num2;
            } else {
                arr1[i] = num2;
                arr2[i] = num1;
            }
        }

        for (int x : arr1) System.out.print(x + " ");
        System.out.println();
        for (int x : arr2) System.out.print(x + " ");
    }
}