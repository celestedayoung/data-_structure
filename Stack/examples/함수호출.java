package Stack;

import java.util.Arrays;

public class 함수호출 {
	public static void main(String[] args) {
		System.out.println("---main이 호출되었습니다.---");
		
		int a = 10;	// 기본 자료형
		int[] arr = {1, 2, 3};	// 참조 자료형 -> main과 func1 모두 같은 주소를 참조한다.
		
		func1(a, arr);
		
		System.out.println(a);
		System.out.println(Arrays.toString(arr));
		
		System.out.println("---main이 종료되었습니다.---");
	}
	
	public static void func1(int a, int[] arr) {
		System.out.println("func1이 호출되었습니다.");
		a = 20;
		arr[0] = 4;
		func2();
		System.out.println("func1이 호출되었습니다.");
	}
	
	public static void func2() {
		System.out.println("func2이 호출되었습니다.");
		System.out.println("func2이 호출되었습니다.");
	}
 }
