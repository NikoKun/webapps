import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class extest extends HttpServlet {

   private char[] surname = new char[]{ 'e', 's', 't', 'e', 'b', 'a', 'n' };

   public void init() throws ServletException { }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();

      for (char letter : surname) {
	out.println(letter);
      }
   }

   public void destroy() { }
}
