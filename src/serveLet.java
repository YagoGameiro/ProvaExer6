

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serveLet")
public class serveLet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public serveLet() {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome"); 
		int id = Integer.parseInt(request.getParameter("id")); 
		response.getWriter().append("Olá " + nome +
		", tudo bem com você? o seu id é " + id + " mesmo!");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
