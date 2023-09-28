package Empilhol.Tokenizer;

public class StringStack {
    private String buffer;

    public StringStack(String buffer) {
        this.buffer = buffer;
    }

    public boolean empty() {
        return buffer.length() == 0;
    }

    public char pop() {
        char c = buffer.charAt(0);
        buffer = buffer.substring(1); 
        return c;
    }
    
    public char next() {
        return buffer.charAt(0);
    }
}
