package GenericStack;

public class Prog {
    public static void main(String args[]) {
        Stack stack = new Stack(5);

        try {
            stack.push(new Element(5));
            stack.push(new Element(5));
            stack.push(new Element(5));
            stack.push(new Element(5));
            stack.push(new Element(5));
            stack.push(new Element(5));
        } catch (StackErrorException e) {
            // TODO Auto-generated catch block
            e.print();
        }
    
    }
}
