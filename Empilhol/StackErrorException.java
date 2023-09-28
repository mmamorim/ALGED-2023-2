package Empilhol;

public class StackErrorException extends Exception{
    private String error;

    public StackErrorException(String error) {
        this.error = "StackErrorException: " + error;
    }

    public void print() {
        System.out.println(error);
    }
}
