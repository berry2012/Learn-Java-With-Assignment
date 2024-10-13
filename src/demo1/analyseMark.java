package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class analyseMark {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (marks.size() < 6) {
            System.out.print("Enter the mark: ");
            int inputMark = scanner.nextInt();

            if (inputMark >= 0 && inputMark <= 100) {
                marks.add(inputMark);
            } else {
                System.out.println("Invalid mark: " + inputMark);
            }
        }

        System.out.println("Number of marks: " + marks.size());

        double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average mark: " + Math.round(average));

        int highestMark = marks.stream().mapToInt(Integer::intValue).max().orElse(0);
        System.out.println("Highest mark: " + highestMark);

        int lowestMark = marks.stream().mapToInt(Integer::intValue).min().orElse(0);
        System.out.println("Lowest mark: " + lowestMark);

        scanner.close();
    }
}
