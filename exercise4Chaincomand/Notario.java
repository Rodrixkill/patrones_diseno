package exercise4Chaincomand;

public class Notario implements Banco{

private Banco next; 
	
	@Override
	public void setNext(Banco handler) {
		next=handler;

	}

	@Override
	public Banco next() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void criteriaHandler(int amount) {
		if(amount < 200){
			System.out.println("Tarea atendida por notario");
		}else{
			next.criteriaHandler(amount);
		}

	}

}
