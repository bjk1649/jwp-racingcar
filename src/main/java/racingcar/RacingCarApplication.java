package racingcar;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class RacingCarApplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("챠량의 수를 입력하세요.");
		int n = sc.nextInt();

		System.out.println("차량 이름을 입력하세요.");
		String input = sc.next();

		List<String> carInfo = new ArrayList<>(Arrays.asList(input.split(",")));

		if (carInfo.size() != n) {
			System.out.println("입력한 차량의 수와 입력받은 이름의 갯수가 일치하지 않습니다.");
			return;
		}

		List<Car> cars = new ArrayList<>();
		for (String carName : carInfo) {
			cars.add(new Car(carName));
		}

		System.out.println("움직일 횟수를 입력하세요.");
		int moveCount = sc.nextInt();

		for(int i=0; i<moveCount; i++) {
			Printer printer = new Printer();
			cars.get(i).runResult();
		}
	}
}
