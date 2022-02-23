package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormSignUp
 */
@WebServlet("/form-nguoi-dung")
public class FormSignUp extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pr = response.getWriter();
		
		pr.println("<form action='/Registration-jsp-servlet/signup' method='POST'>");
		pr.println("ten: <input type='text' name='name'> ");
		pr.println("email: <input type='text' name='email'> ");
		pr.println("pass: <input type='text' name='pass'> ");
	
		pr.println(" <input type='submit' value='submit'> ");
		pr.println("</form>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

}
