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

    public Distance getDistance() {
        return distance;
    }

    public void stop() {
        this.distance.stop();
    }

    public String printStatus() {
        return String.format("%s : %s", printName(), distance.print());
    }

    public int compare(Car car) {
        return this.distance.compare(car.distance);
    }

    public boolean same(Car car) {
        return this.distance.equals(car.distance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Car car = (Car)o;

        return name != null ? name.equals(car.name) : car.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
