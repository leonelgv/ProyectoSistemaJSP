<%@ page import="include.Carrera" %>
<%@ page import="controller.controladorCarrera" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String carrera = request.getParameter("carrera");
    String reticula = request.getParameter("reticula");
    String nivelescolar = request.getParameter("nivelescolar");
    String claveoficial = request.getParameter("claveoficial");
    String nombrecarrera = request.getParameter("nombrecarrera");
    String nombrereducido = request.getParameter("nombrereducido");;

    int cargamaxima = 0;
    int creditostotales = 0;

    try {
        cargamaxima = Integer.parseInt(request.getParameter("cargamaxima"));
        creditostotales = Integer.parseInt(request.getParameter("creditostotales"));
    } catch (NumberFormatException e){

    }

    String nivel = request.getParameter("nivel");
    String modalidad = request.getParameter("modalidad");

    Carrera nuevaCarrera = new Carrera(carrera, reticula, nivelescolar, claveoficial, nombrecarrera, nombrereducido, cargamaxima, creditostotales, nivel, modalidad);

    controladorCarrera cc = new controladorCarrera();
    if(cc.agregarCarrera(nuevaCarrera)) {
        response.sendRedirect("index.jsp");
    } else {
        response.sendRedirect("a_carrera.jsp");
    }
%>