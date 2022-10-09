package racingcar;

import static racingcar.Message.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FinalWinner {

    private List<Car> cars;

    public FinalWinner(List<Car> cars) {
        Set<Car> set = new HashSet<>();
        Car winnerCar = cars.stream()
            .max(Car::compare)
            .get();
        set.add(winnerCar);
        for (Car car : cars) {
            if (winnerCar.compare(car) == 0) {
                set.add(car);
            }
        }
        this.cars = new ArrayList<>(set);
    }

    public String print() {
        return FINAL_WINNER_MESSAGE + cars.stream()
            .map(car -> car.getName().printName())
            .map(Object::toString)
            .collect(Collectors.joining(", "));
    }
}
