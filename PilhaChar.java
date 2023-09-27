public class PilhaChar { 

	private int tamanho, topo;
	private char vet[];
		
	PilhaChar(){
		tamanho = 5;
		vet = new char[5];
		topo = -1;		
	}
	
	PilhaChar(int n) {
	   tamanho = n;
		vet = new char[tamanho];
		topo = -1;
	}
		
	boolean isfull(){
		if (topo==tamanho-1)
			return true;
		else
			return false;
	}
		
	boolean isempty(){
		if (topo == -1)
			return true;
		else
			return false;
	}
		
	void push(char elem){
		if(isfull()){ 
			System.out.println("Overflow!");
			System.exit(1);
		}
		else
			vet[++topo]=elem;
	}
		
	char pop(){
		if(isempty()){
			//throw new StackOverflowException();
			System.out.println("Underflow!");
			System.exit(1);
			//return '*';
		}	
		//else
			return vet[topo--];
	}
		 
	char top(){
		if(isempty()){
			System.out.println("Underflow!");
			System.exit(1);
			//return '*';
		}
		//else
			return vet[topo];
	}
	
	void destroy(){
		topo=-1; 
	}
   
	public static void main(String[] args) {
		
		System.out.println("criando uma pilha de caracteres com 10 elementos...");
		PilhaChar p1 = new PilhaChar(10);
		System.out.println("verificando status inicial da pilha...");
		System.out.println("está vazia? "+p1.isempty());
		System.out.println("está cheia? "+p1.isfull());
		System.out.println("incluindo o caractere A...");
		p1.push('A');
		System.out.println("verificando status da pilha...");
		System.out.println("está vazia? "+p1.isempty());
		System.out.println("está cheia? "+p1.isfull());
		System.out.println("incluindo o caractere B...");
		p1.push('B');
		System.out.println("incluindo o caractere C...");
		p1.push('C');
		System.out.println("realizando 3 pops na seqüência...");
		System.out.println(p1.pop());
		System.out.println(p1.pop());
		System.out.println(p1.pop());
		System.out.println("verificando status da pilha...");
		System.out.println("está vazia? "+p1.isempty());
		System.out.println("está cheia? "+p1.isfull());
		
		System.out.println("criando string com o conteúdo ESTRUTURA...");
		String palavra="ESTRUTURA";
		System.out.println("criando uma pilha de caracteres com tamanho do string...");
		PilhaChar p2 = new PilhaChar(palavra.length());
		System.out.println("incluindo os caracteres do string na pilha...");
		char aux;
      for(int i=0;i<palavra.length();i++){
		   aux=palavra.charAt(i);
			p2.push(aux);
		}	
		System.out.println("verificando status da pilha...");
		System.out.println("esta vazia? "+p2.isempty());
		System.out.println("esta cheia? "+p2.isfull());
		System.out.println("retirando e mostrando caracteres da pilha ate esvaziar a pilha...");
		while(p2.isempty()==false)
			System.out.print(p2.pop());
		System.out.println("");
		System.out.println("verificando status da pilha...");
		System.out.println("esta vazia? "+p2.isempty());
		System.out.println("esta cheia? "+p2.isfull());
	}

}
