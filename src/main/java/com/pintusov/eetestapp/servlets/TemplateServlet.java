package com.pintusov.eetestapp.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Enumeration;

/**
 * Project: EETestApp
 * Created by: USER
 * Date: 17.07.17.
 */

@WebServlet(name = "TemplateServlet",
		urlPatterns = {"/TemplateServletURI"})
public class TemplateServlet extends HttpServlet {

	private static final String HEADER_NAME = "headerName";
	private static final String HEADER_VALUE = "headerValue";

	@Override
	protected void service(HttpServletRequest request,
	                       HttpServletResponse response)
						   throws ServletException, IOException {

		for (Enumeration e = request.getHeaderNames(); e.hasMoreElements();) {
			String nextRequestHeaderName = (String) e.nextElement();
			String nextRequestHeaderValue = request.getHeader(nextRequestHeaderName);
			Reader reader = request.getReader();

			response.setHeader(HEADER_NAME, HEADER_VALUE);
			PrintWriter writer = response.getWriter();
		}
	}
}
