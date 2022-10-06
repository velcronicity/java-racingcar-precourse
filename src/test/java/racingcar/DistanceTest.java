package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DistanceTest {
    @Test
    void go_또는_stop_인경우_distnace_변경() {
        Distance distance = new Distance();
        distance.go();
        assertThat(distance.get()).isEqualTo(1);
        distance.go();
        distance.go();
        assertThat(distance.get()).isEqualTo(3);
        distance.stop();
        distance.stop();
        assertThat(distance.get()).isEqualTo(3);
    }

    @Test
    void 거리_출력_테스트() {
        Distance distance = new Distance();
        assertThat(distance.print()).isEqualTo("");
        distance.go();
        assertThat(distance.print()).isEqualTo("-");
        distance.go();
        assertThat(distance.print()).isEqualTo("--");
    }
}