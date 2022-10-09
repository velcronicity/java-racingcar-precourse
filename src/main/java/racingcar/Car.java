package racingcar;

public class Car {
    private final Name name;
    private final Distance distance;

    public Car(String name) {
        this.name = new Name(name);
        this.distance = new Distance();
    }

    public Name getName() {
        return name;
    }

    public Distance getDistance() {
        return distance;
    }

    public void go() {
        this.distance.go();
    }

    public void stop() {
        this.distance.stop();
    }

    public String printStatus() {
        return String.format("%s : %s", name.printName(), distance.print());
    }

    public int compare(Car car) {
        return this.distance.compare(car.distance);
    }

    public void goOrStop(GoStop goStop) {
        if (GoStop.GO == goStop) {
            this.go();
        }
    }
}
