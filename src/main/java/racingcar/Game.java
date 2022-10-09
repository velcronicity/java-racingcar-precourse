package racingcar;

import java.util.List;

public class Game {
    private final Cars cars;

    public Game(List<String> carNames) {
        this.cars = new Cars(carNames);
    }

    public FinalWinner start(int count) {
        System.out.println("\n실행 결과");
        for (int i = 0; i < count; i++) {
            GoStopParams goStopParams = new GoStopParams(cars.getSize());
            MiddleResult middleResult = cars.process(goStopParams);
            System.out.println(middleResult.print());
            System.out.println();
        }
        return cars.getFinalWinner();
    }
}
