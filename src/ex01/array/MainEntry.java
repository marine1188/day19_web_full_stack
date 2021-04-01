package ex01.array;

public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 선언 하는 방법
		
		char[] ch; //배열선언
		ch = new char[4];//배열생성, 메모리에 할당
		
		//2.선언 과 동시에 할당
		char[] ch2 = new char[4]; //배열선언 및 생성
		//배열 초기화
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		//3.선언과 동시에 초기화//장점 더 늘어나더라도 수정 편의
		char[]ch3 = {'J','A','V','A','K','B','S','M'};
		
		//배열의 길이(크기)
		System.out.println("배열의 길이(크기)" + ch2.length);
		System.out.println("배열의 길이(크기)" + ch3.length);
		
		//배열의 내용 출력
		System.out.println("ch2[2] = " + ch2[2]);
		System.out.println("\n");
		
		for (int i = 0; i < ch2.length; i++) {
			System.out.println("ch2["+i+"] = " + ch2[i]);
		}
		System.out.println("=====================");
		for (int i = 0; i < ch3.length; i++) {
			System.out.println("ch3["+i+"] = " + ch3[i]);
		}
		
	}

}
