import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù ���� �Է� ��: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		int result = first;
		
		while(true) {
		System.out.println("���� �Է� ��: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		if("quit".equals(symbol)) {
			System.out.println("���� ��� �� "+ result);
		}
		
		
		System.out.println("�� ���� �Է� ��: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		
		if(symbol.equals("+")) {
		System.out.println("���� ��" +(first + second));
		}
		else if(symbol.equals("-")) {
		System.out.println("���� �E��" +(first - second));
		}
		else if(symbol.equals("*")) {
		System.out.println("���� ����" +(first * second));
		}
		else if(symbol.equals("/")) {
		System.out.println("���� ������" +(first / second));
		}
		else {
	    System.out.println("��Ģ���� ��ȣ�� �ƴ�");
	    }
	}
}
}

