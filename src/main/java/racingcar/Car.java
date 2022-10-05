package racingcar;

import static racingcar.Message.*;

public class Car {
    private final String name;
    private int distance;

    public Car(String name) {
        if (name == null || name.length() > 5)
            throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR);
        this.name = name;
        distance = 0;
    }

    public String printName() {
        return name;
    }

    public void go() {
        this.distance += 1;
    }

    public int getDistance() {
        return distance;
    }

    public void stop() {
        //do nothing
    }
}
