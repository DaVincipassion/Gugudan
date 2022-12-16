import java.util.Scanner;

public class Gugudan {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ã¹ ¹ø¤Š ÀÔ·Â °ª: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		System.out.println("µÎ ¹ø¤Š ÀÔ·Â °ª: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		System.out.println("°ªÀÇ ÇÕ" +(first + second));
		System.out.println("°ªÀÇ –E¼À" +(first - second));
		System.out.println("°ªÀÇ °ö¼À" +(first * second));
		System.out.println("°ªÀÇ ³ª´°¼À" +(first / second));
	}

}
