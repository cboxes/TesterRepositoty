import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.time.*;


public class PagoEmpleado {
    public static Empleados[] txtExtraeArchivo(File file){
	Empleados[] Empleado = new Empleados[100];
	int LineaNum = 0;
   
	Validar dato = new Validar();    
        try{
            BufferedReader br = new BufferedReader (new FileReader(file)); // Construye una clase BufferedReader para leer archivos
	    	String s = null;
            while ((s = br.readLine())!= null) {// Usa el método readLine para leer una línea a la vez		
				String[] part1 = s.split("=");
				String[] part2 = part1[1].split(",");
                String sNombre = part1[0];//Nombre de empleado

				for (int i = 0; i < part2.length; i++){
    				// en cada iteración obtiene dias y horas trabajadas del arreglo part2
					String sDia = part2[i].substring(0,2); // dia de trabajo
					//obtener las horas de trabajo
					int part2long  = part2[i].length();
					String[] part3 = part2[i].substring(2,part2long).split("-");
            		try{
			 			if(dato.validarNumero(part3[0]) && dato.validarNumero(part3[1]) && dato.validarDia(sDia)) //Validar los datos del archivo segun formato
			 			{
							LocalTime dHoraI = LocalTime.parse(part3[0]);//hora inicial
							LocalTime dHoraF = LocalTime.parse(part3[1]);//hora final
							Empleado[LineaNum] = new Empleados(sNombre,sDia,dHoraI,dHoraF);
			 			}else{
							LocalTime dHoraI = LocalTime.parse("00:00"); //hora inicial
							LocalTime dHoraF = LocalTime.parse("00:00"); //hora final
							Empleado[LineaNum] = new Empleados(sNombre,sDia,dHoraI,dHoraF);
							System.out.println("El empleado "+ sNombre  + " contiene un dia y/o una hora no valida : => "+
							sDia+part3[0] +"-"+part3[1] +" que NO se ingresa al calculo");
			      		}
					}catch(Exception e){
						e.printStackTrace();
				}			
			LineaNum++;
			}
        }
        br.close();    
        }catch(Exception e){
            e.printStackTrace();
        }
		Empleados[] EmpleadoNew = Arrays.copyOf(Empleado, LineaNum);
        return EmpleadoNew;
    }

    public static void main(String[] args){
        File file = new File("./"+"file_hour.txt"); //directory de almacenamiento de archivo txt, puede modificarlo según su propia ruta
		Empleados[] Empleado = txtExtraeArchivo(file);
    	new CalculaPago(Empleado,0.00);
    }
}