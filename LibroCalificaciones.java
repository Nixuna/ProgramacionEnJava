//Declaracion de una clase con un metodo

public class LibroCalificaciones
{
	private String nombreDelCurso; //Variable de instancia
	
	//EL contrustor inicializa el nombreDelCurso con el String que se provee como argumento
	public LibroCalificaciones(String nombre)
	{
		nombreDelCurso = nombre;
	}


	public void establecerNombreDelCurso(String nombre)
	{
		nombreDelCurso = nombre;
	}

	public String obtenerNombreDelCurso()
	{
		return nombreDelCurso;
	}

   public void mostrarMensajes()
   {
      System.out.printf("Bienvenido a LibroCalificaciones\n%s\n", obtenerNombreDelCurso());
   }
}

