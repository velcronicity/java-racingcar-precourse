package racingcar;

import static racingcar.Message.*;

public class Car {
    private final String name;
    private Distance distance;

    public Car(String name) {
        if (name == null || name.length() > 5)
            throw new IllegalArgumentException(INPUT_ERROR_CAR_NAME);
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

    public String printStatus() {
        return String.format("%s : %s", printName(), distance.print());
    }
}
