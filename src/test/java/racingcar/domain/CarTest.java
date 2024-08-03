package racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.ThrowingSupplier;

@SuppressWarnings("NonAsciiCharacters")
class CarTest {
    @Test
    void 자동차_이름의_글자수가_다섯글자_이상이면_예외를_던진다() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Car("asdfsd"));
    }

    @Test
    void 자동차_이름의_글자수가_다섯글자_이하이면_예외를_던지지_않는다() {
        String 자동차_이름 = "aasd";
        ThrowingSupplier<Car> 실행할_함수 = () -> new Car(자동차_이름);
        Assertions.assertDoesNotThrow(실행할_함수);
    }

    @Test
    void num이_4이상일때_position이_증가한다() {
        Car car = new Car("son");
        car.run(5);

        Assertions.assertNotEquals(car.position, 0);
    }
}