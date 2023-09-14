
public class Sort {
    private int qtdeComparacoes;

    public Sort() {
        qtdeComparacoes = 0;
    }

    public void troca(int[] v, int pos1, int pos2) {
        int aux = v[pos1];
        v[pos1] = v[pos2];
        v[pos2] = aux;
    }

    public void selection(int[] v) {
        int menor; // indice do menor elemento
        // loop até o último elemento
        for (int i = 0; i < v.length - 1; i++) {
            menor = i; // primeiro índice do resto
            // encontra o índice do menor elemento a partir de i
            for (int j = i + 1; j < v.length; j++) {
                qtdeComparacoes++;
                if (v[j] < v[menor]) {
                    menor = j;
                }
            }
            // troca i com o menor
            troca(v, i, menor);
        }
    }

    public void insertion(int[] v) {
        int insert; // variável temporária para o elemento a inserir
        // loop do segundo até o último elemento
        for (int i = 1; i < v.length; i++) {
            // guarda o valor do elemento corrente
            insert = v[i];
            // inicializa a variável de localização
            int moveItem = i;
            // procura lugar para colocar o elemento
            while (moveItem > 0 && v[moveItem - 1] > insert) {
                // muda uma posição a direita
                qtdeComparacoes++;
                if(qtdeComparacoes % 1000000 == 0) {
                    System.out.println(qtdeComparacoes);
                }
                v[moveItem] = v[moveItem - 1];
                moveItem--;
            }
            v[moveItem] = insert; // coloca o elemento no lugar
        }
    }

    public void bubble(int[] v) {
        // loop até o último elemento
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = 0; j < v.length - 1 - i; j++) {
                // troca vet[j] com vet[j+1]
                qtdeComparacoes++;
                if (v[j] > v[j + 1]) {
                    troca(v, j, j+1);
                }
            }
        }
    }

    public void stats() {
        System.out.println("qtde comparações: "+qtdeComparacoes);
    }
}