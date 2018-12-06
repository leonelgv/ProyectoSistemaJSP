package include;

public class Carrera {
    private String carrera;
    private String reticula;
    private String nivel_escolar;
    private String clave_oficial;
    private String nombre_carrera;
    private String nombre_reducido;
    private int carga_maxima;
    private int creditos_totales;
    private String nivel;
    private String modalidad;

    public Carrera(String clave_oficial, String nombre_carrera) {
        this.clave_oficial = clave_oficial;
        this.nombre_carrera = nombre_carrera;
    }

    public Carrera(String carrera, String reticula, String nivel_escolar, String clave_oficial, String nombre_carrera, String nombre_reducido, int carga_maxima, int creditos_totales, String nivel, String modalidad) {
        this.carrera = carrera;
        this.reticula = reticula;
        this.nivel_escolar = nivel_escolar;
        this.clave_oficial = clave_oficial;
        this.nombre_carrera = nombre_carrera;
        this.nombre_reducido = nombre_reducido;
        this.carga_maxima = carga_maxima;
        this.creditos_totales = creditos_totales;
        this.nivel = nivel;
        this.modalidad = modalidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getReticula() {
        return reticula;
    }

    public void setReticula(String reticula) {
        this.reticula = reticula;
    }

    public String getNivel_escolar() {
        return nivel_escolar;
    }

    public void setNivel_escolar(String nivel_escolar) {
        this.nivel_escolar = nivel_escolar;
    }

    public String getClave_oficial() {
        return clave_oficial;
    }

    public void setClave_oficial(String clave_oficial) {
        this.clave_oficial = clave_oficial;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getNombre_reducido() {
        return nombre_reducido;
    }

    public void setNombre_reducido(String nombre_reducido) {
        this.nombre_reducido = nombre_reducido;
    }

    public int getCarga_maxima() {
        return carga_maxima;
    }

    public void setCarga_maxima(int carga_maxima) {
        this.carga_maxima = carga_maxima;
    }

    public int getCreditos_totales() {
        return creditos_totales;
    }

    public void setCreditos_totales(int creditos_totales) {
        this.creditos_totales = creditos_totales;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
}
