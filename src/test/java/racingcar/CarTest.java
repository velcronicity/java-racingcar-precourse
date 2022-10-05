package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차는_전진_또는_멈춤_한다() {
        Car car = new Car("test");
        car.go();
        assertThat(car.getDistance()).isEqualTo(1);
        car.stop();
        assertThat(car.getDistance()).isEqualTo(1);
        car.go();
        assertThat(car.getDistance()).isEqualTo(2);
        car.stop();
        assertThat(car.getDistance()).isEqualTo(2);
    }

    @Test
    void 자동차는_5자리이하_이름을_갖고_출력한다() {
        String name = "hello";
        Car car = new Car(name);
        assertThat(car.printName()).isEqualTo(name);
        assertThatThrownBy(() -> new Car("123456"))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.CAR_NAME_LENGTH_ERROR);
        assertThatThrownBy(() -> new Car(null))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage(Message.CAR_NAME_LENGTH_ERROR);
    }
}
