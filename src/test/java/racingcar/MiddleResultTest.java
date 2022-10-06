package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MiddleResultTest {

    @Test
    void 중간_결과_출력() {
        String result1 = "yubi : -";
        String result2 = "zozo : ";
        String result3 = "zanbi : ---";
        MiddleResult result = new MiddleResult(Arrays.asList(result1, result2, result3));
        assertThat(result.print()).isEqualTo(result1 + "\n" + result2 + "\n" + result3);

    }
}