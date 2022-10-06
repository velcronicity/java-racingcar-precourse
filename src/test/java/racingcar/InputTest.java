package racingcar;

import static org.assertj.core.api.Assertions.*;

import java.io.ByteArrayInputStream;

import org.junit.jupiter.api.Test;

class InputTest {
    @Test
    void 경주자동차_이름입력_후_반환() {
        command("yubi,zozo,son,yeopo");
        assertThat(Input.readCarsName()).hasSize(4);

        command("yubi,");
        assertThat(Input.readCarsName()).hasSize(1);
    }

    @Test
    void 경주자동차_이름입력_검증() {
        command("yubizozo,son,yeopo");
        assertThatThrownBy(Input::readCarsName)
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_CAR_NAME);
    }

    @Test
    void 시도횟수_입력받아_검증후_반환() {
        command("0");
        assertThatThrownBy(Input::readCount)
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_COUNT);

        command("abc");
        assertThatThrownBy(Input::readCount)
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.INPUT_ERROR_COUNT);
    }

    private void command(final String... args) {
        final byte[] buf = String.join("\n", args).getBytes();
        System.setIn(new ByteArrayInputStream(buf));
    }
}