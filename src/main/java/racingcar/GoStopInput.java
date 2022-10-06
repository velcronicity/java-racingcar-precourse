package racingcar;

import java.util.List;

public class GoStopInput {
    private List<GoStop> goStops;

    public GoStopInput(List<GoStop> list) {
        this.goStops = list;
    }

    public GoStop get(int i) {
        return goStops.get(i);
    }

    public int size() {
        return goStops.size();
    }
}
