package fiveQuestion;

import java.util.Scanner;

// Q3: 請用程式畫出
//     *
//    * *
//   * * *
//  * * * *
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
public class Question03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("輸入菱形高度(此題為9)");
		Integer height = scanner.nextInt();
		
		if (height < 3) {
			System.out.println("圖形高度必須大於3");
		} else if (height %2 == 0) {
			System.out.println("圖形高度須為奇數");
		} 
		
		else {
			Integer blockNumber = height/2 + 1;   //此為中間層數, 以及 blockNumber 減掉 i 的時候就會變成第 i 層前面的 block 數量
			String block = " ";
			String blockMixStar = " *";
			
			for (int i = 1; i <= height; i++) {
				
				if (i <= blockNumber) {
					for (int j = 1; j <= blockNumber - i; j++) {    // 第 i 層前面有 blockNumber - i 個 block
						System.out.print(block);
					}
					for (int j = 1; j <=i; j++) {                   // 第 i 層後面有 i 個 blockMixStar
						System.out.print(blockMixStar);
					}
				}
				
				else {												// 規律改變 (i大於blockNumber時)
					for (int j = 1; j <= i - blockNumber; j++) {	// 第 i 層前面有 i - blockNumber 個 block
						System.out.print(block);
					}
					for (int j = 0; j <= height - i ; j++) {     	// 第 i 層後面有 height - i 個 blockMixStar
						System.out.print(blockMixStar);
					}
				}
				System.out.println();
			}
		}
		scanner.close();
	}
}
