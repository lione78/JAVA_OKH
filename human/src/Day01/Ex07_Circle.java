package Day01;

import java.util.Scanner;

// import : 외부에서 정의된 클래스 파일을 포함하는 키원드
// - import 패키지명.클래스명;
// 자동 import : 클래스명 위에 올려놓고 ctrl + space
// 자동 import : 커서 아무데나 놓고 ctrl + shift + O


/**
 *  반지름 입력 받아, 원의 넓이를 구하는 프로그램
 */


public class Ex07_Circle {

	public static void main(String[] args) {
		// 상수
		// - 프로그램 실행 동안 값을 변경하지 않고 사용할 값
		// - 키워드 : final
		final double PI = 3.141592;
		// PI = 3.14;			-상수는 값 변경 불가
		Scanner sc = new Scanner(System.in);
		// 바로 엔터 : shift + enter
		System.out.println("반지름 : ");
		double radius = sc.nextDouble();
		double area = PI * radius * radius;
		
		System.out.println("원의 넓이는 : " + area);
		
		sc.close();
		
	}
}
