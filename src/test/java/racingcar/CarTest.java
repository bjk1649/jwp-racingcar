package racingcar;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;

class CarTest {

    @Test
    void 이름이_올바르면_예외가_던져지지_않는다() {
        String name = "이름2";

        Car car = new Car(name);

        assertThat(car.carName).isEqualTo(name);
    }

    @Test
    void 이름이_5자_이상이면_예외를_던진다() {
        String name = "5자이상인이";

        ThrowingCallable throwingCallable = () -> new Car(name);

        assertThatThrownBy(throwingCallable);
    }

    @Test
    void 이름이_빈칸이면_예외를_던진다() {
        String name = "  ";

        ThrowingCallable throwingCallable = () -> new Car(name);

        assertThatThrownBy(throwingCallable);
    }
}
