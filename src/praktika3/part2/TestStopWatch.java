package praktika3.part2;

import java.util.Random;

public class TestStopWatch {
    public static void main(String[] args) {
        // 1. Создаем массив из 100 000 чисел
        int[] numbers = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }

        // 2. Создаем секундомер
        StopWatch stopWatch = new StopWatch();

        // 3. Засекаем время и сортируем массив методом выбора
        stopWatch.start();
        selectionSort(numbers);
        stopWatch.stop();

        // 4. Выводим результат
        System.out.println("Время сортировки 100 000 чисел методом выбора:");
        System.out.println(stopWatch.getElapsedTime() + " миллисекунд");
    }

    // Сортировка методом выбора 
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}