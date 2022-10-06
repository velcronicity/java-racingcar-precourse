package racingcar;

import static racingcar.Message.*;

import java.util.List;
import java.util.stream.Collectors;

public class FinalWinner {

    private List<Car> cars;

    public FinalWinner(List<Car> cars) {
        this.cars = cars;
    }

    public String print() {
        return FINAL_WINNER_MESSAGE + cars.stream()
            .map(Car::printName)
            .map(Object::toString)
            .collect(Collectors.joining(", "));
    }
}
