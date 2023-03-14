package CreditLines;

import Users.Persona;

public class MedianoPlazo extends Convenio{
	public MedianoPlazo(Persona p) {
		super(p);
		this.nombreConvenio="Mediano plazo";
		this.cuotas= "24 mensuales";
	}
}
