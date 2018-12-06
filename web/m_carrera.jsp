<%@ page import="controller.controladorCarrera" %>
<%@ page import="include.Carrera" %>
<%@ page import="java.util.ArrayList" %>
<jsp:include page='views/header.jsp'></jsp:include>
<%
    String claveoficial = request.getParameter("claveoficial");
    controladorCarrera cc = new controladorCarrera();
    ArrayList<Carrera> carrera = new ArrayList<Carrera>();
    carrera = cc.obtenerCarrera(claveoficial);
%>

<div class="container">
    <form class="col s12" action="/modificarCarrera" method="post">
        <div class="row">
            <div class="input-field col s12 center">
                <p class="center login-form-text">Modificar carrera</p>
            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8 center">
                <input id="carrera" name="carrera" type="text" value="<% out.print(carrera.get(0).getCarrera()); %>">
                <label for="carrera" class="center-align">Carrera</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="reticula" name="reticula" type="text" value="<% out.print(carrera.get(0).getReticula()); %>">
                <label for="reticula" class="center-align">Reticula</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nivelescolar" name="nivelescolar" type="text" value="<% out.print(carrera.get(0).getNivel_escolar()); %>">
                <label for="nivelescolar" class="center-align">Nivel Escolar</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="claveoficial" name="claveoficial" type="text" readonly="readonly" value="<% out.print(carrera.get(0).getClave_oficial()); %>">
                <label for="claveoficial" class="center-align">Clave oficial</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombrecarrera" name="nombrecarrera" type="text" value="<% out.print(carrera.get(0).getNombre_carrera()); %>" >
                <label for="nombrecarrera" class="center-align">Nombre de la carrera</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nombrereducido" name="nombrereducido" type="text" value="<% out.print(carrera.get(0).getNombre_reducido()); %>">
                <label for="nombrereducido" class="center-align">Nombre corto</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="cargamaxima" name="cargamaxima" type="text" value="<% out.print(carrera.get(0).getCarga_maxima()); %>">
                <label for="cargamaxima" class="center-align">Carga m&aacute;xima</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="creditostotales" name="creditostotales" type="text" value="<% out.print(carrera.get(0).getCreditos_totales()); %>">
                <label for="creditostotales" class="center-align">Cr&eacute;ditos totales</label>
            </div>
            <div class="col s2">

            </div>
        </div>

        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="nivel" name="nivel" type="text" value="<% out.print(carrera.get(0).getNivel()); %>">
                <label for="nivel" class="center-align">Nivel</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input id="modalidad" name="modalidad" type="text" value="<% out.print(carrera.get(0).getModalidad()); %>">
                <label for="modalidad" class="center-align">Modalidad</label>
            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row margin">
            <div class="col s2">

            </div>
            <div class="input-field col s8">

            </div>
            <div class="col s2">

            </div>
        </div>
        <div class="row">
            <div class="col s2">

            </div>
            <div class="input-field col s8">
                <input type="submit" value="Actualizar" onclick='return(verif(this.form)); MM_validateForm()' class="btn col s6">
                <a class="btn col s6" href="carreras.jsp">Regresar</a>
            </div>
            <div class="col s2">

            </div>
        </div>
    </form>
</div>


<jsp:include page='views/footer.jsp'></jsp:include>