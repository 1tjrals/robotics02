package test2;

import java.util.Scanner;

public class Multiplication_table {

	public static void main(String[] args) {

		int m = 0;
		int num = 0;
		
		System.out.print("입력해주세요.>");
		
		Scanner scanner = new Scanner(System.in);
		m = scanner.nextInt();
		
		for(int i =1; i<=9; i++) {
			
			
			System.out.print(m+"x");
			System.out.print(i+"=");
			System.out.println(i*m);
		}
	}
}
