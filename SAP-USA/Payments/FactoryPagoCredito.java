package Payments;

import java.util.*;

/**
 * 
 */
public class FactoryPagoCredito extends PagoCredito {

    /**
     * Default constructor
     */
    public FactoryPagoCredito() {
    }

    public PagoCredito RealizarPago() {
    	PagoCredito pago = new PagoCredito();
    	
    	pago.getNumTarjeta();
    	pago.getUsuario();
    	
        // TODO implement here
        return pago;
    }
    
    
    
    
    

}