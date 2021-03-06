package com.netease;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

public class NoodlesServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(NoodlesServlet.class);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setHeader("content-type", "text/html;charset=UTF-8");
    	request.setCharacterEncoding("UTF-8");
        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        if (vegetable == null) {
            vegetable = "Tomato";
        }
        logger.info("往面条里加了"+vegetable);
        writer.println("<html><body>");
        writer.println("<h1> Noodles with " + vegetable + "</h1>"); 
        writer.println("</body></html>");
    }
}
