package racingcar;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> nameList) {
        cars = nameList.stream()
            .map(Car::new)
            .collect(Collectors.toList());
    }

    public int getSize() {
        return cars.size();
    }

    public Distance goStop(int index, GoStop goOrStop) {
        Car car = cars.get(index);
        if (goOrStop == GoStop.GO) {
            car.go();
        }
        return car.getDistance();
    }

    public MiddleResult cycle(GoStopInput goStopInput) {
        for (int i = 0; i < cars.size(); i++) {
            goStop(i, goStopInput.get(i));
        }

        List<String> results = cars.stream()
            .map(Car::printStatus)
            .collect(Collectors.toList());
        return new MiddleResult(results);
    }

    public FinalWinner getFinalWinner() {
        Set<Car> set = new HashSet<>();
        Car winnerCar = cars.stream()
            .max(Car::compare)
            .get();
        set.add(winnerCar);
        for (Car car : cars) {
            if (winnerCar.same(car)) {
                set.add(car);
            }
        }
        return new FinalWinner(new ArrayList<>(set));
    }
}
