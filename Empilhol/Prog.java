package Empilhol;

public class Prog {
    public static void main(String args[]) {

        String entrada = "54 + 3 * 2";
        Tokenizer tokenizer = new Tokenizer(entrada);
        while (tokenizer.hasNext()) {
            System.out.println(tokenizer.next());
        }
    }
}
