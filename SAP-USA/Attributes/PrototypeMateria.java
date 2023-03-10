package Attributes;

import java.util.*;

public class PrototypeMateria extends Materia{

    public PrototypeMateria() {
    }
    public String FranjaHoraria;
    public float[] Nota = new float[] {0, 0, 0, 0};
    public Users.Docente Docente;

    public Salon Salon;
    
    private ArrayList<Long> ListaEstudiantes;

    private void CalcularDefinitiva() {
        float notaFinal=30*this.Nota[0]+30*this.Nota[1]+40*this.Nota[2];
        
        this.Nota[3]=notaFinal/100;
    }

}