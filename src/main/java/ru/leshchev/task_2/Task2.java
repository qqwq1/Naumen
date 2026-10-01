package ru.leshchev.task_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Количество элементов не может быть отрицательным.");
            return;
        }

        ArrayList<Double> numbers = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            numbers.add(random.nextDouble(-100.0, 100.0));
        }
        System.out.println("Исходный список: " + numbers);
        mergeSort(numbers);
        System.out.println("Отсортированный список: " + numbers);
    }

    public static void mergeSort(ArrayList<Double> numbers) {
        if (numbers.size() < 2) {
            return;
        }
        int middle = numbers.size() / 2;
        ArrayList<Double> left = new ArrayList<>(numbers.subList(0, middle));
        ArrayList<Double> right = new ArrayList<>(numbers.subList(middle, numbers.size()));
        mergeSort(left);
        mergeSort(right);

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                numbers.set(k++, left.get(i++));
            } else {
                numbers.set(k++, right.get(j++));
            }
        }
        while (i < left.size()) {
            numbers.set(k++, left.get(i++));
        }
        while (j < right.size()) {
            numbers.set(k++, right.get(j++));
        }
    }
}
