package quiz;

import java.util.Scanner;

public class quiz_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열문제 2) 기상청 특정달 ((4월)이면 30일 기준) 강수량 측정 후
		// 평균을 구하시오(30일이니까 30개의 랜덤 값)

		int day_num = 30;
		double[] rainy_day = new double[day_num];
		double sum = 0, avg = 0;

		for (int i = 0; i < rainy_day.length; i++) {
			rainy_day[i] = Math.random() * 200;
			sum += rainy_day[i];
		}

//		for (int i = 0; i < rainy_day.length; i++) {
//			sum = rainy_day[i] + sum;
//		}

		avg = sum / rainy_day.length; // avg = sum / day_num;

		System.out.println("4월의 평균 강수량 : " + String.format("%.2f", avg) + "mm");

	}

}
