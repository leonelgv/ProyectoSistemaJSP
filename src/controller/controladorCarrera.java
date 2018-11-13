package controller;

import include.Carrera;
import model.modeloCarrera;

public class controladorCarrera {

    public boolean agregarCarrera(Carrera carrera){
        modeloCarrera carrera1 = new modeloCarrera();
        return carrera1.insertarCarrera(carrera);
    }

    public static void main(String[] args){
        controladorCarrera cc = new controladorCarrera();
        System.out.println(cc.agregarCarrera(new Carrera("Informatica", "6", "Nivel superior", "IINF-2010-220", "Ingeniería Informática", "IINF", 32, 260, "1", "Escolarizada")));
    }

}
