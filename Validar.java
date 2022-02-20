public class Validar {
String cadena;

	public boolean validarNumero(String cadena) {
             this.cadena = cadena;
		if (cadena.matches("[0-9,:]*")) {
			return true;
		} else {
			return false;
		}
    	}

    	public boolean validarDia(String cadena) {
		this.cadena = cadena;
		if (cadena.matches("[MO,TU,WE,TH,FR,SA,SU]*")) {
			return true;
		} else {
			return false;
		}
    	}	
	
}