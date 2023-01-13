package ejercicioexamen;

import java.util.Scanner;

import ejercicioexamen.examen;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		
		// inicializo la matriz copiando codigo dado.
		double imcs_pacientes [][] = {

			    {15.7,15.8,16.1,16.3,16.7,17,17.4,17.1,17.5,17.6,18.4,18.6},

			    {38.5,38.4,38.3,38.3,38.8,37.5,37.4,37.1,36.8,36.0,35.4,35.2},

			    {33.5,33.6,33.8,33.9,33.6,33.1,32.4,31.8,31.7,29.8,28.4,27.2},

			    {32.7,32.4,33,32.7,32.9,31.6,31.5,30.4,29.2,27.3,25.2,24.7}

			};
		
		System.out.println("RELACIÓN DE DATOS DE PACIENTES\n ");
		examen.mostrarImcs(imcs_pacientes);
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Introduzca el número código del paciente: ");
		int paciente=teclado.nextInt();
		
		//devolver la media de esa fila Función que devuelva media
		
	
		
		double numeroPaciente [] =examen.mostrarHistorialPaciente(imcs_pacientes, paciente);
		System.out.println("La media del paciente es:");
		
		examen.mostrarMediaPaciente(numeroPaciente);

		
		teclado.close();

	}

}
