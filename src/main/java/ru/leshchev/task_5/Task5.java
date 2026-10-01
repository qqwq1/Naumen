package ru.leshchev.task_5;

import java.util.Scanner;

public class Task5 implements Task {
    private final int seconds;
    private boolean running;

    public Task5(int seconds) {
        if (seconds < 0) {
            throw new IllegalArgumentException("Время не может быть отрицательным.");
        }
        this.seconds = seconds;
    }

    @Override
    public void start() {
        if (running) {
            return;
        }
        running = true;
        try {
            for (int remaining = seconds; remaining >= 0 && running; remaining--) {
                System.out.println(remaining);
                if (remaining == 0) {
                    break;
                }
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            stop();
        }
    }

    @Override
    public void stop() {
        running = false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите время в секундах: ");
        Task5 timer = new Task5(scanner.nextInt());
        timer.start();
    }
}
