package racingcar;

import static racingcar.Message.*;

public class ValidateUtil {
    public static void isValidCarName(String name) {
        if (name == null || name.length() > 5) {
            throw new IllegalArgumentException(INPUT_ERROR_CAR_NAME);
        }
    }

    public static void isValidCount(String countString) {
        int count = parseCount(countString);
        if (count <= 0)
            throw new IllegalArgumentException(INPUT_ERROR_COUNT);
    }

    private static int parseCount(String countString) {
        try {
            return Integer.parseInt(countString);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(INPUT_ERROR_COUNT);
        }
    }
}
