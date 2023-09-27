class DequeChar {

	private int tamanho, front,rear;
	private char vet[];
		
	DequeChar(){
      tamanho = 5;
		vet = new char[tamanho];
      front = 0;
      rear = 0;
	}
	
	DequeChar(int n) {
	   tamanho = n;
		vet = new char[tamanho];
		front = 0;
      rear = 0;
	}
		
	boolean isfull(){
		if (rear == tamanho)
			return true;
		else
			return false;
	}
		
	boolean isempty(){
		if (front == rear)
			return true;
		else
			return false;
	}
	
	void incIni(char elem){
		if(isfull()){ 
			System.out.println("Overflow!");
			System.exit(1);
		}
		else {
			for(int i=rear-1;i>=0;i--)
           vet[i+1]=vet[i];
         vet[0]=elem;
			rear++;
		}	
	}

	void incFim(char elem){
		if(isfull()){ 
			System.out.println("Overflow!");
			System.exit(1);
		}
		else {
			vet[rear]=elem;
			rear++;
		}	

	}

	char retIni(){
		char aux='*';
      if(isempty()){ 
			System.out.println("Underflow!");
			System.exit(1);
		}
		else {
        aux = vet[front];
        for(int i=0;i<rear-1;i++)
          vet[i]=vet[i+1];
        rear--;
      }  
      return aux;
	}		 

	char retFim(){
		char aux = '*';
      if(isempty()){ 
			System.out.println("Underflow!");
			System.exit(1);
		}
		else {
        aux= vet[rear-1];
        rear--;
      }
      return aux;
	}		 

	public static void main(String args[]){
		
		DequeChar d1 = new DequeChar(12);

		System.out.println("Incluindo no Inicio A, B, C, D, E, F...");
		d1.incIni('A');
		d1.incIni('B');
		d1.incIni('C');
		d1.incIni('D');
		d1.incIni('E');
		d1.incIni('F');

		System.out.println("Incluindo no Final 1, 2, 3, 4, 5, 6...");
		d1.incFim('A');
		d1.incFim('B');
		d1.incFim('C');
		d1.incFim('D');
		d1.incFim('E');
		d1.incFim('F');
		
		System.out.println("retirando do inicio: "+d1.retIni());
		System.out.println("retirando do final: "+d1.retFim());
		System.out.println("retirando do inicio: "+d1.retIni());
		System.out.println("retirando do final: "+d1.retFim());

	}

}				  		 