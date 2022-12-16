import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번쨰 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		int result = first;
		
		while(true) {
		System.out.println("연산 입력 값: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		if("quit".equals(symbol)) {
			System.out.println("최종 결과 값 "+ result);
		}
		
		
		System.out.println("두 번쨰 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		
		if(symbol.equals("+")) {
		System.out.println("값의 합" +(first + second));
		}
		else if(symbol.equals("-")) {
		System.out.println("값의 뺼셈" +(first - second));
		}
		else if(symbol.equals("*")) {
		System.out.println("값의 곱셈" +(first * second));
		}
		else if(symbol.equals("/")) {
		System.out.println("값의 나눗셈" +(first / second));
		}
		else {
	    System.out.println("사칙연산 기호가 아님");
	    }
	}
}
}

