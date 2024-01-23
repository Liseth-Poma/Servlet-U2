package car.controller;

import java.io.*;
import java.util.List;

import car.dao.AutoDaoImpl;
import car.idao.IAutoDao;
import car.model.Auto;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "servletController", value = "/servletController")
public class AutoServletController extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World! By Servlet";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        IAutoDao oAutoDAO = new AutoDaoImpl();
        String opcion = request.getParameter("opcion");
        if (opcion.equals("registro")){
            RequestDispatcher rd = request.getRequestDispatcher("crear.jsp");
            rd.forward(request, response);
        }else if (opcion.equals("eliminar")){
            oAutoDAO.delete(request.getParameter("placa"));
            List<Auto> listaAutos = oAutoDAO.get();
            request.setAttribute("autos", listaAutos);

            RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
            rd.forward(request, response);

        }else if (opcion.equals("actualizar")){
            Auto oAuto = oAutoDAO.getAuto(request.getParameter("placa"));
            request.setAttribute("auto", oAuto);
            RequestDispatcher rd = request.getRequestDispatcher("actualizar.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String opcion = req.getParameter("opcion");
        IAutoDao oAutoDao = new AutoDaoImpl();
        if (opcion.equals("crear")) {
            Auto oAuto = new Auto();
            oAuto.setMarca(req.getParameter("marca"));
            oAuto.setPlaca(req.getParameter("placa"));
            oAuto.setModelo(req.getParameter("modelo"));
            oAuto.setCilindraje(req.getParameter("cilindraje"));
            oAuto.setAnio(req.getParameter("anio"));
            oAuto.setConsumo(req.getParameter("consumo"));

            oAutoDao.add(oAuto);
            List<Auto> listaAutos = oAutoDao.get();
            req.setAttribute("autos", listaAutos);

            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.forward(req, resp);
        }else if (opcion.equals("actualizar")){
            IAutoDao oAutoDao2 = new AutoDaoImpl();

            Auto oAuto = new Auto();
            oAuto.setMarca(req.getParameter("marca"));
            oAuto.setPlaca(req.getParameter("placa"));
            oAuto.setModelo(req.getParameter("modelo"));
            oAuto.setCilindraje(req.getParameter("cilindraje"));
            oAuto.setAnio(req.getParameter("anio"));
            oAuto.setConsumo(req.getParameter("consumo"));

            oAutoDao2.update(oAuto);
            List<Auto> listaAutos = oAutoDao2.get();
            req.setAttribute("autos", listaAutos);

            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.forward(req, resp);
        }
    }

    public void destroy() {
    }
}
