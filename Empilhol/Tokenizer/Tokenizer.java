package Empilhol.Tokenizer;

import Empilhol.Element;

public class Tokenizer {
    private StringStack codeStack;

    public Tokenizer(String code) {
        this.codeStack = new StringStack(code);
    }

    public boolean hasNext() {
        return !codeStack.empty();
    }

    public Element next() {
        String token = "";
        while(!codeStack.empty()) {
            char c = codeStack.pop();
            if(c == ' ') break;
            token = token + c;
        }
        while(!codeStack.empty() && codeStack.next() == ' ') {
            codeStack.pop();
        }
        if(token.equals("+") || token.equals("*")) {
            return new Element(token);
        }
        return new Element(Integer.parseInt(token));
    }
}
