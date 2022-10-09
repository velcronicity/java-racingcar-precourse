package racingcar;

import static racingcar.Message.*;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> carNames = readCarsName();
        int count = readCount();
        Game game = new Game(carNames);
        FinalWinner result = game.start(count);
        System.out.println(result.print());
    }

    private static List<String> readCarsName() {
        try {
            return Input.readCarsName();
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_MESSAGE + e.getMessage());
            return readCarsName();
        }
    }

    private static int readCount() {
        try {
            return Input.readCount();
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_MESSAGE + e.getMessage());
            return readCount();
        }
    }
}
