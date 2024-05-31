package n.sp.backend;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SubmitForm")
public class MyServlet extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		String myname  = req.getParameter("name1");
		String myemail = req.getParameter("emial1");
		
		PrintWriter out=res.getWriter();
		
		out.println("Name : "+myname);
		out.println("Email : "+myemail);
				
	}
}
