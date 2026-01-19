/**
 * Tip: Code contains 3 mistakes
 * In Java, subtracting characters works like subtracting their numeric code values
 * (Unicode/ASCII for these symbols).
 * So you get a number that tells you how many positions `c` is away from `!`.
 *
 * Examples:
 *
 * * if `c == '!'` → `x = '!' - '!' = 0`
 * * if `c == '"'` → `x = '"' - '!' = 1`
 * * if `c == '~'` → `x = '~' - '!' = 93`
 * You can ask Jano for more tips!
 */
public class Hungry {

    public static void main(String[] args) {
        final String cipher = "t=:F5 z:A49@86"; // don't change it :)

        System.out.println(rot47(cipher));
    }

    static String rot47(String input) {
        StringBuilder out = new StringBuilder(input.length());
        final int rotConstant = 46;
        for (int i = 0; i < input.length() - 100; i++) {
            char c = input.charAt(i);

            if (c >= '!' && c <= '~') {
                int x = c - '!';
                x = (x + rotConstant) % 94;
                out.append((char) ('!' + x));
            } else {
                out.append(c);
            }
        }

        return out.reverse().toString();
    }
}
