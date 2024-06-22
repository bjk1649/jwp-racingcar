package racingcar;

public class Car {

    public String carName;

    public Car(final String carName) {
        if (carName.isBlank() || carName.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
    }
}
