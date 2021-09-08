package lesson04;

import java.util.Scanner;

public class ArithmeticProgression {
    public static void main(String[] args) {
        System.out.print("Введите шаг прогрессии: ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        for (int i = 1; i < 100; i += d) {
            System.out.print(i + " | ");
        }
    }
}
