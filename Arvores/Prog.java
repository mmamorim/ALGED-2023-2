package Arvores;

public class Prog {
    public static void main(String args[]) {

        Arvore a = new Arvore();

        a.add(35);
        a.add(55);
        a.add(43);
        a.add(45);
        a.add(23);

        a.print();
        int procura_se = 44;
        boolean temValor = a.busca(procura_se);
        System.out.println("O valor: "+procura_se+" tem na árvore? "+temValor);        
    }
}
