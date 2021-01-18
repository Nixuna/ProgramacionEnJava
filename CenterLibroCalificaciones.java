//Se estara empezando a usar objetos y metodos
//Este programa sera un ejemplo de ello, en el trascurso de los dias este programa variara

import java.util.Scanner;

public class CenterLibroCalificaciones
{
	public static void main (String args[])
	{
		Scanner entrada = new Scanner(System.in);
		LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones();

		System.out.printf("El nombre del curso inicial es: %s\n", miLibroCalificaciones.obtenerNombreDelCurso());

		System.out.print("Escriba el nombre del curso: ");
		String nombreDelCurso = entrada.nextLine();
		miLibroCalificaciones.establecerNombreDelCurso(nombreDelCurso);
		miLibroCalificaciones.mostrarMensajes(nombreDelCurso);

		System.out.println();
	}

}
