package Payments;

import java.util.*;

/**
 * 
 */
public class PagoCredito extends Pago{


    public PagoCredito() {
    }

 
    public int NumeroCuotas;
    public String TipoTajeta;
    public long NumTarjeta;
    public String FechaVencimiento;
    
	public int getNumeroCuotas() {
		return NumeroCuotas;
	}
	public void setNumeroCuotas(int numeroCuotas) {
		NumeroCuotas = numeroCuotas;
	}
	public String getTipoTajeta() {
		return TipoTajeta;
	}
	public void setTipoTajeta(String tipoTajeta) {
		TipoTajeta = tipoTajeta;
	}
	public long getNumTarjeta() {
		return NumTarjeta;
	}
	public void setNumTarjeta(long numTarjeta) {
		NumTarjeta = numTarjeta;
	}
	public String getFechaVencimiento() {
		return FechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		FechaVencimiento = fechaVencimiento;
	}
    
    
}