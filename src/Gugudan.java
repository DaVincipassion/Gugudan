import java.util.Scanner;


public class Gugudan {
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
   
	
      
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = Input.getFirstValue(scanner);
		
		int result = first;
		
		while(true) {
		String symbol = Input.getSymbol(scanner);
		
		if("quit".equals(symbol)) {
			Output.print(result);
			break;
		}
		
		
		int second = Input.getSecondValue(scanner);
	
		result = gugudan(result,symbol,second);
	}
  }
}

