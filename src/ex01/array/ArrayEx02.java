package ex01.array;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 5까지의 수의 합
		int[] a = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		// a 배열의 테이터 값 합 구하기

		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum = " + sum);

		// int[] arr == new int[5]

		// 5개의 데이터를 임으로 입력 하세요
		System.out.println("arr[5]에 임의의 데이터 입력하세요. ");

		int[] arr = new int[5];

		Scanner sc = new Scanner(System.in);

		double[]b = new double[5];
		for (int i = 0; i < arr.length; i++) {
//			System.out.println((i + 1) + "번째 데이터 =");
//			arr[i] = sc.nextInt();
			// 난수 만들기
			b[i] =Math.random()*5;
		}

		System.out.println("\n==========================");
		for (int i = 0; i < arr.length; i++) {
//			System.out.println("arr[" + i + "] = " + arr[i]);
			System.out.println("arr[" + i + "] = " + b[i]);
		}
	}

}
