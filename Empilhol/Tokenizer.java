package Empilhol;

public class Tokenizer {
    private String buffer;

    public Tokenizer(String buffer) {
        this.buffer = buffer;
    }

    public boolean hasNext() {
        return buffer.length() > 0;
    }

    public String next() {
        String token = "";
        char c = buffer.charAt(0);
        buffer = buffer.substring(1);
        while (c != ' ' || buffer.length() > 0) {
            token = token + c;
            c = buffer.charAt(0);
            buffer = buffer.substring(1);
        }
        return token;
    }
}
