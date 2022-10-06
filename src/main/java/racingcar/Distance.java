package racingcar;

public class Distance {
    private int distance;

    public Distance() {
        this.distance = 0;
    }

    public void go() {
        distance++;
    }

    public void stop() {
        //do nothing
    }

    public int get() {
        return distance;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
