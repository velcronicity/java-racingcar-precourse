package racingcar;

import static org.assertj.core.api.Assertions.*;
import static racingcar.Message.*;

import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    void 랜덤값_범위에_따라_전진_또는_멈춤() {
        Cars cars = new Cars();
        assertThat(cars.determineGoStop(9)).isEqualTo(GoStop.GO);
        assertThat(cars.determineGoStop(4)).isEqualTo(GoStop.GO);
        assertThat(cars.determineGoStop(3)).isEqualTo(GoStop.STOP);
        assertThat(cars.determineGoStop(0)).isEqualTo(GoStop.STOP);
        assertThatThrownBy(() -> cars.determineGoStop(-1))
            .isInstanceOf(IllegalStateException.class)
            .hasMessage(RANDOM_NUMBER_ERROR);
        assertThatThrownBy(() -> cars.determineGoStop(10))
            .isInstanceOf(IllegalStateException.class)
            .hasMessage(RANDOM_NUMBER_ERROR);
    }
}
