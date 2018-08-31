import java.util.ArrayList;

public class Laboratorio
{
    private ArrayList <Alumno> alumnos; 

    /**
     * Constructor for objects of class Laboratorio
     */
    public Laboratorio()
    {
        alumnos = new ArrayList <Alumno>();
    }
    
    public void inscribir (int clave, String name){
        alumnos.add(new Alumno(clave,name));
    }
    
    public void darDeBaja(int clave){
        Alumno temp;
        for(Alumno al : alumnos){
            if(al.dameClave()==clave){
                alumnos.remove(al);
            }
        }
    }
    
    public void imprimir(){
        System.out.println("ALUMNOS DEL LABORATORIO");
        for(Alumno al : alumnos){
            System.out.println("Alumno: "+ al.dameNombre()+" Clave: "+ al.dameClave());
        }
    }
}
