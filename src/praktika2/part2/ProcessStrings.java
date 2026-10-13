package praktika2.part2;

public class ProcessStrings implements StringProcessing {

    @Override
    public int countChars(String s) {
        return s.length();
    }

    @Override
    public String oddPositionChars(String s) {
        StringBuilder result = new StringBuilder();
        // позиции 1, 3, 5... (в программировании индексы 0, 2, 4...)
        for (int i = 0; i < s.length(); i += 2) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    @Override
    public String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}