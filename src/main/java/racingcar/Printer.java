package racingcar;

public class Printer {
    public void runResult(Car car) {
        System.out.println(car.carName + " : ");
        for (int i=0; i<car.position; i++) {
            System.out.println("-");
        }
        System.out.println();
    }
}
