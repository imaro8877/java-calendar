package imaro.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("두수를 입력해주세요.");
		String s1 = scanner.next();
		String s2 = scanner.next();
		System.out.println(s1 + "," + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		System.out.println(a + "," + b);
		System.out.println(a + b);
		System.out.printf("%d 와 %d의 합은 %d 입니다.\n", a, b, a + b);
		scanner.close();

		System.out.println("월을 입력해주세요.");
		Scanner scanner1 = new Scanner(System.in);
		int month = scanner1.nextInt();
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		System.out.printf("%d월은 %d일까지 있습니다.", month, maxDays[month-1]);
		scanner1.close();
	}

}
