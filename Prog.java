import java.util.Random;

public class Prog {
    public static void main(String args[]) {
        int vetor[] = new int[10];
        preencheAleatorio(vetor, 100);
        imprime(vetor);
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
