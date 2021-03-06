package ex02.array;

import java.util.Random;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][][] arr = new int[2][2][3];
		int x = 0;
		
		System.out.println("면 = " + arr.length);  // 2
		System.out.println("행 = " + arr[0].length);  // 2
		System.out.println("열 = " + arr[0][1].length);  // 3
		System.out.println("열 = " + arr[0][0].length);  // 3
		
		// input
		for (int i = 0; i < arr.length; i++) {   //
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					//arr[i][j][k] = ++x;
					//arr[i][j][k] = x += 10;
					//arr[i][j][k] = (int)(Math.random() * 100) + 1 ;   // 0 ~ n-1 ==> 0 ~ 99
					
					arr[i][j][k] = new Random().nextInt(45) + 1;   // 1 ~ 45 사이값 추출됨
				} // k end
			} // j end
		} // i end
		
		
		// output data
		for (int i = 0; i < arr.length; i++) {   //
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + "\t");
				} // k end
				System.out.println();
			} // j end
			System.out.println();
		} // i end
		
	}

}
