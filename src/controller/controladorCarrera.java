package controller;

import include.Carrera;
import model.modeloCarrera;

import java.util.ArrayList;

public class controladorCarrera {

    public boolean agregarCarrera(Carrera carrera){
        modeloCarrera carrera1 = new modeloCarrera();
        return carrera1.insertarCarrera(carrera);
    }

    public ArrayList<Carrera> obtenerCarreras(){
        modeloCarrera carrera = new modeloCarrera();
        return carrera.obtenerCarreras();
    }

    public ArrayList<Carrera> obtenerCarrera(String clave){
        modeloCarrera carrera = new modeloCarrera();
        return carrera.obtenerCarrera(clave);
    }
    public boolean actualizarCarrera(Carrera carrera){
        modeloCarrera carrera1 = new modeloCarrera();
        return carrera1.actualizarCarrera(carrera);
    }

    public boolean eliminarCarrera(String clave){
        modeloCarrera carrera1 = new modeloCarrera();
        return carrera1.borrarCarrera(clave);
    }
    /*
    public static void main(String[] args){

        controladorCarrera cc = new controladorCarrera();
        //Agregar un elemento
        //System.out.println(cc.agregarCarrera(new Carrera("Biologia", "8", "Nivel superior", "LBIO-2010-220", "Licenciatura en Biología", "LBIO", 32, 260, "1", "Escolarizada")));

        //Listar todos los elementos de la tabla
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();
        carreras = cc.obtenerCarreras();
        for (int a=0;a<carreras.size();a++){
            System.out.println("Carrera: " + carreras.get(a).getCarrera());
            System.out.println("Reticula: "+ carreras.get(a).getNombre_carrera());
            System.out.println("Nivel escolar: "+ carreras.get(a).getNivel_escolar());
            System.out.println("Clave: "+ carreras.get(a).getClave_oficial());
            System.out.println();
        }

        //Modificar un elemento
        //System.out.println(cc.actualizarCarrera(new Carrera("Biologia", "7", "Licenciatura", "LBIO-2010-220", "Licenciatura en Biología", "LBIO", 36, 300, "1", "Escolarizada")));

        //Listar un elemento de la tabla por su llave primaria
        ArrayList<Carrera> carrera = new ArrayList<Carrera>();
        carrera = cc.obtenerCarrera("LBIO-2010-220");

        for (int b=0;b<carrera.size();b++){
            System.out.println("Carrera: " + carrera.get(b).getCarrera());
            System.out.println("Reticula: "+ carrera.get(b).getNombre_carrera());
            System.out.println("Nivel escolar: "+ carrera.get(b).getNivel_escolar());
            System.out.println("Clave: "+ carrera.get(b).getClave_oficial());
            System.out.println();
        }

        //Eliminar un elemento
        System.out.println(cc.eliminarCarrera("LBIO-2010-220"));
    }
    */

}
