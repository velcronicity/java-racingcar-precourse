package racingcar;

import static org.assertj.core.api.Assertions.*;
import static racingcar.Message.*;

import org.junit.jupiter.api.Test;

class GoStopParamsTest {

    @Test
    void 랜덤값_범위에_따라_전진_또는_멈춤() {
        GoStopParams goStopParams = new GoStopParams(0);
        assertThat(goStopParams.determineGoStop(9)).isEqualTo(GoStop.GO);
        assertThat(goStopParams.determineGoStop(4)).isEqualTo(GoStop.GO);
        assertThat(goStopParams.determineGoStop(3)).isEqualTo(GoStop.STOP);
        assertThat(goStopParams.determineGoStop(0)).isEqualTo(GoStop.STOP);
        assertThatThrownBy(() -> goStopParams.determineGoStop(-1))
            .isInstanceOf(IllegalStateException.class)
            .hasMessage(INTERNAL_ERROR_RANDOM_NUMBER);
        assertThatThrownBy(() -> goStopParams.determineGoStop(10))
            .isInstanceOf(IllegalStateException.class)
            .hasMessage(INTERNAL_ERROR_RANDOM_NUMBER);
    }

}