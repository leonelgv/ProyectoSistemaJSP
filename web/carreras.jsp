<jsp:include page='views/header.jsp'></jsp:include>
<%@ page import="include.Carrera" %>
<%@ page import="controller.controladorCarrera" %>
<%@ page import="java.util.ArrayList" %>

<div class="container">
    <div class="row">
        <div class="input-field col s12 center">
            <h3>Carreras</h3>
        </div>
    </div>
    <div class="row">
        <div class="input-field col s12">
            <a class="btn" href="a_carrera.jsp">Nuevo</a>
        </div>
    </div>
    <div class="row margin">
        <div class="col s12 center">
            <table class="striped">
                <thead>
                <tr>
                    <th>CARRERA</th>
                    <th>RETICULA</th>
                    <th>NIVEL ESCOLAR</th>
                    <th>CLAVE OFICIAL</th>
                    <th>NOMBRE CARRERA</th>
                    <th>NOMBRE REDUCIDO</th>
                    <th>CARGA MAXIMA</th>
                    <th>CREDITOS TOTALES</th>
                    <th>NIVEL</th>
                    <th>MODALIDAD</th>
                    <th></th>
                </tr>
                </thead>
                <%
                    String htmlcode = "<tbody>";
                    controladorCarrera cc = new controladorCarrera();
                    int contador = 0;
                    ArrayList<Carrera> carreras = new ArrayList<Carrera>();
                    carreras = cc.obtenerCarreras();
                    if(carreras.size() > 0){
                        for(int a=0; a<carreras.size();a++){
                            htmlcode += "<tr><td>" + carreras.get(a).getCarrera()
                                    + "</td><td>" + carreras.get(a).getReticula()
                                    + "</td><td>" + carreras.get(a).getNivel_escolar()
                                    + "</td><td>" + carreras.get(a).getClave_oficial()
                                    + "</td><td>" + carreras.get(a).getNombre_carrera()
                                    + "</td><td>" + carreras.get(a).getNombre_reducido()
                                    + "</td><td>" + carreras.get(a).getCarga_maxima()
                                    + "</td><td>" + carreras.get(a).getCreditos_totales()
                                    + "</td><td>" + carreras.get(a).getNivel()
                                    + "</td><td>" + carreras.get(a).getModalidad()
                                    + "<td><a class=\"btn\" href=\"#\"><i class=\"material-icons\">zoom_in</i></a>"
                                    + "<a class=\"btn blue\" href=\"#\"><i class=\"material-icons\">create</i></a>"
                                    + "<a class=\"btn red\" href=\"#\"><i class=\"material-icons\">delete</i></a>"
                                    + "</td></tr>";
                        }
                    } else{
                        htmlcode += "<tr><td colspan=\"10\">No existen carreras</td></tr>";
                    }
                    htmlcode += "</tbody>";

                    out.print(htmlcode);
                %>
            </table>
        </div>
    </div>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>