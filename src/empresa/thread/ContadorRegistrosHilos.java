package empresa.thread;



import empresa.conexion.OperacionesBD;

public class ContadorRegistrosHilos implements Runnable {

	OperacionesBD opeBD = new OperacionesBD();
	private int comparadorOriginal;
	private int comparadorNuevo;
	volatile boolean b = true;

	@Override
	public void run() {
		b=true;
		
			comparadorOriginal = opeBD.mostrarHilos();

			System.out.println("Hilo en marcha");
			System.out.println("Numero de registros en la tabla articulos: " + comparadorOriginal);
			while (b) {				
					comparadorNuevo = opeBD.mostrarHilos();
		
				if (comparadorNuevo != comparadorOriginal) {
					System.out.println("Nueva compra controlada por el hilo"+"\n"+"Numero de compras anterior: "+comparadorOriginal+"\n"+"Numero de compras nuevo: "+comparadorNuevo);
					comparadorOriginal = comparadorNuevo;
				}			
			}
	}
	
	public void stop() {
		b=false;
		System.out.println("Hilo parado");
	}

}
