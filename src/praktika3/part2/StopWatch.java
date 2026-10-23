package praktika3.part2;

public class StopWatch {
    // Скрытые поля данных 
    private long startTime;
    private long endTime;

    // Конструктор без аргументов
    public StopWatch() {
        startTime = System.currentTimeMillis();
        endTime = startTime;
    }

    // Геттеры
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // Сброс времени старта
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Засечь время окончания
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Прошедшее время в миллисекундах
    public long getElapsedTime() {
        return endTime - startTime;
    }
}