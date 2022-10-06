package racingcar;

import static racingcar.Message.*;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class Game {

    private final Cars cars;

    public Game(Cars cars) {
        this.cars = cars;
    }

    public GoStop determineGoStop(int randomNumber) {
        if (randomNumber < 0 || randomNumber > 9)
            throw new IllegalStateException(INTERNAL_ERROR_RANDOM_NUMBER);
        if (randomNumber >= 4)
            return GoStop.GO;
        return GoStop.STOP;
    }

    public FinalWinner process(int count) {
        System.out.println("\n실행 결과");
        for (int i = 0; i < count; i++) {
            MiddleResult middleResult = cars.cycle(getGoStopInput());
            System.out.println(middleResult.print());
            System.out.println();
        }
        return cars.getFinalWinner();
    }

    public GoStopInput getGoStopInput() {
        List<GoStop> list = new ArrayList<>();
        for (int i = 0; i < cars.getSize(); i++) {
            list.add(determineGoStop(Randoms.pickNumberInRange(0, 9)));
        }
        return new GoStopInput(list);
    }
}
