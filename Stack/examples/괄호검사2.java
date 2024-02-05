package Stack;

import java.util.Arrays;

public class 괄호검사2 {
    public static void main(String[] args) {
        String text = "({})[{)]";
        char[] textArr = text.toCharArray();

        char open1 ='(';
        char open2 = '{';
        char open3 = '[';

        char close1 = ')';
        char close2 = '}';
        char close3 = ']';

        int flag = 1;

        for (int i = 0; i < textArr.length; i++) {
            if (textArr[i] == open1 || textArr[i] == open2 || textArr[i] == open3) {
                Stack.push(textArr[i]);
            } else {
                if (Stack.pop() == open1) {
                    System.out.println(Stack.pop());
                    if (textArr[i] != close1) {
                        flag = 0;
                        break;
                    }
                }
                if (Stack.pop() == open2) {
                    System.out.println(Stack.pop());
                    if (textArr[i] != close2) {
                        flag = 0;
                        break;
                    }
                }
                if (Stack.pop() == open3){
                    System.out.println(Stack.pop());
                    if (textArr[i] != close3) {
                        flag = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(flag);
    }

    public static class Stack {
        static char[] stack = new char[10];
        static int top = -1;

        public static boolean isEmpty() {
            return top == -1;
        }

        public static boolean isFull() {
            return top == stack.length - 1;
        }

        public static void push(char item) {
            if (isFull()) {
                return;
            }
            stack[++top] = item;
        }

        public static char pop() {
            if (isEmpty()) {
                return 'e';
            }
            return stack[top--];
        }
    }
}
