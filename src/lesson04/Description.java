package lesson04;

import java.util.Scanner;

public class Description {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 0) {
            if (a % 2 == 0) {
                System.out.print("Число " + a + " положительное и чётное.");
            } else {
                System.out.print("Число " + a + " положительное и нечётное.");
            }
        }
        if (a < 0) {
            if (a % 2 == 0) {
                System.out.print("Число " + a + " отрицательное и чётное.");
            } else {
                System.out.print("Число " + a + " отрицательное и нечётное.");
            }
        }
        if (a == 0) {
            System.out.print("Ваше число - 0.");
        }
    }
}

