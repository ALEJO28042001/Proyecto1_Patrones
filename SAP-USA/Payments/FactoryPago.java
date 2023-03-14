package Payments;

import java.util.*;

import Users.Persona;

/**
 * 
 */
public abstract class FactoryPago {

    public FactoryPago() {
    }


    public Pago RealizarPago(Persona p) {
        //Eleccion de qué se va a pagar
        return null;
    }


    public void MedioPago() {
        //Eleccion de cómo se va a pagar
    	Scanner sc = new Scanner (System.in);
    	
    	String opcion;
    	
    	FactoryPago medioPago;
    	
    	System.out.println("Medio de pago?");
    	opcion = sc.next();
    	
    	if (opcion.equalsIgnoreCase("Credito")) {
    		medioPago = new FactoryPagoCredito();
    	}else if (opcion.equalsIgnoreCase("PSE")){
    		medioPago = new FactoryPagoPSE();
    	}else if(opcion.equalsIgnoreCase("Financiacion")) {
    		medioPago = new FactoryFinanciar();
    	}
    }

}