package empresa.thread;



import empresa.conexion.OperacionesBD;

public class ContadorRegistrosHilos implements Runnable {

	OperacionesBD opeBD = new OperacionesBD();
	private int comparadorOriginal;
	private int comparadorNuevo;
	volatile boolean b = true;

	@Override
	public void run() {
		
			comparadorOriginal = opeBD.mostrarHilos();

			System.out.println(b);
			System.out.println("Numero de registros en la tabla articulos: " + comparadorOriginal);
			while (b) {				
					comparadorNuevo = opeBD.mostrarHilos();
		
				if (comparadorNuevo != comparadorOriginal) {
					comparadorOriginal = comparadorNuevo;
				}			
			}
	}
	
	public void stop() {
		b=false;
		System.out.println(b);
	}

}
