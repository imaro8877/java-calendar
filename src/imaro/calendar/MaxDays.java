package imaro.calendar;

import java.util.Scanner;

public class MaxDays {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int maxDaysofMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {
		System.out.println("월을 입력해주세요.");
		Scanner scanner = new Scanner(System.in);
		MaxDays cal = new MaxDays();
		int month = scanner.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.", month, cal.maxDaysofMonth(month));
		scanner.close();
	}

}
