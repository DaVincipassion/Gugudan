import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ���� �Է� ��: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("���� �Է� ��: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		
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

