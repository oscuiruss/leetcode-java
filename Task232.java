package Sobes;

import java.util.Stack;

public class Task232 {
    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        System.out.println(obj.empty());
    }

    static class MyQueue {
        static Stack<Integer> stack1 = new Stack<>();
        static Stack<Integer> stack2 = new Stack<>();

        public MyQueue() {

        }

        public void push(int x) {
            stack1.push(x);
        }

        public int pop() {
            if (!stack2.isEmpty()) {
                return stack2.pop();
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

        public int peek() {
            if (!stack2.isEmpty()) {
                return stack2.peek();
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.peek();
        }

        public boolean empty() {
            return stack2.isEmpty() && stack1.isEmpty();
        }
    }
}
