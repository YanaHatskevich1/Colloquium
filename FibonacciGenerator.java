package fibonacci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciGenerator {

    public List<Integer> generateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Число n должно быть положительным.");
        }

        List<Integer> fibonacciSequence = new ArrayList<>(n);

        if (n >= 1) fibonacciSequence.add(0); // F(0)
        if (n >= 2) fibonacciSequence.add(1); // F(1)

        for (int i = 2; i < n; i++) {
            int nextNumber = fibonacciSequence.get(i - 1) + fibonacciSequence.get(i - 2);
            fibonacciSequence.add(nextNumber);
        }

        return fibonacciSequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число n (количество чисел Фибоначчи): ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Ошибка: Число n должно быть положительным.");
                return;
            }

            FibonacciGenerator generator = new FibonacciGenerator();
            List<Integer> fibonacci = generator.generateFibonacci(n);

            System.out.println("Последовательность Фибоначчи из " + n + " чисел: " + fibonacci);
        } catch (Exception e) {
            System.out.println("Ошибка ввода! Убедитесь, что вы вводите целое число.");
        } finally {
            scanner.close();
        }
    }
}
