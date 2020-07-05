package empresa.thread;

public class PruebaSynzcronize {
	
	String comprobacion ="si";
	
	
	
	public PruebaSynzcronize() {
		super();
	}

	public synchronized  void insertarSincronizado() throws InterruptedException{
		
		System.out.println("Quieres insertar un articulo?");
		Thread.sleep(2000);
		wait();
		Thread.sleep(2000);
		System.out.println("");
		System.out.println("*******************INSERCION REALIZADA CON EXITO***************");
		
	}
	
	public synchronized void mostrarSinc() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("");
		System.out.println("*****************Esperando confirmacion de insercion***********************");
		
		Thread.sleep(2000);
		
		notify();
	}
}
