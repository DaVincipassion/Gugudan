import java.util.Scanner;

public class Input {
	static int getFirstValue(Scanner scanner) {
		System.out.println("ù ???? ?Է? ??: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	static String getSymbol(Scanner scanner) {
		
		System.out.println("???? ?Է? ??: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("?? ???? ?Է? ??: ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}
}
