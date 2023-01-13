package ejercicioexamen;

public class examen {
	//crear la función mostrar indices:
	
	public static void mostrarImcs (double matriz[][]) {
		
		for (int i=0; i< matriz.length; i++) {
			for (int j=0; j< matriz[0].length;j++){     
				
		
		 System.out.printf("%.2f  ",matriz[i][j] );
			}
			System.out.println();
		}
	}
	///////
	public static double [] mostrarHistorialPaciente(double[][] imcs_pacientes, int paciente) {
		double lineaHistorialpaciente [] = new double[imcs_pacientes.length];
		double suma=0;
		
		
		for (int i =0; i<imcs_pacientes.length; i++) {
			for (int j=0; j<imcs_pacientes[0].length;j++) {
			
				suma=suma+imcs_pacientes[i][j];
			}
			lineaHistorialpaciente[i] = (double) suma/imcs_pacientes[0].length;
			suma=0;
		}
		return lineaHistorialpaciente;
	}
///// para mostrar la media que he metido en el vector de arriba
	
	public static void mostrarMediaPaciente(double mediadelpaciente[]) {
		
		for (int i = 0; i < mediadelpaciente.length; i++) {
			

	
			System.out.printf("%.2f  ",mediadelpaciente[i]);
			
		
		}
		System.out.println();
	
	}
}


