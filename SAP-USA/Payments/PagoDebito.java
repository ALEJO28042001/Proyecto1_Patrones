package Payments;

import java.util.*;

/**
 * 
 */
public class PagoDebito extends Pago{

    public PagoDebito() {
    }

    public String Banco;

	public String getBanco() {
		return Banco;
	}

	public void setBanco(String banco) {
		Banco = banco;
	}
    
}