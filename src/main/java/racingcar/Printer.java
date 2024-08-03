package racingcar;

import racingcar.domain.Car;

public class Printer {
    public void runResult(Car car) {
        System.out.print(car.carName + " : ");
        for (int i = 0; i < car.position; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
