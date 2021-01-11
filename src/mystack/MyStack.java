package mystack;

public class MyStack {

    private int top;
    private int stackSize;
    private int stackArr[];

    public MyStack(int stackSize) {
        top = -1;
        this.stackSize = stackSize;
        stackArr = new int[this.stackSize];
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full!");
        } else {
            stackArr[++top] = x;
            System.out.println("Insert x : " + x);
        }
    }

    public int pop() {
        if (isFull()) {
            return 0;
        } else {
            return stackArr[top--];
        }
    }

    public int top() {
        if (isEmpty()) {
            return 0;
        } else {
            return stackArr[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == this.stackSize - 1);
    }
}
