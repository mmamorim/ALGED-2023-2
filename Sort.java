
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
                if (qtdeComparacoes % 1000000 == 0) {
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
                    troca(v, j, j + 1);
                }
            }
        }
    }

    public void merge(int vet[], int ini1, int fim1, int ini2, int fim2) {
        int i1 = ini1;
        int i2 = ini2;
        int iaux = ini1;
        int vetaux[] = new int[vet.length];
        while (i1 <= fim1 && i2 <= fim2)
            if (vet[i1] <= vet[i2])
                vetaux[iaux++] = vet[i1++];
            else
                vetaux[iaux++] = vet[i2++];
        while (i1 <= fim1)
            vetaux[iaux++] = vet[i1++];
        while (i2 <= fim2)
            vetaux[iaux++] = vet[i2++];
        for (int i = ini1; i <= fim2; i++)
            vet[i] = vetaux[i];
    }

    public void mergeSort(int vet[], int ini, int fim) {
        int meio;
        if (ini < fim) {
            meio = (ini + fim) / 2;
            mergeSort(vet, ini, meio);
            mergeSort(vet, meio + 1, fim);
            merge(vet, ini, meio, meio + 1, fim);
        }
    }

    public int separa(int vet[], int ini, int fim) {
        int c = vet[ini], i = ini + 1, j = fim, aux;
        while (i <= j) {
            while (i <= fim && vet[i] <= c)
                i++;
            while (c < vet[j])
                j--;
            if (i < j) {
                aux = vet[i];
                vet[i] = vet[j];
                vet[j] = aux;
                i++;
                j--;
            }
        }
        vet[ini] = vet[j];
        vet[j] = c;
        return j;
    }

    public void quickSort(int vet[], int ini, int fim) {
        int j;
        if (ini < fim) {
            // separa a partir do primeiro
            j = separa(vet, ini, fim);
            // ordena a primeira parte
            quickSort(vet, ini, j - 1);
            // ordena a segunda parte
            quickSort(vet, j + 1, fim);
        }
    }

    public void stats() {
        System.out.println("qtde comparações: " + qtdeComparacoes);
    }
}