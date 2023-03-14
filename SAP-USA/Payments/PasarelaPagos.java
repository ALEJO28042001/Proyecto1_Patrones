package Payments;

import java.util.*;

import Users.Persona;

public class PasarelaPagos {
	
	
	private Persona p;
	private ArrayList<Factura> HistoricoPagos;
	
    public PasarelaPagos() {
    }
    
    public PasarelaPagos(Persona p1) {
    	
    	this.p= p1;
    } 
    
    //Metodo para extraer el tipo de clase. Limitado a jerarquía 1.
    private String ExtraerTipo(Persona p) {
    	
    	Class<? extends Persona> temp1 = p.getClass();
    	String temp2 = temp1.getName();
    	//Linea que extrae el nombre de la clase. viene en formato Users.Persona, si se cambia el nombre del paquete, cambiar el numero en el substring para arreglar.
    	String temp3 = temp2.substring(6);
    	return temp3;
    }
    
    private PasarelaPagos PagoPersona(Persona p) {
        // TODO implement here
    	PasarelaPagos pagos;
    	    	
      	String tipo = ExtraerTipo(p);
    	
      	if(tipo=="Estudiante") {
      		pagos= new PagoEstudiante();
      	}else if(tipo=="Docente") {
      		pagos = new PagoDocente();
      	}else {
      		pagos = new PagoAdministrativo();
      	}

        return pagos;
    }

    public void GenerarRecibo() {
    	
        
    }

    public Pago PagarCertificado() {
        // TODO implement here
        return null;
    }

}