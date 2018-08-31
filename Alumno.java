
public class Alumno
{
    private int clave;
    private String nombre;

    public Alumno(int clave, String nombre)
    {
        this.clave = clave;
        this.nombre = nombre;
    }
    public int dameClave(){
        return clave;
    }
    public String dameNombre(){
        return nombre;
    }

}
