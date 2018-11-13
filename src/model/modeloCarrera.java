package model;

import include.Carrera;

import java.sql.PreparedStatement;

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

}
