package praktika2.part3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {
        final int N = 100_000;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Добавление в конец
        long start = System.nanoTime();
        for (int i = 0; i < N; i++) arrayList.add(i);
        long timeArr = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < N; i++) linkedList.add(i);
        long timeLinked = System.nanoTime() - start;

        System.out.println("ADD в конец:");
        System.out.println("  ArrayList:  " + timeArr / 1_000_000 + " мс");
        System.out.println("  LinkedList: " + timeLinked / 1_000_000 + " мс");

        // Вставка в середину
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.add(N / 2, i);
        timeArr = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.add(N / 2, i);
        timeLinked = System.nanoTime() - start;

        System.out.println("\nADD в середину (1000 операций):");
        System.out.println("  ArrayList:  " + timeArr / 1_000_000 + " мс");
        System.out.println("  LinkedList: " + timeLinked / 1_000_000 + " мс");

        // Поиск
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.get(N / 2);
        timeArr = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.get(N / 2);
        timeLinked = System.nanoTime() - start;

        System.out.println("\nGET из середины (1000 операций):");
        System.out.println("  ArrayList:  " + timeArr / 1_000_000 + " мс");
        System.out.println("  LinkedList: " + timeLinked / 1_000_000 + " мс");

        // Удаление из начала
        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) arrayList.remove(0);
        timeArr = System.nanoTime() - start;

        start = System.nanoTime();
        for (int i = 0; i < 1000; i++) linkedList.remove(0);
        timeLinked = System.nanoTime() - start;

        System.out.println("\nREMOVE из начала (1000 операций):");
        System.out.println("  ArrayList:  " + timeArr / 1_000_000 + " мс");
        System.out.println("  LinkedList: " + timeLinked / 1_000_000 + " мс");

        System.out.println("\n=== ВЫВОД ===");
        System.out.println("ArrayList быстрее при доступе по индексу.");
        System.out.println("LinkedList быстрее при вставке/удалении в начале.");
    }
}