package model;

import include.Carrera;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modeloCarrera extends conexion {

    public boolean insertarCarrera(Carrera carrera){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "INSERT INTO CARRERA (CARRERA, RETICULA, " +
                    "NIVEL_ESCOLAR, CLAVE_OFICIAL, NOMBRE_CARRERA, " +
                    "NOMBRE_REDUCIDO, CARGA_MAXIMA, CREDITOS_TOTALES, " +
                    "NIVEL, MODALIDAD) " +
                    "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1,carrera.getCarrera());
            pst.setString(2,carrera.getReticula());
            pst.setString(3,carrera.getNivel_escolar());
            pst.setString(4, carrera.getClave_oficial());
            pst.setString(5, carrera.getNombre_carrera());
            pst.setString(6, carrera.getNombre_reducido());
            pst.setInt(7, carrera.getCarga_maxima());
            pst.setInt(8, carrera.getCreditos_totales());
            pst.setString(9, carrera.getNivel());
            pst.setString(10, carrera.getModalidad());

            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {

            }
        }
        return flag;
        }

    public ArrayList<Carrera> obtenerCarreras(){
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT CARRERA, RETICULA, NIVEL_ESCOLAR, " +
                    "CLAVE_OFICIAL, NOMBRE_CARRERA, NOMBRE_REDUCIDO, " +
                    "CARGA_MAXIMA, CREDITOS_TOTALES, NIVEL, MODALIDAD " +
                    "FROM CARRERA ";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()){
                carreras.add(new Carrera(rs.getString("CARRERA"),
                        rs.getString("RETICULA"),
                        rs.getString("NIVEL_ESCOLAR"),
                        rs.getString("CLAVE_OFICIAL"),
                        rs.getString("NOMBRE_CARRERA"),
                        rs.getString("NOMBRE_REDUCIDO"),
                        rs.getInt("CARGA_MAXIMA"),
                        rs.getInt("CREDITOS_TOTALES"),
                        rs.getString("NIVEL"),
                        rs.getString("MODALIDAD")));
            }
        } catch (Exception e) {

        }finally {
            try {
                if(getConection() != null)getConection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {

            }
        }
        return carreras;
    }

    public ArrayList<Carrera> obtenerCarrerasFK(){
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT CLAVE_OFICIAL, NOMBRE_CARRERA FROM CARRERA ";
            pst = getConection().prepareCall(consulta);
            rs = pst.executeQuery();
            while (rs.next()){
                carreras.add(new Carrera(
                        rs.getString("CLAVE_OFICIAL"),
                        rs.getString("NOMBRE_CARRERA")));
            }
        } catch (Exception e) {

        }finally {
            try {
                if(getConection() != null)getConection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {

            }
        }
        return carreras;
    }

    public ArrayList<Carrera> obtenerCarrera(String clave){
        ArrayList<Carrera> carrera = new ArrayList<Carrera>();
        PreparedStatement pst = null;
        ResultSet rs = null;
        try {
            String consulta = "SELECT CARRERA, RETICULA, NIVEL_ESCOLAR, " +
                    "CLAVE_OFICIAL, NOMBRE_CARRERA, NOMBRE_REDUCIDO, " +
                    "CARGA_MAXIMA, CREDITOS_TOTALES, NIVEL, MODALIDAD " +
                    "FROM CARRERA WHERE CLAVE_OFICIAL = ?";
            pst = getConection().prepareCall(consulta);
            pst.setString(1, clave);
            rs = pst.executeQuery();
            while (rs.next()){
                carrera.add(new Carrera(rs.getString("CARRERA"),
                        rs.getString("RETICULA"),
                        rs.getString("NIVEL_ESCOLAR"),
                        rs.getString("CLAVE_OFICIAL"),
                        rs.getString("NOMBRE_CARRERA"),
                        rs.getString("NOMBRE_REDUCIDO"),
                        rs.getInt("CARGA_MAXIMA"),
                        rs.getInt("CREDITOS_TOTALES"),
                        rs.getString("NIVEL"),
                        rs.getString("MODALIDAD")));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {
            try {
                if(getConection() != null)getConection().close();
                if(pst != null)pst.close();
                if(rs !=null)rs.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return carrera;
    }

    public boolean actualizarCarrera(Carrera carrera){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "UPDATE CARRERA SET CARRERA = ?, RETICULA = ?, " +
                    "NIVEL_ESCOLAR = ?, CLAVE_OFICIAL = ?, NOMBRE_CARRERA = ?, " +
                    "NOMBRE_REDUCIDO = ?, CARGA_MAXIMA = ?, CREDITOS_TOTALES = ?, " +
                    "NIVEL = ?, MODALIDAD = ? WHERE CLAVE_OFICIAL = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1,carrera.getCarrera());
            pst.setString(2,carrera.getReticula());
            pst.setString(3,carrera.getNivel_escolar());
            pst.setString(4, carrera.getClave_oficial());
            pst.setString(5, carrera.getNombre_carrera());
            pst.setString(6, carrera.getNombre_reducido());
            pst.setInt(7, carrera.getCarga_maxima());
            pst.setInt(8, carrera.getCreditos_totales());
            pst.setString(9, carrera.getNivel());
            pst.setString(10, carrera.getModalidad());
            pst.setString(11, carrera.getClave_oficial());

            if(pst.executeUpdate() == 1){
                flag = true;
            }

        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception a) {
                System.out.println(a.getMessage());
            }
        }
        return flag;
    }

    public boolean borrarCarrera(String clave){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta = "DELETE FROM CARRERA WHERE CLAVE_OFICIAL = ?";
            pst = getConection().prepareStatement(consulta);
            pst.setString(1, clave);


            if(pst.executeUpdate() == 1){
                flag = true;
            }
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try {
                if (getConection() != null) getConection().close();
                if (pst != null) pst.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return flag;
    }
}
