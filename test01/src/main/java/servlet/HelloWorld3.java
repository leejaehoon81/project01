package servlet;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorld3 extends GenericServlet {

  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    System.out.println("HelloWorld3!!!");
    
  }

}
