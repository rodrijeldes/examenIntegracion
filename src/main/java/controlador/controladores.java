package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Dao;

/**
 * Servlet implementation class controladores
 */
public class controladores extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public controladores() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usuario, password, msg="";
		
		usuario = request.getParameter("usuario");
		password = request.getParameter("password");
		
		try {
			if(Dao.validarDatos(usuario,password)>0) {
				msg = "Usuario y Clave Correcta";
			}
			else {
				msg = "Usuario y Clave Incorrecta Revisar";
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
		msg = msg.toUpperCase();
		RequestDispatcher despachador = request.getRequestDispatcher("/reservas.jsp");	
		request.setAttribute("mensaje", msg);
		despachador.forward(request, response);
		
		
	}

}
