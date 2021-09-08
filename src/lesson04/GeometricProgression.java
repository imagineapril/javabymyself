package lesson04;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        System.out.print("Введите знаменатель геометрической прогрессии: ");
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 1; i < 1000; i *= q) {
            System.out.print(i + " | ");
        }
    }
}
