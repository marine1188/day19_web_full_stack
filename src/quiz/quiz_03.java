package quiz;

import java.util.Scanner;

public class quiz_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 문제 3 //2차원문제

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][4];
		System.out.println("배열 요소 입력 (2행 3렬): ");
		System.out.println("array size : " + arr.length);
		
		// 행렬 입력
		for (int i = 0; i < arr.length - 1; i++) {// row 행
			for (int j = 0; j < arr[i].length; j++) {//col 열
				arr[i][j] = sc.nextInt();

			//더한 다음에 찍으면 된다 
				if (i != 2)
					arr[2][j] += arr[i][j];
			}
		} // end for

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + "\t");
			System.out.println();
		} // end forF

	}

}
