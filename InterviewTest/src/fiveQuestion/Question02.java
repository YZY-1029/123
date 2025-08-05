package fiveQuestion;

// Q2: 請以 Java 寫出九九乘法
public class Question02 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}
