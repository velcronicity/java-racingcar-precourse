package racingcar;

import static org.assertj.core.api.Assertions.*;
import static racingcar.Message.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CarsTest {
    @Test
    void String_List_입력받아_Car_List_멤버변수_초기화() {
        Cars cars = new Cars(Arrays.asList("yubi", "zozo", "son", "yeopo"));
        assertThat(cars.getSize()).isEqualTo(4);
    }

    @Test
    void finalWinnerTest() {
        Cars cars = new Cars(Arrays.asList("yubi", "zozo", "son", "yeopo"));
        cars.process(new GoStopParams(5));
        FinalWinner finalWinner = cars.getFinalWinner();
        assertThat(finalWinner.print()).contains(FINAL_WINNER_MESSAGE);
    }
}