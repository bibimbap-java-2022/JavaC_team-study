import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	public static void Cal1() {
		
		System.out.println("정재우"); 
		System.out.println("201811294");
		System.out.println("차례대로 2개의 숫자를 입력하세요.");
int A,B;		
		 A = scanner.nextInt();
		 B = scanner.nextInt();
		System.out.println("A@B="+(A+B)*(A-B));
		}
 public static void Cal2() {
	 System.out.println("차례대로 3개의 숫자를 입력하세요.");
	int A,B,C;		
	 A = scanner.nextInt();
	 B = scanner.nextInt();
	 C = scanner.nextInt();
		System.out.println("(A+B)%C="+(A+B)%C);
		System.out.println("((A%C) + (B%C))%C="+((A%C) + (B%C))%C);
		System.out.println("(A+B)%C=((A%C) + (B%C))%C");
		System.out.println();
		System.out.println("(AxB)%C="+(A*B)%C);
		System.out.println("((A%C) x (B%C))%C="+((A%C) * (B%C))%C);
		System.out.println("(A+B)%C=((A%C) x (B%C))%C");
}
 public static void main(String[] args) { 
	 Cal1();
 	Cal2();
 }
}