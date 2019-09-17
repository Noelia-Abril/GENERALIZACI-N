import java.util.Scanner;
public class Persona 
{
	public String ci;
	public String nombre;
	public String apellido;
	public Persona()
	{
		
	}
    public Persona(String id,String nom,String ap) 
    {
    	ci=id;
    	nombre=nom;
    	apellido=ap;
    }
    public void leerDP()
    {
    	Scanner in=new Scanner(System.in);
    	System.out.print("CI: ");
    	ci=in.next();
    	System.out.print("Nombre: ");
    	nombre=in.next();
    	System.out.print("Apellido: ");
    	apellido=in.next();
    }
    public void mostrarDP()
    {
    	System.out.println("CI: "+ci);
    	System.out.println("Nombre: "+nombre+" "+apellido);
    }
        
}