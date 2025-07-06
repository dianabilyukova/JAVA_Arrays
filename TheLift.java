import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        String[] input = scanner.nextLine().split(" ");
        int[] lift = new int[input.length];

        for (int i = 0; i < lift.length; i++) {
            lift[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < lift.length && people > 0; i++) {
            int freeSpots = 4 - lift[i];
            int taken = Math.min(people, freeSpots);
            lift[i] += taken;
            people -= taken;
        }

        boolean hasEmpty = false;
        for (int wagon : lift) {
            if (wagon < 4) {
                hasEmpty = true;
                break;
            }
        }

        if (people == 0 && hasEmpty) {
            System.out.println("The lift has empty spots!");
        } else if (people > 0 && !hasEmpty) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }

        for (int wagon : lift) {
            System.out.print(wagon + " ");
        }
    }
}
