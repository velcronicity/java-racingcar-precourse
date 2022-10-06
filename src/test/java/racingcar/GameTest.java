package racingcar;

import static org.assertj.core.api.Assertions.*;
import static racingcar.Message.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.jupiter.api.Test;

public class GameTest {
    @Test
    void 랜덤값_범위에_따라_전진_또는_멈춤() {
        Game game = new Game(new Cars(Collections.emptyList()));
        assertThat(game.determineGoStop(9)).isEqualTo(GoStop.GO);
        assertThat(game.determineGoStop(4)).isEqualTo(GoStop.GO);
        assertThat(game.determineGoStop(3)).isEqualTo(GoStop.STOP);
        assertThat(game.determineGoStop(0)).isEqualTo(GoStop.STOP);
        assertThatThrownBy(() -> game.determineGoStop(-1))
            .isInstanceOf(IllegalStateException.class)
            .hasMessage(INTERNAL_ERROR_RANDOM_NUMBER);
        assertThatThrownBy(() -> game.determineGoStop(10))
            .isInstanceOf(IllegalStateException.class)
            .hasMessage(INTERNAL_ERROR_RANDOM_NUMBER);
    }

    @Test
    void goStopInputTest() {
        Game game = new Game(new Cars(Arrays.asList("zozo", "yubi", "zanbi")));
        GoStopInput goStopInput = game.getGoStopInput();
        assertThat(goStopInput.size()).isEqualTo(3);
    }

    @Test
    void cycleTest() {
        Game game = new Game(new Cars(Arrays.asList("zozo", "yubi", "zanbi")));
        FinalWinner process = game.process(3);

    }
}
