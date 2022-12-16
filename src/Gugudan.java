import java.util.Scanner;


public class Gugudan {
	static int getFirstValue(Scanner scanner) {
		System.out.println("첫 번쨰 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	static String getSymbol(Scanner scanner) {
		
		System.out.println("연산 입력 값: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("두 번쨰 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}
	static int gugudan(int first,String symbol, int second) {
		int result = 0;
		if(symbol.equals("+")) {
			result = first + second;
			System.out.println("값의 합" +(first + second));
		}else if(symbol.equals("-")) {
			result = first - second;
			System.out.println("값의 뺼셈" +(first - second));
		}else if(symbol.equals("*")) {
			result = first * second;
			System.out.println("값의 곱셈" +(first * second));
		}else if(symbol.equals("/")) {
			result = first / second;
			System.out.println("값의 나눗셈" +(first / second));
		}else {
		    System.out.println("사칙연산 기호가 아님");
		}
		return result;
		}
    static void print(int result) {
    	System.out.println("최종 결과 값 "+ result);
    }
	
	
    
    
    
    
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = getFirstValue(scanner);
		
		int result = first;
		
		while(true) {
		String symbol = getSymbol(scanner);
		
		if("quit".equals(symbol)) {
			print(result);
			break;
		}
		
		
		int second = getSecondValue(scanner);
		
		result = gugudan(result,symbol,second);
	}
  }
}

