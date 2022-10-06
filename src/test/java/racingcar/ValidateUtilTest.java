package racingcar;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateUtilTest {
    @Test
    void 자동차이름_5자이하_검증() {
        assertThatThrownBy(() -> ValidateUtil.isValidCarName(null))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_CAR_NAME);
        assertThatThrownBy(() -> ValidateUtil.isValidCarName("123456"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_CAR_NAME);

        assertDoesNotThrow(() -> ValidateUtil.isValidCarName("12345"));
        assertDoesNotThrow(() -> ValidateUtil.isValidCarName("a"));
    }

    @Test
    void 시도회수_검증() {
        assertDoesNotThrow(() -> ValidateUtil.isValidCount("3"));
        assertDoesNotThrow(() -> ValidateUtil.isValidCount("12"));
        assertThatThrownBy(() -> ValidateUtil.isValidCount("a"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_COUNT);
        assertThatThrownBy(() -> ValidateUtil.isValidCount("0"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_COUNT);
        assertThatThrownBy(() -> ValidateUtil.isValidCount(null))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_COUNT);
    }
}