public class Ejecutar 
{
	public static void main(String[] args) 
    {
        Empleado e=new Empleado();
        Cliente c=new Cliente();
        System.out.println("DATOS DEL EMPLEADO\n");
        e.leerE();
        System.out.println("\nALMACENADO\n");
        e.mostrarE();
        System.out.println("\nDATOS DEL CLIENTE\n");
        c.leerC();
        System.out.println("\nALMACENADO\n");
        c.mostrarC();
    }
}