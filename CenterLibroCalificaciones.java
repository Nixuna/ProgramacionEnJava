//Se estara empezando a usar objetos y metodos
//Este programa sera un ejemplo de ello, en el trascurso de los dias este programa variara

import java.util.Scanner;

public class CenterLibroCalificaciones
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

		System.out.println("Escriba el nombre del curso:");
		String nombreDelCurso = entrada.nextLine();
		System.out.println();
		miLibroCalificaciones.mostrarMensajes(nombreDelCurso);
	}

}
