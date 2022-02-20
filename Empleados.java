import java.time.*;
 
// Empleados son retornados en un arreglo
public class Empleados {

    String nombre;
    String dia;	
    LocalTime horai;
    LocalTime horaf; 

 
    // Constructor a instanciar clase..
    public Empleados(String nombre,String dia, LocalTime horai, LocalTime horaf)
    {
        this.nombre = nombre;
        this.dia = dia;
        this.horai = horai;
        this.horaf = horaf;
    }
}