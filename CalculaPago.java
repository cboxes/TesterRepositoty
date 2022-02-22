import java.time.*;
public class CalculaPago {
	Double valorHoraT;


public CalculaPago(Empleados[] Empleado,Double valorHoraT){
	
	this.valorHoraT = valorHoraT;
	LocalTime dHoraI;
	LocalTime dHoraF;
    Double valorHora = 0.00;
        
	String sNombrex = Empleado[0].nombre;
    try{
	   for (int i = 0; i < Empleado.length; i++){
		String sNombre = Empleado[i].nombre;
		String sDia = Empleado[i].dia;
		dHoraI = Empleado[i].horai;	    
		dHoraF = Empleado[i].horaf;
		
		if(sNombre != sNombrex){
		   System.out.println("The amount to pay "+ sNombrex + " is: "+valorHora +" USD");	
		   valorHoraT = valorHora;
		   sNombrex = sNombre;
		   valorHora = 0.00;
	        } 
		   valorHora = valorHora + dRangoHoras(sDia,dHoraI,dHoraF);
	      }
	      System.out.println("The amount to pay "+ sNombrex + " is: "+valorHora +" USD");	
    }catch(Exception e){
            e.printStackTrace();
        	} 
    }

public Double dRangoHoras(String dia, LocalTime horai, LocalTime horaf){
	LocalTime dHor1I = LocalTime.parse("00:01");
	LocalTime dHor1F = LocalTime.parse("09:00");
	LocalTime dHor2I = LocalTime.parse("09:01");
	LocalTime dHor2F = LocalTime.parse("18:00");
	LocalTime dHor3I = LocalTime.parse("18:01");
	LocalTime dHor3F = LocalTime.parse("00:00");
	Double valorHora = 0.00;


	switch (dia){
	    	case "MO","TU","WE","TH","FR" ->{
			if ((horai.compareTo(dHor1I) >= 0) && (horai.compareTo(dHor1F) <= 0) &&
                            (horaf.compareTo(dHor1I) >= 0) && (horaf.compareTo(dHor1F) <= 0)
                           )
				{
				  valorHora = 25.00;
				}
			if ((horai.compareTo(dHor2I) >= 0) && (horai.compareTo(dHor2F) <= 0) &&
                            (horaf.compareTo(dHor2I) >= 0) && (horaf.compareTo(dHor2F) <= 0)
                           )
				{valorHora = 15.00;}
	                if ((horai.compareTo(dHor3I) >= 0) && (horai.compareTo(dHor3F) >= 0) &&
                            (horaf.compareTo(dHor3I) >= 0) && (horaf.compareTo(dHor3F) >= 0)
                           )
				{valorHora = 20.00;}
	             }
            case "SA","SU" ->{
			if ((horai.compareTo(dHor1I) >= 0) && (horai.compareTo(dHor1F) <= 0) &&
                            (horaf.compareTo(dHor1I) >= 0) && (horaf.compareTo(dHor1F) <= 0)
                           )
				{valorHora = 30.00;}
			if ((horai.compareTo(dHor2I) >= 0) && (horai.compareTo(dHor2F) <= 0) &&
                            (horaf.compareTo(dHor2I) >= 0) && (horaf.compareTo(dHor2F) <= 0)
                           )
				{valorHora = 20.00;}
	        if ((horai.compareTo(dHor3I) >= 0) && (horai.compareTo(dHor3F) >= 0) &&
                            (horaf.compareTo(dHor3I) >= 0) && (horaf.compareTo(dHor3F) >= 0)
                           )
				{valorHora = 25.00;}
	    	}
	}

	return valorHora;
    }	
}