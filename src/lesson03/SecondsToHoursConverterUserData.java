package lesson03;

import java.util.Scanner;

public class SecondsToHoursConverterUserData {
    public static void main(String[] args) {
        System.out.print("Введите секунды: ");
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int hours = seconds / 3600;
        System.out.println(seconds + " секунд составляет " + hours + " часа.");
    }
}
