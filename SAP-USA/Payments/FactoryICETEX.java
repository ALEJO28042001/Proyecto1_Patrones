package Payments;

import java.util.*;

import CreditLines.*;
import Users.Persona;
/**
 * 
 */
public class FactoryICETEX extends ICETEX {


    public FactoryICETEX() {
    }

    public Financiacion RealizarPago(Persona p) {
       
    	ICETEX pago = new ICETEX();
    	ACCESS convenio = new ACCESS(p);
    	Convenio c;
 
    	
        return null;
    }

}