package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MiddleResultTest {

    @Test
    void 중간_결과_출력() {
        Car yubi = new Car("yubi");
        yubi.go();

        Car zozo = new Car("zozo");
        zozo.stop();

        Car zanbi = new Car("zanbi");
        zanbi.go();
        zanbi.go();
        zanbi.go();

        MiddleResult result = new MiddleResult(Arrays.asList(yubi, zozo, zanbi));
        assertThat(result.print()).isEqualTo("yubi : -" + "\n" + "zozo : " + "\n" + "zanbi : ---");
    }
}