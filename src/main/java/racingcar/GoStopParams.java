package racingcar;

import static racingcar.Message.*;

import java.util.ArrayList;
import java.util.List;

import camp.nextstep.edu.missionutils.Randoms;

public class GoStopParams {
    private List<GoStop> goStops;

    public GoStopParams(int size) {
        goStops = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            goStops.add(determineGoStop(Randoms.pickNumberInRange(0, 9)));
        }
    }

    public GoStop determineGoStop(int randomNumber) {
        if (randomNumber < 0 || randomNumber > 9)
            throw new IllegalStateException(INTERNAL_ERROR_RANDOM_NUMBER);
        if (randomNumber >= 4)
            return GoStop.GO;
        return GoStop.STOP;
    }

    public GoStop get(int i) {
        return goStops.get(i);
    }

    public int size() {
        return goStops.size();
    }
}
