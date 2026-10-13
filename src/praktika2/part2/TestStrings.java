package praktika2.part2;

public class TestStrings {
    public static void main(String[] args) {
        StringProcessing sp = new ProcessStrings();
        String test = "Программирование";

        System.out.println("Исходная строка: " + test);
        System.out.println("Количество символов: " + sp.countChars(test));
        System.out.println("Символы на нечётных позициях: " + sp.oddPositionChars(test));
        System.out.println("Инвертированная строка: " + sp.reverse(test));
    }
}