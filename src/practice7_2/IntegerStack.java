package practice7_2;

import java.util.ArrayDeque;
import java.util.Deque;

public class IntegerStack {

    private Deque<Integer> data = new ArrayDeque<Integer>();

    public void addInteger(int num) {
        data.addFirst(num);
    }

    public void removeInteger() {
        if (data.isEmpty()) {
            System.out.println("The stack is already empty");
        } else {
            data.removeFirst();
        }
    }

    public int checkTop() {
        return data.peekFirst();
    }

    @Override
    public String toString() {
        return data.toString();
    }

    public static void main(String[] args) {

        IntegerStack stack = new IntegerStack();

        stack.addInteger(1);
        stack.addInteger(2);
        stack.addInteger(3);
        stack.addInteger(4);
        stack.addInteger(5);
        stack.addInteger(6);
        stack.addInteger(7);

        System.out.println(stack);

        System.out.println();

        System.out.println("Top of stack: " + stack.checkTop());

        stack.removeInteger();
        stack.removeInteger();
        stack.removeInteger();

        System.out.println(stack);

    }

}
