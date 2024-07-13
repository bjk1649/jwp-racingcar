package racingcar;

public class Car {

    public String carName;
    public int position = 0;

    public Car(final String carName) {
        if (carName.isBlank() || carName.length() > 5) {
            throw new IllegalArgumentException();
        }
        this.carName = carName;
    }

    public void run(int number) {
        if (number >= 4) {
            position++;
        }
    }
}
