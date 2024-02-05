package Stack;

import java.util.Scanner;
import java.util.Stack;

public class 실행취소 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<String> ctrlZ = new Stack<>();
		Stack<String> ctrlY = new Stack<>();
		
		while(true) {
			System.out.println("1: 새로운 작업");
			System.out.println("2: 실행 취소(Ctrl + Z)");
			System.out.println("3: 취소의 취소(Ctrl + Y)");
			System.out.println("0: 종료");
			
			int N = sc.nextInt();
			
			if (N == 1) {
				
				// 1. 현재 진행 작업을 ctrlZ 스택에 추가한다.
				// 2. 새로운 작업을 입력 받는다.
				// 3. crtlY 스택을 비운다.
				
			} else if (N == 2) {
				
				// ctrlZ 스택에 있는 데이터를 뽑아서 ctrlY 스택으로 넣는다.
				
			} else if (N == 3) {
				
				// ctrlY 스택에 있는 데이터를 뽑아서 다시 ctrlZ 스택으로 넣는다.
				
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
