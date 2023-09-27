public class FilaChar {

	private int tamanho, front, rear;
	private char vet[];
		
	FilaChar(){
		tamanho = 5;
		vet = new char[5];
		front = 0;
		rear = 0;		
	}
	
	FilaChar(int n) {
	   tamanho = n;
		vet = new char[tamanho];
		front = 0;
		rear = 0;
	}
	
	int next(int n) {
		if(n == tamanho-1)
			return 0;
		else
			return n+1;
	   // return (n+1)%tamanho;
   }			
		
	boolean isfull(){
		if (next(rear) == front)
			return true;
		else
			return false;
	}
		
	boolean isempty(){
		if (rear == front)
			return true;
		else
			return false;
	}
		
	void store(char elem){
		if(isfull()){ 
			System.out.println("Overflow!");
			System.exit(1);
		}
		else {
			vet[rear]=elem;
			rear = next(rear);
		}	
	}
		
	char retrieve(){
		if(isempty()){
			System.out.println("Underflow!");
			System.exit(1);
			//return '*';
		}	
		//else
			char aux = vet[front];
			front = next(front);
			return aux;
	}
		 
	void destroy(){
		front = rear; 
	}

	public static void main(String[] args) {
		
		System.out.println("criando uma fila de caracteres com 10 elementos...");
		FilaChar f1 = new FilaChar(10);
		System.out.println("verificando status inicial da fila...");
		System.out.println("esta vazia? "+f1.isempty());
		System.out.println("esta cheia? "+f1.isfull());
		System.out.println("incluindo o caractere A...");
		f1.store('A');
		System.out.println("verificando status da fila...");
		System.out.println("esta vazia? "+f1.isempty());
		System.out.println("esta cheia? "+f1.isfull());
		System.out.println("incluindo o caractere B...");
		f1.store('B');
		System.out.println("incluindo o caractere C...");
		f1.store('C');
		System.out.println("realizando 3 retrieves na seqüência...");
		System.out.println(f1.retrieve());
		System.out.println(f1.retrieve());
		System.out.println(f1.retrieve());
		System.out.println("verificando status da fila...");
		System.out.println("esta vazia? "+f1.isempty());
		System.out.println("esta cheia? "+f1.isfull());
		
		System.out.println("criando string com o conteúdo ESTRUTURA...");
		String palavra="FILA";
		System.out.println("criando uma fila de caracteres com tamanho do string...");
		FilaChar f2 = new FilaChar(palavra.length()+1);
		System.out.println("incluindo os caracteres do string na fila...");
		char aux;
      for(int i=0;i<palavra.length();i++){
		   aux=palavra.charAt(i);
			f2.store(aux);
		}	
		System.out.println("verificando status da fila...");
		System.out.println("esta vazia? "+f2.isempty());
		System.out.println("esta cheia? "+f2.isfull());
		System.out.println("retirando e mostrando caracteres da fila até esvaziar a pilha...");
		while(f2.isempty()==false)
			System.out.print(f2.retrieve());
		System.out.println("");
		System.out.println("verificando status da fila...");
		System.out.println("esta vazia? "+f2.isempty());
		System.out.println("esta cheia? "+f2.isfull());
	}

}
