import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int sum = 0;

        for (String str : input) {
            int num = Integer.parseInt(str);
            if (num % 2 ==0) {
                sum +=num;
            }
        }
        System.out.println(sum);
    }
}
