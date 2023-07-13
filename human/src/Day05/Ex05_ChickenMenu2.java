package Day05;

import java.util.Scanner;

/*
		############ 메 뉴 판 #############
		1. 교촌 치킨 - 허니콤보 치킨
		2. 처갓집 - 양념치킨
		3. 굿후렌드 - 후라이드 치킨
		4. 후라이드잘하는집 - 후라이드 치킨
		5. 보드람 - 후라이드 치킨
		6. 굽네치킨 - 볼케이노
		7. BBQ - 황금올리브 반반 치킨
		0. 종료
		############### 입력 : 
		
		메뉴 번호에 따라 메뉴 변수에 해당메뉴를 저장해주고,
		"(해당메뉴) 이 주문되었습니다."라고 출력하시오.
		0을 입력하기 전까지 반복하고,
		0을 입력하면 반복을 종료합니다.
		종료시, "?개의 주문을 완료합니다."라고 출력하시오.
 */
public class Ex05_ChickenMenu2 {

	public static void main(String[] args) {
		int menuNo = 0;
		int count = -1;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("############ 메 뉴 판 #############");
			System.out.println("1. 교촌 치킨 - 허니콤보 치킨");
			System.out.println("2. 처갓집 - 양념치킨");
			System.out.println("3. 굿후렌드 - 후라이드 치킨");
			System.out.println("4. 후라이드잘하는집 - 후라이드 치킨");
			System.out.println("5. 보드람 - 후라이드 치킨");
			System.out.println("6. 굽네치킨 - 볼케이노");
			System.out.println("7. BBQ - 황금올리브 반반 치킨");
			System.out.println("0. 종료");
			System.out.println("############### 입력 : ");
			menuNo = sc.nextInt();
			
			switch (menuNo) {
			case 1:
				System.out.println("교촌 치킨 - 허니콤보 치킨이 주문되었습니다.");
				break;
			case 2: 
				System.out.println("처갓집 - 양념치킨킨이 주문되었습니다.");
				break;
			case 3: 
				System.out.println("굿후렌드 - 후라이드 치킨이 주문되었습니다.");
				break;
			case 4: 
				System.out.println("후라이드잘하는집 - 후라이드 치킨이 주문되었습니다.");
				break;
			case 5: 
				System.out.println("보드람 - 후라이드 치킨이 주문되었습니다.");
				break;
			case 6: 
				System.out.println("굽네치킨 - 볼케이노이 주문되었습니다.");
				break;
			case 7: 
				System.out.println("BBQ - 황금올리브 반반 치킨이 주문되었습니다.");
				break;
			default:
				break;
			}
			count++;
			
		} while (menuNo != 0);
		System.out.println(count + "개의 주문을 완료합니다");
		sc.close();
	}
}
