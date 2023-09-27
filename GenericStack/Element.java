package GenericStack;

public class Element {
    public final static int UNDEFINED = 0;
    public final static int INT = 1;
    public final static int DOUBLE = 2;
    public final static int STRING = 3;

    private int type;
    private int int_value;
    private double double_value;
    private String string_value;

    public Element() {
        this.type = Element.UNDEFINED;
    }

    public Element(int value) {
        this.int_value = value;
        this.type = Element.INT;
    }

    public Element(double value) {
        this.double_value = value;
        this.type = Element.DOUBLE;
    }

    public Element(String value) {
        this.string_value = value;
        this.type = Element.STRING;
    }

    public void print() {
        if(type == Element.UNDEFINED)
            System.out.println("UNDEFINED");
        if(type == Element.INT)
            System.out.println(int_value);
        if(type == Element.DOUBLE)
            System.out.println(double_value);
        if(type == Element.STRING)
            System.out.println(string_value);
    }
}
