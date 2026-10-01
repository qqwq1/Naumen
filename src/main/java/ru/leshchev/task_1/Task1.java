package ru.leshchev.task_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Количество элементов не может быть отрицательным.");
            return;
        }

        int[] numbers = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        if (n == 0) {
            System.out.println("Массив пуст, максимального значения нет.");
            return;
        }

        long maxAbsolute = 0;
        for (int number : numbers) {
            maxAbsolute = Math.max(maxAbsolute, Math.abs((long) number));
        }
        System.out.println("Максимальное значение по модулю: " + maxAbsolute);
    }
}
