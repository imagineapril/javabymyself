package lesson04;

import java.util.Scanner;

public class Minimum {
    public static void main(String[] args) {
        System.out.print("Введите первое число: ");
        Scanner sc1 = new Scanner(System.in);
        int a = sc1.nextInt();
        System.out.print("Введите второе число: ");
        Scanner sc2 = new Scanner(System.in);
        int b = sc2.nextInt();
        if (a < b) {
            System.out.println("Число " + a + " меньше.");
        } else {
            if (b < a) {
                System.out.println("Число " + b + " меньше.");
            } else {
                System.out.println("Числа равны.");
            }
        }
    }
}
