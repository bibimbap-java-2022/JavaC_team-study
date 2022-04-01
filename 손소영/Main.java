package study;

import java.util.Scanner;

public class Main {

    // Scanner 선언 및 생성
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 자신의 이름 출력
        System.out.println("손소영");
        // 자신의 학번 출력
        System.out.println("201711649");
        System.out.println();
    
        // A와 B를 받아 A@B 연산 결과를 출력하는 프로그램 작성
        // A@B = (A+B)*(A-B)
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        
        System.out.println("A@B = " + (a + b) * (a - b) );
        System.out.println();
        // (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        System.out.println("(A+B)%C는 ((A%C) + (B%C))%C 와 같을까?");
        int result1 = (a + b) % c;
        int result2 = ((a % c) + (b % c)) % c;
        if (result1 == result2)
            System.out.println("같다");
        else
            System.out.println("다르다");
        // (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
        System.out.println("(A×B)%C는 ((A%C) × (B%C))%C 와 같을까?");
        int result3 = (a * b) % c;
        int result4 = ((a % c) * (b % c)) % c;
        if (result3 == result4)
            System.out.println("같다");
        else
            System.out.println("다르다");
        // 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성.
        
    }
}