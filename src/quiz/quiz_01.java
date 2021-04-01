package quiz;

import java.util.Scanner;

public class quiz_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열문제 1) int[] a = {7,3,5,7,12,99,7,2,7,8}
		// 중에서 7의 개수를 찾으시오
		int[] a = { 7, 3, 5, 7, 12, 99, 7, 2, 7, 8 }; // 이거 소트해서 찾으면 빠르지 않을까?
		int cnt_7 = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 7)
				cnt_7++;
		}

		System.out.println("배열 안의 7의 갯수 : " + cnt_7);
		
	}

}
