package ex03.sort;

import java.util.Arrays;

public class ForeachTesat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 7, 3, 5, 2, 8,90,100,88 };
		
		System.out.println("\n**** 오름차순 정렬 : ");
		Arrays.sort(a);   // 정렬 알고리즘이 이미 내부적으로 처리 되어 있는 메소드
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
			if(i==3)break;
		}
		System.out.println("=================");
		//for(자료형 변수명 : 배열명 또는 컬렉션명){반복문실행문;}
		for(int item : a)
			{
				System.out.println(item+" ");
			}
	}

}
