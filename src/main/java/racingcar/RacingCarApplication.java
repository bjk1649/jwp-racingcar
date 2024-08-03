package racingcar;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RacingCarApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = getCarNumbers(sc);

        List<String> carInfo = getCarNames(sc);

        if (carInfo.size() != n) {
            System.out.println("입력한 차량의 수와 입력받은 이름의 갯수가 일치하지 않습니다.");
            return;
        }

        List<Car> cars = createCarsFromName(carInfo);

        int moveCount = getMoveCount(sc);

        for (int i = 0; i < moveCount; i++) {
            runAllCar(cars);
        }
    }

    private static List<Car> createCarsFromName(List<String> carInfo) {
        List<Car> cars = new ArrayList<>();
        for (String carName : carInfo) {
            cars.add(new Car(carName));
        }
        return cars;
    }

    private static int getMoveCount(Scanner sc) {
        System.out.println("움직일 횟수를 입력하세요.");
        return sc.nextInt();
    }

    private static List<String> getCarNames(Scanner sc) {
        System.out.println("차량 이름을 입력하세요.");
        String input = sc.next();

        return new ArrayList<>(Arrays.asList(input.split(",")));
    }

    private static int getCarNumbers(Scanner sc) {
        System.out.println("챠량의 수를 입력하세요.");
        return sc.nextInt();
    }

    private static void runAllCar(List<Car> cars) {
        for (Car car : cars) {
            Printer printer = new Printer();
            car.run((int) (Math.random() * 10));
            printer.runResult(car);
        }
    }
}
