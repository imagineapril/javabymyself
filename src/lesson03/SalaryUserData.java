package lesson03;

import java.util.Scanner;

public class SalaryUserData {
    public static void main(String[] args) {
        System.out.print("Введите зарплату до вычета налогов: ");
        Scanner sc = new Scanner(System.in);
        int salaryBefore = sc.nextInt();
        int salaryAfter = salaryBefore - salaryBefore / 100 * 13;
        System.out.println("Зарплата на руки составит " + salaryAfter);
    }
}
