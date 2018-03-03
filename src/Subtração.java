

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Subtração
 */
@WebServlet("/Subtração")
public class Subtração extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Subtração() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Recuperar parametro
		int parametro1 = Integer.parseInt(request.getParameter("numero1"));
		int parametro2 = Integer.parseInt(request.getParameter("numero2"));
		
		// Criar objeto da classe pessoa
	    int n = (parametro1 - parametro2);
				
		// Pegar o writer do reponse
				PrintWriter out = response.getWriter();
				
		
		
		// escrever na variavel out
		out.println("<html><head><title>Calculadora</title></head>");
		out.println("<body><h1>Valor: </h1>");
		out.println("<body><h2>" + n + "</h2>");
		
		 out.println("</body></html>");
	}

}
