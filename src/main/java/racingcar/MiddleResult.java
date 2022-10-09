package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class MiddleResult {
    private List<String> results;

    public MiddleResult(List<Car> cars) {
        this.results = cars.stream()
            .map(Car::printStatus)
            .collect(Collectors.toList());

    }

    public String print() {
        return results.stream()
            .map(Object::toString)
            .collect(Collectors.joining("\n"));
    }
}
