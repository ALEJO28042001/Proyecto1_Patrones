package CreditLines;

import Users.Persona;

public class Convenio {
	
	String nombreConvenio;
	Boolean amortizacion;
	String valorMatricula;
	String deudor;
	String coDeudor;
	Boolean renovacion;
	String cuotas;
	
	public Convenio() {
		
	}
	
	public Convenio(Persona p) {
		this.deudor=p.getNombre()+" "+p.getApelllido();
		this.renovacion=false;
		this.amortizacion=false;
	}
	
	public String getNombreConvenio() {
		return nombreConvenio;
	}
	public void setNombreConvenio(String nombreConvenio) {
		this.nombreConvenio = nombreConvenio;
	}
	public Boolean getAmortizacion() {
		return amortizacion;
	}
	public void setAmortizacion(Boolean amortizacion) {
		this.amortizacion = amortizacion;
	}
	public String getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(String valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public String getDeudor() {
		return deudor;
	}
	public void setDeudor(String deudor) {
		this.deudor = deudor;
	}
	public String getCoDeudor() {
		return coDeudor;
	}
	public void setCoDeudor(String coDeudor) {
		this.coDeudor = coDeudor;
	}
	public Boolean getRenovacion() {
		return renovacion;
	}
	public void setRenovacion(Boolean renovacion) {
		this.renovacion = renovacion;
	}
	
	
	
}
