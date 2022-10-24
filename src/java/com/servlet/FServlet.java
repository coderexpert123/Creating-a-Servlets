package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;



public class FServlet implements Servlet{
  
    ServletConfig con;
    
    @Override
    public void init(ServletConfig config) throws ServletException {
        this.con=con;
        
        System.out.println("Creating obj ....");

    }
    
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
 
        System.out.println("Servicing ....");
        
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        out.println("<h1>THIs is me </h1>");
        out.println("<h1>THIs is you </h1>");

    }
    
   @Override
    public void destroy() {
       System.err.println("destroy");
    }
    @Override
    public ServletConfig getServletConfig() {
return this.con;

        }

    
    public String getServletInfo() {
            return "crefj";
    }
    
  

 
 
    
}
