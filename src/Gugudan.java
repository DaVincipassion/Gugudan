import java.util.Scanner;


public class Gugudan {
	static int getFirstValue(Scanner scanner) {
		System.out.println("ù ���� �Է� ��: ");
		int first = scanner.nextInt();
		System.out.println(first);
		return first;
	}
	static String getSymbol(Scanner scanner) {
		
		System.out.println("���� �Է� ��: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		return symbol;
	}
	static int getSecondValue(Scanner scanner) {
		System.out.println("�� ���� �Է� ��: ");
		int second = scanner.nextInt();
		System.out.println(second);
		return second;
	}
	static int gugudan(int first,String symbol, int second) {
		int result = 0;
		if(symbol.equals("+")) {
			result = first + second;
			System.out.println("���� ��" +(first + second));
		}else if(symbol.equals("-")) {
			result = first - second;
			System.out.println("���� �E��" +(first - second));
		}else if(symbol.equals("*")) {
			result = first * second;
			System.out.println("���� ����" +(first * second));
		}else if(symbol.equals("/")) {
			result = first / second;
			System.out.println("���� ������" +(first / second));
		}else {
		    System.out.println("��Ģ���� ��ȣ�� �ƴ�");
		}
		return result;
		}
    static void print(int result) {
    	System.out.println("���� ��� �� "+ result);
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

