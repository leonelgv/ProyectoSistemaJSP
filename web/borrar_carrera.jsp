<%@ page import="controller.controladorCarrera" %>
<%
    String claveoficial = request.getParameter("claveoficial");
    controladorCarrera cc = new controladorCarrera();
    if(cc.eliminarCarrera(claveoficial)){
        response.sendRedirect("carreras.jsp");
    } else {
        response.sendRedirect("index.jsp");
    }
%>