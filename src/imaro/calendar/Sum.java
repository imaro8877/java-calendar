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
		System.out.printf("%d 와 %d의 합은 %d 입니다.", a, b, a + b);
		scanner.close();
	}

}
