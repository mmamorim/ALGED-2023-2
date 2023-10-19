package Arvores;

public class Arvore {
    private Node raiz;

    public Arvore() {
        raiz = null;
    }

    private void adicionar(Node raiz, int info) {
        if (info <= raiz.getInfo()) {
            // ESQUERDA
            if (raiz.getEsq() == null) {
                raiz.setEsq(new Node(info));
            } else {
                adicionar(raiz.getEsq(), info);
            }
        } else {
            // Direta
            if (raiz.getDir() == null) {
                raiz.setDir(new Node(info));
            } else {
                adicionar(raiz.getDir(), info);
            }
        }
    }

    public void add(int info) {
        if (raiz == null) {
            raiz = new Node(info);
        } else {
            adicionar(raiz, info);
        }
    }

    private boolean buscaRec(Node raiz, int valor) {
        if(raiz != null) {
            if(raiz.getInfo() == valor) {
                return true;
            } else {
                if(valor < raiz.getInfo()) {
                    return buscaRec(raiz.getEsq(), valor);
                } else {
                    return buscaRec(raiz.getDir(), valor);
                }
            }
        } 
        return false;
    }

    public boolean busca(int valor) {
        return buscaRec(raiz, valor);
    }

    private void printRec(Node node) {
        if(node != null) {
            printRec(node.getEsq());
            System.out.println(node);
            printRec(node.getDir());
        }
    }  

    public void print() {
        printRec(raiz);
    }
}
