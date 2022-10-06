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
    void n번째자동차_go_stop_메소드() {
        Cars cars = new Cars(Arrays.asList("yubi", "zozo", "son", "yeopo"));
        Distance distance = new Distance();
        distance.go();
        assertThat(cars.goStop(0, GoStop.GO)).isEqualTo(distance);
        assertThat(cars.goStop(1, GoStop.GO)).isEqualTo(distance);
    }

    @Test
    void finalWinnerTest() {
        Cars cars = new Cars(Arrays.asList("yubi", "zozo", "son", "yeopo"));
        cars.goStop(0, GoStop.GO);
        FinalWinner finalWinner = cars.getFinalWinner();
        assertThat(finalWinner.print()).isEqualTo(FINAL_WINNER_MESSAGE + "yubi");

        cars = new Cars(Arrays.asList("yubi", "zozo", "son", "yeopo"));
        cars.goStop(0, GoStop.GO);
        cars.goStop(3, GoStop.GO);
        finalWinner = cars.getFinalWinner();
        assertThat(finalWinner.print()).isEqualTo(FINAL_WINNER_MESSAGE + "yeopo, yubi");

    }
}