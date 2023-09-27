package GenericStack;

public class Stack {
    private final int max_length = 1000;
    private Element memory[];
    private int top;

    public Stack() {
        memory = new Element[max_length];
        top = 0;
    }

    public Stack(int length) {
        memory = new Element[length];
        top = 0;
    }

    public boolean empty() {
        return top == 0;
    }

    public boolean full() {
        return top >= memory.length;
    }

    public void push(Element e) throws StackErrorException {
        if (full()) {
            throw new StackErrorException("Stack is full!");
        } else {
            memory[top] = e;
            top++;
        }
    }

    public Element pop() throws StackErrorException {
        if (empty()) {
            throw new StackErrorException("Stack is empty!");
        }   
        top--;
        return memory[top];
    }

    public Element next() throws StackErrorException {
        if (empty()) {
            throw new StackErrorException("Stack is empty!");
        }   
        return memory[top-1];
    }

    public int length() {
        return top;
    }
}
