package racingcar;

import static racingcar.Message.*;

public class Car {
    private final String name;
    private Distance distance;

    public Car(String name) {
        if (name == null || name.length() > 5)
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR);
        this.name = name;
        distance = new Distance();
    }

    public String printName() {
        return name;
    }

    public void go() {
        this.distance.go();
    }

    public int getDistance() {
        return distance.get();
    }

    public void stop() {
        this.distance.stop();
    }
}
