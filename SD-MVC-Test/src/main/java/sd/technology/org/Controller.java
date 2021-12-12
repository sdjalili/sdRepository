package sd.technology.org;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String params = request.getParameter("page");
		if(params.equals("login")) {
			getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		}else if (params.equals("about")) {
			getServletContext().getRequestDispatcher("/About.jsp").forward(request, response);
		}else if (params.equals("signup")) {
			getServletContext().getRequestDispatcher("/Signup.jsp").forward(request, response);
		}else {
			getServletContext().getRequestDispatcher("/NotFound.jsp").forward(request, response);
		}
	}

}
