package Day05;

import java.util.Scanner;

/**
 * 화폐 매수 구하기
 * 
 * 금액		: 547620
 * 50000	: 10개
 * 10000	: 4개
 * 5000		: 1개
 * 1000		: 2개
 * 500		: 1개
 * 100		: 1개
 * 50		: 0개
 * 10		: 2개
 * 5		: 0개
 * 1		: 0개
 * 
 * 위와 같이 금액을 입력하면,
 * 큰 화폐단위부터 계산하여 화폐단위별로 화폐매수를
 * 출력하는 프로그램을 작성하시오.
 * 
 */

public class Ex02_NumberOfCurrency {
	/*
	 * (순서도)
	 *  1. 필요한 변수 선언
	 *  - (입력금액), (화폐매수), (화폐단위)
	 *  
	 *  2. (입력금액) 입력
	 *  
	 *  3. 화폐매수 계산
	 *   - [조건] : 큰 화폐 단위부터 계산한다.
	 *   3-1. 화폐매수 계산
	 *    10 = 537620 / 50000
	 *   (화폐매수) = (입력금액) / (화폐단위)
	 *   
	 *   3-2. 잔액 계산
	 *   37620 = 537620 % 50000
	 *   37620 = 537620 - (50000*10)
	 *   i)  (잔 액) = (입력금액) % (화폐단위)
	 *   ii) (잔 액) = (입력금액) - (화폐단위*화폐매수)
	 *   
	 *   3-3. 화폐단위 변환
	 *   	번갈아 가면서, /5, /2 연산을 반복한다.
	 *   (화폐단위) = (화폐단위) / 5
	 *   (화폐단위) = (화폐단위) / 2
	 *   
	 *  4. 3번의 과정을 반복
	 *   - 반복조건 : (화폐단위)가 1보다 크거나 같으면 반복
	 *  5. 3-1 에서 구한 화폐매수를 출력한다.
	 *   
	 */

	public static void main(String[] args) {
		//1. 필요한 변수 선언
		//  - (입력금액), (화폐매수), (화폐단위)
		int input;				// 입력금액
		int count;				// 화폐매수
		int unit = 50000;		// 화폐단위 : 큰 화폐단위부터 시작
		
		// 2. (입력금액) 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		input = sc.nextInt();
		
		boolean sw = true;
		
		// 4. 3번의 과정을 반복
		while (input > 0) {
			// 3-1. 화폐매수 계산
			// (화폐매수) = (입력금액) / (화폐단위)
			count = input / unit;
			
			// 3-2. 잔액 계산
			// i)  (잔 액) = (입력금액) % (화폐단위)
			// ii) (잔 액) = (입력금액) - (화폐단위*화폐매수)
			input = input % unit;
			//input  = input - (unit*count);
			
			System.out.println(unit + "\t:" + count + "개");
			
			// 3-3. 화폐단위 변환
			// (화폐단위) = (화폐단위) / 5
			// (화폐단위) = (화폐단위) / 2
			
			if ( sw ) 
				unit = unit / 5;
			else 
				unit = unit / 2;
			sw = !sw;
			
		}
		
		sc.close();
	}
}
