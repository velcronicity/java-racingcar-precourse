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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Distance distance1 = (Distance)o;

        return distance == distance1.distance;
    }

    @Override
    public int hashCode() {
        return distance;
    }

    public int compare(Distance distance) {
        return this.distance < distance.get() ? -1 : 1;
    }
}
