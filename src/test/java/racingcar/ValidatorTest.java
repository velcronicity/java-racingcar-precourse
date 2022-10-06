package racingcar;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidatorTest {
    @Test
    void 자동차이름_5자이하_검증() {
        assertThatThrownBy(() -> Validator.isValidCarName(null))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_CAR_NAME);
        assertThatThrownBy(() -> Validator.isValidCarName("123456"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_CAR_NAME);

        assertDoesNotThrow(() -> Validator.isValidCarName("12345"));
        assertDoesNotThrow(() -> Validator.isValidCarName("a"));
    }

    @Test
    void 시도회수_검증() {
        assertDoesNotThrow(() -> Validator.isValidCount("3"));
        assertDoesNotThrow(() -> Validator.isValidCount("12"));
        assertThatThrownBy(() -> Validator.isValidCount("a"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_COUNT);
        assertThatThrownBy(() -> Validator.isValidCount("0"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_COUNT);
        assertThatThrownBy(() -> Validator.isValidCount(null))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_COUNT);
    }
}