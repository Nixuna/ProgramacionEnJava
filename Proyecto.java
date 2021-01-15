//Este es un programa que variara dentro de los dias 
//No es un proyecto en si, si no una base para el aprendizaje del lenguaje java

import java.util.Scanner; //El programa usa la clase Scanner

public class Proyecto
{
	public static void main (String args[])

	{
		System.out.print("Inicio del Proyecto\n");
		Scanner entrada = new Scanner(System.in);
		
		int x, y, suma;

		System.out.print("Escriba el primer entero: ");
		x = entrada.nextInt();

		System.out.print("Escriba el segundo entero: ");
		y = entrada.nextInt();

		suma = x + y;
		System.out.printf("La suma es: %d\n", suma);

		if (suma % 2 == 0)
			System.out.println("El valor de la suma es un numero par");
		else
			System.out.println("El valor de la suma es un numero impar");
	}
}

