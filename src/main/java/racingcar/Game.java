package racingcar;

import static racingcar.Message.*;

public class Game {
    public GoStop determineGoStop(int randomNumber) {
        if (randomNumber < 0 || randomNumber > 9)
            throw new IllegalStateException(RANDOM_NUMBER_ERROR);
        if (randomNumber >= 4)
            return GoStop.GO;
        return GoStop.STOP;
    }
}
