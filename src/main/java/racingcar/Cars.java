package racingcar;

import java.util.List;
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
}
