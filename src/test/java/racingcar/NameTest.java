package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameTest {

    @Test
    void 이름_클래스는_문자열변수를가지고_출력한다() {
        String nameString = "test";
        Name name = new Name(nameString);
        assertThat(name.printName()).isEqualTo(nameString);
    }
}