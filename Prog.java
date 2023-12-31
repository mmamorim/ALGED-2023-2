import java.util.Random;

public class Prog {
    public static void main(String args[]) {
        int qtde = 1000000;
        int vetor[] = new int[qtde];
        preencheAleatorio(vetor, 100);
        imprime(vetor);
        Sort sort = new Sort();
        sort.quickSort(vetor, 0, qtde-1);
        //sort.insertion(vetor);
        imprime(vetor);
        sort.stats();
    }

    public static void preencheAleatorio(int[] v, int max) {
        Random r = new Random();
        for (int i = 0; i < v.length; i++)
            v[i] = r.nextInt(max + 1);
    }

    public static void imprime(int[] v) {
        System.out.print("[");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]);
            if (i < v.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
