package Attributes;

import Users.Docente;

import java.util.*;

public class PrototypeMateria extends Materia implements IPrototypeMateria{


    public String franjaHoraria;
    public float[] nota;
    public Docente docente;

    public Salon salon;

    public PrototypeMateria(String franjaHoraria, Docente docente, Salon salon) {
        this.franjaHoraria = franjaHoraria;
        this.docente = docente;
        this.nota = new float[] {0, 0, 0, 0};
        this.salon = salon;
    }

    private void CalcularDefinitiva() {
        float notaFinal=30*this.nota[0]+30*this.nota[1]+40*this.nota[2];
        
        this.nota[3]=notaFinal/100;
    }

    @Override
    public PrototypeMateria clone() {
        return new PrototypeMateria(franjaHoraria, docente, salon);
    }
}