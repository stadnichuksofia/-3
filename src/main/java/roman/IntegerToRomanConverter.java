package roman;

public class IntegerToRomanConverter {

    private static final int[] values = {
        1000, 900, 500, 400, 100, 90,
        50, 40, 10, 9, 5, 4, 1
    };

    private static final String[] symbols = {
        "M", "CM", "D", "CD", "C", "XC",
        "L", "XL", "X", "IX", "V", "IV", "I"
    };

    public static String convertToRoman(int number) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < values.length && number > 0; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(symbols[i]);
            }
        }

        return result.toString();
    }
}
