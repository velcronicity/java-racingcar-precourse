package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GameTest {

    @Test
    void goStopInputTest() {
        GoStopParams goStopParams = new GoStopParams(3);
        assertThat(goStopParams.size()).isEqualTo(3);
    }

    @Test
    void cycleTest() {
        Game game = new Game(Arrays.asList("zozo", "yubi", "zanbi"));
        FinalWinner process = game.start(3);

    }
}
