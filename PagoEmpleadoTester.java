import java.security.AccessController;
import java.time.*;
import static org.mockito.Mockito.*;

public class PagoEmpleadoTester {
	PagoEmpleado pagoEmpleado;
    Empleados empleado;	
	CalculaPago calculaPago;


	public static void main(String[] args){
		PagoEmpleadoTester tester = new PagoEmpleadoTester();
		tester.setUp();
		System.out.println(tester.testValue()?"pass":"fail");
	 }

	 public void setUp(){
		//Create a  object which is to be tested		
		pagoEmpleado = new PagoEmpleado();	

	
		//Create the mock object of stock service
		//empleado = mock(Empleados.class);	
		calculaPago = mock(CalculaPago.class);
	
	 }
	 public boolean testValue(){
    	   
		//Creates a list of hours to be added to the employee
		Empleados[] Empleado = new Empleados[2];
		LocalTime dHoraI = LocalTime.parse("09:00"); //hora inicial
		LocalTime dHoraF = LocalTime.parse("12:00"); //hora final
		Empleado[0]  = new Empleados("LEO","MO", dHoraI,dHoraF);
		LocalTime dHora1I = LocalTime.parse("10:00"); //hora inicial
		LocalTime dHora1F = LocalTime.parse("17:00"); //hora final
		Empleado[1]  = new Empleados("PAT","SA", dHora1I,dHora1F);
			
   
	
		//mock 
		when(calculaPago.dRangoHoras("MO", dHoraI, dHoraF)).thenReturn(20.00);
		when(calculaPago.dRangoHoras("SA", dHora1I, dHora1F)).thenReturn(10.00);		
  
		
        calculaPago.valorHoraT=100.00;
		Double marketValue = calculaPago.valorHoraT;
		return marketValue == 100.00;
	 }
}