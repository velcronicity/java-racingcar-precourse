package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class CarsTest {
    @Test
    void String_List_입력받아_Car_List_멤버변수_초기화() {
        Cars cars = new Cars(Arrays.asList("yubi", "zozo", "son", "yeopo"));
        assertThat(cars.getSize()).isEqualTo(4);
    }
}