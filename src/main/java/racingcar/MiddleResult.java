package racingcar;

import java.util.List;
import java.util.stream.Collectors;

public class MiddleResult {
    private List<String> results;

    public MiddleResult(List<String> results) {
        this.results = results;
    }

    public String print() {
        return results.stream()
            .map(Object::toString)
            .collect(Collectors.joining("\n"));
    }
}
