package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(List<String> nameList) {
        //todo 이름길이 검증을 여기로 옮길까?
        cars = nameList.stream()
            .map(Car::new)
            .collect(Collectors.toList());
    }

    public int getSize() {
        return cars.size();
    }
}
