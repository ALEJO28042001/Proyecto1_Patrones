package Actions;

import Users.Persona;

public class ExtraerTipo {
	
    //Metodo para extraer el tipo de clase. Limitado a jerarquía 1.
    public String ExtraerTipo(Persona p) {
    	
    	Class<? extends Persona> temp1 = p.getClass();
    	String temp2 = temp1.getName();
    	//Linea que extrae el nombre de la clase. viene en formato Users.Persona, si se cambia el nombre del paquete, cambiar el numero en el substring para arreglar.
    	String temp3 = temp2.substring(6);
    	return temp3;
    }
}
