package Stack;

public class Stack {
	
	static int[] stack = new int[5];
	
	static int top = -1;
	
	
	public static void main(String[] args) {
		
		// 더 이상 꺼낼 데이터가 없는 경우
		push(1);
		int data1 = pop();
		int data2 = pop();
		
		// 더 이상 데이터를 넣을 수 없는 경우
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		push(6);

	}
	
	// 삽입: push
	public static void push(int data) {
		if (isFull()) {
			System.out.println("더 이상 추가할 수 없습니다.");
			return;
		}
		stack[++top] = data;
	}
	
	// 삭제: pop
	public static int pop() {
		if (isEmpty()) {
			System.out.println("더 이상 꺼낼 수 없습니다.");
			return Integer.MIN_VALUE;
		}
		return stack[top--];
	}
	
	// 스택이 비었는지 확인하는 메소드: isEmpty
	public static boolean isEmpty() {
		return top == -1;
	}

	// 스택이 다 찼는지 확인하는 메소드: isFull
	public static boolean isFull() {
		return top == stack.length - 1;
	}
	
}
