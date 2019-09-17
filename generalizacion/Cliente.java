import java.util.Scanner;
public class Cliente extends Persona
{
	private String nit;
	private String Dir;
	public Cliente() 
	{
    }
    public void leerC()
    {
    	Scanner in=new Scanner(System.in);
    	System.out.print("#NIT: ");
    	nit=in.next();
    	super.leerDP();
    	System.out.print("Direccion: ");
    	Dir=in.next();
    }
    public void mostrarC()
    {
    	System.out.println("NIT: "+nit);
    	super.mostrarDP();
    	System.out.println("Direccion: "+Dir);
    }
       
}