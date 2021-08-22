package lesson03;

import java.util.Scanner;

public class GasolineCostUserData {
    public static void main(String[] args) {
        System.out.print("Введите количество литров: ");
        Scanner sc = new Scanner(System.in);
        int liter = sc.nextInt();
        int cost = 50;
        System.out.println("Стоимость бензина составит " + liter * cost);
    }
}
