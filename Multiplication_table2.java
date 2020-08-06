package test2;

public class Multiplication_table2 {

	public static void main(String[] args) {
		
	   int num=0;
				
		for(int i =1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j + "x" + i + "=" + i*j + "\t");
			}
			System.out.print("\n");
		} 
	}
}
