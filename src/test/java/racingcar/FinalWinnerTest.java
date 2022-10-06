package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class FinalWinnerTest {

    @Test
    void 최종우승자_출력() {
        FinalWinner finalWinner = new FinalWinner(Arrays.asList(new Car("123"), new Car("456")));
        assertThat(finalWinner.print()).isEqualTo(Message.FINAL_WINNER_MESSAGE + "123, 456");
    }
}