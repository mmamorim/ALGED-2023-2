package Arvores;

public class Node {
    private Node esq;
    private int info;
    private Node dir;

    public Node(int info) {
        this.info = info;
        dir = null;
        esq = null;
    }

    public int getInfo() {
        return info;
    }
    
    public Node getEsq() {
        return esq;
    }

    public void setEsq(Node node) {
        this.esq = node;
    }

    public Node getDir() {
        return dir;
    }

    public void setDir(Node node) {
        this.dir = node;
    }

    public String toString() {
        return "["+info+"]";
    }

    public void print() {
        System.out.println("["+info+"]");
    }
}
