package ex03.sort;

import java.util.Arrays;

public class ArraysSortTest {
	public static void main(String[] args) {
		//sort 메소드를 이용해서 정렬가능 기본 오름 차순이다
		//내림 차순 이용시 for 문을 이용하여 가능 
		int[] a = { 7, 3, 5, 2, 8 };
		System.out.println("**** 소트 전 출력 : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.println("\n**** 오름차순 정렬 : ");
		Arrays.sort(a);   // 정렬 알고리즘이 이미 내부적으로 처리 되어 있는 메소드
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		System.out.println("\n**** 내림차순 정렬 : ");
		for (int i = a.length-1; i >= 0 ; i--) {
			System.out.print(a[i] + "\t");
		}
	}

}







