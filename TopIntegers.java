import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            boolean isTop = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] <= nums[j]) {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(nums[i] + " ");
            }
        }
    }
}