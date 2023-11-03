import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько температур вы хотите ввести?");
        int numTemp = scanner.nextInt();
        double[] temperatures = new double[numTemp];

        for (int i = 0; i < numTemp; i++) {
            System.out.println("Введите температуру " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
        }

        System.out.println("Введенные данные:");
        for (int i = 0; i < numTemp; i++) {
            System.out.println("Температура " + (i + 1) + ": " + temperatures[i]);
        }

        double sum = 0;
        for (int i = 0; i < numTemp; i++) {
            sum += temperatures[i];
        }
        double average = sum / numTemp;
        System.out.println("Среднее арифметическое температур: " + average);
    }
}

