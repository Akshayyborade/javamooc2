
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0;
        while (true) {
            System.out.println("enter a number:");
            int number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Cannot calculate the average");
                break;
            } else {
                if (number > 0) {
                    sum = sum + number;
                    count++;
                }
            }

        }
        double avg = (double) sum / count;
        System.out.println(avg);
        scanner.close();

    }
}
