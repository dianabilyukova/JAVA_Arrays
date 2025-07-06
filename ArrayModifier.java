import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int[] nums = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        while (true) {
            String commandLine = scanner.nextLine();
            if (commandLine.equals("end")) break;

            String[] cmd = commandLine.split(" ");
            switch (cmd[0]) {
                case "swap":
                    int index1 = Integer.parseInt(cmd[1]);
                    int index2 = Integer.parseInt(cmd[2]);
                    int temp = nums[index1];
                    nums[index1] = nums[index2];
                    nums[index2] = temp;
                    break;
                case "multiply":
                    index1 = Integer.parseInt(cmd[1]);
                    index2 = Integer.parseInt(cmd[2]);
                    nums[index1] = nums[index1] * nums[index2];
                    break;
                case "decrease":
                    for (int i = 0; i < nums.length; i++) {
                        nums[i]--;
                    }
                    break;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < nums.length - 1) {
                System.out.print(nums[i] + ", ");
            } else {
                System.out.println(nums[i]);
            }
        }
    }
}