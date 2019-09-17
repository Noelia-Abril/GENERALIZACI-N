import java.util.Scanner;
public class Empleado extends Persona 
{
	private String CodEmp;
	private float salario;
    public Empleado() 
    {
    	
    }
    public void leerE()
    {
    	Scanner in=new Scanner(System.in);
    	System.out.print("#Codigo Empleado: ");
    	CodEmp=in.next();
    	super.leerDP();
    	System.out.print("Salario: ");
    	salario=in.nextFloat();
    }
    public void mostrarE()
    {
    	System.out.println("Codigo: "+CodEmp);
    	super.mostrarDP();
    	System.out.println("Salario: "+salario+" Bs");
    }
}