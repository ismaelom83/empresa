package empresa.thread;

public class PruebaSynzcronize {
	
	String comprobacion ="si";
	
	
	
	public PruebaSynzcronize() {
		super();
	}

	public synchronized  void insertarSincronizado() throws InterruptedException{
		
		System.out.println("****** EL HILO ESTA EN MARCHA A LA ESPAERA DE LA CONFIRMACION *****************");
		Thread.sleep(2000);
		wait();
		Thread.sleep(2000);
		System.out.println("");
		System.out.println("******************* INSERCION REALIZADA CON EXITO ***************");
		
	}
	
	public synchronized void mostrarSinc() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("");
		System.out.println("***************** ESPERANDO LA CONFIRMACION DE LA INSERCION ***********************");
		
		Thread.sleep(2000);
		
		notify();
	}
}
