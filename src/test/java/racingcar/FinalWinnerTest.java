package racingcar;

import static org.assertj.core.api.Assertions.*;
import static racingcar.Message.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FinalWinnerTest {

    @Test
    void 최종우승자_출력() {
        FinalWinner finalWinner = new FinalWinner(Arrays.asList(new Car("123"), new Car("456")));
        assertThat(finalWinner.print()).contains(FINAL_WINNER_MESSAGE);
        assertThat(finalWinner.print()).contains("123");
        assertThat(finalWinner.print()).contains(",");
        assertThat(finalWinner.print()).contains("456");
    }
}