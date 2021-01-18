//Declaracion de una clase con un metodo

public class LibroCalificaciones
{
	private String nombreDelCurso; //Variable de instancia

	public void establecerNombreDelCurso(String nombre)
	{
		nombreDelCurso = nombre;
	}

	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
	}

   public void mostrarMensajes(String nombreDelCurso)
   {
      System.out.printf("Bienvenido a LibroCalificaciones\n%s\n", obtenerNombreDelCurso());
   }
}

