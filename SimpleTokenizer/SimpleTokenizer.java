
package SimpleTokenizer;

import java.util.Scanner;

import Empilhol.Element;

public class SimpleTokenizer {
    private Scanner leitor;

    public SimpleTokenizer(String input) {
        leitor = new Scanner(input);
    }

    public Element nextElement() {

        while (leitor.hasNext()) {
            try {
                int ivalue = leitor.nextInt();
                System.out.println("ivalue: " + ivalue);
            } catch (Exception e) {
                System.out.println("erro");
                try {
                    Double dvalue = leitor.nextDouble();
                    System.out.println("dvalue: " + dvalue);
                } catch (Exception e1) {
                    System.out.println("erro");
                    try {
                        String svalue = leitor.next();
                        System.out.println("svalue: " + svalue);
                    } catch (Exception e2) {
                        System.out.println("erro");
                    }
                }
            }
        }
        return new Element();
    }
}