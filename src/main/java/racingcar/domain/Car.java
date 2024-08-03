package racingcar.domain;

public class Car {
    public String carName;
    public int position = 0;

    public Car(final String carName) {
        if (carName.isBlank() || carName.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
    }

    public void run(int num) {
        if (num >= 4) {
            position++;
        }
    }
}
