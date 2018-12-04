package servlet;

import controller.controladorCarrera;
import include.Carrera;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletCrearCarrera", urlPatterns = {"/crearCarrera"})
public class ServletCrearCarrera extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
            response.sendRedirect("carreras.jsp");
        } else {
            response.sendRedirect("a_carrera.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
