package io.jatoms.osgi.possiblebugs.scl;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;
import org.osgi.service.http.whiteboard.propertytypes.HttpWhiteboardServletPattern;

@HttpWhiteboardServletPattern("/myservlet")
@Component(service = Servlet.class, scope = ServiceScope.PROTOTYPE)
public class MyServlet extends HttpServlet{
    
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
	            throws IOException {
	        resp.setContentType("text/plain");
	        resp.getWriter().println("Hello World!");
	    }
    
}
