package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차는_전진_또는_멈춤_한다() {
        Car car = new Car("test");
        car.go();
        assertThat(car.getDistance().get()).isEqualTo(1);
        car.stop();
        assertThat(car.getDistance().get()).isEqualTo(1);
        car.go();
        assertThat(car.getDistance().get()).isEqualTo(2);
        car.stop();
        assertThat(car.getDistance().get()).isEqualTo(2);
    }

    @Test
    void 자동차_상태출력() {
        Car car = new Car("test");
        assertThat(car.printStatus()).isEqualTo("test : ");
        car.go();
        car.go();
        car.go();
        assertThat(car.printStatus()).isEqualTo("test : ---");
    }
}
